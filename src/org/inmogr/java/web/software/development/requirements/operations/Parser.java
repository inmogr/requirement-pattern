package org.inmogr.java.web.software.development.requirements.operations;

import org.inmogr.java.web.software.development.requirements.beans.CommonReqBean;
import org.inmogr.java.web.software.development.requirements.beans.RequirementBean;
import org.inmogr.java.web.software.development.requirements.beans.RequirementPatternBean;
import org.inmogr.java.web.software.development.requirements.beans.SPLDomainBean;
import org.inmogr.java.web.software.development.requirements.beans.SolutionBean;
import org.inmogr.java.web.software.development.requirements.beans.VariableReqBean;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Parser {
	
	public static JsonObject parseItem(JsonObject dbFormat, String listType) {
		switch (listType) {
			case "SPLDomain":
                SPLDomainBean object1 = new SPLDomainBean();
                object1.setClass(dbFormat);
				return Converter.getJsonObject(object1);
			case "RequirementPattern":
                RequirementPatternBean object2 = new RequirementPatternBean();
                object2.setClass(dbFormat);
				return Converter.getJsonObject(object2);
			case "Solution":
                SolutionBean object3 = new SolutionBean();
                object3.setClass(dbFormat);
				return Converter.getJsonObject(object3);
			case "Requirement":
                RequirementBean object4 = new RequirementBean();
                object4.setClass(dbFormat);
				return Converter.getJsonObject(object4);
			case "CommonReq":
                CommonReqBean object5 = new CommonReqBean();
                object5.setClass(dbFormat);
				return Converter.getJsonObject(object5);
			case "VariableReq":
                VariableReqBean object6 = new VariableReqBean();
                object6.setClass(dbFormat);
				return Converter.getJsonObject(object6);
			default:
				return new JsonObject();
		}
	}
	
	public static JsonArray parseList(JsonArray dbFormat, String listType) {
		JsonArray javaFormat = new JsonArray();
		for (int index = 0; index < dbFormat.size(); index++) {
			JsonObject old = dbFormat.get(index).getAsJsonObject();
			JsonObject updated = parseItem(old, listType);
			javaFormat.add(updated);
		}
		return javaFormat;
	}
	
	public static Object parseToObject(JsonObject json, String listType) {
		switch (listType) {
			case "SPLDomain":
				return Converter.getObject(json, new SPLDomainBean());
			case "RequirementPattern":
                return Converter.getObject(json, new RequirementPatternBean());
			case "Solution":
                return Converter.getObject(json, new SolutionBean());
			case "Requirement":
                return Converter.getObject(json, new RequirementBean());
			case "CommonReq":
                return Converter.getObject(json, new CommonReqBean());
			case "VariableReq":
                return Converter.getObject(json, new VariableReqBean());
			default:
				return null;
		}
	}

}
