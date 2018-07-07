package org.inmogr.java.web.software.development.requirements.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListItemsOLD {

	private String SPLDomainName;
	private int patternID;
	private int solutionID;
	private double requirementID;
	private int commonRequirementID;
	private int variableReqID;
	
	/**
	 * The key is the requirementID as double to String
	 * and the array list contains ids of common requirements
	 **/
	protected Map<String, ArrayList<String>> commonRequirements = new HashMap<>();
	
	/**
	 * The key is the requirementID as double to String
	 * and the array list contains ids of variable Reqs
	 **/
	protected Map<String, ArrayList<String>> variableRequirements = new HashMap<>();

	public String getSPLDomainName() {
		return SPLDomainName;
	}

	public void setSPLDomainName(String sPLDomainName) {
		SPLDomainName = sPLDomainName;
	}

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

	public double getRequirementID() {
		return requirementID;
	}

	public void setRequirementID(double requirementID) {
		this.requirementID = requirementID;
		String key = ""+requirementID;
		if (!commonRequirements.containsKey(key)) {
			commonRequirements.put(key, new ArrayList<>());
		}
		if (!variableRequirements.containsKey(key)) {
			variableRequirements.put(key, new ArrayList<>());
		}
	}

	public int getCommonRequirementID() {
		return commonRequirementID;
	}

	public void setCommonRequirementID(int commonRequirementID) {
		this.commonRequirementID = commonRequirementID;
		String key = ""+requirementID;
		if (!commonRequirements.containsKey(key)) {
			commonRequirements.put(key, new ArrayList<>());
		}
		String id = ""+commonRequirementID;
		if (!commonRequirements.get(key).contains(id)) {
			commonRequirements.get(key).add(id);
		}
	}

	public int getVariableReqID() {
		return variableReqID;
	}

	public void setVariableReqID(int variableReqID) {
		this.variableReqID = variableReqID;
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

	public void clear() {
		SPLDomainName = null;
		patternID = 0;
		solutionID = 0;
		requirementID = 0;
		commonRequirementID = 0;
		variableReqID = 0;
		commonRequirements = new HashMap<>();
		variableRequirements = new HashMap<>();
	}

}
