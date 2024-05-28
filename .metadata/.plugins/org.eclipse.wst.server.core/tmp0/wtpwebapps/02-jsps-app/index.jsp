<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP Page</title>
</head>
<body>
<h1> Hi!!!!! Welcome to Java Server Pages</h1>
<% int i=10; %>
<%=++i %>
<%= new Date() %>
<%-- --%>
<%@ include file="NewFile.html" %>

</body>
</html>