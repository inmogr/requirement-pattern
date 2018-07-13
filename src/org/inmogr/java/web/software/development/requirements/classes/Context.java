package org.inmogr.java.web.software.development.requirements.classes;

public class Context {

	private String bussinessDomain;
	private String organizationFactor;
	private PatternType patternType;
	private ReqEngAct reqAct;
	private Stakeholder stakeholder;

	public String getBussinessDomain() {
		return bussinessDomain;
	}

	public void setBussinessDomain(String bussinessDomain) {
		this.bussinessDomain = bussinessDomain;
	}

	public String getOrganizationFactor() {
		return organizationFactor;
	}

	public void setOrganizationFactor(String organizationFactor) {
		this.organizationFactor = organizationFactor;
	}

	public PatternType getPatternType() {
		return patternType;
	}

	public void setPatternType(PatternType patternType) {
		this.patternType = patternType;
	}
	
	public void setPatternType(String patternType) {
		if (patternType.equals(PatternType.product.name())) {
			this.patternType = PatternType.product;
		}
		else if (patternType.equals(PatternType.process.name())) {
			this.patternType = PatternType.process;
		}
		else {
			this.patternType = PatternType.none;
		}
	}

	public ReqEngAct getReqAct() {
		return reqAct;
	}

	public void setReqAct(ReqEngAct reqAct) {
		this.reqAct = reqAct;
	}
	
	public void setReqAct(String reqAct) {
		if (reqAct.equals(ReqEngAct.elicitation.name())) {
			this.reqAct = ReqEngAct.elicitation;
		}
		else if (reqAct.equals(ReqEngAct.specification.name())) {
			this.reqAct = ReqEngAct.specification;
		}
		else if (reqAct.equals(ReqEngAct.validation.name())) {
			this.reqAct = ReqEngAct.validation;
		}
		else if (reqAct.equals(ReqEngAct.allReqActivities.name())) {
			this.reqAct = ReqEngAct.allReqActivities;
		}
		else {
			this.reqAct = ReqEngAct.none;
		}
	}

	public Stakeholder getStakeholder() {
		return stakeholder;
	}

	public void setStakeholder(Stakeholder stakeholder) {
		this.stakeholder = stakeholder;
	}

}
