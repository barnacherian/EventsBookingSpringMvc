<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="d" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add delegate</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</head>
<body>



<h1>Add Delegate Page</h1>
<d:form class="form-inline" action="add" method="post" modelAttribute="delegate">
 <div class="form-group">
<table>

<tr>
<td>Delegate id:</td>
<td><d:input path="delegateId" class="form-control" required="true"/></td>
</tr>

<tr>
<td>Delegate name:</td>
<td><d:input path="name" class="form-control" required="true"/></td>
</tr>

<tr>
<td>Address (building):</td>
<td><d:input path="address.building" class="form-control" required="true"/></td>
</tr>

<tr>
<td>street:</td>
<td><d:input path="address.street" class="form-control" required="true"/></td>
</tr>

<tr>
<td>city:</td>
<td><d:input path="address.city" class="form-control" required="true"/></td>
</tr>


<%-- <tr>
<td> Event name:</td>
<td><d:select path="eventName" required="true"/></td>
</tr>

<tr>
<td> Event date in dd-mm-yyyy format:</td>
<td><d:select path="date" required="true"/></td>
</tr>

<tr>
<td> Event city:</td>
<td><e:select path="city" required="true"/></td>
</tr> 
 --%>
<tr>
</div>
<td><input type="submit" class="btn btn-default" value="Add Event"/> </td>
</tr>

</table>
</d:form>
</body>
</html>