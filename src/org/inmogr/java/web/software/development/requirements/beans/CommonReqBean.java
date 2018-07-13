package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.classes.CommonReq;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordDelete;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import org.inmogr.java.web.software.development.requirements.operations.RecordUpdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CommonReqBean extends CommonReq {
	
	@Override
	public String getCommonReqID() {
		String response = super.getCommonReqID();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getRequirementID() {
		String response = super.getRequirementID();
		if (response == null) {
			return "";
		}
		return response;
	}

	public boolean isAdd() {
		if (null == getCommonReqID() || 0 == getCommonReqID().length()) {return false;}
		if (null == getRequirementID() || 0 == getRequirementID().length()) {return false;}
		if (null == getCommonDescription() || 0 == getCommonDescription().length()) {return false;}
		if (null == getCommonConstraint() || 0 == getCommonConstraint().length()) {return false;}
		if (null == getFixedPart() || 0 == getFixedPart().length()) {return false;}
		if (null == getExtendedPart() || 0 == getExtendedPart().length()) {return false;}
		return true;
	}

	public JsonObject add() {
		if (!isAdd()) { return new JsonObject(); }
		return RecordAdd.addCommonReq(this);
	}

	public boolean isUpdate() {
		return isAdd();
	}

	public JsonObject update() {
		if (!isUpdate()) { return new JsonObject(); }
		return RecordUpdate.updateCommonReq(this);
	}
	
	public boolean isDelete() {
		if (null == getCommonReqID() || 0 == getCommonReqID().length()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteCommonReq(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("common_req_id")) {
            setCommonReqID(json.get("common_req_id").getAsString());
        }
		if (json.has("requirement_id")) {
            setRequirementID(json.get("requirement_id").getAsString());
        }
		if (json.has("common_description")) {
            setCommonDescription(json.get("common_description").getAsString());
        }
		if (json.has("common_constraint")) {
            setCommonConstraint(json.get("common_constraint").getAsString());
        }
		if (json.has("fixed_part")) {
            setFixedPart(json.get("fixed_part").getAsString());
        }
		if (json.has("extended_part")) {
			setExtendedPart(json.get("extended_part").getAsString());
        }
	}
	
	public void fetch() {
		JsonObject json = RecordSelect.selectCommonReqByID(getCommonReqID());
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
