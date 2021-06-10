

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
<title>Insert title here</title>
</head>
<body>
<center>
<h1> List Of Policies</h1>
</center>
<br><br>
<table align=center border=1>
 				<tr>
					<th colspan=6><u>List Of Policy</u></th>
				</tr>
				<tr>
				    <th>pid</th>
					<th>first Name</th>
					<th>Last Name</th>
					<th>Type of Policy</th>
					<th>Approved</th>
					<th>Rejected</th>
				</tr>
				<c:forEach var="l" items="${list}">
					<tr>
					    <td>${l.pid}</td>
						<td>${l.fnm}</td>
						<td>${l.lnm}</td>
						<td>${l.tpolicy}</td>
						<td><a href="/ApprovePolicy/${l.pid}" ><button>Approved</button> </a></td>
						<td><a href="/DeletePolicy/${l.pid}" ><button>Reject Policy</button> </a></td>
					</tr>
				</c:forEach>

			</table>
</body>
</html>