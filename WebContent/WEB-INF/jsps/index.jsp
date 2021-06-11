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
<h1>All Employees</h1>


<%
	List<Employee> list = (List<Employee>)request.getAttribute("list");
%>
<%
	for(Employee e:list){
		out.println(e.getName() +" "+e.getSalary()+"<BR />");
	}
%>
<hr/>
<a href="<%=request.getContextPath()%>/project">Go to projects</a>
<br/>
<a href="${pageContext.request.contextPath }/login">Go to login</a>




</body>
</html>