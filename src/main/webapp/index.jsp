<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Project</title>
</head>
<body>
	<form action="ControladorGestionUsuario" method="post">
		<div>
			<img src="./images/6f692f78790545818bb26fd1b1cbb13c.png" alt=""
				srcset="">
		</div>
		<div class="login">
			<h2>Login</h2>
			<div class="form">
				<input class="input input-b" type="text" placeholder="Username"
					name="username" /> 
				<input class="input input-b" type="password"
					placeholder="Password" name="contrasenia" />
				<button class="input button-login" name="btnlogin">Sign in</button>
				<a href="#">
					<p>Don't have an account? Register</p>
				</a>
			</div>
		</div>
	</form>
</body>
</html>