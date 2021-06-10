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
<title>Sign In Client</title>
</head>
<body align=center>
<h1>Sign In Client</h1>
<form action="verifyuser" method="post">
<table align=center >
	<tr>
		<td>UserEmail:</td>	
		<td><input  type="text" name="username" placeholder="Enter Email"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input  type="password" name="password" placeholder="Enter Password"></td>
	</tr>
	<tr>
		<td colspan=2><input type="submit" value="Sign in"></td>
	</tr>
</table>
</form>
</body>
</html>