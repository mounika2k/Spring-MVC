<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.hexaware.main.beans.User" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Users</h2>
<table border="1">
<tr>
<td>Id</td>
<td>Name</td>
<td>Username</td>
<td>Password</td>
</tr>
	
<%
	List<User> user=(List<User>)request.getAttribute("user");
%>

<%
	for(User u:user){%>
		<tr>
		<td><%out.println(u.getId());%></td>
		<td><%out.println(u.getName());%></td>
		<td><%out.println(u.getUsername());%></td>
		<td><%out.println(u.getPassword());%></td></tr>

	<%} %>

</body>
</html>