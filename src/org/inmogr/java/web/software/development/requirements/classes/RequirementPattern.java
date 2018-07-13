package org.inmogr.java.web.software.development.requirements.classes;

public class RequirementPattern {

	private String patternID;
	private String patternName;
	private String AKA;
	private String knownUses;
	private String application;
	private String SPLDomainName;
	private String problem;
	private String force;
	private String example;
	private Author author;
	private Classification classification;
	private ForDesign considerationForDesign;
	private ForDevelopment considerationForDevelopment;
	private ForTesting considerationForTesting;
	private Context context;
	private String relatedPatternID;
	private PatternRelation relationType;

	public String getPatternID() {
		return patternID;
	}

	public void setPatternID(String patternID) {
		this.patternID = patternID;
	}

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	public String getAKA() {
		return AKA;
	}

	public void setAKA(String aKA) {
		AKA = aKA;
	}

	public String getKnownUses() {
		return knownUses;
	}

	public void setKnownUses(String knownUses) {
		this.knownUses = knownUses;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getSPLDomainName() {
		return SPLDomainName;
	}

	public void setSPLDomainName(String sPLDomainName) {
		SPLDomainName = sPLDomainName;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getForce() {
		return force;
	}

	public void setForce(String force) {
		this.force = force;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public ForDesign getConsiderationForDesign() {
		return considerationForDesign;
	}

	public void setConsiderationForDesign(ForDesign considerationForDesign) {
		this.considerationForDesign = considerationForDesign;
	}

	public ForDevelopment getConsiderationForDevelopment() {
		return considerationForDevelopment;
	}

	public void setConsiderationForDevelopment(ForDevelopment considerationForDevelopment) {
		this.considerationForDevelopment = considerationForDevelopment;
	}

	public ForTesting getConsiderationForTesting() {
		return considerationForTesting;
	}

	public void setConsiderationForTesting(ForTesting considerationForTesting) {
		this.considerationForTesting = considerationForTesting;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public String getRelatedPatternID() {
		return relatedPatternID;
	}

	public void setRelatedPatternID(String relatedPatternID) {
		this.relatedPatternID = relatedPatternID;
	}

	public PatternRelation getRelationType() {
		return relationType;
	}

	public void setRelationType(PatternRelation relationType) {
		this.relationType = relationType;
	}

}
