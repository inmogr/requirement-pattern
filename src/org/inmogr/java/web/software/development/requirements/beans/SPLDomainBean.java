package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.classes.SPLDomain;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordDelete;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import org.inmogr.java.web.software.development.requirements.operations.RecordUpdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class SPLDomainBean extends SPLDomain {
	
	@Override
	public String getSPLDomainName() {
		String response = super.getSPLDomainName();
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
	public String getPatternDescription() {
		String response = super.getPatternDescription();
		if (response == null) {
			return "";
		}
		return response;
	}
	
	@Override
	public String getDateCreated(String format) {
		String response = super.getDateCreated(format);
		if (response == null) {
			return "";
		}
		return response;
	}
	
	public void setDateCreatedAsString(String dateCreated) {
		try {
			setDateCreated(dateCreated);
		}
		catch (Exception e) {}
	}
	
	@Override
	public String getDomainAuthor() {
		String response = super.getDomainAuthor();
		if (response == null) {
			return "";
		}
		return response;
	}

	public boolean isAdd() {
		if (null == getSPLDomainName() || 0 == getSPLDomainName().length()) { return false; }
	    if (null == getGoal() || 0 == getGoal().length()) { return false; }
	    if (null == getPatternDescription() || 0 == getPatternDescription().length()) { return false; }
	    if (null == getDateCreated()) { return false; }
	    if (null == getDomainAuthor() || 0 == getDomainAuthor().length()) { return false; }
		return true;
	}

	public JsonObject add() {
		if (!isAdd()) { return new JsonObject(); }
		return RecordAdd.addSPLDomain(this);
	}

	public boolean isUpdate() {
		return isAdd();
	}

	public JsonObject update() {
		if (!isUpdate()) { return new JsonObject(); }
		return RecordUpdate.updateSPLDomain(this);
	}

	public boolean isDelete() {
		if (null == getSPLDomainName() || 0 == getSPLDomainName().length()) { return false; }
		return true;
	}

	public JsonObject delete() {
		if (!isDelete()) { return new JsonObject(); }
		return RecordDelete.deleteSPLDomain(this);
	}
	
	public void setClass(JsonObject json) {
		if (json.has("spl_domain_name")) {
            setSPLDomainName(json.get("spl_domain_name").getAsString());
        }
		if (json.has("goal")) {
            setGoal(json.get("goal").getAsString());
        }
		if (json.has("pattern_description")) {
            setPatternDescription(json.get("pattern_description").getAsString());
        }
		if (json.has("date_created")) {
            setDateCreated(json.get("date_created").getAsString());
        }
		if (json.has("domain_author")) {
            setDomainAuthor(json.get("domain_author").getAsString());
        }
	}
	
	public void fetch() {
		JsonObject json = RecordSelect.selectSPLDomainByID(getSPLDomainName());
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
