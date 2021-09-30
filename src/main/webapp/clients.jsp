<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles.css">
<link rel="stylesheet" href="style-grid.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Project</title>
</head>
<body>
	<form action="ControladorGestionUsuario" method="get">
	<div>
		<a href="navUser.jsp"><img
			src="./images/6f692f78790545818bb26fd1b1cbb13c.png" alt="" srcset=""></a>
	</div>
	<nav class="navbar navbar-light" style="background-color: transparent;">
		<div class="">
			<ul>
				<li><a class="nav-usuarios" href="navUser.jsp">Usuarios</a></li>
				<li><a class="nav-usuarios" href="clients.jsp">Clientes</a></li>
				<li><a class="nav-usuarios" href="supplier.jsp">Proveedores</a></li>
				<li><a class="nav-usuarios" href="">Productos</a></li>
				<li><a class="nav-usuarios" href="">Ventas</a></li>
				<li><a class="nav-usuarios" href="">Reportes</a></li>
			</ul>
		</div>
	</nav>
	<div class="login"
		style="width: 800px; margin-left: 400px !important; background-color: rgba(255, 255, 255, 0.664) !important; margin-top: 2rem !important;">
		<h2>Clientes</h2>
		<form action="ControladorGestionCliente" method="post">
			<div class="form">
				<div class="grid-50 container-95">
					<div class="p-3 me-1 mb-3">
						<div class="">
							<label for="cedula"> Cedula <input
								style="margin-left: 80px;" type="number" name="cedula"
								id="Cedula" required />
							</label>
						</div>
					</div>
					<div class=" p-3 me-4 mb-3">
						<div class="">
							<label for="usuario"> Telefono <input
								style="margin-left: 59.54px;" type="number" name="telefono"
								id="telefono" required />
							</label>
						</div>
					</div>
					<div class="p-3 me-2 mb-3">
						<div class="">
							<label for="Nombre"> Nombre Completo <input type="text"
								name="nombre" id="nombre" required />
							</label>
						</div>
					</div>
					<div class="p-3 me-2 mb-3">
						<div class="">
							<label for="contraseña"> Correo Electrónico <input
								type="email" name="correo" id="correo" required />
							</label>
						</div>
					</div>
					<div class="p-3 me-2 mb-3">
						<div class="">
							<label for="correo"> Dirección <input
								style="margin-left: 65px;" type="text" name="direccion" id="direccion"
								required />
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="d-flex p-3"
				style="align-items: center; margin-left: 10rem !important;">
				<input class="button-login p-2 me-5" type="submit" name="btnins" value="Consultar"> 
				<input class="button-login p-2  me-5" type="submit" style="width: 90px !important;" name="btncon"
					value="Crear"> 
				<input class="button-login p-2  me-5" type="submit" name="btnact" value="Actualizar"> <input
					class="button-login btn-delete p-2" type="submit" name="btneli"
					value="Eliminar">
			</div>
		</form>
	</div>
	</form>
</body>
</html>