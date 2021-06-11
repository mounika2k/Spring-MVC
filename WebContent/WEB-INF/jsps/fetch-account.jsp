<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.hexaware.main.beans.Account" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>Name</td>
<td>Email</td>
<td>Pan</td>
<td>Contact</td>
</tr>
<%
	List<Account> account=(List<Account>)request.getAttribute("account");
%>

<%
	for(Account a:account){%>
		<tr><td><% out.println(a.getName());%></td>
		<td><%out.println(a.getEmail());%></td>
		<td><%out.println(a.getPan());%></td>
		<td><% out.println(a.getContact());%></td>
		<td><input type="button" value="delete" action="${pageContext.request.contextPath}/process-signup" modelAttribute="user"></tr>
		
<%} %>	


</table>
</body>
</html>