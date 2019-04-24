<html>
<head>
<title>Mindtree Cricket Council</title>
<style>
body {
	font-family: "Arial", sans-serif;
}

.header {
	text-align: center;
}

.header>h1 {
	padding: 40px;
	font-family: "Arial", sans-serif;
	font-size: 34px;
}

.master {
	text-align: center;
}

h2 {
	font-size: 18px;
}

.master {
	margin: 20px 200px;
}

form {
	display: inline-block;
	margin: 10px 0 50px 0;
}

form>input {
	width: 200px;
	height: 200px;
	background-color: green;
	font-size: 16px;
	color: #FFFFFF;
}

form>input:hover {
	background-color: tomato;
	width: 210px;
	height: 210px;
}
</style>
</head>

<body>

	<div class="master">
		<hr>
		<div class="header">
			<h1>MTK Cricket Council</h1>
		</div>
		<hr>
		<h2>Welcome to MTK Cricket Council</h2>
		<br>
		<form action="addPlayer">
			<input type="submit" value="Add Player" />
		</form>
		<form action="getAllPlayers">
			<input type="submit" value="Get All Players Info" />
		</form>

		<form action="addTeam">
			<input type="submit" value="Add a Team" />
		</form>

		<hr>
		<p>2018 Octopent</p>
	</div>
</body>
</html>