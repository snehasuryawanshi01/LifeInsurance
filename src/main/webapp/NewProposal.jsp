<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body {
  background-color:lightblue ;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Term Insurance Policy</title>
<script type="text/javascript">

function getAge(){
    var dob = document.getElementById('date').value;
    dob = new Date(dob);
    var today = new Date();
    var age = Math.floor((today-dob) / (365.25 * 24 * 60 * 60 * 1000));
    document.getElementById('age').value=age;
}

</script>
</head>
<body align=center>
<h1>Enter Client Details</h1>
<form action="createPolicy" method="post">
<table align=center border=3>
	<tr>
		<td>First Name  :</td> 
		<td><input id="fnm" name="fnm" placeholder="Enter First Name" required/></td>
	</tr>
	<tr>
		<td>Last name :</td>
		<td><input id="lnm" name="lnm" placeholder="Enter Last Name"required/></td>
	</tr>
	<tr>
		<td>DOB :</td>
		<td><input type="date" value="" id="date" name="dob" onblur="getAge();"  /></td>
	</tr>
	<tr>
		<td>Age :</td>
		<td> <input type="text" id="age" name="age" value="" class="form-control" placeholder="Age">
	</tr>
	<tr>
		<td>E-Mail id :</td>
		<td><input id="email" name="email" placeholder="Enter E-Mail id" required/></td>
	</tr>
	<tr>
		<td>Mobile number :</td>
		<td><input id="mobno" name="mobno" placeholder="Enter mobile number" required/></td>
	</tr>
	<tr>
		<td>Gender :</td>
		<td>
			<input type="radio" name="gender" value="male"> Male
  			<input type="radio" name="gender" value="female"> Female
 			<input type="radio" name="gender" value="other" required checked> Other
		</td>
	</tr>
	<tr>
		<td>Type of Insurance</td>
		<td>
			<input type="radio" name="tpolicy" value="Term"> Term insurance
  			<input type="radio" name="tpolicy" value="Whole"> Whole Life insurance
 			<input type="radio" name="tpolicy" value="Money" required checked> Money Back policy
 			<input type="radio" name="tpolicy" value="Endowment"> Endowment Policy
		</td>
	</tr>
	<tr>
		<td>Do you consume tobacco? :</td>
		<td>
			<input type="radio" name="tobaco" value="yes" checked> Yes
 			<input type="radio" name="tobaco" value="no" required> No
		</td>
	</tr>
	<tr>
		<td>Annual income :</td>
		<td><input id="income" name="income" type="Number" required/></td>
	</tr>
	<tr>
		<td>Life cover amount(up to 3 crores) :</td>
		<td><input id="coveramt" name="coveramt" type="Number" min="1" max="30,000,000" required/></td>
	</tr>
	<tr>
		<td>Life cover up to the age(Max 100 years) :</td>
		<td><input id="coverage" name="coverage" type="Number" min="1" max="100" required/></td>
	</tr>
	
	<tr>
		<td colspan=2><input type="submit" value="Submit"></td>
	</tr>
</table>
		</form>
      
</body>
</html>