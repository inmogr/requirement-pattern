package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.classes.VariablePart;
import org.inmogr.java.web.software.development.requirements.operations.Converter;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordDelete;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import org.inmogr.java.web.software.development.requirements.operations.RecordUpdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class VariableReqBean extends VariableReqExt {
	
	@Override
	public String getVariableReqID() {
		String response = super.getVariableReqID();
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
	
	@Override
	public String getVarDescription() {
		String response = super.getVarDescription();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getVarConstraint() {
		String response = super.getVarConstraint();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getFixedPart() {
		String response = super.getFixedPart();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getVariationPoint() {
		String response = super.getVariationPoint();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public VariablePart getVarPart() {
		VariablePart response = super.getVarPart();
		if (response == null) {
			return new VariablePart();
		}
		return response;
	}
	
	public String getVNameAsString() {
		VariablePart object = getVarPart();
		String[] response = object.getVName();
		if (response == null) {
			return "";
		}
		return Converter.arrayToString(response);
	}
	
	public String getVPNameAsString() {
		VariablePart object = getVarPart();
		String[] response = object.getVPName();
		if (response == null) {
			return "";
		}
		return Converter.arrayToString(response);
	}

	public boolean isAdd() {
		if (null == getVariableReqID() || 0 == getVariableReqID().length()) {return false;}
		if (null == getRequirementID() || 0 == getRequirementID().length()) {return false;}
		if (0 == getVarDescription().length()) {return false;}
		if (0 == getVarConstraint().length()) {return false;}
		if (0 == getFixedPart().length()) {return false;}
		if (0 == getVariationPoint().length()) {return false;}
		if (null == getVarPart().getVName() || 0 == getVarPart().getVName().length) {return false;}
		if (null == getVarPart().getVPName() || 0 == getVarPart().getVPName().length) {return false;}
		if (null == getVarPart().getModel() || 0 == getVarPart().getModel().length()) {return false;}
		return true;
	}

	public JsonObject add() {
		if (!isAdd()) { return new JsonObject(); }
		return RecordAdd.addVariableReq(this);
	}

	public boolean isUpdate() {
		return isAdd();
	}

	public JsonObject update() {
		if (!isUpdate()) { return new JsonObject(); }
		return RecordUpdate.updateVariableReq(this);
	}

	public boolean isDelete() {
		if (null == getVariableReqID() || 0 == getVariableReqID().length()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteVariableReq(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("variable_req_id")) {
            setVariableReqID(json.get("variable_req_id").getAsString());
        }
		if (json.has("requirement_id")) {
            setRequirementID(json.get("requirement_id").getAsString());
        }
		if (json.has("var_description")) {
            setVarDescription(json.get("var_description").getAsString());
        }
		if (json.has("var_constraint")) {
            setVarConstraint(json.get("var_constraint").getAsString());
        }
		if (json.has("fixed_part")) {
            setFixedPart(json.get("fixed_part").getAsString());
        }
		if (json.has("variation_point")) {
            setVariationPoint(json.get("variation_point").getAsString());
        }
		if (json.has("v_name")) {
            setVariableReq_VName(json.get("v_name").getAsString());
        }
		if (json.has("vp_name")) {
            setVariableReq_VPName(json.get("vp_name").getAsString());
        }
		if (json.has("model")) {
            setVariableReq_model(json.get("model").getAsString());
        }
	}
	
	public void fetch() {
		JsonObject json = RecordSelect.selectVariableReqByID(getVariableReqID());
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
