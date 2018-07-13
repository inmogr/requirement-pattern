<%@page import="org.inmogr.java.web.software.development.requirements.beans.RequirementBean"%>
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
	<title>Lists</title>
	<%=HTML.JQUERY%>
	<%=HTML.POPPER%>
	<%=HTML.BOOT_JS%>
	<%=HTML.BOOT_CSS%>
	<%=HTML.DATATABLES_CSS%>
	<%=HTML.DATATABLES_JS%>
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
		<jsp:useBean id="dataList" class="org.inmogr.java.web.software.development.requirements.beans.ListItemsBean" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="dataList" />
		<div class="mx-5">
			<h1>
				<strong>
					List Items
				</strong>
			</h1>
			<br>
			<table class="table table-striped table-bordered table-hover" id="dataTables-example">
				<thead>
					<tr>
						<th style="width: 20%;">ID</th>
						<th>Name</th>
						<th style="width: 10%;">Select</th>
						<th style="width: 10%;">Update</th>
						<th style="width: 10%;">Delete</th>
					</tr>
				</thead>
				<tbody>
				<%
				String listType = "Requirement";
				dataList.setListItems(listType);
				for (int index = 0 ; index < dataList.getListItems().size() ; index++) {
				%>
					<tr>
						<td style="width: 20%;">
							<%=dataList.getItem(index, listType, "id")%>
						</td>
						<td>
							<%=dataList.getItem(index, listType, "")%>
							<span hidden="true">
								<%=dataList.getItem(index).toString()%>
							</span>
						</td>
						<td style="width: 10%;">
							<form method="post" action="CommonReq.jsp">
								<input type="hidden" name="requirementID" value=<%=("\""+dataList.getItem(index, listType, "id")+"\"")%>>
								<input type="submit" value="Select" class="btn btn-success">
							</form>
						</td>
						<td style="width: 10%;">
							<form method="post" action=<%=("\""+"../update/"+listType+".jsp"+"\"")%>>
								<input type="hidden" name="reqID" value=<%=("\""+dataList.getItem(index, listType, "id")+"\"")%>>
								<input type="submit" value="Update" class="btn btn-primary">
							</form>
						</td>
						<td style="width: 10%;">
							<form method="post" action=<%=("\""+"../delete/"+listType+".jsp"+"\"")%>>
								<input type="hidden" name="reqID" value=<%=("\""+dataList.getItem(index, listType, "id")+"\"")%>>
								<input type="submit" value="Delete" class="btn btn-danger">
							</form>
						</td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
		</div>
		<script>
		$(document).ready(function() {
			$('#dataTables-example').DataTable({
				responsive: true
			});
		});
		</script>
		<%
	}
%>
</body>
</html>
