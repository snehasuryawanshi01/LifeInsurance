<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align=center>

<h1>Application Form</h1>
<form action="registeruser" method="post">
<table align=center >
	<tr>
		<td>Email :</td> 
		<td><input type="text" id="email" name="email" placeholder="Enter Email" required/></td>
	</tr>
	<tr>
		<td>Password :</td>
		<td><input type="password" id="password" name="password" placeholder="Enter Password" required/></td>
	</tr>
	<tr>
		<td>Username :</td>
		<td><input id="username" name="username" placeholder="Enter username" required/></td>
	</tr>
	<tr>
		<td colspan=2><input type="submit" value="Register"></td>
	</tr>
</table>
</form>
</body>
</html>