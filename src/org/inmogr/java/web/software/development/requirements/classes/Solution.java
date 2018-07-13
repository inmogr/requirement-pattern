package org.inmogr.java.web.software.development.requirements.classes;

public class Solution {

	private String solutionID;
	private String solutionName;
	private String patternID;
	private String goal;
	private String description;
	private OrthogonalVM variabilityModel;

	public String getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(String solutionID) {
		this.solutionID = solutionID;
	}

	public String getSolutionName() {
		return solutionName;
	}

	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

	public String getPatternID() {
		return patternID;
	}

	public void setPatternID(String patternID) {
		this.patternID = patternID;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OrthogonalVM getVariabilityModel() {
		return variabilityModel;
	}

	public void setVariabilityModel(OrthogonalVM variabilityModel) {
		this.variabilityModel = variabilityModel;
	}

}
