<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<style>
body {
  background-color: linen;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Console</title>
</head>
<body>

<table align=center border=1>
 				<tr>
					<th colspan=8><h1>List Of Policies</h1></th>
				</tr>
				<tr>
				    
					<th>First Name</th>
					<th>Last Name</th>
					<th>Cover Amount</th>
					<th>Income</th>					
					<th>Type Of Policy</th>
					<th>Approved</th>
					<th>Reject</th>
					
				</tr>
				<c:forEach var="l" items="${list}">
				    <tr>
					
					<td>${l.fnm}</td>
					<td>${l.lnm}</td>
					<td>${l.coveramt}</td>
					<td>${l.income}</td>					
				    <td>${l.tpolicy}</td>
				    <td><a href="/DeletePolicy/${l.pid}"><button>delete Policy</button> </a></td>
					</tr>					
					</tr>
				</c:forEach>

</table>
</body>
</html>