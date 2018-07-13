package org.inmogr.java.web.software.development.requirements.operations;

import com.google.gson.JsonObject;
import org.inmogr.java.jar.database.mysql.builder.SQLSelect;
import org.inmogr.java.web.software.development.requirements.global.Values;

public class RecordSelect {
	
	public static JsonObject selectUser(String username, String password) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("username", username);
		select.addCondition("password", password);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_USERS);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectSPLDomain() {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_SPL_DOMAIN);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectSPLDomainByID(String SPLDomain) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("spl_domain_name", SPLDomain);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_SPL_DOMAIN);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectRequirementPattern(String SPLDomain) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("spl_domain_name", SPLDomain);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_REQUIREMENT_PATTERN);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectRequirementPatternByID(String patternID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("pattern_id", patternID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_REQUIREMENT_PATTERN);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectSolution(String patternID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("pattern_id", patternID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_SOLUTION);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectSolutionByID(String solutionID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("solution_id", solutionID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_SOLUTION);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectRequirement(String solutionID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("solution_id", solutionID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_REQUIREMENT);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectRequirementByID(String reqID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("req_id", reqID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_REQUIREMENT);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectCommonReq(String requirementID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("requirement_id", requirementID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_COMMON_REQUIREMENT);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectCommonReqByID(String commonReqID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("common_req_id", commonReqID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_COMMON_REQUIREMENT);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectVariableReq(String requirementID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("requirement_id", requirementID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_VARIABLE_REQUIREMENT);
		response = select.execute();
		select.closeConnection();
		return response;
	}
	
	public static JsonObject selectVariableReqByID(String variableReqID) {
		JsonObject response = new JsonObject();
		SQLSelect select = new SQLSelect(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		select.addColumn("*");
		select.addCondition("variable_req_id", variableReqID);
		select.setDatabase(Values.DATABASE_NAME);
		select.setTable(Values.DATABASE_TABLE_VARIABLE_REQUIREMENT);
		response = select.execute();
		select.closeConnection();
		return response;
	}

}
