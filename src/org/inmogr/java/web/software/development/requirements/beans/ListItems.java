package org.inmogr.java.web.software.development.requirements.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListItems {
	
	private String patternID;
	private String solutionID;
	protected Map<String, ArrayList<String>> commonRequirements = new HashMap<>();
	protected Map<String, ArrayList<String>> variableRequirements = new HashMap<>();
	
	//
	//
	//
	//
	//

	public String getPatternID() {
		return patternID;
	}

	public void setPatternID(String patternID) {
		this.patternID = patternID;
	}

	public String getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(String solutionID) {
		this.solutionID = solutionID;
	}

	public void addRequirementID(String requirementID) {
		String key = requirementID;
		if (!commonRequirements.containsKey(key)) {
			commonRequirements.put(key, new ArrayList<>());
		}
		if (!variableRequirements.containsKey(key)) {
			variableRequirements.put(key, new ArrayList<>());
		}
	}

	public void addCommonRequirementID(String requirementID, String commonRequirementID) {
		String key = requirementID;
		if (!commonRequirements.containsKey(key)) {
			commonRequirements.put(key, new ArrayList<>());
		}
		String id = commonRequirementID;
		if (!commonRequirements.get(key).contains(id)) {
			commonRequirements.get(key).add(id);
		}
	}

	public void addVariableReqID(String requirementID, String variableReqID) {
		String key = requirementID;
		if (!variableRequirements.containsKey(key)) {
			variableRequirements.put(key, new ArrayList<>());
		}
		String id = variableReqID;
		if (!variableRequirements.get(key).contains(id)) {
			variableRequirements.get(key).add(id);
		}
	}
	
	public Map<String, ArrayList<String>> getCommonRequirements() {
		return commonRequirements;
	}
	
	public Map<String, ArrayList<String>> getVariableRequirements() {
		return variableRequirements;
	}

}
