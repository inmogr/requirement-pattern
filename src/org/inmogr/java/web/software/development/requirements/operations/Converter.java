package org.inmogr.java.web.software.development.requirements.operations;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Converter {
	
	public static String arrayToString(String ... values) {
		if (null == values || 0 == values.length) {
			return "";
		}
		String response = "";
		for (String value : values) {
			response += value + ",";
		}
		return response.substring(0, response.length() - 1);
	}
	
	public static String arrayListToString(ArrayList<String> values) {
		if (null == values || 0 == values.size()) {
			return "";
		}
		String response = "";
		for (String value : values) {
			response += value + ",";
		}
		return response.substring(0, response.length() - 1);
	}
	
	public static JsonObject getJsonObject(Object ofObject) {
		return new JsonParser().parse(new Gson().toJson(ofObject)).getAsJsonObject();
	}
	
	public static Object getObject(JsonObject json, Object newObject) {
		return new Gson().fromJson(json, newObject.getClass());	
	}
	
}
