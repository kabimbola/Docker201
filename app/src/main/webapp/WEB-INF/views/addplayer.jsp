<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

h3{
	margin: 50px 0;
}

.master{
	margin: 10px 300px;
}
form{
	margin: 40px 0;
}
form > fieldset {
	text-align: center;
}

</style>
</head>
<body>
	<div class="banner">
		MT Cricket Council
	</div>
	
	<div class="master">
	<h3>FILL OUT THE FOLLOWING INFO TO ADD A NEW PLAYER</h3>
	<form action="addPlayer" method="post">

		<fieldset>
			<table>
				<tr>
					<td>Player Id:</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td class="select">Player Type
					<select name="type">
							<option value="Batsman">Batsman</option>
							<option value="Bowler">Bowler</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>Batting Avg.:</td>
					<td><input type="text" name="batAvg"></td>
				</tr>
				<tr>
					<td>Bowling Avg.:</td>
					<td><input type="text" name="bowlAvg"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Confirm & Checkout"></td>
				</tr>
			</table>
		</fieldset>
	</form>
	</div>
</body>
</html>