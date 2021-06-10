<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<style>
body {
  background-color: aliceblue;
  
  
  

}
..button {
  background-color: #4CAF50; /* Green */

  color: white;

}
</style>
<head>
<meta charset="ISO-8859-1">
<title>My Insurance</title>
</head>
<body>
<br><br>
<table align=center border=1>
 				<tr>
					<th colspan=3><u>Name Of Clients </u></th>
				</tr>
				<c:forEach var="l" items="${list}">
					<tr>
						<td><b> ${l.cname}</b></td>
						<td><a href="NewProposal.jsp" ><button>New Proposal</button> </a> </td>
						<td><a href="/${l.cname}"><button>List Of Policy</button></a>  </td>
						
					</tr>
				</c:forEach>

			</table>
</body>
</html>