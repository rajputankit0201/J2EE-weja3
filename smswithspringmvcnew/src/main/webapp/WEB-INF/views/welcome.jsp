<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String email = (String) request.getAttribute("admin");
	%>
	<nav>
		<a href="home">HOME</a> <a href="add_student">ADD</a> <a
			href="edit_student">EDIT</a> <a href="delete_student">DELETE</a> <a
			href="search">SEARCH</a> <a href="get_students">ALL STUDENTS</a> <a
			href="delete_admin?email=<%=email%>">DELETE ADMIN</a> <a
			href="log_out">LOG OUT</a>
	</nav>
	<div align="center">
		<h1>WELCOME TO STUDENT MANAGEMENT SYSTEM</h1>
	</div>
</body>
</html>