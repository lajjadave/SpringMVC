<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Registration form</h3>

<form:form action="register" modelAttribute="emp" method="post">

	<table>
		<tr>
			<td><label>Email:</label></td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td><label>Password:</label></td>
			<td><form:input path="password"/></td>
		</tr>
		<tr>
			<td><label>Name:</label></td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td><label>Role:</label></td>
			<td><form:input path="role"/></td>
		</tr>
		<tr>
			<td><label></label></td>
			<td><input type="submit" value="Register"></td>
		</tr>
	</table>
</form:form>
</body>
</html>