<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.hexaware.main.beans.Employee" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Account project</h1>



<hr/>

<a href="${pageContext.request.contextPath }/account">Dashboard</a>
<br/>
<a href="${pageContext.request.contextPath }/fetch-account">accounts</a>
<br/>
<a href="${pageContext.request.contextPath }/users">users</a>




</body>
</html>