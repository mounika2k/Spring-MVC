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
<div class="dropdown-menu">
  <form class="px-4 py-3">
    <div class="form-group">
      <label for="exampleDropdownFormEmail1">Email address</label>
      <input type="email" class="form-control" id="exampleDropdownFormEmail1" placeholder="email@example.com">
    </div>
    <div class="form-group">
      <label for="exampleDropdownFormPassword1">Password</label>
      <input type="password" class="form-control" id="exampleDropdownFormPassword1" placeholder="Password">
    </div>
    <div class="form-check">
      <input type="checkbox" class="form-check-input" id="dropdownCheck">
      <label class="form-check-label" for="dropdownCheck">
        Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Sign in</button>
  </form>
  <div class="dropdown-divider"></div>
  <a class="dropdown-item" href="#">New around here? Sign up</a>
  <a class="dropdown-item" href="#">Forgot password?</a>
</div>
<table border="0" style="width: 100%">
		<tr>
			<td><h1>LOGIN</h1>
			<sf:form method="post" action="${pageContext.request.contextPath}/process-login" modelAttribute="user">
			Username: <sf:input type="text" path="username"/><sf:errors path="username"/><br/><br/>
			Password: <sf:input type="password" path="password"/><sf:errors path="password"/><br/><br/>
			<input type="submit" value="Login In">
				</sf:form>
			
			</td>
			
			
			<td><h1>SignUp</h1>
			<td>
			<%=request.getAttribute("msg") %>
			<sf:form method="post" action="${pageContext.request.contextPath}/process-signup" modelAttribute="user">
					<%-- 	Id: <sf:input type="number" path="id"/><sf:errors path="name"/><br/><br/> --%>
			
			Name: <sf:input type="text" path="name"/><sf:errors path="name"/><br/><br/>
			Username: <sf:input type="text" path="username"/><sf:errors path="username"/><br/><br/>
			Password: <sf:input type="password" path="password"/><sf:errors path="password"/><br/><br/>
			<input type="submit" value="Sign Up">
		</td>
			
	</sf:form>
	</td>
	</td>
	</tr>
	</table>
</body>
</html>