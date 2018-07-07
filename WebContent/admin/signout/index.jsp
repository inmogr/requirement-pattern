<%@page import="org.inmogr.java.web.software.development.requirements.global.HTML"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="auth" class="org.inmogr.java.web.software.development.requirements.beans.AuthenticationBean" scope="session"></jsp:useBean>
<%
auth.signOut();
response.sendRedirect(HTML.ADMIN_DIR+"/sign");
%>