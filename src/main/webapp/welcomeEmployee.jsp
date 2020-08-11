<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome ${emp.name } - ${emp.id }</h3>

<c:url var="updateLink" value="update">
	<c:param name="empId" value="${emp.id}"/>
</c:url>
<a href="${updateLink}">Update Employee</a>

<c:url var="deleteLink" value="delete">
	<c:param name="empId" value="${emp.id}"/>
</c:url>
<a href="${deleteLink}">Delete Employee</a>
</body>
</html>