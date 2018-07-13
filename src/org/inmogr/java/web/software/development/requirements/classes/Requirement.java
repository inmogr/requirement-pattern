package org.inmogr.java.web.software.development.requirements.classes;

public class Requirement {

	private String reqID;
	private String reqName;
	private String solutionID;
	private RequirementType reqType;
	private String reqDescription;
	private ReqPriority priority;
	private String patternName;

	public String getReqID() {
		return reqID;
	}

	public void setReqID(String reqID) {
		this.reqID = reqID;
	}

	public String getReqName() {
		return reqName;
	}

	public void setReqName(String reqName) {
		this.reqName = reqName;
	}

	public String getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(String solutionID) {
		this.solutionID = solutionID;
	}

	public RequirementType getReqType() {
		return reqType;
	}

	public void setReqType(RequirementType reqType) {
		this.reqType = reqType;
	}
	
	public void setReqType(String reqType) {
		if (reqType.equals(RequirementType.functional.name())) {
			this.reqType = RequirementType.functional;
		}
		else if (reqType.equals(RequirementType.nonfunctional.name())) {
			this.reqType = RequirementType.nonfunctional;
		}
		else if (reqType.equals(RequirementType.nontechnical.name())) {
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
		if (priority.equals(ReqPriority.high.name())) {
			this.priority = ReqPriority.high;
		}
		else if (priority.equals(ReqPriority.low.name())) {
			this.priority = ReqPriority.low;
		}
		else if (priority.equals(ReqPriority.neutral.name())) {
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
