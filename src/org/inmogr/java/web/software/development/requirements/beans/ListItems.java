package org.inmogr.java.web.software.development.requirements.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListItems {
	
	private int patternID;
	private int solutionID;
	protected Map<String, ArrayList<String>> commonRequirements = new HashMap<>();
	protected Map<String, ArrayList<String>> variableRequirements = new HashMap<>();
	
	//
	//
	//
	//
	//

	public int getPatternID() {
		return patternID;
	}

	public void setPatternID(int patternID) {
		this.patternID = patternID;
	}

	public int getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(int solutionID) {
		this.solutionID = solutionID;
	}

	public void addRequirementID(double requirementID) {
		String key = ""+requirementID;
		if (!commonRequirements.containsKey(key)) {
			commonRequirements.put(key, new ArrayList<>());
		}
		if (!variableRequirements.containsKey(key)) {
			variableRequirements.put(key, new ArrayList<>());
		}
	}

	public void addCommonRequirementID(double requirementID, int commonRequirementID) {
		String key = ""+requirementID;
		if (!commonRequirements.containsKey(key)) {
			commonRequirements.put(key, new ArrayList<>());
		}
		String id = ""+commonRequirementID;
		if (!commonRequirements.get(key).contains(id)) {
			commonRequirements.get(key).add(id);
		}
	}

	public void addVariableReqID(double requirementID, int variableReqID) {
		String key = ""+requirementID;
		if (!variableRequirements.containsKey(key)) {
			variableRequirements.put(key, new ArrayList<>());
		}
		String id = ""+variableReqID;
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
