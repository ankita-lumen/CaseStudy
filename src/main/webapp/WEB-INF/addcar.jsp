<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Car</title>
</head>
<body>
 <p>RowAdded</p><c:out value="${rowAdded}"/> 
<form:form method="post" action="cars">
<form:label path="carmodelname">Car Model Name</form:label>
<form:input path="carmodelname"/>
<form:label path="year">Manufacture Year</form:label>
<form:input path="year"/>
<form:label path="kilometer">Kilometer</form:label>
<form:input path="kilometer"/>
<form:label path="status">Status</form:label>
<form:input path="status"/>
<input type="submit" value="Add">
</form:form>
</body>
</html>