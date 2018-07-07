package org.inmogr.java.web.software.development.requirements.classes;

public class Classification {

	private String purpose;
	private String classType;
	private boolean allowedValue;
	private Stakeholder audience;
	private String defaultValue;

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public boolean isAllowedValue() {
		return allowedValue;
	}

	public void setAllowedValue(boolean allowedValue) {
		this.allowedValue = allowedValue;
	}

	public Stakeholder getAudience() {
		return audience;
	}

	public void setAudience(Stakeholder audience) {
		this.audience = audience;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
