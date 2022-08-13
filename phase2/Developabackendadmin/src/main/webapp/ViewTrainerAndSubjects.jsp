<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Subjects"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Subjects and the Trainer</title>
</head>
<body>
<h3>View All Subjects and Trainer</h3>




<table border="1">
<tr>
	<th>Subject ID</th>
	<th>Subject Name</th>
	<th>Subject Trainer</th>
</tr>
<%
Object obj = session.getAttribute("listofSubjects");
List<Subjects> listofSubjects = (List<Subjects>)obj;
Iterator<Subjects> li = listofSubjects.iterator();
while(li.hasNext()){
	Subjects ss = li.next();
	%>
	<tr>
	<td><%=ss.getSubid() %> </td>
	<td><%=ss.getSubname()%> </td>
	<td><%=ss.getTsubid()%> </td>
	</tr>
	<% 
}
%>
</table>
<br/>
<a href="home.jsp">Main Page</a>
</body>
</html>
