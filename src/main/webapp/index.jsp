<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h2>Employee Portal</h2>

<form action="login">
	Email: <input type="email" name="email"><br>
	Password: <input type="password" name="pwd"><br>
	<input type="submit" value="Login">
</form>

<form action="signup">
	<input type="submit" value="Sign Up">
</form>

<form action="list">
	<input type="submit" value="List All Employees">
	</form>
</body>
</html>
