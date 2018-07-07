package org.inmogr.java.web.software.development.requirements.classes;

public class Requirement {

	private double reqID;
	private String reqName;
	private int solutionID;
	private RequirementType reqType;
	private String reqDescription;
	private ReqPriority priority;
	private String patternName;

	public double getReqID() {
		return reqID;
	}

	public void setReqID(double reqID) {
		this.reqID = reqID;
	}

	public String getReqName() {
		return reqName;
	}

	public void setReqName(String reqName) {
		this.reqName = reqName;
	}

	public int getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(int solutionID) {
		this.solutionID = solutionID;
	}

	public RequirementType getReqType() {
		return reqType;
	}

	public void setReqType(RequirementType reqType) {
		this.reqType = reqType;
	}
	
	public void setReqType(String reqType) {
		if (reqType == RequirementType.functional.name()) {
			this.reqType = RequirementType.functional;
		}
		else if (reqType == RequirementType.nonfunctional.name()) {
			this.reqType = RequirementType.nonfunctional;
		}
		else if (reqType == RequirementType.nontechnical.name()) {
			this.reqType = RequirementType.nontechnical;
		}
		else {
			this.reqType = RequirementType.none;
		}
	}

	public String getReqDescription() {
		return reqDescription;
	}

	public void setReqDescription(String reqDescription) {
		this.reqDescription = reqDescription;
	}

	public ReqPriority getPriority() {
		return priority;
	}

	public void setPriority(ReqPriority priority) {
		this.priority = priority;
	}
	
	public void setPriority(String priority) {
		if (priority == ReqPriority.high.name()) {
			this.priority = ReqPriority.high;
		}
		else if (priority == ReqPriority.low.name()) {
			this.priority = ReqPriority.low;
		}
		else if (priority == ReqPriority.neutral.name()) {
			this.priority = ReqPriority.neutral;
		}
		else {
			this.priority = ReqPriority.none;
		}
	}

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

}
