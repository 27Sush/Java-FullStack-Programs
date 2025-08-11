<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to my First jsp file</h1>

<!--  Scripting Elements  -->

<!--  1. Declaration tag -->
<%!
	String name = "Sushant";
	int n1 = 25;
	int n2 = 30;
%>

<!--  2. Expression tag -->
<%= "Welcome "+name+"\n" %>
<br><br>
<%= "Addition of two numbers\n" %>
<%= "Sum of "+n1+" and "+n2+" is = "+(n1+n2) %>


</body>
</html>