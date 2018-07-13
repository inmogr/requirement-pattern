<%@page import="org.inmogr.java.web.software.development.requirements.operations.Converter"%>
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
	<title>Requirement Pattern</title>
	<%=HTML.JQUERY%>
	<%=HTML.POPPER%>
	<%=HTML.BOOT_JS%>
	<%=HTML.BOOT_CSS%>
</head>
<body>
    <%
	if (!auth.isAuthenticated()) {
		response.sendRedirect(HTML.ADMIN_DIR+"/sign");
	}
	else {
		%>
		<jsp:useBean id="dataList" class="org.inmogr.java.web.software.development.requirements.beans.ListItemsBean" scope="session"></jsp:useBean>
		<jsp:useBean id="print" class="org.inmogr.java.web.software.development.requirements.beans.PrintBean" scope="session"></jsp:useBean>
		<jsp:setProperty property="indexOfRP" name="print"/>
		<%
		print.setData(dataList);
		if (!print.hasData()) {
			response.sendRedirect(HTML.ADMIN_DIR+"/list");
		}
		else {
			if (print.indexOfRP < 0) {
				print.setIndexOfRP(0);
			}
			else if (print.indexOfRP > (print.listOfRequirementPattern.size()-1)) {
				print.setIndexOfRP(print.listOfRequirementPattern.size()-1);
			}
			String id1 = "";
			String id2 = "";
			for (int localIndex = 0 ; localIndex < print.listOfRequirementPattern.size() ; localIndex++) {
				print.setIndexOfRP(localIndex);
				%>
				<div class="container py-5">
					<table class="table table-bordered">
						<tbody>
							<tr>
								<th scope="col" style="width: 30%;" colspan="2">SPL Domain Name</th>
								<td scope="col" style="width: 70%;"><%=print.objectOfSPLDomain.getSPLDomainName()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Goal</th>
								<td><%=print.objectOfSPLDomain.getGoal()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Description</th>
								<td><%=print.objectOfSPLDomain.getPatternDescription()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Created Date</th>
								<td><%=print.objectOfSPLDomain.getDateCreated(null)%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Domain Author</th>
								<td><%=print.objectOfSPLDomain.getDomainAuthor()%></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="container py-3">
					<table class="table table-bordered">
						<thead class="thead-dark text-center">
							<tr>
								<th scope="col" style="width: 30%;" colspan="2">Section</th>
								<th scope="col" style="width: 70%;">Description</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row" colspan="2">*Pattern ID</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getPatternID()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">*Pattern Name</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getPatternName()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Also Known As</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getAKA()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Authors</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getAuthor().getName()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">Created Date (Author Date)</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getAuthor().getDate(null)%></td>
							</tr>
							<tr>
								<th scope="row" rowspan="5">*Context / Applicability</th>
								<th scope="row">*RE Activity</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getContext().getReqAct().name()%></td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">*Pattern Type</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getContext().getPatternType().name()%></td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">Business Domain</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getContext().getBussinessDomain()%></td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">Organization Environmental Factors</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getContext().getOrganizationFactor()%></td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">Stakeholders</th>
								<td>
									<span class="font-italic">
										Role:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getContext().getStakeholder().getRole()%>
									</span>
									<hr>
									<span class="font-italic">
										Goal:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getContext().getStakeholder().getStakeGoal()%>
									</span>
								</td>
							</tr>
							<tr>
								<th scope="row" colspan="2">*Problem AKA Intent and Objective</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getProblem()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">*Force</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getForce()%></td>
							</tr>
							<tr>
								<th scope="row" colspan="2">*Solution</th>
								<td>See "Solution Section" below</td>
							</tr>
							<tr>
								<th scope="row" colspan="2">*Application and Example</th>
								<td>
									<span class="font-italic">
										Application:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getApplication()%>
									</span>
									<br>
									<span class="font-italic">
										Example:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getExample()%>
									</span>
								</td>
							</tr>
							<tr>
								<th scope="row" colspan="2">*Known Uses</th>
								<td><%=print.listOfRequirementPattern.get(print.indexOfRP).getKnownUses()%></td>
							</tr>
							<tr>
								<th scope="row" rowspan="2">Cataloging:</th>
								<th scope="row">Classification</th>
								<td>
									<span class="font-italic">
										Type:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getClassification().getClassType()%>
									</span>
									<hr>
									<span class="font-italic">
										Default Value:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getClassification().getDefaultValue()%>
									</span>
									<hr>
									<span class="font-italic">
										Purpose:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getClassification().getPurpose()%>
									</span>
									<hr>
									<span class="font-italic">
										Audience Role:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getClassification().getAudience().getRole()%>
									</span>
									<hr>
									<span class="font-italic">
										Audience Goal:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getClassification().getAudience().getStakeGoal()%>
									</span>
									<hr>
									<span class="font-italic">
										Allowed Value:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getClassification().isAllowedValue()%>
									</span>
								</td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">Related Pattern</th>
								<td>
									<%
									id1 = print.listOfRequirementPattern.get(print.indexOfRP).getPatternID();
									id2 = print.listOfRequirementPattern.get(print.indexOfRP).getRelatedPatternID();
									if (id2 == null || id2.equals("") || id1.equals(id2)) {
										%>
										-
										<%
									}
									else {
										%>
										<span class="font-italic">
											ID:
										</span>
										<span>
											<%=id2%>
										</span>
										<hr>
										<span class="font-italic">
											Name:
										</span>
										<span>
											<%=print.fetchIfHasRelatives(print.listOfRequirementPattern.get(print.indexOfRP).getPatternID(), print.listOfRequirementPattern.get(print.indexOfRP).getRelatedPatternID()).get("patternName").getAsString()%>
										</span>
										<hr>
										<span class="font-italic">
											Relation (Extends):
										</span>
										<span>
											<%=print.listOfRequirementPattern.get(print.indexOfRP).getRelationType().isRelationExtends()%>
										</span>
										<hr>
										<span class="font-italic">
											Relation (Refers):
										</span>
										<span>
											<%=print.listOfRequirementPattern.get(print.indexOfRP).getRelationType().isRelationRefers()%>
										</span>
										<%
									}
									%>
								</td>
							</tr>
							<tr>
								<th scope="row" rowspan="3">Custom Section</th>
								<th scope="row">Consideration for Design</th>
								<td>
									<span class="font-italic">
										Description:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDesign().getConDescription()%>
									</span>
									<hr>
									<span class="font-italic">
										Purpose:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDesign().getConPurpose()%>
									</span>
									<hr>
									<span class="font-italic">
										Constraint:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDesign().getConConstraint()%>
									</span>
									<hr>
									<span class="font-italic">
										Pattern Name:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDesign().getDesignPatternName()%>
									</span>
									<hr>
									<span class="font-italic">
										Guide:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDesign().getDesignGuide()%>
									</span>
								</td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">Consideration for Development</th>
								<td>
									<span class="font-italic">
										Description:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDevelopment().getConDescription()%>
									</span>
									<hr>
									<span class="font-italic">
										Purpose:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDevelopment().getConPurpose()%>
									</span>
									<hr>
									<span class="font-italic">
										Constraint:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDevelopment().getConConstraint()%>
									</span>
									<hr>
									<span class="font-italic">
										Guide:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForDevelopment().getDevGuide()%>
									</span>
								</td>
							</tr>
							<tr>
								<!-- ONE COLUMN USED ALREADY -->
								<th scope="row">Consideration for Testing</th>
								<td>
									<span class="font-italic">
										Description:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForTesting().getConDescription()%>
									</span>
									<hr>
									<span class="font-italic">
										Purpose:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForTesting().getConPurpose()%>
									</span>
									<hr>
									<span class="font-italic">
										Constraint:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForTesting().getConConstraint()%>
									</span>
									<hr>
									<span class="font-italic">
										Pattern Name:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForTesting().getTestType()%>
									</span>
									<hr>
									<span class="font-italic">
										Guide:
									</span>
									<span>
										<%=print.listOfRequirementPattern.get(print.indexOfRP).getConsiderationForTesting().getTestGuide()%>
									</span>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<!---->
				<!---->
				<!---->
				<!---->
				<!---->
				<div class="container py-3">
					<div class="container-fluid my-4">
						<h2>
							Solution Section
						</h2>
					</div>
					<table class="table table-bordered">
						<thead class="thead-dark text-center">
							<tr>
								<th scope="col" style="width: 20%;">Section</th>
								<th scope="col" style="width: 80%;" colspan="3">Description</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">Solution ID</th>
								<td colspan="3"><%=print.listOfSolution.get(print.indexOfRP).getSolutionID()%></td>
							</tr>
							<tr>
								<th scope="row">Solution Name</th>
								<td colspan="3"><%=print.listOfSolution.get(print.indexOfRP).getSolutionName()%></td>
							</tr>
							<tr>
								<th scope="row">Goal</th>
								<td colspan="3"><%=print.listOfSolution.get(print.indexOfRP).getGoal()%></td>
							</tr>
							<tr>
								<th scope="row">Description</th>
								<td colspan="3"><%=print.listOfSolution.get(print.indexOfRP).getDescription()%></td>
							</tr>
							<%
							//for(int index1 = 0 ; index1 < print.listOfRequirement.get(print.indexOfRP).size() ; index1++) {
							for(int index1 = print.listOfRequirement.get(print.indexOfRP).size() - 1 ; index1 >= 0  ; index1--) {
								%>
								<tr>
									<th scope="row" rowspan="5">Requirement</th>
									<td style="width: 20%;">ID</td>
									<td colspan="3"><%=print.listOfRequirement.get(print.indexOfRP).get(index1).getReqID()%></td>
								</tr>
								<tr>
									<!-- ONE COLUMN USED ALREADY -->
									<td style="width: 20%;">Name</td>
									<td colspan="3"><%=print.listOfRequirement.get(print.indexOfRP).get(index1).getReqName()%></td>
								</tr>
								<tr>
									<!-- ONE COLUMN USED ALREADY -->
									<td style="width: 20%;">Type</td>
									<td colspan="3"><%=print.listOfRequirement.get(print.indexOfRP).get(index1).getReqType()%></td>
								</tr>
								<tr>
									<!-- ONE COLUMN USED ALREADY -->
									<td style="width: 20%;">Description</td>
									<td colspan="3"><%=print.listOfRequirement.get(print.indexOfRP).get(index1).getReqDescription()%></td>
								</tr>
								<tr>
									<!-- ONE COLUMN USED ALREADY -->
									<td style="width: 20%;">Priority</td>
									<td colspan="3"><%=print.listOfRequirement.get(print.indexOfRP).get(index1).getPriority()%></td>
								</tr>
								<%
								for(int index2 = 0 ; index2 < print.listOfCommonReq.get(print.indexOfRP).get(index1).size() ; index2++) {
									%>
									<tr>
										<th scope="row" rowspan="5">Common Requirement Form</th>
										<td style="width: 20%;">ID</td>
										<td colspan="3"><%=print.listOfCommonReq.get(print.indexOfRP).get(index1).get(index2).getCommonReqID()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Description</td>
										<td colspan="3"><%=print.listOfCommonReq.get(print.indexOfRP).get(index1).get(index2).getCommonDescription()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Constraints</td>
										<td colspan="3"><%=print.listOfCommonReq.get(print.indexOfRP).get(index1).get(index2).getCommonConstraint()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Fixed Part</td>
										<td style="width: 20%;">Form Text</td>
										<td><%=print.listOfCommonReq.get(print.indexOfRP).get(index1).get(index2).getFixedPart()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Extended Part</td>
										<td style="width: 20%;">Form Text</td>
										<td><%=print.listOfCommonReq.get(print.indexOfRP).get(index1).get(index2).getExtendedPart()%></td>
									</tr>
									<%
								}
								for(int index3 = 0 ; index3 < print.listOfVariableReq.get(print.indexOfRP).get(index1).size() ; index3++) {
									%>
									<tr>
										<th scope="row" rowspan="5">Variable Requirement Form</th>
										<td style="width: 20%;">ID</td>
										<td colspan="2"><%=print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVariableReqID()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Description</td>
										<td colspan="2"><%=print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVarDescription()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Constraints</td>
										<td colspan="2"><%=print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVarConstraint()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Fixed Part</td>
										<td style="width: 20%;">Form Text</td>
										<td><%=print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getFixedPart()%></td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Variable Part</td>
										<td colspan="2">
											<span class="font-italic">
												Variation Points (VP):
											</span>
											<span>
												<%=Converter.arrayToString(print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVarPart().getVPName())%>
												<!--
												print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVariationPoint()
												-->
											</span>
											<hr>
											<span class="font-italic">
												Variants (V):
											</span>
											<span>
												<%=Converter.arrayToString(print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVarPart().getVName())%>
											</span>
										</td>
									</tr>
									<tr>
										<th scope="row" rowspan="3">Variable Model Form</th>
										<td style="width: 20%;">Description</td>
										<td colspan="2">
											<!--
											print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVPNameAsString()
											-->
										</td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Constraints</td>
										<td colspan="2">
											<!--
											print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVNameAsString()
											-->
										</td>
									</tr>
									<tr>
										<!-- ONE COLUMN USED ALREADY -->
										<td style="width: 20%;">Model (s)</td>
										<td colspan="2"><%=print.listOfVariableReq.get(print.indexOfRP).get(index1).get(index3).getVarPart().getModel()%></td>
									</tr>
									<%
								}
							}
							%>
						</tbody>
					</table>
				</div>
				<%
			}
			%>
			<link rel="stylesheet" href="css.css">
			<script type="text/javascript" src="js.js"></script>
			<div class="container mt-5 py-3" id="select-file-area">
		        <div class="input-group mb-3">
		            <div class="custom-file">
		                <input type="file" class="custom-file-input" id="inputGroupFile03">
		                <label class="custom-file-label" for="inputGroupFile03">Choose file</label>
		            </div>
		        </div>
		    </div>
		    <div class="container py-3">
		        <img class="selected-image" id="view-image-area">
		    </div>
			<%
		}
	}
%>
</body>
</html>
