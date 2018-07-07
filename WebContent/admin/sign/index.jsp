<%@page import="org.inmogr.java.web.software.development.requirements.global.HTML"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!--  -->
<jsp:useBean id="auth" class="org.inmogr.java.web.software.development.requirements.beans.AuthenticationBean" scope="session"></jsp:useBean>
<!--  -->
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Requirement Pattern</title>
	<%=HTML.JQUERY%>
	<%=HTML.POPPER%>
	<%=HTML.BOOT_JS%>
	<%=HTML.BOOT_CSS%>
</head>
<body>
<%
	String res = "";
	if (auth.isAuthenticated()) {
		response.sendRedirect(HTML.ADMIN_DIR+"/list");
	}
	else {
		%>
			<jsp:useBean id="user" class="org.inmogr.java.web.software.development.requirements.beans.UserBean" scope="request"></jsp:useBean>
			<jsp:setProperty property="*" name="user"/>
		<%
		if (user.getMethod().equals("in")) {
			res = auth.signIn(user);
		}
		else if (user.getMethod().equals("up")) {
			res = auth.signUp(user);
		}
		if (res.equals("SUCCESSFUL")) {
			response.sendRedirect("../list");
		}
		else {
			%>
				<div class="container my-5">
					<div class="row">
						<div class="col-6">
							<div class="card">
								<div class="card-header">
									Sign In
								</div>
								<div class="card-body">
									<form action="." method="post">
										<div class="form-group my-2">
											<label>Email</label>
											<br>
											<input required type="email" name="username" class="form-control" value=<%=user.getUsername()%>>
										</div>
										<div class="form-group my-2">
											<label>Password</label>
											<br>
											<input required type="password" name="password" class="form-control" value=<%=user.getPassword()%>>
										</div>
										<div class="form-group my-3">
											<input type="hidden" name="fName" value=" ">
											<input type="hidden" name="lName" value=" ">
											<input type="hidden" name="method" value="in">
											<div class="float-right">
												<input type="submit" value="Sign in" class="btn btn-primary">
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-6">
							<div class="card">
								<div class="card-header">
									Sign Up
								</div>
								<div class="card-body">
									<form action="." method="post">
										<div class="form-group my-2">
											<label>Email</label>
											<br>
											<input required type="email" name="username" class="form-control" value=<%=user.getUsername()%>>
										</div>
										<div class="form-group my-2">
											<label>Password</label>
											<br>
											<input required type="password" name="password" class="form-control" value=<%=user.getPassword()%>>
										</div>
										<div class="form-group my-2">
											<label>First name</label>
											<br>
											<input required type="text" name="fName" class="form-control" value=<%=user.getfName()%>>
										</div>
										<div class="form-group my-2">
											<label>Last name</label>
											<br>
											<input required type="text" name="lName" class="form-control" value=<%=user.getlName()%>>
										</div>
										<div class="form-group my-3">
											<input type="hidden" name="method" value="up">
											<div class="float-right">
												<input type="submit" value="Sign up" class="btn btn-success">
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			<%
		}
	}
%>
</body>
</html>
