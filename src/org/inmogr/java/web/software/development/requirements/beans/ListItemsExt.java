package org.inmogr.java.web.software.development.requirements.beans;

import java.util.HashMap;
import java.util.Map;

public class ListItemsExt {

	// ACTIVE ITEMS
	private String SPLDomainName;
	private String patternID;
	private String solutionID;
	private String requirementID;
	private String commonRequirementID;
	private String variableReqID;
	// ACTIVE ITEMS
	
	protected Map<String, ListItems> requirementPatterns = new HashMap<>();

	public String getSPLDomainName() {
		return SPLDomainName;
	}

	public void setSPLDomainName(String sPLDomainName) {
		SPLDomainName = sPLDomainName;
	}

	public String getPatternID() {
		return patternID;
	}

	public void setPatternID(String patternID) {
		this.patternID = patternID;
		String key = patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
			requirementPatterns.get(key).setPatternID(patternID);
		}
	}

	public String getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(String solutionID) {
		this.solutionID = solutionID;
		String key = patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).setSolutionID(solutionID);
	}

	public String getRequirementID() {
		return requirementID;
	}

	public void setRequirementID(String requirementID) {
		this.requirementID = requirementID;
		String key = patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).addRequirementID(requirementID);
	}

	public String getCommonRequirementID() {
		return commonRequirementID;
	}

	public void setCommonRequirementID(String commonRequirementID) {
		this.commonRequirementID = commonRequirementID;
		String key = patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).addCommonRequirementID(requirementID, commonRequirementID);
	}

	public String getVariableReqID() {
		return variableReqID;
	}

	public void setVariableReqID(String variableReqID) {
		this.variableReqID = variableReqID;
		String key = patternID;
		if (!requirementPatterns.containsKey(key)) {
			requirementPatterns.put(key, new ListItems());
		}
		requirementPatterns.get(key).addVariableReqID(requirementID, variableReqID);
	}

	public void clear() {
		SPLDomainName = null;
		patternID = null;
		solutionID = null;
		requirementID = null;
		commonRequirementID = null;
		variableReqID = null;
		requirementPatterns = new HashMap<>();
	}
	
}
