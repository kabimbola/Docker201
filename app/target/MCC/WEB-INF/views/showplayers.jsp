<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Players</title>
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

	<h1>Players List: Mindtree Kalinga Cricket Council</h1>
	<br>
	<br>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Type</th>
			<th>Age</th>
			<th>Batting Avg.</th>
			<th>Bowling Avg.</th>
			<th>Status</th>
		</tr>
		<c:forEach items="${list}" var="player">
			<tr>
				<td>${player.id}</td>
				<td>${player.name}</td>
				<td>${player.type}</td>
				<td>${player.age}</td>
				<td>${player.battingAvg}</td>
				<td>${player.bowlingAvg}</td>
				<td>${player.status}</td>

			</tr>
		</c:forEach>

	</table>

	<a href="index">Index</a>
</body>
</html>