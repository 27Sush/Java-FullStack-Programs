<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	String name = request.getParameter("name");
	String mail = request.getParameter("mail");
	String feedback = request.getParameter("feedback");
	
	if(name.equals("") || mail.equals("") || feedback.equals("")){
		response.sendRedirect("feedback.jsp");
	} else { 
		out.print("<br><br>Feedback received...<br>");
		out.print("Thank you for your feedback<br><br>");
		out.print("Name : "+name+"<br>Email Id  : "+mail+"<br>Feedback : "+feedback);
	}	
%>
<br><br>
<a href="feedback.jsp">Click here to submit another response</a>

</body>
</html>