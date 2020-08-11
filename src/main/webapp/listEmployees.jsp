<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List of Employees</h2>

<table>
	<tr>
		<td>ID</td><td>EMAIL</td><td>NAME</td><td>ROLE</td>
	</tr>
	<c:forEach items="${employees}" var="emp">
		<tr>
			<td>${emp.id}</td><td>${emp.email}</td><td>${emp.name}</td><td>${emp.role}</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>