<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Trainer"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>View All Trainer Details</h3>
<table border="1">
<tr>
	<th>Trainer ID</th>
	<th>Trainer Name</th>
</tr>
<%
Object obj = session.getAttribute("listofTrainer");
List<Trainer> listofTrainer = (List<Trainer>)obj;
Iterator<Trainer> li = listofTrainer.iterator();
while(li.hasNext()){
	Trainer t = li.next();
	%>
	<tr>
	<td><%=t.getTid() %> </td>
	<td><%=t.getTname()%> </td>
	</tr>
	<% 
}
%>
</table>
<br/>

<a href="home.jsp">Main Page</a>

</body>
</html>