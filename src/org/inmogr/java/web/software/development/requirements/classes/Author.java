package org.inmogr.java.web.software.development.requirements.classes;

import java.util.Date;

import org.inmogr.java.web.software.development.requirements.classes.extended.MyDate;

import com.google.gson.JsonObject;

public class Author {

	private String name;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}
	
	public String getDate(String format) {
		if (date == null) {
			return null;
		}
		if (format == null || format.equals("")) {
			format = "yyyy-mm-dd";
		}
		MyDate myDate = new MyDate(date.getTime());
		return myDate.gString(format);
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Author() {}
	
	public Author(JsonObject json) {
		setClass(json);
	}
	
	public void setClass(JsonObject json) {
		name = json.get("name").getAsString();
		date = new Date(json.get("date").getAsLong());
	}

}
