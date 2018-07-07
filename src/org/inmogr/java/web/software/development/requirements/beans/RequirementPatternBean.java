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

	public boolean isAdd() {
		if (0 == getPatternID()) {return false;}
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
		if (null == getConsideration()) {return false;}
		if (null == getContext()) {return false;}
		if (0 == getRelatedPatternID()) {return false;}
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
		if (0 == getPatternID()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteRequirementPattern(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("pattern_id")) {
            setPatternID(json.get("pattern_id").getAsInt());
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
		if (json.has("consideration_con_constraint")) {
            setConsideration_conConstraint(json.get("consideration_con_constraint").getAsString());
        }
		if (json.has("consideration_con_description")) {
            setConsideration_conDescription(json.get("consideration_con_description").getAsString());
        }
		if (json.has("consideration_con_purpose")) {
            setConsideration_conPurpose(json.get("consideration_con_purpose").getAsString());
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
            setRelatedPatternID(json.get("related_pattern_id").getAsInt());
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
