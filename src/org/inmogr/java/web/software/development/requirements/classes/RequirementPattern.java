package org.inmogr.java.web.software.development.requirements.classes;

public class RequirementPattern {

	private int patternID;
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
	private Consideration consideration;
	private Context context;
	private int relatedPatternID;
	private PatternRelation relationType;

	public int getPatternID() {
		return patternID;
	}

	public void setPatternID(int patternID) {
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

	public Consideration getConsideration() {
		return consideration;
	}

	public void setConsideration(Consideration consideration) {
		this.consideration = consideration;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public int getRelatedPatternID() {
		return relatedPatternID;
	}

	public void setRelatedPatternID(int relatedPatternID) {
		this.relatedPatternID = relatedPatternID;
	}

	public PatternRelation getRelationType() {
		return relationType;
	}

	public void setRelationType(PatternRelation relationType) {
		this.relationType = relationType;
	}

}
