package org.inmogr.java.web.software.development.requirements.global;

public class HTML {
	public static final String PUBLIC_DIR = "/Requirement_Pattern";
	public static final String RESOURCE_DIR = PUBLIC_DIR+"/resources";
	public static final String ADMIN_DIR = PUBLIC_DIR+"/admin";
	public static final String JQUERY = "<script src=\""+RESOURCE_DIR+"/jquery-3.3.1.slim.min.js\"></script>";
	public static final String POPPER = "<script src=\""+RESOURCE_DIR+"/popper.min.js\"></script>";
	public static final String BOOT_JS = "<script src=\""+RESOURCE_DIR+"/bootstrap/js/bootstrap.min.js\"></script>";
	public static final String BOOT_CSS = "<link href=\""+RESOURCE_DIR+"/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">";
	public static final String DATATABLES_CSS = "<link href=\""+RESOURCE_DIR+"/datatables/jquery.dataTables.css\" rel=\"stylesheet\">";
	public static final String DATATABLES_JS = "<script src=\""+RESOURCE_DIR+"/datatables/jquery.dataTables.js\"></script>";
	
	public static String getSelected(String value, String defaultValue) {
		if (value.equals(defaultValue)) {
			return "selected";
		}
		else {
			return "";
		}
	}
	
	public static String getSelected(boolean value, boolean defaultValue) {
		if (value == defaultValue) {
			return "selected";
		}
		else {
			return "";
		}
	}
}
