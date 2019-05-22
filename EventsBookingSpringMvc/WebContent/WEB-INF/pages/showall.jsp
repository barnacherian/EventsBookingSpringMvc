<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show all delegates</title>
</head>
<body>
<table>
<tr>
<td>Delegate Id</td>
<td>Delegate name</td>
<td>Delegate city(Address) </td>
</tr>

<a:forEach var="delegate" items="${showdelegate}">
<tr>
<td>${delegate.delegateId}</td>
<td>${delegate.name}</td>
<td>${delegate.address.city}</td>
</tr>
</a:forEach>


</table>

<a href="listpage">Home</a> 
</body>
</html>