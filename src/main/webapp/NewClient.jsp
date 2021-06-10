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
<title>Create New Client</title>
</head>
<body align =center>
<h1>New Client Registration</h1>
<form action="registerclient" method="post">
<table align=center >
	<tr>
		<td>First Name :</td> 
		<td><input id="cname" name="cname" placeholder="Enter  first name" required/></td>
	</tr>
	 <tr>
		<td>Last name :</td>
		<td><input id="password"  placeholder="Enter last name" required/></td>
	</tr> 
	<tr>
		<td colspan=2><input type="submit" value="Register"></td>
	</tr>
</table>
		</form>
</body>
</html>