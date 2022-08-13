
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Students"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>View All Student Details</h3>




<table border="1">
<tr>
	<th>Student ID</th>
	<th>Student Name</th>
	<th>Student Age</th>
</tr>
<%
Object obj = session.getAttribute("listofStudents");
List<Students> listofStudents = (List<Students>)obj;
Iterator<Students> li = listofStudents.iterator();
while(li.hasNext()){
	Students t = li.next();
	%>
	<tr>
	<td><%=t.getSid() %> </td>
	<td><%=t.getSname()%> </td>
	<td><%=t.getAge() %></td>
	</tr>
	<% 
}
%>
</table>
<br/>
<a href="home.jsp">Main Page</a>

</body>
</html>