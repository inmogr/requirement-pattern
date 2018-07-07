package org.inmogr.java.web.software.development.requirements.operations;

import com.google.gson.JsonObject;

import org.inmogr.java.jar.database.mysql.builder.SQLUpdate;
import org.inmogr.java.web.software.development.requirements.classes.CommonReq;
import org.inmogr.java.web.software.development.requirements.classes.Requirement;
import org.inmogr.java.web.software.development.requirements.classes.RequirementPattern;
import org.inmogr.java.web.software.development.requirements.classes.SPLDomain;
import org.inmogr.java.web.software.development.requirements.classes.Solution;
import org.inmogr.java.web.software.development.requirements.classes.User;
import org.inmogr.java.web.software.development.requirements.classes.VariableReq;
import org.inmogr.java.web.software.development.requirements.global.Values;

public class RecordUpdate {
	
	public static JsonObject updateUser(User user) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("username", user.getUsername());
		update.addValue("password", user.getPassword());
		update.addValue("fName", user.getfName());
		update.addValue("lName", user.getlName());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_USERS);
		response = update.execute();
		update.closeConnection();
		return response;
	}
	
	public static JsonObject updateSPLDomain(SPLDomain domain) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("spl_domain_name", domain.getSPLDomainName());
		update.addValue("goal", domain.getGoal());
		update.addValue("pattern_description", domain.getPatternDescription());
		update.addValue("date_created", domain.getDateCreated(null));
		update.addValue("domain_author", domain.getDomainAuthor());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_SPL_DOMAIN);
		response = update.execute();
		update.closeConnection();
		return response;
	}
	
	public static JsonObject updateRequirementPattern(RequirementPattern requirementPattern) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("pattern_id", requirementPattern.getPatternID());
		update.addValue("pattern_name", requirementPattern.getPatternName());
		update.addValue("aka", requirementPattern.getAKA());
		update.addValue("known_uses", requirementPattern.getKnownUses());
		update.addValue("application", requirementPattern.getApplication());
		update.addValue("spl_domain_name", requirementPattern.getSPLDomainName());
		update.addValue("problem", requirementPattern.getProblem());
		update.addValue("force", requirementPattern.getForce());
		update.addValue("example", requirementPattern.getExample());
		update.addValue("author_name", requirementPattern.getAuthor().getName());
		update.addValue("author_date", requirementPattern.getAuthor().getDate(null));
		update.addValue("classification_class_type", requirementPattern.getClassification().getClassType());
		update.addValue("classification_default_value", requirementPattern.getClassification().getDefaultValue());
		update.addValue("classification_purpose", requirementPattern.getClassification().getPurpose());
		update.addValue("classification_audience_role", requirementPattern.getClassification().getAudience().getRole());
		update.addValue("classification_audience_stake_goal", requirementPattern.getClassification().getAudience().getStakeGoal());
		update.addValue("classification_allowed_value", requirementPattern.getClassification().isAllowedValue());
		update.addValue("consideration_con_constraint", requirementPattern.getConsideration().getConConstraint());
		update.addValue("consideration_con_description", requirementPattern.getConsideration().getConDescription());
		update.addValue("consideration_con_purpose", requirementPattern.getConsideration().getConPurpose());
		update.addValue("context_bussiness_domain", requirementPattern.getContext().getBussinessDomain());
		update.addValue("context_organization_factor", requirementPattern.getContext().getOrganizationFactor());
		update.addValue("context_pattern_type", requirementPattern.getContext().getPatternType().name());
		update.addValue("context_req_act", requirementPattern.getContext().getReqAct().name());
		update.addValue("context_stakeholder_role", requirementPattern.getContext().getStakeholder().getRole());
		update.addValue("context_stakeholder_stake_goal", requirementPattern.getContext().getStakeholder().getStakeGoal());
		update.addValue("related_pattern_id", requirementPattern.getRelatedPatternID());
		update.addValue("relation_type_relation_extends", requirementPattern.getRelationType().isRelationExtends());
		update.addValue("relation_type_relation_refers", requirementPattern.getRelationType().isRelationRefers());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_REQUIREMENT_PATTERN);
		response = update.execute();
		update.closeConnection();
		return response;
	}
	
	public static JsonObject updateSolution(Solution solution) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("solution_id", solution.getSolutionID());
		update.addValue("solution_name", solution.getSolutionName());
		update.addValue("pattern_id", solution.getPatternID());
		update.addValue("goal", solution.getGoal());
		update.addValue("description", solution.getDescription());
		update.addValue("variability_model_vm_description", solution.getVariabilityModel().getVMDescription());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_SOLUTION);
		response = update.execute();
		update.closeConnection();
		return response;
	}
	
	public static JsonObject updateRequirement(Requirement requirement) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("req_id", requirement.getReqID());
		update.addValue("req_name", requirement.getReqName());
		update.addValue("solution_id", requirement.getSolutionID());
		update.addValue("req_type", requirement.getReqType().name());
		update.addValue("req_description", requirement.getReqDescription());
		update.addValue("priority", requirement.getPriority().name());
		update.addValue("pattern_name", requirement.getPatternName());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_REQUIREMENT);
		response = update.execute();
		update.closeConnection();
		return response;
	}
	
	public static JsonObject updateCommonReq(CommonReq commonReq) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("common_req_id", commonReq.getCommonReqID());
		update.addValue("requirement_id", commonReq.getRequirementID());
		update.addValue("common_description", commonReq.getCommonDescription());
		update.addValue("common_constraint", commonReq.getCommonConstraint());
		update.addValue("fixed_part", commonReq.getFixedPart());
		update.addValue("extended_part", commonReq.getExtendedPart());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_COMMON_REQUIREMENT);
		response = update.execute();
		update.closeConnection();
		return response;
	}
	
	public static JsonObject updateVariableReq(VariableReq variableReq) {
		JsonObject response = new JsonObject();
		SQLUpdate update = new SQLUpdate(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		update.addCondition("variable_req_id", variableReq.getVariableReqID());
		update.addValue("requirement_id", variableReq.getRequirementID());
		update.addValue("var_description", variableReq.getVarDescription());
		update.addValue("var_constraint", variableReq.getVarConstraint());
		update.addValue("fixed_part", variableReq.getFixedPart());
		update.addValue("variation_point", variableReq.getVariationPoint());
		update.addValue("v_name", Converter.arrayToString(variableReq.getVarPart().getVName()));
		update.addValue("vp_name", Converter.arrayToString(variableReq.getVarPart().getVPName()));
		update.addValue("model", variableReq.getVarPart().getModel());
		update.setDatabase(Values.DATABASE_NAME);
		update.setTable(Values.DATABASE_TABLE_VARIABLE_REQUIREMENT);
		response = update.execute();
		update.closeConnection();
		return response;
	}

}
