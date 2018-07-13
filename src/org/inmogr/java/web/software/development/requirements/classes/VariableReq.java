package org.inmogr.java.web.software.development.requirements.classes;

public class VariableReq {

	private String variableReqID;
	private String requirementID;
	private String varDescription;
	private String varConstraint;
	private String fixedPart;
	private String variationPoint;
	private VariablePart varPart;

	public String getVariableReqID() {
		return variableReqID;
	}

	public void setVariableReqID(String variablePartID) {
		this.variableReqID = variablePartID;
	}

	public String getRequirementID() {
		return requirementID;
	}

	public void setRequirementID(String requirementID) {
		this.requirementID = requirementID;
	}

	public String getVarDescription() {
		return varDescription;
	}

	public void setVarDescription(String varDescription) {
		this.varDescription = varDescription;
	}

	public String getVarConstraint() {
		return varConstraint;
	}

	public void setVarConstraint(String varConstraint) {
		this.varConstraint = varConstraint;
	}

	public String getFixedPart() {
		return fixedPart;
	}

	public void setFixedPart(String fixedPart) {
		this.fixedPart = fixedPart;
	}

	public String getVariationPoint() {
		return variationPoint;
	}

	public void setVariationPoint(String variationPoint) {
		this.variationPoint = variationPoint;
	}

	public VariablePart getVarPart() {
		return varPart;
	}

	public void setVarPart(VariablePart varPart) {
		this.varPart = varPart;
	}

}
