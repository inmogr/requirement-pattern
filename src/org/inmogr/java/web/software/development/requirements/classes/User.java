package org.inmogr.java.web.software.development.requirements.classes;

public class User {

	protected String username = "";
	protected String password = "";
	protected String fName = "";
	protected String lName = "";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public void setlClass(User user) {
		this.username = user.username;
		this.password = user.password;
		this.fName = user.fName;
		this.lName = user.lName;
	}
	
	public User deepCopy() {
		User user = new User();
		user.username = username;
		user.password = password;
		user.fName = fName;
		user.lName = lName;
		return user;
	}

}
