package org.inmogr.java.web.software.development.requirements.classes;

public class CommonReq {

	private int commonReqID;
	private double requirementID;
	private String commonDescription;
	private String commonConstraint;
	private String fixedPart;
	private String extendedPart;

	public int getCommonReqID() {
		return commonReqID;
	}

	public void setCommonReqID(int commonReqID) {
		this.commonReqID = commonReqID;
	}

	public double getRequirementID() {
		return requirementID;
	}

	public void setRequirementID(double requirementID) {
		this.requirementID = requirementID;
	}

	public String getCommonDescription() {
		return (commonDescription == null) ? "" : commonDescription;
	}

	public void setCommonDescription(String commonDescription) {
		this.commonDescription = commonDescription;
	}

	public String getCommonConstraint() {
		return (commonConstraint == null) ? "" : commonConstraint;
	}

	public void setCommonConstraint(String commonConstraint) {
		this.commonConstraint = commonConstraint;
	}

	public String getFixedPart() {
		return (fixedPart == null) ? "" : fixedPart;
	}

	public void setFixedPart(String fixedPart) {
		this.fixedPart = fixedPart;
	}

	public String getExtendedPart() {
		return (extendedPart == null) ? "" : extendedPart;
	}

	public void setExtendedPart(String extendedPart) {
		this.extendedPart = extendedPart;
	}

}
