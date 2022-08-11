
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String Pid=request.getParameter("pid");
String Pname=request.getParameter("pname");
String Price=request.getParameter("price");
out.println("Your Product Id is "+Pid);
out.println("<br>Your Product name  is "+Pname);
out.println("<br>Your Product price  is "+Price);
%>
<jsp:include page="index.jsp"></jsp:include>


</body>
</html>