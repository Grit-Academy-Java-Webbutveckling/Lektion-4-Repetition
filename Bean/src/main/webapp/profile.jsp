<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
	User user = (User) request.getAttribute("user");
	out.print("<p>" + user.welcomeMessage() + "</p>");
	out.print("<p>" + user.getFirstName() + "</p>");
	out.print("<p>" + user.getCar().getColor() + "</p>");
	out.print("<p>" + user.getCar().getModel() + "</p>");
	%>

</body>
</html>