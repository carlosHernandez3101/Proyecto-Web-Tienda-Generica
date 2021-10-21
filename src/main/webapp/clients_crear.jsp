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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Project</title>
</head>
<body>
    <header class="d-flex">

      <div>
        <a href="navUser.jsp"><img src="./images/Color logo - no background.png" style="width: 200px;" alt="" srcset=""></a>
      </div>
      <nav class="mt-5 ms-5">
        <li class=" ms-5 nav-item dropdown">        
          <button class=" btn btn-nav dropdown-toggle"  type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
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
          <button class=" btn btn-nav dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
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
          <button class=" btn btn-nav dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
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
          <button class=" btn btn-nav dropdown-toggle" type="button" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
            Productos
          </button>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: rgba(104, 98, 98, 0.712);">
              <li><a class="dropdown-item font-size" href="productos.jsp">Cargar</a></li> 
          </ul>
        </li>
        <li class=" ms-2 nav-item">
          <a class=" btn btn-nav" type="button" id="navbarDropdown" href="ventas.jsp">
            Ventas            
        </a>
        </li>
        <li class=" ms-2 nav-item dropdown">
          <a class=" btn btn-nav" type="button" id="navbarDropdown" href="reportes.jsp">
            Reportes            
        </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            
          </ul>
        </li>
      </nav>   
        
    </header>
    <div class="login">
        <h2 class="label-color" >Agregar Clientes</h2>
        	<form action="ControladorGestionCliente" method="post">
          <div class="form">
              <div class="grid-50 container-95">
                  <div class="p-3 me-1 mb-3">
                      <div class="">
                          <label for="cedula" class="label-color">
                              Cedula
                              <input  type="text" name="cedula" id="Cedula" required/>
                          </label>                   
                      </div>
                  </div>
                  <div class=" p-3 me-4 mb-3">
                      <div class="">
                          <label for="telefono" class="label-color">
                              Telefono
                              <input  type="text" name="telefono" id="telefono" />
                          </label>                   
                      </div>
                  </div>
                  <div class="p-3 me-2 mb-3">
                      <div class="">
                          <label for="Nombre" class="label-color">
                              Nombre Completo
                              <input type="text" name="nombre" id="nombre" />
                          </label>                   
                      </div>
                  </div>
                  <div class="p-3 me-2 mb-3">
                      <div class="">
                          <label for="correo" class="label-color">
                              Correo Electronico
                              <input type="email" name="correo" id="correo" />
                          </label>                   
                      </div>
                  </div>
                  <div class="p-3 me-2 mb-3">
                      <div class="">
                          <label for="direccion" class="label-color">
                              Direccion
                              <input  type="text" name="direccion" id="direccion" />
                          </label>                   
                      </div>
                  </div>
              </div>
          </div>
          <div class="d-flex p-3 btn-i" style="align-items: center; margin-left: 20rem !important;">            
            <input class="button-login p-2  me-5" type="submit" style="width: 90px !important;" name="btnins"  value="Crear">            
        </div>        
     </form>
    </div>
    <div class="footer-w" >
      <div class="mb-5 mt-5 d-flex" >
        <div class=" ms-5 mt-3 logoFooter ms-5">
          <a href="https://misionticueb.myopenlms.net/" target="_blank"><img alt="logo" src="images/channels-642_misiontic_logo.png" width="100px"></a>
        </div>    
        <div class="logo-universidad ms-5 mt-3" > 
          <a href="https://www.unbosque.edu.co/" target="_blank"><img alt="Logo minfruver" src="images/Logo_de_la_Universidad_El_Bosque.svg.png" width="100px"></a>
        </div>  
        <div class="label-color  ms-5 mt-5">      
          <p><b>Autores: </b>Carlos Hernandez, Jhon Rubiano, Jamilton Vidal, Sandra Rodriguez</p>
        </div>  
        <div class="InfoGeneral ms-5 mt-5 label-color d-flex">
          <p>Siguenos en nuestras redes sociales</p>
          <div class="redesSociales">
            <a class="ms-5" href="#"><img class="icon" alt="Facebook" src="images/Facebook-f_Logo-Blue-Logo.wine.svg"></a>
            <a class="ms-5" href="#"><img class="icon" alt="Instagram" src="images/Instagram-Glyph-Color-Logo.wine.svg"></a>
            <a class="ms-5" href="#"><img class="icon-t" alt="Twitter" src="images/pngaaa.com-615958.png"></a>
          </div>            
        </div>    
      </div>  
      <div class="label-color">
        <p>Copyright &copy 2021. All Rights Reserved</p>
      </div>
    </div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
   
</body>
</html>