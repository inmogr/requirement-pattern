<%@page import="org.inmogr.java.web.software.development.requirements.global.HTML"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<jsp:useBean id="dataList" class="org.inmogr.java.web.software.development.requirements.beans.ListItemsBean" scope="session"></jsp:useBean>
<%
dataList.clear();
%>
<script type="text/javascript">
	window.location.href = <%=("\""+HTML.ADMIN_DIR+"/list/SPLDomain.jsp"+"\"")%>
</script>
</body>
</html>