<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body {
  background-color: linen;
}


.button {
  background-color: red; 
  border-radius: 4px;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  transition-duration: 0.4s;
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
}



.button2 {
  background-color: red; 
  color: black; 
  border: 2px solid #008CBA;
}



.button3 {
  background-color: white; 
  color: black; 
  border: 2px solid #f44336;
}

.button3:hover {
  background-color: #f44336;
  color: white;
}

.button4 {
  background-color: white;
  color: black;
  border: 2px solid #e7e7e7;
}

.button4:hover {background-color: #e7e7e7;}

.button5 {
  background-color: white;
  color: black;
  border: 2px solid #555555;
}

.button5:hover {
  background-color: #555555;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>MyInsurance</title>
</head>
<body align=center>

<h4 align=center style="color:red">Login in successfull !!!</h4>

<h1>Welcome to Insurance Policy</h1>

<table align=center border=0>
	<tr>
		<td><a href="NewClient.jsp" ><button class="button">New Client</button></a></td>
		
		<td><a href="/getallusers" ><button class="button button2">List of client</button></a></td>
			
		<!-- <td><a href="NewProposal.jsp" ><button class="button button3">Create Proposal</button></a></td>	
	
		<td><a href="" ><button class="button button4">List of Policy</button></a></td>	
	
		<td><a href="" ><button class="button button5">Cancelled Policy</button></a></td>	
		 -->
	</tr>
</table>


</body>
</html>