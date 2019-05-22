<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search result</title>
</head>
<body>
<table>

<tr>
<td>Event name</td>
<td>Event date </td>
<td>Event city </td>
</tr>

<tr>

<td>${showeventsearch.eventName}</td>
<td>${showeventsearch.date}</td>
<td>${showeventsearch.city}</td><br/>

</tr>
</table>
<a href="listpage">Home</a> 
</body>
</html>