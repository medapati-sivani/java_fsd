<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add Student Details</h3>
<form action="StudentsController" method="post">
<label>Student ID : </label>
<input type="number" name="sid">
<label>Student Name : </label>
<input type="text" name="sname">
<label>Student Age : </label>
<input type="number" name="age">
<input type="submit" value="Add Student">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>

</body>
</html>