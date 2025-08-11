<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<br><br>
<h1> EMPLOYEE DETAILS </h1>
<br><br>
<table border="2">

	<tr>
		<th>EMPLOYEE ID</th>
		<th>EMPLOYEE NAME</th>
		<th>PHONE NUMBER</th>
	</tr>
	
	<c:forEach items="${employeeList}" var="employee">
	
	<tr>
		<td>${employee.id}</td>
		<td>${employee.name}</td>
		<td>${employee.phone}</td>				
	</tr>

	</c:forEach>

</table>
<br><br>
<a href="index.jsp">HOME</a>

</body>
</html>			