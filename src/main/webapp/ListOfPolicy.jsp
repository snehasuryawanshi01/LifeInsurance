<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br><br>
<table align=center border=1>
 				<tr>
					<th colspan=5><u>List Of Policy</u></th>
				</tr>
				<tr>
				    <th>pid</th>
					<th>first Name</th>
					<th>Last Name</th>
					<th>Type of Policy</th>
					<th>Cancellation</th>
				</tr>
				<c:forEach var="l" items="${key}">
					<tr>
					    <td>${l.pid}</td>
						<td>${l.fnm}</td>
						<td>${l.lnm}</td>
						<td>${l.tpolicy}</td>
						<td><a href="/DeletePolicy/${l.pid}" ><button>delete Policy</button> </a></td>
					</tr>
				</c:forEach>

			</table>
</body>
</html>