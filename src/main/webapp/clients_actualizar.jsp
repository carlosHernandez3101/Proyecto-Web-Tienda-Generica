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
<div>
        <a href="navUser.jsp"><img src="./images/6f692f78790545818bb26fd1b1cbb13c.png" alt="" srcset=""></a>
    </div>
    <li class=" ms-5 nav-item dropdown">
        <button class=" btn btn-secondary dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
          Usuarios
        </button>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: rgba(104, 98, 98, 0.712);">
        <li><a class="dropdown-item font-size" href="usuarios_consultar.jsp">Consultar</a></li>
        <li><a class="dropdown-item font-size" href="usuarios_crear.jsp">Crear</a></li>
        <li><a class="dropdown-item font-size" href="usuarios_actualizar.jsp">Actualizar</a></li>
        <li><a class="dropdown-item font-size" href="usuarios_eliminar.jsp">Eliminar</a></li>
        </ul>
      </li>
      <li class=" ms-2 nav-item dropdown">
        <button class=" btn btn-secondary dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
          Clientes
        </button>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: rgba(104, 98, 98, 0.712);">
        <li><a class="dropdown-item font-size" href="clients_consultar.jsp">Consultar</a></li>
        <li><a class="dropdown-item font-size" href="clients_crear.jsp">Crear</a></li>
        <li><a class="dropdown-item font-size" href="clients_actualizar.jsp">Actualizar</a></li>
        <li><a class="dropdown-item font-size" href="clients_eliminar.jsp">Eliminar</a></li>
        </ul>
      </li>
      <li class=" ms-2 nav-item dropdown">
        <button class=" btn btn-secondary dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
          Proveedores
        </button>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: rgba(104, 98, 98, 0.712);">
          <li><a class="dropdown-item font-size" href="proveedores_consultar.jsp">Consultar</a></li>
          <li><a class="dropdown-item font-size" href="proveedores_crear.jsp">Crear</a></li>
          <li><a class="dropdown-item font-size" href="proveedores_actualizar.jsp">Actualizar</a></li>
          <li><a class="dropdown-item font-size" href="proveedores_eliminar.jsp">Eliminar</a></li>
        </ul>
      </li>
      <li class=" ms-2 nav-item dropdown">
        <button class=" btn btn-secondary dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
          Productos
        </button>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: rgba(104, 98, 98, 0.712);">
          <li><a class="dropdown-item font-size" href="">Consultar</a></li>
          <li><a class="dropdown-item font-size" href="">Crear</a></li>
          <li><a class="dropdown-item font-size" href="">Actualizar</a></li>
          <li><a class="dropdown-item font-size" href="">Eliminar</a></li>
        </ul>
      </li>
      <li class=" ms-2 nav-item dropdown">
        <button class=" btn btn-secondary dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
          Ventas
        </button>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
          
        </ul>
      </li>
      <li class=" ms-2 nav-item dropdown">
        <button class=" btn btn-secondary dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
          Reportes
        </button>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
          
        </ul>
      </li>   
   <div class="login" style="width: 800px;margin-left: 400px !important; background-color: rgba(255, 255, 255, 0.664) !important;margin-top:2rem !important;">
    <h2>Clientes</h2>
    <form action="">
        <div class="form">
            <div class="grid-50 container-95">
                <div class="p-3 me-1 mb-3">
                    <div class="">
                        <label for="cedula">
                            Cedula
                            <input style="margin-left: 80px;" type="text" name="cedula" id="Cedula" required/>
                        </label>                   
                    </div>
                </div>
                <div class=" p-3 me-4 mb-3">
                    <div class="">
                        <label for="usuario">
                            Telefono
                            <input style="margin-left: 59.54px;" type="text" name="usuario" id="usuario" required/>
                        </label>                   
                    </div>
                </div>
                <div class="p-3 me-2 mb-3">
                    <div class="">
                        <label for="Nombre">
                            Nombre Completo
                            <input type="text" name="nombre" id="nombre" required/>
                        </label>                   
                    </div>
                </div>
                <div class="p-3 me-2 mb-3">
                    <div class="">
                        <label for="contraseña">
                            Correo Electrónico
                            <input type="email" name="contraseña" id="contraseña" required/>
                        </label>                   
                    </div>
                </div>
                <div class="p-3 me-2 mb-3">
                    <div class="">
                        <label for="correo">
                            Dirección
                            <input style="margin-left: 65px;" type="text" name="correo" id="correo" required/>
                        </label>                   
                    </div>
                </div>
            </div>
        </div>
        <div class="d-flex p-3" style="align-items: center; margin-left: 20rem !important;">            
            <input class="button-login p-2  me-5" type="submit" style="width: 90px !important;" name="btnact"  value="Actualizar" required>            
        </div>        
   </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
   
</body>
</html>