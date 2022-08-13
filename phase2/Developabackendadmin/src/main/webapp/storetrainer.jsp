<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add Trainer Details</h3>
<form action="TrainerController" method="post">
<label>Trainer ID : </label>
<input type="number" name="tid">
<label>Trainer Name : </label>
<input type="text" name="tname">
<input type="submit" value="Add Trainer">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>

</body>
</html>