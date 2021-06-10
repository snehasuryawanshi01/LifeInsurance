<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyInsurance</title>
<style>
body {
  background-color: linen;
}
</style>
</head>
<body align=center>
<h1>INSURANCE APPLICATION</h1>
<!-- <a href="Signin.jsp" ><button>Sign In</button></a></br></br> -->
<form action="verifyuser" method="post">
<table align=center >
	<tr>
		<td>UserEmail:</td>	
		<td><input type="text" name="UserEmail" placeholder="Enter Email"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password" placeholder="Enter Password"></td>
	</tr>
	<tr>
		<td colspan=2><input type="submit" value="Sign in"></td>
	</tr>
</table>
</form>
<br><br>
<!-- <a href="Signup.jsp" ><button>Sign Up</button></a> -->
<h2>Not a registered User?</h2>
<a href="Signup.jsp" ><button>Sign Up</button></a>
<a href="admin.jsp" ><button>Admin</button></a>
</body>
</html>