<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<br>
<h1>EMPLOYEE DETAILS...</h1>
<br> <br>

<table border="2">

	<tr>
		<th>EMPLOYEE ID</th>
		<th>EMPLOYEE NAME</th>
		<th>EMPLOYEE PHONE</th>
	</tr>
	
	<tr>
		<td>${employee.id}</td>
		<td>${employee.name}</td>
		<td>${employee.phone}</td>
	</tr>

</table>

<br>
<a href="index.jsp">HOME</a>

</body>
</html>