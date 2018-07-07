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
	<title>Update Requirement</title>
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
                <form action="signout">
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
		<jsp:useBean id="data" class="org.inmogr.java.web.software.development.requirements.beans.RequirementBean"></jsp:useBean>
		<jsp:setProperty property="*" name="data" />
		<%
		String isUpdate = request.getParameter("isUpdate");
		if (isUpdate == null) {
			isUpdate = "false";
		}
		if (data.isUpdate() && isUpdate.equals("true")) {
            JsonObject res = data.update();
            %>
            <div class="container my-5">
                <div class="card">
                    <div class="card-header text-center">
                        Requirement
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
                        <form action="../add/Requirement.jsp" method="get">
                            <button name="submit" type="submit" class="btn btn-primary">Add new one</button>
                        </form>
                    </div>
                </div>
            </div>
            <%
		}
		else {
			data.fetch();
            %>
            <div class="container my-5">
                <form action="Requirement.jsp" method="get">
                    <div class="card">
                        <div class="card-header text-center">
                            Requirement
                        </div>
                        <div class="card-body">
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">ID</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="reqID" value=<%=("\""+data.getReqID()+"\"")%> placeholder="enter number here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">Name</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="reqName" value=<%=("\""+data.getReqName()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">Solution ID</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="solutionID" value=<%=("\""+data.getSolutionID()+"\"")%> placeholder="enter number here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">Type</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select name="reqTypeAsString" class="custom-select" aria-describedby="HelpBlock" required="required">
	                                    <option value="functional" <%=HTML.getSelected("functional", data.getReqTypeAsString())%>>Functional</option>
	                                	<option value="nonfunctional" <%=HTML.getSelected("nonfunctional", data.getReqTypeAsString())%>>Nonfunctional</option>
	                                	<option value="nontechnical" <%=HTML.getSelected("nontechnical", data.getReqTypeAsString())%>>Nontechnical</option>
	                                </select> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">Description</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea name="reqDescription" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getReqDescription())%></textarea> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">Priority</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select name="priorityAsString" class="custom-select" aria-describedby="HelpBlock" required="required">
	                                    <option value="high" <%=HTML.getSelected("high", data.getPriorityAsString())%>>High</option>
	                                	<option value="neutral" <%=HTML.getSelected("neutral", data.getPriorityAsString())%>>Neutral</option>
	                                	<option value="low" <%=HTML.getSelected("low", data.getPriorityAsString())%>>Low</option>
	                                </select> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label">Pattern Name</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input name="patternName" value=<%=("\""+data.getPatternName()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer text-center">
                        	<input type="hidden" name="isUpdate" value="true"> 
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
