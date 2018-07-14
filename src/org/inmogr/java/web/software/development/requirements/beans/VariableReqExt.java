package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.web.software.development.requirements.classes.VariablePart;
import org.inmogr.java.web.software.development.requirements.classes.VariableReq;

public class VariableReqExt extends VariableReq {

	private String variableReq_VName;
	private String variableReq_VPName;
	private String variableReq_description;
	private String variableReq_constaints;
	private String variableReq_model;

	public String getVariableReq_VName() {
		String response = variableReq_VName;
		if (variableReq_VName == null) {
			return "";
		}
		return response;
	}

	public void setVariableReq_VName(String variableReq_VName) {
		this.variableReq_VName = variableReq_VName;
		VariablePart object = getVarPart();
		if (null == object) {
			object = new VariablePart();
		}
		object.setVName(variableReq_VName.split(","));
		setVarPart(object);
	}

	public String getVariableReq_VPName() {
		String response = variableReq_VPName;
		if (variableReq_VPName == null) {
			return "";
		}
		return response;
	}

	public void setVariableReq_VPName(String variableReq_VPName) {
		this.variableReq_VPName = variableReq_VPName;
		VariablePart object = getVarPart();
		if (null == object) {
			object = new VariablePart();
		}
		object.setVPName(variableReq_VPName.split(","));
		setVarPart(object);
	}

	public String getVariableReq_description() {
		String response = variableReq_description;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setVariableReq_description(String variableReq_description) {
		this.variableReq_description = variableReq_description;
		VariablePart object = getVarPart();
		if (null == object) {
			object = new VariablePart();
		}
		object.setDescription(variableReq_description);
		setVarPart(object);
	}

	public String getVariableReq_constaints() {
		String response = variableReq_constaints;
		if (response == null) {
			return "";
		}
		return response;
	}

	public void setVariableReq_constaints(String variableReq_constaints) {
		this.variableReq_constaints = variableReq_constaints;
		VariablePart object = getVarPart();
		if (null == object) {
			object = new VariablePart();
		}
		object.setConstraints(variableReq_constaints);
		setVarPart(object);
	}

	public String getVariableReq_model() {
		String response = variableReq_model;
		if (variableReq_model == null) {
			return "";
		}
		return response;
	}

	public void setVariableReq_model(String variableReq_model) {
		this.variableReq_model = variableReq_model;
		VariablePart object = getVarPart();
		if (null == object) {
			object = new VariablePart();
		}
		object.setModel(variableReq_model);
		setVarPart(object);
	}

}
