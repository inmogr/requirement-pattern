package org.inmogr.java.web.software.development.requirements.classes;

import java.util.Date;
import org.inmogr.java.web.software.development.requirements.classes.extended.MyDate;

public class SPLDomain {

	private String SPLDomainName;
	private String goal;
	private String patternDescription;
	private Date dateCreated;
	private String domainAuthor;

	public String getSPLDomainName() {
		return (SPLDomainName == null) ? "" : SPLDomainName;
	}

	public void setSPLDomainName(String sPLDomainName) {
		SPLDomainName = sPLDomainName;
	}

	public String getGoal() {
		return (goal == null) ? "" : goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getPatternDescription() {
		return (patternDescription == null) ? "" : patternDescription;
	}

	public void setPatternDescription(String patternDescription) {
		this.patternDescription = patternDescription;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String getDateCreated(String format) {
		if (dateCreated == null) {
			return null;
		}
		if (format == null || format.equals("")) {
			format = "yyyy-mm-dd";
		}
		MyDate myDate = new MyDate(dateCreated.getTime());
		return myDate.gString(format);
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDateCreated(MyDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public void setDateCreated(String dateCreated) {
		this.dateCreated = new MyDate(dateCreated, "yyyy-mm-dd");
	}

	public String getDomainAuthor() {
		return (domainAuthor == null) ? "" : domainAuthor;
	}

	public void setDomainAuthor(String domainAuthor) {
		this.domainAuthor = domainAuthor;
	}

}
