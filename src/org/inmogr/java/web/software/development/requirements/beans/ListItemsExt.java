package org.inmogr.java.web.software.development.requirements.beans;

import java.util.HashMap;
import java.util.Map;

public class ListItemsExt {

	// ACTIVE ITEMS
	private String SPLDomainName;
	private int patternID;
	private int solutionID;
	private double requirementID;
	private int commonRequirementID;
	private int variableReqID;
	// ACTIVE ITEMS
	
	protected Map<String, ListItems> requirementPatterns = new HashMap<>();

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
		String key = ""+patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
			requirementPatterns.get(key).setPatternID(patternID);
		}
	}

	public int getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(int solutionID) {
		this.solutionID = solutionID;
		String key = ""+patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).setSolutionID(solutionID);
	}

	public double getRequirementID() {
		return requirementID;
	}

	public void setRequirementID(double requirementID) {
		this.requirementID = requirementID;
		String key = ""+patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).addRequirementID(requirementID);
	}

	public int getCommonRequirementID() {
		return commonRequirementID;
	}

	public void setCommonRequirementID(int commonRequirementID) {
		this.commonRequirementID = commonRequirementID;
		String key = ""+patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).addCommonRequirementID(requirementID, commonRequirementID);
	}

	public int getVariableReqID() {
		return variableReqID;
	}

	public void setVariableReqID(int variableReqID) {
		this.variableReqID = variableReqID;
		String key = ""+patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).addVariableReqID(requirementID, variableReqID);
	}

	public void clear() {
		SPLDomainName = null;
		patternID = 0;
		solutionID = 0;
		requirementID = 0;
		commonRequirementID = 0;
		variableReqID = 0;
		requirementPatterns = new HashMap<>();
	}
	
}
