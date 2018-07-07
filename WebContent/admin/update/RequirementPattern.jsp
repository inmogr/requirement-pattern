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
	<title>Update Requirement Pattern</title>
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
		<jsp:useBean id="data" class="org.inmogr.java.web.software.development.requirements.beans.RequirementPatternBean"></jsp:useBean>
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
                        Requirement Pattern
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
                        <form action="../add/RequirementPattern.jsp" method="get">
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
                <form action="RequirementPattern.jsp" method="get">
                    <div class="card">
                        <div class="card-header text-center">
                            Requirement Pattern
                        </div>
                        <div class="card-body">
                            <div class="form-group row">
                                <label for="patternID" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Pattern ID</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="patternID" name="patternID" value=<%=("\""+data.getPatternID()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">type any hint you like here</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="patternName" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Pattern Name</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="patternName" name="patternName" value=<%=("\""+data.getPatternName()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">type any hint you like here</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="AKA" class="col-sm-4 col-md-3 col-lg-2 col-form-label">AKA</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="AKA" name="AKA" value=<%=("\""+data.getAKA()+"\"")%> placeholder="enter text here" type="text" aria-describedby="HelpBlock" required="required" class="form-control here"> 
                                    <span id="HelpBlock" class="form-text text-muted">type any hint you like here</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label" for="knownUses">Known Uses</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="knownUses" name="knownUses" cols="40" rows="5" aria-describedby="HelpBlock" class="form-control" required="required"><%=(data.getKnownUses())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">type any hint you like here</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="application" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Application</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="application" name="application" cols="40" rows="5" aria-describedby="HelpBlock" class="form-control" required="required"><%=(data.getApplication())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">type any hint you like here</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="SPLDomainName" class="col-sm-4 col-md-3 col-lg-2 col-form-label">SPL Domain Name</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="omainName" name="SPLDomainName" value=<%=("\""+data.getSPLDomainName()+"\"")%> placeholder="enter text here" type="text" class="form-control here" required="required">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="problem" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Problem</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="problem" name="problem" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getProblem())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="force" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Force</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="force" name="force" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getForce())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="example" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Example</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                	<textarea id="example" name="example" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getExample())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="author_name" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Author Name</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="author_name" name="author_name" value=<%=("\""+data.getAuthor_name()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="author_date" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Author Date</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="author_date" name="author_date" value=<%=("\""+data.getAuthor_date()+"\"")%> placeholder="yyyy-mm-dd" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="classification_classType" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Classification Class Type</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="classification_classType" name="classification_classType" value=<%=("\""+data.getClassification_classType()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="classification_defaultValue" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Classification Default Value</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="classification_defaultValue" name="classification_defaultValue" value=<%=("\""+data.getClassification_defaultValue()+"\"")%> placeholder="enter text here" type="text" class="form-control here" aria-describedby="HelpBlock" required="required"> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="classification_purpose" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Classification Purpose</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="classification_purpose" name="classification_purpose" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getClassification_purpose())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="classification_audience_role" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Classification Audience Role</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="classification_audience_role" name="classification_audience_role" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getClassification_audience_role())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="classification_audience_stakeGoal" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Classification Audience Stake Goal</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="classification_audience_stakeGoal" name="classification_audience_stakeGoal" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getClassification_audience_stakeGoal())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="classification_allowedValue" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Classification Allowed Value</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select id="classification_allowedValue" name="classification_allowedValue" class="custom-select" aria-describedby="HelpBlock" required="required">
                                        <option value="true" <%=HTML.getSelected(true, data.isClassification_allowedValue())%>>True</option>
                                        <option value="false" <%=HTML.getSelected(false, data.isClassification_allowedValue())%>>False</option>
                                    </select> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="consideration_conConstraint" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Consideration Con Constraint</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="consideration_conConstraint" name="consideration_conConstraint" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getConsideration_conConstraint())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="consideration_conDescription" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Consideration Con Description</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="consideration_conDescription" name="consideration_conDescription" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getConsideration_conDescription())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-4 col-md-3 col-lg-2 col-form-label" for="consideration_conPurpose">Consideration Con Purpose</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="consideration_conPurpose" name="consideration_conPurpose" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getConsideration_conPurpose())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="context_bussinessDomain" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Context Bussiness Domain</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="context_bussinessDomain" name="context_bussinessDomain" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getContext_bussinessDomain())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="context_organizationFactor" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Context Organization Factor</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="context_organizationFactor" name="context_organizationFactor" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getContext_organizationFactor())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="context_patternType" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Context Pattern Type</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select id="context_patternType" name="context_patternType" class="custom-select" aria-describedby="HelpBlock" required="required">
                                        <option value="process" <%=HTML.getSelected("process", data.getContext_patternType())%>>Process</option>
                                        <option value="product" <%=HTML.getSelected("product", data.getContext_patternType())%>>Product</option>
                                    </select> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="context_reqAct" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Context Req Act</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select id="context_reqAct" name="context_reqAct" class="custom-select" aria-describedby="HelpBlock" required="required">
                                        <option value="elicitation" <%=HTML.getSelected("elicitation", data.getContext_reqAct())%>>Elicitation</option>
                                        <option value="specification" <%=HTML.getSelected("specification", data.getContext_reqAct())%>>Specification</option>
                                        <option value="validation" <%=HTML.getSelected("validation", data.getContext_reqAct())%>>Validation</option>
                                        <option value="allReqActivities" <%=HTML.getSelected("allReqActivities", data.getContext_reqAct())%>>All Req Activities</option>
                                    </select> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="context_stakeholder_role" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Context Stakeholder Role</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="context_stakeholder_role" name="context_stakeholder_role" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getContext_stakeholder_role())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="context_stakeholder_stakeGoal" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Context Stakeholder Stake Goal</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <textarea id="context_stakeholder_stakeGoal" name="context_stakeholder_stakeGoal" cols="40" rows="5" class="form-control" aria-describedby="HelpBlock" required="required"><%=(data.getContext_stakeholder_stakeGoal())%></textarea>
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="relatedPatternID" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Related Pattern ID</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <input id="relatedPatternID" name="relatedPatternID" value=<%=("\""+data.getRelatedPatternID()+"\"")%> placeholder="optional" type="text" class="form-control here" aria-describedby="HelpBlock"> 
                                    <span id="HelpBlock" class="form-text text-muted">optional</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="relationType_relationExtends" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Relation Type Relation Extends</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select id="relationType_relationExtends" name="relationType_relationExtends" class="custom-select" aria-describedby="HelpBlock" required="required">
                                        <option value="true" <%=HTML.getSelected(true, data.isRelationType_relationExtends())%>>True</option>
                                        <option value="false" <%=HTML.getSelected(false, data.isRelationType_relationExtends())%>>False</option>
                                    </select> 
                                    <span id="HelpBlock" class="form-text text-muted">placeholder</span>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="relationType_relationRefers" class="col-sm-4 col-md-3 col-lg-2 col-form-label">Relation Type Relation Refers</label> 
                                <div class="col-sm-8 col-md-9 col-lg-10">
                                    <select id="relationType_relationRefers" name="relationType_relationRefers" class="custom-select" aria-describedby="HelpBlock" required="required">
                                        <option value="true" <%=HTML.getSelected(true, data.isRelationType_relationRefers())%>>True</option>
                                        <option value="false" <%=HTML.getSelected(false, data.isRelationType_relationRefers())%>>False</option>
                                    </select> 
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
