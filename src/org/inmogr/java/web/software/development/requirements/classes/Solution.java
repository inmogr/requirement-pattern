package org.inmogr.java.web.software.development.requirements.classes;

public class Solution {

	private int solutionID;
	private String solutionName;
	private int patternID;
	private String goal;
	private String description;
	private OrthogonalVM variabilityModel;

	public int getSolutionID() {
		return solutionID;
	}

	public void setSolutionID(int solutionID) {
		this.solutionID = solutionID;
	}

	public String getSolutionName() {
		return solutionName;
	}

	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

	public int getPatternID() {
		return patternID;
	}

	public void setPatternID(int patternID) {
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
