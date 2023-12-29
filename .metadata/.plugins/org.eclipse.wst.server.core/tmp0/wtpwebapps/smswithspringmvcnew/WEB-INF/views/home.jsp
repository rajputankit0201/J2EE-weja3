<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav>
		<a href="home">HOME</a> <a href="add_student">ADD</a> <a
			href="edit_student">EDIT</a> <a href="delete_student">DELETE</a> <a
			href="search">SEARCH</a> <a href="get_students">ALL STUDENTS</a> <a
			href="log_out">LOG OUT</a>
	</nav>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null && (message.equals("Logged in") || message.equals("Invalid Email or Password"))) {
	%>
	<div align="center">
		<h1><%=message%></h1>
	</div>
	<%
	}
	%>
</body>
</html>