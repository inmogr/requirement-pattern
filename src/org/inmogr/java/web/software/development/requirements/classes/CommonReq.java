package org.inmogr.java.web.software.development.requirements.classes;

public class CommonReq {

	private String commonReqID;
	private String requirementID;
	private String commonDescription;
	private String commonConstraint;
	private String fixedPart;
	private String extendedPart;

	public String getCommonReqID() {
		return commonReqID;
	}

	public void setCommonReqID(String commonReqID) {
		this.commonReqID = commonReqID;
	}

	public String getRequirementID() {
		return requirementID;
	}

	public void setRequirementID(String requirementID) {
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
