<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="add_student" method="post">
			<table border="1px solid">
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age"></td>
				</tr>
			</table>
			<input type="submit" value="ADD">
		</form>
	</div>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h1><%=message%></h1>
	</div>
	<%
	}
	%>
</body>
</html>