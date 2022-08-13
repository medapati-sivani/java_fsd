<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Classes"%>
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
<h3>View All Class Details</h3>




<table border="1">
<tr>
	<th>Serial No</th>
	<th>Class ID</th>
</tr>
<%
Object obj = session.getAttribute("listofClasses");
List<Classes> listofClasses = (List<Classes>)obj;
Iterator<Classes> li = listofClasses.iterator();
while(li.hasNext()){
	Classes c = li.next();
	%>
	<tr>
	<td><%=c.getNo() %> </td>
	<td><%=c.getCid()%> </td>
	</tr>
	<% 
}
%>
</table>
<br/>
<a href="home.jsp">Main Page</a>

</body>
</html>