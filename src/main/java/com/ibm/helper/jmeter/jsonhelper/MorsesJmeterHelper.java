package com.ibm.helper.jmeter.jsonhelper;

import com.eclipsesource.json.JsonArray;

/*import org.apache.jmeter.threads.JMeterVariables;*/

import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class MorsesJmeterHelper extends CustomJsonHelper {	

	public static void main(String[] args) throws Exception {
		/*// TODO Auto-generated method stub
		MorsesJmeterHelper test = new MorsesJmeterHelper();
		
		JMeterVariables vars = new JMeterVariables();
		vars.put("resultGetCustomers_matchNr", "1");
		vars.put("resultGetCustomers_1", "{\"imageContent\":null,\"collectionAddress\":{\"houseName\":\"lzKnwNZZH lNJnZ\",\"flatNo\":\"zZbh O\",\"town\":\"muBHuoj\",\"isVerified\":1,\"street\":\"mRw xVCJw TwJaJNRwEo , WJENwKaDKC xVJC\",\"postcode\":\"CT9 5NB\",\"locality\":null,\"county\":\"MhmV\",\"houseNo\":null},\"agentBalanceLimit\":45.0,\"customerCode\":\"17546366\",\"callbackDate\":null,\"memoCallingData\":null,\"createdOn\":\"2014-12-08T10:12:31.000Z\",\"affordability\":{\"benefits\":null,\"otherRepay\":null,\"others2\":null,\"livingCostEvidence\":null,\"utilityBills\":null,\"rent\":null,\"utilityBillsPBP\":null,\"affordability\":null,\"livingCost\":null,\"pensionEvidence\":null,\"mortgage\":null,\"othersEvidence\":null,\"mclRepayPBP\":null,\"otherRepayPBP\":null,\"pension\":null,\"otherRepayEvidence\":null,\"benefitsEvidence\":null,\"others\":null,\"wagesEvidence\":null,\"rentEvidence\":null,\"rentPaidPBP\":null,\"mclRepayEvidence\":null,\"others2_pbp\":null,\"livingCostPBP\":null,\"mortgageEvidence\":null,\"wages\":null,\"utilityBillsEvidence\":null,\"assessDate\":null,\"mclRepay\":null,\"others2_evidence\":null,\"mortgagePBP\":null,\"staffId\":null},\"callDayWeek\":5,\"managerBalanceLimit\":0.0,\"vulnerableSetDate\":null,\"surname\":\"Clinton\",\"isVulnerable\":0,\"customerId\":\"5E45972B-C761-FC3E-C1BB-11074DFDBD57\",\"territoryId\":223847,\"email\":null,\"memoGeneral\":null,\"customerAddress\":{\"houseName\":\"lzKnwNZZH lNJnZ\",\"flatNo\":\"zZbh O\",\"town\":\"muBHuoj\",\"isVerified\":1,\"street\":\"mRw xVCJw TwJaJNRwEo , WJENwKaDKC xVJC\",\"postcode\":\"CT9 5NB\",\"locality\":null,\"county\":\"MhmV\",\"houseNo\":null},\"paymentPerf\":43.96,\"walkingSequence\":13,\"NINumber\":\"131201035\",\"lastModifiedBy\":\"LES.BLOWN\",\"homePhone\":\"gFFjDhgLDah\",\"mobile\":\"t\",\"dateOfBirth\":\"1958-02-12\",\"tcAcceptanceDate\":null,\"lastModifiedOn\":\"2015-10-20T10:43:59.000Z\",\"agentSaleLimit\":10.0,\"cardacctId\":null,\"firstName\":\"Anthony\",\"managerSaleLimit\":0.0,\"marketing\":{\"preferenceSMS\":0,\"preferenceTelephone\":0,\"electronicDocuments\":0,\"researchCompany\":1,\"preferenceLetter\":0,\"preferenceEmail\":0},\"healthIssues\":null,\"nationality\":null,\"createdBy\":\"YANN.DEMEZIERES\",\"inFinancialDifficulties\":0,\"collectionFrequency\":\"W\",\"workPhone\":null,\"salutation\":\"MR\",\"operation\":null,\"maritalStatus\":\"MARR\",\"status\":\"LIVE\"}");
		vars.put("customersApiFields", "{\"customerId\":{\"name\":\"customerId\",\"type\":\"string\",\"isNull\":false},\"territoryId\":{\"name\":\"territoryId\",\"type\":\"numeric\",\"isNull\":false},\"customerCode\":{\"name\":\"customerCode\",\"type\":\"string\",\"isNull\":false},\"salutation\":{\"name\":\"salutation\",\"type\":\"string\",\"isNull\":false},\"firstName\":{\"name\":\"firstName\",\"type\":\"string\",\"isNull\":false},\"surname\":{\"name\":\"surname\",\"type\":\"string\",\"isNull\":false},\"mobile\":{\"name\":\"mobile\",\"type\":\"string\",\"isNull\":true},\"workPhone\":{\"name\":\"workPhone\",\"type\":\"string\",\"isNull\":true},\"homePhone\":{\"name\":\"homePhone\",\"type\":\"string\",\"isNull\":true},\"status\":{\"name\":\"status\",\"type\":\"enum\",\"comment\":[\"LIVE\",\"CLO\",\"CAN\",\"BAD\",\"ONHOLD\",\"DECS\",\"BANNED\"],\"isNull\":false},\"isVulnerable\":{\"name\":\"isVulnerable\",\"type\":\"numeric\",\"isNull\":false},\"vulnerableSetDate\":{\"name\":\"vulnerableSetDate\",\"type\":\"datetime\",\"isNull\":true},\"inFinancialDifficulties\":{\"name\":\"inFinancialDifficulties\",\"type\":\"enum\",\"comment\":[\"0\",\"1\",\"2\"],\"isNull\":false},\"dateOfBirth\":{\"name\":\"dateOfBirth\",\"type\":\"dateTime\",\"isNull\":false},\"walkingSequence\":{\"name\":\"walkingSequence\",\"type\":\"numeric\",\"isNull\":true},\"callDayWeek\":{\"name\":\"callDayWeek\",\"type\":\"datetime\",\"isNull\":true},\"callbackDate\":{\"name\":\"callbackDate\",\"type\":\"datetime\",\"isNull\":true},\"email\":{\"name\":\"email\",\"type\":\"string\",\"isNull\":true},\"customerAddress\":{\"name\":\"customerAddress\",\"type\":\"object\",\"isNull\":false,\"postcode\":{\"name\":\"postcode\",\"type\":\"string\",\"isNull\":false},\"flatNo\":{\"name\":\"flatNo\",\"type\":\"string\",\"isNull\":true},\"houseNo\":{\"name\":\"houseNo\",\"type\":\"string\",\"isNull\":true},\"houseName\":{\"name\":\"houseName\",\"type\":\"string\",\"isNull\":true},\"street\":{\"name\":\"street\",\"type\":\"string\",\"isNull\":true},\"locality\":{\"name\":\"locality\",\"type\":\"string\",\"isNull\":true},\"county\":{\"name\":\"county\",\"type\":\"string\",\"isNull\":true},\"town\":{\"name\":\"town\",\"type\":\"string\",\"isNull\":true},\"isVerified\":{\"name\":\"isVerified\",\"type\":\"enum\",\"comment\":[\"0\",\"1\",\"2\"],\"isNull\":true}},\"collectionAddress\":{\"name\":\"collectionAddress\",\"type\":\"object\",\"isNull\":false,\"postcode\":{\"name\":\"postcode\",\"type\":\"string\",\"isNull\":false},\"flatNo\":{\"name\":\"flatNo\",\"type\":\"string\",\"isNull\":true},\"houseNo\":{\"name\":\"houseNo\",\"type\":\"string\",\"isNull\":true},\"houseName\":{\"name\":\"houseName\",\"type\":\"string\",\"isNull\":true},\"street\":{\"name\":\"street\",\"type\":\"string\",\"isNull\":true},\"locality\":{\"name\":\"locality\",\"type\":\"string\",\"isNull\":true},\"county\":{\"name\":\"county\",\"type\":\"string\",\"isNull\":true},\"town\":{\"name\":\"town\",\"type\":\"string\",\"isNull\":true},\"isVerified\":{\"name\":\"isVerified\",\"type\":\"numeric\",\"comment\":[\"0\",\"1\",\"2\"],\"isNull\":true}},\"memoCallingData\":{\"name\":\"memoCallingData\",\"type\":\"String\",\"isNull\":true},\"memoGeneral\":{\"name\":\"memoGeneral\",\"type\":\"String\",\"isNull\":true},\"agentSaleLimit\":{\"name\":\"agentSaleLimit\",\"type\":\"Numeric\",\"isNull\":true},\"managerSaleLimit\":{\"name\":\"managerSaleLimit\",\"type\":\"Numerc\",\"isNull\":true},\"agentBalanceLimit\":{\"name\":\"agentBalanceLimit\",\"type\":\"Numeric\",\"isNull\":true},\"managerBalanceLimit\":{\"name\":\"managerBalanceLimit\",\"type\":\"Numeric\",\"isNull\":true},\"paymentPerf\":{\"name\":\"paymentPerf\",\"type\":\"numeric\",\"isNull\":true},\"cardacctId\":{\"name\":\"cardacctId\",\"type\":\"string\",\"isNull\":true},\"imageContent\":{\"name\":\"imageContent\",\"type\":\"string\",\"isNull\":true},\"tcAcceptanceDate\":{\"name\":\"tcAcceptanceDate\",\"type\":\"datetime\",\"isNull\":true},\"collectionFrequency\":{\"name\":\"collectionFrequency\",\"type\":\"string\",\"isNull\":true},\"NINumber\":{\"name\":\"NINumber\",\"type\":\"string\",\"isNull\":true},\"maritalStatus\":{\"name\":\"maritalStatus\",\"type\":\"string\",\"isNull\":true},\"healthIssues\":{\"name\":\"healthIssues\",\"type\":\"numeric\",\"isNull\":true},\"nationality\":{\"name\":\"nationality\",\"type\":\"string\",\"isNull\":false},\"affordability\":{\"wages\":{\"name\":\"wages\",\"type\":\"numeric\",\"isNull\":true},\"wagesEvidence\":{\"name\":\"wagesEvidence\",\"type\":\"numeric\",\"isNull\":true},\"benefits\":{\"name\":\"benefits\",\"type\":\"numeric\",\"isNull\":true},\"benefitsEvidence\":{\"name\":\"benefitsEvidence\",\"type\":\"numeric\",\"isNull\":true},\"pension\":{\"name\":\"pension\",\"type\":\"numeric\",\"isNull\":true},\"pensionEvidence\":{\"name\":\"pensionEvidence\",\"type\":\"numeric\",\"isNull\":true},\"others\":{\"name\":\"others\",\"type\":\"numeric\",\"isNull\":true},\"othersEvidence\":{\"name\":\"othersEvidence\",\"type\":\"numeric\",\"isNull\":true},\"rent\":{\"name\":\"rent\",\"type\":\"numeric\",\"isNull\":true},\"rentEvidence\":{\"name\":\"rentEvidence\",\"type\":\"numeric\",\"isNull\":true},\"rentPaidPBP\":{\"name\":\"rentPaidPBP\",\"type\":\"numeric\",\"isNull\":true},\"mortgage\":{\"name\":\"mortgage\",\"type\":\"numeric\",\"isNull\":true},\"mortgageEvidence\":{\"name\":\"mortgageEvidence\",\"type\":\"numeric\",\"isNull\":true},\"mortgagePBP\":{\"name\":\"mortgagePBP\",\"type\":\"numeric\",\"isNull\":true},\"mclRepay\":{\"name\":\"mclRepay\",\"type\":\"numeric\",\"isNull\":true},\"mclRepayEvidence\":{\"name\":\"mclRepayEvidence\",\"type\":\"numeric\",\"isNull\":true},\"mclRepayPBP\":{\"name\":\"mclRepayPBP\",\"type\":\"numeric\",\"isNull\":true},\"otherRepay\":{\"name\":\"otherRepay\",\"type\":\"numeric\",\"isNull\":true},\"otherRepayEvidence\":{\"name\":\"otherRepayEvidence\",\"type\":\"numeric\",\"isNull\":true},\"otherRepayPBP\":{\"name\":\"otherRepayPBP\",\"type\":\"numeric\",\"isNull\":true},\"utilityBills\":{\"name\":\"utilityBills\",\"type\":\"numeric\",\"isNull\":true},\"utilityBillsEvidence\":{\"name\":\"utilityBillsEvidence\",\"type\":\"numeric\",\"isNull\":true},\"utilityBillsPBP\":{\"name\":\"utilityBillsPBP\",\"type\":\"numeric\",\"isNull\":true},\"livingCost\":{\"name\":\"livingCost\",\"type\":\"numeric\",\"isNull\":true},\"livingCostEvidence\":{\"name\":\"livingCostEvidence\",\"type\":\"numeric\",\"isNull\":true},\"livingCostPBP\":{\"name\":\"livingCostPBP\",\"type\":\"numeric\",\"isNull\":true},\"others2\":{\"name\":\"others2\",\"type\":\"numeric\",\"isNull\":true},\"others2_evidence\":{\"name\":\"others2_evidence\",\"type\":\"numeric\",\"isNull\":true},\"others2_pbp\":{\"name\":\"others2_pbp\",\"type\":\"numeric\",\"isNull\":true},\"affordability\":{\"name\":\"affordability\",\"type\":\"numeric\",\"isNull\":true},\"staffId\":{\"name\":\"staffId\",\"type\":\"numeric\",\"isNull\":true},\"assessDate\":{\"name\":\"assessDate\",\"type\":\"date\",\"isNull\":true},\"name\":\"affordability\",\"type\":\"object\",\"isNull\":false},\"marketing\":{\"name\":\"marketing\",\"type\":\"object\",\"isNull\":false,\"preferenceEmail\":{\"name\":\"preferenceEmail\",\"type\":\"numeric\",\"isNull\":true},\"preferenceTelephone\":{\"name\":\"preferenceTelephone\",\"type\":\"numeric\",\"isNull\":true},\"preferenceSMS\":{\"name\":\"preferenceSMS\",\"type\":\"numeric\",\"isNull\":true},\"preferenceLetter\":{\"name\":\"preferenceLetter\",\"type\":\"numeric\",\"isNull\":true},\"electronicDocuments\":{\"name\":\"electronicDocuments\",\"type\":\"numeric\",\"isNull\":true},\"researchCompany\":{\"name\":\"researchCompany\",\"type\":\"numeric\",\"isNull\":true}}}");
		test.checkApiJsonStructure(vars, "resultGetCustomers", "customersApiFields");*/
	}
	
	public MorsesJmeterHelper() {
		ConstantsHelper.setUNIQUE_PROPERTY("customerId");
		ConstantsHelper.setNAME_PROPERTY("name");
		ConstantsHelper.setTYPE_PROPERTY("type");
		ConstantsHelper.setISNULL_PROPERTY("isNull");
		ConstantsHelper.setENTITY_IDENTIFIER("object");
		ConstantsHelper.setNUMBER_IDENTIFIER("numeric");
		ConstantsHelper.setENUM_IDENTIFIER("enum");
		ConstantsHelper.setENUM_ARRAY_IDENTIFIER("comment");
		ConstantsHelper.setMISSING_PROPERTY_ERROR_MESSAGE(" is missing");
		ConstantsHelper.setEMPTY_PROPERTY_ERROR_MESSAGE(" is empty");
		ConstantsHelper.setNOT_NUMERIC_PROPERTY_ERROR_MESSAGE(" is not a number");
		ConstantsHelper.setNOT_ENUM_PROPERTY_ERROR_MESSAGE(" is not present in the designed enum list");
		ConstantsHelper.setCOMMON_PROPERTIES(new String[]{ConstantsHelper.NAME_PROPERTY, ConstantsHelper.TYPE_PROPERTY, ConstantsHelper.ISNULL_PROPERTY});
		ConstantsHelper.setUNIQUE_RECORD_IDENTIFIER("uniqueRecordIdentifier");
		ConstantsHelper.setFOUND_ISSUES("foundIssues");
		ConstantsHelper.setGENERAL_ISSUES("\n Issue found with customer " + ConstantsHelper.UNIQUE_RECORD_IDENTIFIER + " where : " + ConstantsHelper.FOUND_ISSUES +";");
		ConstantsHelper.setARRAY_JMETER_IDENTIFIER("matchNr");
	}

	public void checkCustomPatterns(JsonObject parentLevel, JsonObject resulCustomersObject, String propertyName) {
		String propertyType = getType(parentLevel);
		Boolean propertyIsNull = isNull(parentLevel);
		
		if(resulCustomersObject.get(propertyName) == null){
			fieldsWithErrors.add(propertyName + ConstantsHelper.MISSING_PROPERTY_ERROR_MESSAGE);
			return;
		} 
		if(propertyIsNull == false && resulCustomersObject.get(propertyName).isNull()){
			fieldsWithErrors.add(propertyName + ConstantsHelper.EMPTY_PROPERTY_ERROR_MESSAGE);
			return;
		}			
		if(!resulCustomersObject.get(propertyName).isNull()){
			if(propertyType.equals(ConstantsHelper.NUMBER_IDENTIFIER) && !resulCustomersObject.get(propertyName).isNumber()){
				fieldsWithErrors.add(propertyName + ConstantsHelper.NOT_NUMERIC_PROPERTY_ERROR_MESSAGE);
				return;
			}
			if(propertyType.equals(ConstantsHelper.ENUM_IDENTIFIER)){
				JsonArray enumPossibleValues = getProperties(parentLevel, ConstantsHelper.ENUM_ARRAY_IDENTIFIER);
				JsonValue enumReceivedValue = resulCustomersObject.get(propertyName);
				
				if(!isValueInArray(enumPossibleValues, enumReceivedValue)){
					fieldsWithErrors.add(propertyName +": " + enumReceivedValue.asString() + ConstantsHelper.NOT_ENUM_PROPERTY_ERROR_MESSAGE);
					return;
				}
			}
		}
	}

	public String getType(JsonObject inputJson){
		return inputJson.get(ConstantsHelper.TYPE_PROPERTY).asString();
	}

}
