package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.web.software.development.requirements.classes.Author;
import org.inmogr.java.web.software.development.requirements.classes.Classification;
import org.inmogr.java.web.software.development.requirements.classes.Consideration;
import org.inmogr.java.web.software.development.requirements.classes.Context;
import org.inmogr.java.web.software.development.requirements.classes.PatternRelation;
import org.inmogr.java.web.software.development.requirements.classes.RequirementPattern;
import org.inmogr.java.web.software.development.requirements.classes.Stakeholder;
import org.inmogr.java.web.software.development.requirements.classes.extended.MyDate;

public class RequirementPatternExt extends RequirementPattern {
	private String author_name;
	private String author_date;
	private String classification_classType;
	private String classification_defaultValue;
	private String classification_purpose;
	private String classification_audience_role;
	private String classification_audience_stakeGoal;
	private boolean classification_allowedValue;
	private String consideration_conConstraint;
	private String consideration_conDescription;
	private String consideration_conPurpose;
	private String context_bussinessDomain;
	private String context_organizationFactor;
	private String context_patternType;
	private String context_reqAct;
	private String context_stakeholder_role;
	private String context_stakeholder_stakeGoal;
	private boolean relationType_relationExtends;
	private boolean relationType_relationRefers;

	public String getAuthor_name() {
		String response = author_name;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
		Author object = getAuthor();
		if (null == object) {
			object = new Author();
		}
		object.setName(author_name);
		setAuthor(object);
	}

	public String getAuthor_date() {
		String response = author_date;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setAuthor_date(String author_date) {
		this.author_date = author_date;
		Author object = getAuthor();
		if (null == object) {
			object = new Author();
		}
		object.setDate(new MyDate(author_date, "yyyy-mm-dd"));
		setAuthor(object);
	}

	public String getClassification_classType() {
		String response = classification_classType;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setClassification_classType(String classification_classType) {
		this.classification_classType = classification_classType;
		Classification object = getClassification();
		if (null == object) {
			object = new Classification();
		}
		object.setClassType(classification_classType);
		setClassification(object);
	}

	public String getClassification_defaultValue() {
		String response = classification_defaultValue;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setClassification_defaultValue(String classification_defaultValue) {
		this.classification_defaultValue = classification_defaultValue;
		Classification object = getClassification();
		if (null == object) {
			object = new Classification();
		}
		object.setDefaultValue(classification_defaultValue);
		setClassification(object);
	}

	public String getClassification_purpose() {
		String response = classification_purpose;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setClassification_purpose(String classification_purpose) {
		this.classification_purpose = classification_purpose;
		Classification object = getClassification();
		if (null == object) {
			object = new Classification();
		}
		object.setPurpose(classification_purpose);
		setClassification(object);
	}

	public String getClassification_audience_role() {
		String response = classification_audience_role;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setClassification_audience_role(String classification_audience_role) {
		this.classification_audience_role = classification_audience_role;
		Classification object = getClassification();
		if (null == object) {
			object = new Classification();
		}
		Stakeholder object2 = object.getAudience();
		if (null == object2) {
			object2 = new Stakeholder();
		}
		object2.setRole(classification_audience_role);
		object.setAudience(object2);
		setClassification(object);
	}

	public String getClassification_audience_stakeGoal() {
		String response = classification_audience_stakeGoal;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setClassification_audience_stakeGoal(String classification_audience_stakeGoal) {
		this.classification_audience_stakeGoal = classification_audience_stakeGoal;
		Classification object = getClassification();
		if (null == object) {
			object = new Classification();
		}
		Stakeholder object2 = object.getAudience();
		if (null == object2) {
			object2 = new Stakeholder();
		}
		object2.setStakeGoal(classification_audience_stakeGoal);
		object.setAudience(object2);
		setClassification(object);
	}

	public boolean isClassification_allowedValue() {
		return classification_allowedValue;
	}

	public void setClassification_allowedValue(boolean classification_allowedValue) {
		this.classification_allowedValue = classification_allowedValue;
		Classification object = getClassification();
		if (null == object) {
			object = new Classification();
		}
		object.setAllowedValue(classification_allowedValue);
		setClassification(object);
	}

	public String getConsideration_conConstraint() {
		String response = consideration_conConstraint;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setConsideration_conConstraint(String consideration_conConstraint) {
		this.consideration_conConstraint = consideration_conConstraint;
		Consideration object = getConsideration();
		if (null == object) {
			object = new Consideration();
		}
		object.setConConstraint(consideration_conConstraint);
		setConsideration(object);
	}

	public String getConsideration_conDescription() {
		String response = consideration_conDescription;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setConsideration_conDescription(String consideration_conDescription) {
		this.consideration_conDescription = consideration_conDescription;
		Consideration object = getConsideration();
		if (null == object) {
			object = new Consideration();
		}
		object.setConDescription(consideration_conDescription);
		setConsideration(object);
	}

	public String getConsideration_conPurpose() {
		String response = consideration_conPurpose;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setConsideration_conPurpose(String consideration_conPurpose) {
		this.consideration_conPurpose = consideration_conPurpose;
		Consideration object = getConsideration();
		if (null == object) {
			object = new Consideration();
		}
		object.setConPurpose(consideration_conPurpose);
		setConsideration(object);
	}

	public String getContext_bussinessDomain() {
		String response = context_bussinessDomain;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setContext_bussinessDomain(String context_bussinessDomain) {
		this.context_bussinessDomain = context_bussinessDomain;
		Context object = getContext();
		if (null == object) {
			object = new Context();
		}
		object.setBussinessDomain(context_bussinessDomain);
		setContext(object);
	}

	public String getContext_organizationFactor() {
		String response = context_organizationFactor;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setContext_organizationFactor(String context_organizationFactor) {
		this.context_organizationFactor = context_organizationFactor;
		Context object = getContext();
		if (null == object) {
			object = new Context();
		}
		object.setOrganizationFactor(context_organizationFactor);
		setContext(object);
	}

	public String getContext_patternType() {
		String response = context_patternType;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setContext_patternType(String context_patternType) {
		this.context_patternType = context_patternType;
		Context object = getContext();
		if (null == object) {
			object = new Context();
		}
		object.setPatternType(context_patternType);
		setContext(object);
	}

	public String getContext_reqAct() {
		String response = context_reqAct;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setContext_reqAct(String context_reqAct) {
		this.context_reqAct = context_reqAct;
		Context object = getContext();
		if (null == object) {
			object = new Context();
		}
		object.setReqAct(context_reqAct);
		setContext(object);
	}

	public String getContext_stakeholder_role() {
		String response = context_stakeholder_role;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setContext_stakeholder_role(String context_stakeholder_role) {
		this.context_stakeholder_role = context_stakeholder_role;
		Context object = getContext();
		if (null == object) {
			object = new Context();
		}
		Stakeholder object2 = object.getStakeholder();
		if (null == object2) {
			object2 = new Stakeholder();
		}
		object2.setRole(context_stakeholder_role);
		object.setStakeholder(object2);
		setContext(object);
	}

	public String getContext_stakeholder_stakeGoal() {
		String response = context_stakeholder_stakeGoal;
		if (author_name == null) {
			return "";
		}
		return response;
	}

	public void setContext_stakeholder_stakeGoal(String context_stakeholder_stakeGoal) {
		this.context_stakeholder_stakeGoal = context_stakeholder_stakeGoal;
		Context object = getContext();
		if (null == object) {
			object = new Context();
		}
		Stakeholder object2 = object.getStakeholder();
		if (null == object2) {
			object2 = new Stakeholder();
		}
		object2.setStakeGoal(context_stakeholder_stakeGoal);
		object.setStakeholder(object2);
		setContext(object);
	}

	public boolean isRelationType_relationExtends() {
		return relationType_relationExtends;
	}

	public void setRelationType_relationExtends(boolean relationType_relationExtends) {
		this.relationType_relationExtends = relationType_relationExtends;
		PatternRelation object = getRelationType();
		if (null == object) {
			object = new PatternRelation();
		}
		object.setRelationExtends(relationType_relationExtends);
		setRelationType(object);
	}

	public boolean isRelationType_relationRefers() {
		return relationType_relationRefers;
	}

	public void setRelationType_relationRefers(boolean relationType_relationRefers) {
		this.relationType_relationRefers = relationType_relationRefers;
		PatternRelation object = getRelationType();
		if (null == object) {
			object = new PatternRelation();
		}
		object.setRelationRefers(relationType_relationRefers);
		setRelationType(object);
	}

}
