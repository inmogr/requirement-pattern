package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.classes.Requirement;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordDelete;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import org.inmogr.java.web.software.development.requirements.operations.RecordUpdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class RequirementBean extends Requirement {
	
	@Override
	public String getReqID() {
		String response = super.getReqID();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getSolutionID() {
		String response = super.getSolutionID();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getReqName() {
		String response = super.getReqName();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	public String getReqTypeAsString() {
		if (null == getReqType()) {
			return "";
		}
		return super.getReqType().name();
	}
	
	public void setReqTypeAsString(String reqType) {
		super.setReqType(reqType);
	}
	
	@Override
	public String getReqDescription() {
		String response = super.getReqDescription();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	public String getPriorityAsString() {
		if (null == getPriority()) {
			return "";
		}
		return super.getPriority().name();
	}
	
	public void setPriorityAsString(String priority) {
		super.setPriority(priority);
	}
	
	@Override
	public String getPatternName() {
		String response = super.getPatternName();
		if (response == null) {
			return "";
		}
		return response;
	}

	public boolean isAdd() {
		if (null == getReqID() || 0 == getReqID().length()) {return false;}
		if (null == getReqName() || 0 == getReqName().length()) {return false;}
		if (null == getSolutionID() || 0 == getSolutionID().length()) {return false;}
		if (null == getReqType()) {return false;}
		if (null == getReqDescription() || 0 == getReqDescription().length()) {return false;}
		if (null == getPriority()) {return false;}
		if (null == getPatternName() || 0 == getPatternName().length()) {return false;}
		return true;
	}

	public JsonObject add() {
		if (!isAdd()) { return new JsonObject(); }
		return RecordAdd.addRequirement(this);
	}

	public boolean isUpdate() {
		return isAdd();
	}

	public JsonObject update() {
		if (!isUpdate()) { return new JsonObject(); }
		return RecordUpdate.updateRequirement(this);
	}
	
	public boolean isDelete() {
		if (null == getReqID() || 0 == getReqID().length()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteRequirement(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("req_id")) {
            setReqID(json.get("req_id").getAsString());
        }
		if (json.has("req_name")) {
            setReqName(json.get("req_name").getAsString());
        }
		if (json.has("solution_id")) {
            setSolutionID(json.get("solution_id").getAsString());
        }
		if (json.has("req_type")) {
            setReqTypeAsString(json.get("req_type").getAsString());
        }
		if (json.has("req_description")) {
            setReqDescription(json.get("req_description").getAsString());
        }
		if (json.has("priority")) {
			setPriorityAsString(json.get("priority").getAsString());
        }
		if (json.has("pattern_name")) {
			setPatternName(json.get("pattern_name").getAsString());
        }
	}
	
	public void fetch() {
		JsonObject json = RecordSelect.selectRequirementByID(getReqID());
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
