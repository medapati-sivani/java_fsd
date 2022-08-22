<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>AvailableProducts </h1>

<table border=1 cellspacing=0 cellpadding=10>
	<tr><th>ID</th><th>NAME</th><th>PRICE</th></tr>
	<c:forEach var="p" items="${list }">
	
		<tr>
			<td>${p.id }</td>
			<td>${p.name }</td>
			<td>${p.price }</td>
		
		</tr>
	
	</c:forEach>
	
	

</table>

</body>
</html>