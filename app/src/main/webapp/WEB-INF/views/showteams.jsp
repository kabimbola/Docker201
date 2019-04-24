<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teams</title>
<style>
body {
	font-family: "Arial", sans-serif;
}

.banner {
	padding: 10px 50px;
	margin: 10px 0;
	background-color: green;
	text-align: right;
	font-size: 18px;
	color: #FFFFFF;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>
</head>
<body>
	<div class="banner">MT Cricket Council</div>
	<h1>My Teams</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>State</th>
		</tr>
		<c:forEach items="${list}" var="team">
			<tr>
				<td>${team.id}</td>
				<td>${team.name}</td>
				<td>${team.state}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>