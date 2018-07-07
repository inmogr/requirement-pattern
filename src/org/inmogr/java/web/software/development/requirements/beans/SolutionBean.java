package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.classes.OrthogonalVM;
import org.inmogr.java.web.software.development.requirements.classes.Solution;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordDelete;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import org.inmogr.java.web.software.development.requirements.operations.RecordUpdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class SolutionBean extends Solution {
	
	@Override
	public String getSolutionName() {
		String response = super.getSolutionName();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getGoal() {
		String response = super.getGoal();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getDescription() {
		String response = super.getDescription();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	public String getVariabilityModelDescription() {
		OrthogonalVM object = getVariabilityModel();
		if (null == object) {
			object = new OrthogonalVM();
		}
		String response = object.getVMDescription();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	public void setVariabilityModelDescription(String variabilityModelDescription) {
		OrthogonalVM object = getVariabilityModel();
		if (null == object) {
			object = new OrthogonalVM();
		}
		object.setVMDescription(variabilityModelDescription);
		setVariabilityModel(object);
	}

	public boolean isAdd() {
		if (0 == getSolutionID()) {return false;}
		if (null == getSolutionName() || 0 == getSolutionName().length()) {return false;}
		if (0 == getPatternID()) {return false;}
		if (null == getGoal() || 0 == getGoal().length()) {return false;}
		if (null == getDescription() || 0 == getDescription().length()) {return false;}
		if (null == getVariabilityModel()) {return false;}
		return true;
	}

	public JsonObject add() {
		if (!isAdd()) { return new JsonObject(); }
		return RecordAdd.addSolution(this);
	}

	public boolean isUpdate() {
		return isAdd();
	}

	public JsonObject update() {
		if (!isUpdate()) { return new JsonObject(); }
		return RecordUpdate.updateSolution(this);
	}

	public boolean isDelete() {
		if (0 == getSolutionID()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteSolution(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("solution_id")) {
            setSolutionID(json.get("solution_id").getAsInt());
        }
		if (json.has("solution_name")) {
            setSolutionName(json.get("solution_name").getAsString());
        }
		if (json.has("pattern_id")) {
            setPatternID(json.get("pattern_id").getAsInt());
        }
		if (json.has("goal")) {
            setGoal(json.get("goal").getAsString());
        }
		if (json.has("description")) {
            setDescription(json.get("description").getAsString());
        }
		if (json.has("variability_model_vm_description")) {
			setVariabilityModelDescription(json.get("variability_model_vm_description").getAsString());
        }
	}
	
	public void fetch() {
		JsonObject json = RecordSelect.selectSolutionByID(getSolutionID());
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
