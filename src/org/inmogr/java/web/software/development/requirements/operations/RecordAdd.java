package org.inmogr.java.web.software.development.requirements.operations;

import com.google.gson.JsonObject;
import org.inmogr.java.jar.database.mysql.builder.SQLInsert;
import org.inmogr.java.web.software.development.requirements.classes.CommonReq;
import org.inmogr.java.web.software.development.requirements.classes.Requirement;
import org.inmogr.java.web.software.development.requirements.classes.RequirementPattern;
import org.inmogr.java.web.software.development.requirements.classes.SPLDomain;
import org.inmogr.java.web.software.development.requirements.classes.Solution;
import org.inmogr.java.web.software.development.requirements.classes.User;
import org.inmogr.java.web.software.development.requirements.classes.VariableReq;
import org.inmogr.java.web.software.development.requirements.global.Values;

public class RecordAdd {
	
	public static JsonObject addUser(User user) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("username", user.getUsername());
		insert.addValue("password", user.getPassword());
		insert.addValue("fName", user.getfName());
		insert.addValue("lName", user.getlName());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_USERS);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}
	
	public static JsonObject addSPLDomain(SPLDomain domain) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("spl_domain_name", domain.getSPLDomainName());
		insert.addValue("goal", domain.getGoal());
		insert.addValue("pattern_description", domain.getPatternDescription());
		insert.addValue("date_created", domain.getDateCreated(null));
		insert.addValue("domain_author", domain.getDomainAuthor());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_SPL_DOMAIN);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}
	
	public static JsonObject addRequirementPattern(RequirementPattern requirementPattern) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("pattern_id", requirementPattern.getPatternID());
		insert.addValue("pattern_name", requirementPattern.getPatternName());
		insert.addValue("aka", requirementPattern.getAKA());
		insert.addValue("known_uses", requirementPattern.getKnownUses());
		insert.addValue("application", requirementPattern.getApplication());
		insert.addValue("spl_domain_name", requirementPattern.getSPLDomainName());
		insert.addValue("problem", requirementPattern.getProblem());
		insert.addValue("force", requirementPattern.getForce());
		insert.addValue("example", requirementPattern.getExample());
		insert.addValue("author_name", requirementPattern.getAuthor().getName());
		insert.addValue("author_date", requirementPattern.getAuthor().getDate(null));
		insert.addValue("classification_class_type", requirementPattern.getClassification().getClassType());
		insert.addValue("classification_default_value", requirementPattern.getClassification().getDefaultValue());
		insert.addValue("classification_purpose", requirementPattern.getClassification().getPurpose());
		insert.addValue("classification_audience_role", requirementPattern.getClassification().getAudience().getRole());
		insert.addValue("classification_audience_stake_goal", requirementPattern.getClassification().getAudience().getStakeGoal());
		insert.addValue("classification_allowed_value", requirementPattern.getClassification().isAllowedValue());
		insert.addValue("consideration_for_design_con_constraint", requirementPattern.getConsiderationForDesign().getConConstraint());
		insert.addValue("consideration_for_design_con_description", requirementPattern.getConsiderationForDesign().getConDescription());
		insert.addValue("consideration_for_design_con_purpose", requirementPattern.getConsiderationForDesign().getConPurpose());
		insert.addValue("consideration_for_design_design_pattern_name", requirementPattern.getConsiderationForDesign().getDesignPatternName());
		insert.addValue("consideration_for_design_design_guide", requirementPattern.getConsiderationForDesign().getDesignGuide());
		insert.addValue("consideration_for_development_con_constraint", requirementPattern.getConsiderationForDevelopment().getConConstraint());
		insert.addValue("consideration_for_development_con_description", requirementPattern.getConsiderationForDevelopment().getConDescription());
		insert.addValue("consideration_for_development_con_purpose", requirementPattern.getConsiderationForDevelopment().getConPurpose());
		insert.addValue("consideration_for_development_dev_guide", requirementPattern.getConsiderationForDevelopment().getDevGuide());
		insert.addValue("consideration_for_testing_con_constraint", requirementPattern.getConsiderationForTesting().getConConstraint());
		insert.addValue("consideration_for_testing_con_description", requirementPattern.getConsiderationForTesting().getConDescription());
		insert.addValue("consideration_for_testing_con_purpose", requirementPattern.getConsiderationForTesting().getConPurpose());
		insert.addValue("consideration_for_testing_test_guide", requirementPattern.getConsiderationForTesting().getTestGuide());
		insert.addValue("consideration_for_testing_test_type", requirementPattern.getConsiderationForTesting().getTestType());
		insert.addValue("context_bussiness_domain", requirementPattern.getContext().getBussinessDomain());
		insert.addValue("context_organization_factor", requirementPattern.getContext().getOrganizationFactor());
		insert.addValue("context_pattern_type", requirementPattern.getContext().getPatternType().name());
		insert.addValue("context_req_act", requirementPattern.getContext().getReqAct().name());
		insert.addValue("context_stakeholder_role", requirementPattern.getContext().getStakeholder().getRole());
		insert.addValue("context_stakeholder_stake_goal", requirementPattern.getContext().getStakeholder().getStakeGoal());
		insert.addValue("related_pattern_id", requirementPattern.getRelatedPatternID());
		insert.addValue("relation_type_relation_extends", requirementPattern.getRelationType().isRelationExtends());
		insert.addValue("relation_type_relation_refers", requirementPattern.getRelationType().isRelationRefers());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_REQUIREMENT_PATTERN);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}
	
	public static JsonObject addSolution(Solution solution) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("solution_id", solution.getSolutionID());
		insert.addValue("solution_name", solution.getSolutionName());
		insert.addValue("pattern_id", solution.getPatternID());
		insert.addValue("goal", solution.getGoal());
		insert.addValue("description", solution.getDescription());
		insert.addValue("variability_model_vm_description", solution.getVariabilityModel().getVMDescription());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_SOLUTION);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}
	
	public static JsonObject addRequirement(Requirement requirement) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("req_id", requirement.getReqID());
		insert.addValue("req_name", requirement.getReqName());
		insert.addValue("solution_id", requirement.getSolutionID());
		insert.addValue("req_type", requirement.getReqType().name());
		insert.addValue("req_description", requirement.getReqDescription());
		insert.addValue("priority", requirement.getPriority().name());
		insert.addValue("pattern_name", requirement.getPatternName());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_REQUIREMENT);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}
	
	public static JsonObject addCommonReq(CommonReq commonReq) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("common_req_id", commonReq.getCommonReqID());
		insert.addValue("requirement_id", commonReq.getRequirementID());
		insert.addValue("common_description", commonReq.getCommonDescription());
		insert.addValue("common_constraint", commonReq.getCommonConstraint());
		insert.addValue("fixed_part", commonReq.getFixedPart());
		insert.addValue("extended_part", commonReq.getExtendedPart());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_COMMON_REQUIREMENT);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}
	
	public static JsonObject addVariableReq(VariableReq variableReq) {
		JsonObject response = new JsonObject();
		SQLInsert insert = new SQLInsert(Values.JAR_KEY, Values.DATABASE_URL, Values.DATABASE_USER, Values.DATABASE_PASS);
		insert.addValue("variable_req_id", variableReq.getVariableReqID());
		insert.addValue("requirement_id", variableReq.getRequirementID());
		insert.addValue("var_description", variableReq.getVarDescription());
		insert.addValue("var_constraint", variableReq.getVarConstraint());
		insert.addValue("fixed_part", variableReq.getFixedPart());
		insert.addValue("variation_point", variableReq.getVariationPoint());
		insert.addValue("v_name", Converter.arrayToString(variableReq.getVarPart().getVName()));
		insert.addValue("vp_name", Converter.arrayToString(variableReq.getVarPart().getVPName()));
		insert.addValue("vp_description", variableReq.getVarPart().getDescription());
		insert.addValue("vp_constraints", variableReq.getVarPart().getConstraints());
		insert.addValue("model", variableReq.getVarPart().getModel());
		insert.setDatabase(Values.DATABASE_NAME);
		insert.setTable(Values.DATABASE_TABLE_VARIABLE_REQUIREMENT);
		response = insert.execute();
		insert.closeConnection();
		return response;
	}

}
