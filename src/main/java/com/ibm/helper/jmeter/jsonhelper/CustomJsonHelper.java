package com.ibm.helper.jmeter.jsonhelper;

import com.eclipsesource.json.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jmeter.threads.JMeterVariables;

public abstract class CustomJsonHelper {	
	public static List<String> fieldsWithErrors = new ArrayList<String>();
	
	public void checkApiJsonStructure(JMeterVariables vars, String resultedApiJSON, String patternApiFields) throws Exception{
		StringBuilder FailureMessage = new StringBuilder();
		
		for(int i=1; i<= Integer.valueOf(vars.get(resultedApiJSON + ConstantsHelper.UNDERSCORE_DELIMITER + ConstantsHelper.ARRAY_JMETER_IDENTIFIER)); i++){		
			String customerNo = resultedApiJSON + ConstantsHelper.UNDERSCORE_DELIMITER + i;
			JsonObject resulCustomersObject = JsonObject.readFrom(vars.get(customerNo));		
			JsonObject customersApiFields = JsonObject.readFrom(vars.get(patternApiFields));

			checkObjectProperties(resulCustomersObject, customersApiFields);

			if(fieldsWithErrors.size() > 0){
				getErrorMessage(FailureMessage, resulCustomersObject);
			}
		}
		
		if(FailureMessage.length() > 0){
			throw new Exception(FailureMessage.toString());
		}
	}
	
	public void getErrorMessage(StringBuilder FailureMessage, JsonObject resulCustomersObject){
		Map<String, String> errorMap = new HashMap<String, String>();
		
		errorMap.put(ConstantsHelper.UNIQUE_RECORD_IDENTIFIER, resulCustomersObject.get(ConstantsHelper.UNIQUE_PROPERTY).asString());
		errorMap.put(ConstantsHelper.FOUND_ISSUES, Arrays.toString(fieldsWithErrors.toArray()));
		
		FailureMessage.append(formatErrorMessage(errorMap, ConstantsHelper.GENERAL_ISSUES));
		
		fieldsWithErrors = new ArrayList<String>();
		errorMap.clear();
	}
	
	public String formatErrorMessage(Map<String, String> input, String errorBody){
		String output = errorBody;
		
		for (Object key : input.keySet()) {
			output = output.replaceAll(key.toString(), input.get(key));
		}
		
		return output;
	}
	
	public void checkObjectProperties(JsonObject resulCustomersObject, JsonObject customersApiFields){		
		for (String propertyName : customersApiFields.names()) {
			if(isDefiningProperty(propertyName)){
				JsonObject propertyJson = getProperty(customersApiFields, propertyName);
				
				checkFieldProperties(propertyJson, resulCustomersObject, propertyName);				
			}
		}
	}
	
	public Boolean isDefiningProperty(String propertyName) {
		Boolean result = true;
		
		for (String commonProperty : ConstantsHelper.COMMON_PROPERTIES) {
			if(propertyName.equals(commonProperty)){
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public void checkFieldProperties(JsonObject parentLevel, JsonObject resulCustomersObject, String propertyName){		
		checkCustomPatterns(parentLevel, resulCustomersObject, propertyName);
		
		if(isSeparateEntity(parentLevel)){
			JsonObject secondResultCustomerObject = getProperty(resulCustomersObject, propertyName);
			
			checkObjectProperties(secondResultCustomerObject, parentLevel);
		}
	}
	
	public abstract void checkCustomPatterns(JsonObject parentLevel, JsonObject resulCustomersObject, String propertyName);
	
	public Boolean isSeparateEntity(JsonObject inputJson){
		String propertyTypeIdentifier = inputJson.get(ConstantsHelper.TYPE_PROPERTY).asString();
		
		return propertyTypeIdentifier.equals(ConstantsHelper.ENTITY_IDENTIFIER);
	}
	
	public JsonObject getProperty(JsonObject inputJson, String property) {
		return inputJson.get(property).asObject();
	}
	
	public JsonArray getProperties(JsonObject inputJson, String property) {
		return inputJson.get(property).asArray();
	}
	
	public Boolean isNull(JsonObject inputJson){
		return inputJson.get(ConstantsHelper.ISNULL_PROPERTY).asBoolean();
	}
	
	public Boolean isValueInArray(JsonArray input, JsonValue searchedValue){
		Boolean output = false;
		
		for(JsonValue item : input){
			
			if(item.equals(searchedValue)){
				output = true;
				break;
			}
		}
		
		return output;
	}

}
