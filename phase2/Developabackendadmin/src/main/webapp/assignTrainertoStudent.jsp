<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Trainer</title>
</head>
<body>
	<h3>Assign Trainer to Student</h3>
<form action="AssignTrainertoStudentController" method="post">
<label>Student ID :</label>
<input type="number" name="sid">
<label>Trainer ID :</label>
<input type="text" name="tsid">
<input type="submit" value="Assign Trainer">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</body>

</html>
