<%@page import="org.inmogr.java.web.software.development.requirements.global.HTML"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.google.gson.JsonObject" %>
<!--  -->
<jsp:useBean id="auth" class="org.inmogr.java.web.software.development.requirements.beans.AuthenticationBean" scope="session"></jsp:useBean>
<!--  -->
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add Solution</title>
	<%=HTML.JQUERY%>
	<%=HTML.POPPER%>
	<%=HTML.BOOT_JS%>
	<%=HTML.BOOT_CSS%>
</head>
<body>
    <div class="container">
        <div class="row my-3">
            <div class="col text-center">
                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Add
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    	<a class="dropdown-item" href=<%=("\""+HTML.ADMIN_DIR+"/add"+"/SPLDomain.jsp"+"\"")%>>SPL Domain</a>
						<a class="dropdown-item" href=<%=("\""+HTML.ADMIN_DIR+"/add"+"/RequirementPattern.jsp"+"\"")%>>Requirement Pattern</a>
						<a class="dropdown-item" href=<%=("\""+HTML.ADMIN_DIR+"/add"+"/Solution.jsp"+"\"")%>>Solution</a>
						<a class="dropdown-item" href=<%=("\""+HTML.ADMIN_DIR+"/add"+"/Requirement.jsp"+"\"")%>>Requirement</a>
						<a class="dropdown-item" href=<%=("\""+HTML.ADMIN_DIR+"/add"+"/CommonReq.jsp"+"\"")%>>Common Req</a>
						<a class="dropdown-item" href=<%=("\""+HTML.ADMIN_DIR+"/add"+"/VariableReq.jsp"+"\"")%>>Variable Req</a>
                    </div>
                </div>
            </div>
            <div class="col text-center">
            	<a class="btn btn-secondary" href=<%=("\""+HTML.ADMIN_DIR+"/list"+"\"")%>>
            		List
            	</a>
            </div>
            <div class="col text-center">
                <form method="post" action="../signout">
                    <input type="submit" value="Sign Out" class="btn btn-danger">
                </form>
            </div>
        </div>
    </div>
    <%
	if (!auth.isAuthenticated()) {
		response.sendRedirect(HTML.ADMIN_DIR+"/sign");
	}
	else {
		%>
		<jsp:useBean id="data" class="org.inmogr.java.web.software.development.requirements.beans.SolutionBean"></jsp:useBean>
		<jsp:setProperty property="*" name="data" />
		<%
		if (data.isAdd()) {
            JsonObject res = data.add();
            %>
            <div class="container my-5">
                <div class="card">
                    <div class="card-header text-center">
                        Solution
                    </div>
                    <div class="card-body">
                        <table class="table">
                            <tr>
                                <td>
                                    Status
                                </td>
                                <td>
                                    <%=res.get("STATUS").getAsString() %>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Response
                                </td>
                                <td>
                                    <%=res.get("RESPONSE").getAsString() %>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div class="card-footer">
                        <form action="Solution.jsp" method="get">
                            <button name="submit" type="submit" class="btn btn-primary">Add another one</button>
                        </form>
                    </div>
                </div>
            </div>
            <%
		}
		else {
            %>
            <div class="container my-5">
                <form action="Solution.jsp" method="get">
                    <div class="card">
                        <div class="card-header text-center">
                            Solution
                        </div>
                        <div class="card-body">
                            <div class="form-group row">
                                <label for="" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Solution ID</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="solutionID" value=<%=("\""+data.getSolutionID()+"\"")%> placeholder="enter number here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Solution Name</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="solutionName" value=<%=("\""+data.getSolutionName()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Pattern ID</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="patternID" value=<%=("\""+data.getPatternID()+"\"")%> placeholder="enter number here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Goal</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea name="goal" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getGoal())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label" for="">Description</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea name="description" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getDescription())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Variability Model Description</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea name="variabilityModelDescription" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getVariabilityModelDescription())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer text-center"> 
                            <!-- <button name="clear" type="clear" class="btn btn-danger">Clear</button> -->
                            <button name="submit" type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
            <%
		}
	}
    %>
</body>
</html>
