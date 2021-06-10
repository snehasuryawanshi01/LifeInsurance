<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: linen;
}
</style>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Payment Form</h1>


  
 <form>
 <label for="fname">Final Amount:</label><br>
  <input type="text" id="fname" value="${PolicyPremium}"><br>
  
  <input type="radio" id="Credit Card" name="gender" value="CreditCard">
  <label for="male">Credit Card</label><br>
  <input type="radio" id="Debit Card" name="gender" value="Debit Card">
  <label for="female">Debit Card</label><br>
  <input type="radio" id="UPI" name="gender" value="UPI">
  <label for="other">UPI</label>
</form>


<a href="successful.jsp"class="btn btn-success btn-lg btn-block" ><button>Proceed To Pay</button></a>

</body>
</html>