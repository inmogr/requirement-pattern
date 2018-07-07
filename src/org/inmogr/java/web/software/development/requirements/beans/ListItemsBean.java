package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.operations.Converter;
import org.inmogr.java.web.software.development.requirements.operations.Parser;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class ListItemsBean extends ListItemsExt {

	private JsonArray listItems;
	
	private JsonObject getItem(int index) {
		if (index < 0 || listItems.size() <= index) {
			return null;
		}
		else {
			return listItems.get(index).getAsJsonObject();
		}
	}
	
	public String getItem(int index, String listType, String child) {
		JsonObject json = getItem(index);
		if (json == null) {
			return "";
		}
		switch (listType) {
			case "SPLDomain":
				SPLDomainBean splDomain = (SPLDomainBean) Converter.getObject(json, new SPLDomainBean());
				if (child.equals("id")) {
					return "" + splDomain.getSPLDomainName();
				}
				else {
					return "-";
				}
			case "RequirementPattern":
				RequirementPatternBean requirementPattern = (RequirementPatternBean) Converter.getObject(json, new RequirementPatternBean());
				if (child.equals("id")) {
					return "" + requirementPattern.getPatternID();
				}
				else {
					return "" + requirementPattern.getPatternName();
				}
			case "Solution":
				SolutionBean solution = (SolutionBean) Converter.getObject(json, new SolutionBean());
				if (child.equals("id")) {
					return "" + solution.getSolutionID();
				}
				else {
					return "" + solution.getSolutionName();
				}
			case "Requirement":
				RequirementBean requirement = (RequirementBean) Converter.getObject(json, new RequirementBean());
				if (child.equals("id")) {
					return "" + requirement.getReqID();
				}
				else {
					return "" + requirement.getReqName();
				}
			case "CommonReq":
				CommonReqBean commonReq = (CommonReqBean) Converter.getObject(json, new CommonReqBean());
				if (child.equals("id")) {
					return "" + commonReq.getCommonReqID();
				}
				else {
					return "" + commonReq.getCommonDescription();
				}
			case "VariableReq":
				VariableReqBean variableReq = (VariableReqBean) Converter.getObject(json, new VariableReqBean());
				if (child.equals("id")) {
					return "" + variableReq.getVariableReqID();
				}
				else {
					return "" + variableReq.getVarDescription();
				}
			default:
				return "";
		}
	}
	
	public JsonArray getListItems() {
		return listItems;
	}

	public void setListItems(String listType) {
		JsonObject response = null;
		switch (listType) {
			case "SPLDomain":
				response = RecordSelect.selectSPLDomain();
				break;
			case "RequirementPattern":
				if (null == getSPLDomainName()) {
					setSPLDomainName("");
				}
				response = RecordSelect.selectRequirementPattern(getSPLDomainName());
				break;
			case "Solution":
				response = RecordSelect.selectSolution(getPatternID());
				break;
			case "Requirement":
				response = RecordSelect.selectRequirement(getSolutionID());
				break;
			case "CommonReq":
				response = RecordSelect.selectCommonReq(getRequirementID());
				break;
			case "VariableReq":
				response = RecordSelect.selectVariableReq(getRequirementID());
				break;
		}
		if (response != null && response.has(DatabaseConnector.STATUS) && response.has(DatabaseConnector.RESPONSE)) {
			if (response.get(DatabaseConnector.STATUS).getAsString().equals(DatabaseConnector.SUCCESSFUL)
					&& response.get(DatabaseConnector.RESPONSE).isJsonArray()) {
				listItems = Parser.parseList(response.get(DatabaseConnector.RESPONSE).getAsJsonArray(), listType);
				return;
			}
		}
		listItems = new JsonArray();
	}
	
	public void clear() {
		super.clear();
	}
	
}
