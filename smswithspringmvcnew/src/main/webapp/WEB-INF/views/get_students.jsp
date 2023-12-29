
<%@page import="com.jspider.smswithspringmvcnew.pojo.StudentPOJO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    div {
        margin: 20px;
        padding: 20px;
        background-color: white;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    table {
        border-collapse: collapse;
        width: 100%;
        margin-top: 20px;
        background-color: white;
    }

    th, td {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    th {
        background-color: #4CAF50;
        color: white;
    }

    h1 {
        color: #333;
    }

    input[type="text"], input[type="submit"] {
        margin: 5px;
        padding: 10px;
        border: 1px solid #ddd;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        cursor: pointer;
    }
</style>
</head>
<body>
	<%
	@SuppressWarnings("unchecked")
	List<StudentPOJO> students = (List<StudentPOJO>) request.getAttribute("students");
	if (students != null && students.size() > 0) {
	%>
	<div align="center">
		<table border="1px solid">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Age</th>
			</tr>
			<%
			for (StudentPOJO studentPOJO : students) {
			%>
			<tr>
				<td><%=studentPOJO.getId()%></td>
				<td><%=studentPOJO.getName()%></td>
				<td><%=studentPOJO.getEmail()%></td>
				<td><%=studentPOJO.getMobile()%></td>
				<td><%=studentPOJO.getAge()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
	<%
	} else {
	%>
	<div align="center">
		<h1>Students not found.</h1>
	</div>
	<%
	}
	%>
</body>
</html>
