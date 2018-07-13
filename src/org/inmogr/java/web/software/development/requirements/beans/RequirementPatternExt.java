package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.web.software.development.requirements.classes.Author;
import org.inmogr.java.web.software.development.requirements.classes.Classification;
import org.inmogr.java.web.software.development.requirements.classes.ForDesign;
import org.inmogr.java.web.software.development.requirements.classes.ForDevelopment;
import org.inmogr.java.web.software.development.requirements.classes.ForTesting;
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
	private String considerationForDesign_conConstraint;
	private String considerationForDesign_conDescription;
	private String considerationForDesign_conPurpose;
	private String considerationForDesign_designPatternName;
	private String considerationForDesign_designGuide;
	private String considerationForDevelopment_conConstraint;
	private String considerationForDevelopment_conDescription;
	private String considerationForDevelopment_conPurpose;
	private String considerationForDevelopment_devGuide;
	private String considerationForTesting_conConstraint;
	private String considerationForTesting_conDescription;
	private String considerationForTesting_conPurpose;
	private String considerationForTesting_testType;
	private String considerationForTesting_testGuide;
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
	
	public String getConsiderationForDesign_conConstraint() {
		String response = considerationForDesign_conConstraint;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDesign_conConstraint(String considerationForDesign_conConstraint) {
		this.considerationForDesign_conConstraint = considerationForDesign_conConstraint;
		ForDesign object = getConsiderationForDesign();
		if (null == object) {
			object = new ForDesign();
		}
		object.setConConstraint(considerationForDesign_conConstraint);
		setConsiderationForDesign(object);
	}

	public String getConsiderationForDesign_conDescription() {
		String response = considerationForDesign_conDescription;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDesign_conDescription(String considerationForDesign_conDescription) {
		this.considerationForDesign_conDescription = considerationForDesign_conDescription;
		ForDesign object = getConsiderationForDesign();
		if (null == object) {
			object = new ForDesign();
		}
		object.setConDescription(considerationForDesign_conDescription);
		setConsiderationForDesign(object);
	}

	public String getConsiderationForDesign_conPurpose() {
		String response = considerationForDesign_conPurpose;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDesign_conPurpose(String considerationForDesign_conPurpose) {
		this.considerationForDesign_conPurpose = considerationForDesign_conPurpose;
		ForDesign object = getConsiderationForDesign();
		if (null == object) {
			object = new ForDesign();
		}
		object.setConPurpose(considerationForDesign_conPurpose);
		setConsiderationForDesign(object);
	}
	
	//
	
	public String getConsiderationForDesign_designPatternName() {
		String response = considerationForDesign_designPatternName;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDesign_designPatternName(String considerationForDesign_designPatternName) {
		this.considerationForDesign_designPatternName = considerationForDesign_designPatternName;
		ForDesign object = getConsiderationForDesign();
		if (null == object) {
			object = new ForDesign();
		}
		object.setDesignPatternName(considerationForDesign_designPatternName);
		setConsiderationForDesign(object);
	}

	public String getConsiderationForDesign_designGuide() {
		String response = considerationForDesign_designGuide;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDesign_designGuide(String considerationForDesign_designGuide) {
		this.considerationForDesign_designGuide = considerationForDesign_designGuide;
		ForDesign object = getConsiderationForDesign();
		if (null == object) {
			object = new ForDesign();
		}
		object.setDesignGuide(considerationForDesign_designGuide);
		setConsiderationForDesign(object);
	}

	public String getConsiderationForDevelopment_conConstraint() {
		String response = considerationForDevelopment_conConstraint;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDevelopment_conConstraint(String considerationForDevelopment_conConstraint) {
		this.considerationForDevelopment_conConstraint = considerationForDevelopment_conConstraint;
		ForDevelopment object = getConsiderationForDevelopment();
		if (null == object) {
			object = new ForDevelopment();
		}
		object.setConConstraint(considerationForDevelopment_conConstraint);
		setConsiderationForDevelopment(object);
	}

	public String getConsiderationForDevelopment_conDescription() {
		String response = considerationForDevelopment_conDescription;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDevelopment_conDescription(String considerationForDevelopment_conDescription) {
		this.considerationForDevelopment_conDescription = considerationForDevelopment_conDescription;
		ForDevelopment object = getConsiderationForDevelopment();
		if (null == object) {
			object = new ForDevelopment();
		}
		object.setConDescription(considerationForDevelopment_conDescription);
		setConsiderationForDevelopment(object);
	}

	public String getConsiderationForDevelopment_conPurpose() {
		String response = considerationForDevelopment_conPurpose;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDevelopment_conPurpose(String considerationForDevelopment_conPurpose) {
		this.considerationForDevelopment_conPurpose = considerationForDevelopment_conPurpose;
		ForDevelopment object = getConsiderationForDevelopment();
		if (null == object) {
			object = new ForDevelopment();
		}
		object.setConPurpose(considerationForDevelopment_conPurpose);
		setConsiderationForDevelopment(object);
	}
	
	//
	
	public String getConsiderationForDevelopment_devGuide() {
		String response = considerationForDevelopment_devGuide;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForDevelopment_devGuide(String considerationForDevelopment_devGuide) {
		this.considerationForDevelopment_devGuide = considerationForDevelopment_devGuide;
		ForDevelopment object = getConsiderationForDevelopment();
		if (null == object) {
			object = new ForDevelopment();
		}
		object.setDevGuide(considerationForDevelopment_devGuide);
		setConsiderationForDevelopment(object);
	}

	public String getConsiderationForTesting_conConstraint() {
		String response = considerationForTesting_conConstraint;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForTesting_conConstraint(String considerationForTesting_conConstraint) {
		this.considerationForTesting_conConstraint = considerationForTesting_conConstraint;
		ForTesting object = getConsiderationForTesting();
		if (null == object) {
			object = new ForTesting();
		}
		object.setConConstraint(considerationForTesting_conConstraint);
		setConsiderationForTesting(object);
	}

	public String getConsiderationForTesting_conDescription() {
		String response = considerationForTesting_conDescription;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForTesting_conDescription(String considerationForTesting_conDescription) {
		this.considerationForTesting_conDescription = considerationForTesting_conDescription;
		ForTesting object = getConsiderationForTesting();
		if (null == object) {
			object = new ForTesting();
		}
		object.setConDescription(considerationForTesting_conDescription);
		setConsiderationForTesting(object);
	}

	public String getConsiderationForTesting_conPurpose() {
		String response = considerationForTesting_conPurpose;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForTesting_conPurpose(String considerationForTesting_conPurpose) {
		this.considerationForTesting_conPurpose = considerationForTesting_conPurpose;
		ForTesting object = getConsiderationForTesting();
		if (null == object) {
			object = new ForTesting();
		}
		object.setConPurpose(considerationForTesting_conPurpose);
		setConsiderationForTesting(object);
	}
	
	//

	public String getConsiderationForTesting_testType() {
		String response = considerationForTesting_testType;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForTesting_testType(String considerationForTesting_testType) {
		this.considerationForTesting_testType = considerationForTesting_testType;
		ForTesting object = getConsiderationForTesting();
		if (null == object) {
			object = new ForTesting();
		}
		object.setTestType(considerationForTesting_testType);
		setConsiderationForTesting(object);
	}

	public String getConsiderationForTesting_testGuide() {
		String response = considerationForTesting_testGuide;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setConsiderationForTesting_testGuide(String considerationForTesting_testGuide) {
		this.considerationForTesting_testGuide = considerationForTesting_testGuide;
		ForTesting object = getConsiderationForTesting();
		if (null == object) {
			object = new ForTesting();
		}
		object.setTestGuide(considerationForTesting_testGuide);
		setConsiderationForTesting(object);
	}

	public String getContext_bussinessDomain() {
		String response = context_bussinessDomain;
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
		if (response == null) {
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
