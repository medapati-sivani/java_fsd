<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Trainer</title>
</head>
<body>
	<h3>Assign Trainer to Subject</h3>
<form action="AssignTrainertoSubjectController" method="post">
<label>Subject ID : </label>
<input type="number" name="subid">
<label>Trainer ID : </label>
<input type="text" name="tsubid">
<input type="submit" value="Assign Trainer to Subject">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</body>

</html>
