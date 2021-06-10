
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<style>
body {
  background-color: linen;
}
</style>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head><body align="center">
<h1>ADMIN LOGIN</h1>
<form action="/verifyadmin" method="post">
<table align=center >
	<tr>
		<td>UserName:</td>	
		<td><input type="text" name="adminname" placeholder="Enter Admin Name"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input text="password" name="adpassword" placeholder="Enter Admin Password"></td>
	</tr>
	<tr>
		<td colspan=2><input type="submit" value="Sign in"></td>
	</tr>
</table>
</form>
</body>
</html>