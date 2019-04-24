<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Player</title>
<style>
body{
		font-family: "Arial",sans-serif;
	}
.banner{
	padding: 10px 50px;
	margin: 10px 0;
	background-color: green;
	text-align: right;
	font-size: 18px;
	color: #FFFFFF;	
}

</style>
</head>
<body>
	<div class="banner">
		MT Cricket Council
	</div>

	<h1>FILL OUT TEAM INFORMATION AND CHOOSE PLAYERS</h1>

	<form action="addTeam" method="post">
		<fieldset>
			<table>
				<tr>
					<td>Choose Team Id:</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Choose Team Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Select State:</td>
					<td><input type="text" name="state"></td>
				</tr>

				<tr>
					<td>Choose Players:</td>
					<td>
						<c:forEach items="${list}" var="player">
							<input type="checkbox" name=teamPlayers value=${player.id}>${player.name}<br>
						</c:forEach>
					</td>
				</tr>

				<tr>
					<td><input type="submit" value="Confirm & Checkout"></td>
				</tr>
			</table>
		</fieldset>
	</form>


</body>
</html>