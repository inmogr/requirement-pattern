package org.inmogr.java.web.software.development.requirements.classes;

public class VariablePart {

	private String[] VName;
	private String[] VPName;
	private String description;
	private String constraints;
	private String model;

	public String[] getVName() {
		return VName;
	}

	public void setVName(String[] vName) {
		VName = vName;
	}

	public String[] getVPName() {
		return VPName;
	}

	public void setVPName(String[] vPName) {
		VPName = vPName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConstraints() {
		return constraints;
	}

	public void setConstraints(String constraints) {
		this.constraints = constraints;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
