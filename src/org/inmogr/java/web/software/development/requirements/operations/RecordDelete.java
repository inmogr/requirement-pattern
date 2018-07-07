package org.inmogr.java.web.software.development.requirements.operations;

import com.google.gson.JsonObject;
import org.inmogr.java.jar.database.mysql.builder.SQLDelete;
import org.inmogr.java.web.software.development.requirements.classes.CommonReq;
import org.inmogr.java.web.software.development.requirements.classes.Requirement;
import org.inmogr.java.web.software.development.requirements.classes.RequirementPattern;
import org.inmogr.java.web.software.development.requirements.classes.SPLDomain;
import org.inmogr.java.web.software.development.requirements.classes.Solution;
import org.inmogr.java.web.software.development.requirements.classes.User;
import org.inmogr.java.web.software.development.requirements.classes.VariableReq;
import org.inmogr.java.web.software.development.requirements.global.Values;

public class RecordDelete {
	
	public static JsonObject deleteUser(User user) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("username", user.getUsername());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_USERS);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}
	
	public static JsonObject deleteSPLDomain(SPLDomain domain) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("spl_domain_name", domain.getSPLDomainName());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_SPL_DOMAIN);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}
	
	public static JsonObject deleteRequirementPattern(RequirementPattern requirementPattern) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("pattern_id", requirementPattern.getPatternID());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_REQUIREMENT_PATTERN);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}
	
	public static JsonObject deleteSolution(Solution solution) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("solution_id", solution.getSolutionID());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_SOLUTION);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}
	
	public static JsonObject deleteRequirement(Requirement requirement) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("req_id", requirement.getReqID());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_REQUIREMENT);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}
	
	public static JsonObject deleteCommonReq(CommonReq commonReq) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("common_req_id", commonReq.getCommonReqID());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_COMMON_REQUIREMENT);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}
	
	public static JsonObject deleteVariableReq(VariableReq variableReq) {
		JsonObject response = new JsonObject();
		SQLDelete delete = new SQLDelete(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		delete.addCondition("variable_req_id", variableReq.getVariableReqID());
		delete.setDatabase(Values.DATABASE_NAME);
		delete.setTable(Values.DATABASE_TABLE_VARIABLE_REQUIREMENT);
		response = delete.execute();
		delete.closeConnection();
		return response;
	}

}
