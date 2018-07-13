package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordDelete;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import org.inmogr.java.web.software.development.requirements.operations.RecordUpdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class RequirementPatternBean extends RequirementPatternExt {
	
	@Override
	public String getPatternID() {
		String response = super.getPatternID();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getPatternName() {
		String response = super.getPatternName();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getAKA() {
		String response = super.getAKA();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getKnownUses() {
		String response = super.getKnownUses();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getApplication() {
		String response = super.getApplication();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getSPLDomainName() {
		String response = super.getSPLDomainName();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getProblem() {
		String response = super.getProblem();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getForce() {
		String response = super.getForce();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getExample() {
		String response = super.getExample();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getRelatedPatternID() {
		String response = super.getRelatedPatternID();
		if (response == null) {
			return "";
		}
		return response;
	}

	public boolean isAdd() {
		if (null == getPatternID() || 0 == getPatternID().length()) {return false;}
		if (null == getPatternName() || 0 == getPatternName().length()) {return false;}
		if (null == getAKA() || 0 == getAKA().length()) {return false;}
		if (null == getKnownUses() || 0 == getKnownUses().length()) {return false;}
		if (null == getApplication() || 0 == getApplication().length()) {return false;}
		if (null == getSPLDomainName() || 0 == getSPLDomainName().length()) {return false;}
		if (null == getProblem() || 0 == getProblem().length()) {return false;}
		if (null == getForce() || 0 == getForce().length()) {return false;}
		if (null == getExample() || 0 == getExample().length()) {return false;}
		if (null == getAuthor()) {return false;}
		if (null == getClassification()) {return false;}
		if (null == getConsiderationForDesign()) {return false;}
		if (null == getConsiderationForDevelopment()) {return false;}
		if (null == getConsiderationForTesting()) {return false;}
		if (null == getContext()) {return false;}
//		if (null == getRelatedPatternID() || 0 == getRelatedPatternID().length()) {return false;}
		if (null == getRelatedPatternID()) {
			setRelatedPatternID("");
		}
		if (null == getRelationType()) {return false;}
		return true;
	}

	public JsonObject add() {
		if (!isAdd()) { return new JsonObject(); }
		return RecordAdd.addRequirementPattern(this);
	}

	public boolean isUpdate() {
		return isAdd();
	}

	public JsonObject update() {
		if (!isUpdate()) { return new JsonObject(); }
		return RecordUpdate.updateRequirementPattern(this);
	}
	
	public boolean isDelete() {
		if (null == getPatternID() || 0 == getPatternID().length()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteRequirementPattern(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("pattern_id")) {
            setPatternID(json.get("pattern_id").getAsString());
        }
		if (json.has("pattern_name")) {
            setPatternName(json.get("pattern_name").getAsString());
        }
		if (json.has("aka")) {
            setAKA(json.get("aka").getAsString());
        }
		if (json.has("known_uses")) {
            setKnownUses(json.get("known_uses").getAsString());
        }
		if (json.has("application")) {
            setApplication(json.get("application").getAsString());
        }
		if (json.has("spl_domain_name")) {
            setSPLDomainName(json.get("spl_domain_name").getAsString());
        }
		if (json.has("problem")) {
            setProblem(json.get("problem").getAsString());
        }
		if (json.has("force")) {
            setForce(json.get("force").getAsString());
        }
		if (json.has("example")) {
            setExample(json.get("example").getAsString());
        }
		if (json.has("author_name")) {
            setAuthor_name(json.get("author_name").getAsString());
        }
		if (json.has("author_date")) {
            setAuthor_date(json.get("author_date").getAsString());
        }
		if (json.has("classification_class_type")) {
            setClassification_classType(json.get("classification_class_type").getAsString());
        }
		if (json.has("classification_default_value")) {
            setClassification_defaultValue(json.get("classification_default_value").getAsString());
        }
		if (json.has("classification_purpose")) {
            setClassification_purpose(json.get("classification_purpose").getAsString());
        }
		if (json.has("classification_audience_role")) {
            setClassification_audience_role(json.get("classification_audience_role").getAsString());
        }
		if (json.has("classification_audience_stake_goal")) {
            setClassification_audience_stakeGoal(json.get("classification_audience_stake_goal").getAsString());
        }
		if (json.has("classification_allowed_value")) {
            setClassification_allowedValue(json.get("classification_allowed_value").getAsBoolean());
        }
		if (json.has("consideration_for_design_con_constraint")) {
            setConsiderationForDesign_conConstraint(json.get("consideration_for_design_con_constraint").getAsString());
        }
		if (json.has("consideration_for_design_con_description")) {
            setConsiderationForDesign_conDescription(json.get("consideration_for_design_con_description").getAsString());
        }
		if (json.has("consideration_for_design_con_purpose")) {
            setConsiderationForDesign_conPurpose(json.get("consideration_for_design_con_purpose").getAsString());
        }
		if (json.has("consideration_for_design_design_pattern_name")) {
            setConsiderationForDesign_designPatternName(json.get("consideration_for_design_design_pattern_name").getAsString());
        }
		if (json.has("consideration_for_design_design_guide")) {
            setConsiderationForDesign_designGuide(json.get("consideration_for_design_design_guide").getAsString());
        }
		if (json.has("consideration_for_development_con_constraint")) {
            setConsiderationForDevelopment_conConstraint(json.get("consideration_for_development_con_constraint").getAsString());
        }
		if (json.has("consideration_for_development_con_description")) {
            setConsiderationForDevelopment_conDescription(json.get("consideration_for_development_con_description").getAsString());
        }
		if (json.has("consideration_for_development_con_purpose")) {
            setConsiderationForDevelopment_conPurpose(json.get("consideration_for_development_con_purpose").getAsString());
        }
		if (json.has("consideration_for_development_dev_guide")) {
            setConsiderationForDevelopment_devGuide(json.get("consideration_for_development_dev_guide").getAsString());
        }
		if (json.has("consideration_for_testing_con_constraint")) {
            setConsiderationForTesting_conConstraint(json.get("consideration_for_testing_con_constraint").getAsString());
        }
		if (json.has("consideration_for_testing_con_description")) {
            setConsiderationForTesting_conDescription(json.get("consideration_for_testing_con_description").getAsString());
        }
		if (json.has("consideration_for_testing_con_purpose")) {
            setConsiderationForTesting_conPurpose(json.get("consideration_for_testing_con_purpose").getAsString());
        }
		if (json.has("consideration_for_testing_test_guide")) {
			setConsiderationForTesting_testGuide(json.get("consideration_for_testing_test_guide").getAsString());
        }
		if (json.has("consideration_for_testing_test_type")) {
			setConsiderationForTesting_testType(json.get("consideration_for_testing_test_type").getAsString());
        }
		if (json.has("context_bussiness_domain")) {
            setContext_bussinessDomain(json.get("context_bussiness_domain").getAsString());
        }
		if (json.has("context_organization_factor")) {
            setContext_organizationFactor(json.get("context_organization_factor").getAsString());
        }
		if (json.has("context_pattern_type")) {
            setContext_patternType(json.get("context_pattern_type").getAsString());
        }
		if (json.has("context_req_act")) {
			setContext_reqAct(json.get("context_req_act").getAsString());
        }
		if (json.has("context_stakeholder_role")) {
            setContext_stakeholder_role(json.get("context_stakeholder_role").getAsString());
        }
		if (json.has("context_stakeholder_stake_goal")) {
            setContext_stakeholder_stakeGoal(json.get("context_stakeholder_stake_goal").getAsString());
        }
		if (json.has("related_pattern_id")) {
            setRelatedPatternID(json.get("related_pattern_id").getAsString());
        }
		if (json.has("relation_type_relation_extends")) {
            setRelationType_relationExtends(json.get("relation_type_relation_extends").getAsBoolean());
        }
		if (json.has("relation_type_relation_refers")) {
            setRelationType_relationRefers(json.get("relation_type_relation_refers").getAsBoolean());
        }
	}
	
	public void fetch() {
		JsonObject json = RecordSelect.selectRequirementPatternByID(getPatternID());
		if (json != null && json.has(DatabaseConnector.STATUS) && json.has(DatabaseConnector.RESPONSE)) {
			if (json.get(DatabaseConnector.STATUS).getAsString().equals(DatabaseConnector.SUCCESSFUL)) {
				if (json.get(DatabaseConnector.RESPONSE).isJsonArray()) {
					JsonArray array = json.get(DatabaseConnector.RESPONSE).getAsJsonArray();
					if (array.size() > 0) {
						setClass(array.get(0).getAsJsonObject());
					}
				}
			}
		}
	}
	
}
