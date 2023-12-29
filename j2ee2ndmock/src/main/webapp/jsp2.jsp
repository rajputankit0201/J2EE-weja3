<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% %>
    <% String firstName = request.getParameter("FirstName"); %>
    <br>
    <% String lastName = request.getParameter("Lastname"); %>

    <h2>Hello, <%= firstName %> <%= lastName %>!</h2>
    
    <a href="jsp1.jsp"></a>
    
</body>
</html>