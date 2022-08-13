<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Class Details</h2>
<form action="ClassesController" method="post">
<label>No : </label>
<input type="number" name="no">
<label>Class ID : </label>
<input type="text" name="cid">
<input type="submit" value="Store Class">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>

</body>
</html>