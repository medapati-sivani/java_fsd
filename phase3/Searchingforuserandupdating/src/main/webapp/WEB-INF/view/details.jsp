<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updation of details</title>
</head>
<body>
<h3>Details of that product</h3>
<c:set var="product" value="${obj }"></c:set>
ProductID: ${product.id}<br>
Name: ${product.name } <br>
Price: ${product.price } 
<br><br>
<h3>You can update any productdetails here</h3>
<form action="sucess">
product id : <input type="text" name="id" ><br>
Name: <input type="text" name="name" ><br>
Price : <input type="text" name="price" ><br>
<input type="submit" value="submit">
</form>

</body>
</html>	