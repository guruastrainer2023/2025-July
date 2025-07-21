<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Input Screen</h1>
<form:form action="output" method="POST" modelAttribute="emp">
<table>
	<tr>
		<td>ID</td>
		<td><form:input path="id"/></td>
	</tr>
	
	<tr>
		<td>NAME</td>
		<td><form:input path="name"/></td>
	</tr>
	
	<tr>
		<td>Gender</td>
		<td>
			<form:select path="gender">
				<form:option value="MALE"></form:option>MALE
				<form:option value="FEMALE"></form:option>FEMALE
			</form:select>
		</td>
	</tr>
	
	
	<tr>
		<td>CITY</td>
		<td><form:input path="city"/></td>
	</tr>
	
	<tr>
		<td>BASIC</td>
		<td><form:input path="basic"/></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="Display">
	</tr>
	
</table>
</form:form>



</body>
</html>