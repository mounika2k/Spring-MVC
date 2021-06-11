<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Account</h1>
	<%=request.getAttribute("msg") %>
	<sf:form method="post" action="${pageContext.request.contextPath }/create-account" modelAttribute="account">
	Name:<sf:input type="text" path="name"/><sf:errors path="name"></sf:errors><br /><br />
	Email:<sf:input type="text" path="email"/><sf:errors path="email"></sf:errors><br /><br />
	Pan:<sf:input type="Pan" path="pan"/><sf:errors path="pan"></sf:errors><br /><br />
	Contact:<sf:input type="text" path="contact"/><sf:errors path="contact"></sf:errors><br /><br />
	<input type="submit"  value="Create Account"/>
	</sf:form>
	
</body>
</html>