package org.inmogr.java.web.software.development.requirements.beans;

import org.inmogr.java.jar.database.mysql.DatabaseConnector;
import org.inmogr.java.web.software.development.requirements.classes.User;
import org.inmogr.java.web.software.development.requirements.operations.RecordAdd;
import org.inmogr.java.web.software.development.requirements.operations.RecordSelect;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class AuthenticationBean extends User {
	
	private boolean authenticated = true;

	public boolean isAuthenticated() {
		return true && authenticated;
	}
	
	public String signIn(User user) {
		JsonObject response = RecordSelect.selectUser(user.getUsername(), user.getPassword());
		if (response.get(DatabaseConnector.STATUS).getAsString().equals(DatabaseConnector.SUCCESSFUL)) {
			try {
				JsonArray users = response.get(DatabaseConnector.RESPONSE).getAsJsonArray();
				if (users.size() == 1) {
					setlClass(user);
					this.authenticated = true;
					return DatabaseConnector.SUCCESSFUL;
				}
			} catch (Exception e) {}
		}
		return DatabaseConnector.FAILED;
	}
	
	public void signOut() {
		setlClass(new User());
		authenticated = false;
	}
	
	public String signUp(UserBean user) {
		JsonObject response = RecordAdd.addUser(user.deepCopy());
		if (response.get(DatabaseConnector.STATUS).getAsString().equals(DatabaseConnector.SUCCESSFUL)) {
			if (response.get(DatabaseConnector.RESPONSE).getAsString().equals(DatabaseConnector.SUCCESSFUL)) {
				setlClass(user);
				this.authenticated = true;
				return DatabaseConnector.SUCCESSFUL;
			}
		}
		return DatabaseConnector.FAILED;
	}

}
