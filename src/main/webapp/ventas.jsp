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
    <div class="login" style="width: 57rem;margin-left: auto !important;">
        <h2 class="label-color">Ventas</h2>
        <form action="">
            <div class="form">
                <div class="grid-33 container-95">
                    <div class="p-3 mb-1 d-flex">
                        <div class="">
                            <label class="align label-color" for="cedula">
                                Cédula
                                <input  type="text" name="cedula" id="cedula" required/>
                            </label>                   
                        </div>
                        <div>
                            <input class="button-login m-2 p-1" style="margin-top: 1.2rem !important;" type="submit"  name="btncon"  value="Consultar">
                        </div>
                    </div>                    
                    <div class="p-3 me-2 ms-1 mb-1">
                        <div class="">
                            <label class="align label-color" for="cliente">
                                Cliente
                                <input  type="text" name="cliente" id="cliente" required/>
                            </label>                   
                        </div>
                    </div>
                    <div class="p-3 me-2 mb-1 ms-1">
                        <div class="">
                            <label class="align label-color" for="consecutivo">
                                Consecutivo
                                <input  type="text" name="consecutivo" id="consecutivo" style="width: 180px;" required/>
                            </label>                   
                        </div>
                    </div>
                    <div class="p-3 mb-1 d-flex">
                        <div class="">
                            <label class="align label-color" for="codP">
                                Cod. Producto
                                <input  type="text" name="codP" id="codP" required/>
                            </label>                   
                        </div>
                        <div>
                            <input class="button-login m-2 p-1" style="margin-top: 1.2rem !important;" type="submit"  name="btncon"  value="Consultar">
                        </div>
                    </div>
                    <div class="p-3 mb-1 d-flex ms-4">
                        <div class="">
                            <label class="align label-color" for="nomP">
                                Nombre Producto
                                <input  type="text" name="nomP" id="nomP" required/>
                            </label>                   
                        </div>
                        <div>
                            <label class="align label-color" for="cantidad">
                                Cantidad
                                <input  type="text" name="cantidad" id="cantidad" style="width: 30px; margin-left: 25px;"required/>
                            </label>
                        </div>
                    </div>
                    <div class="p-3 mb-1 ms-1">
                        <div class="">
                            <label class="align label-color" for="vlrT">
                                Vlr. Total
                                <input  type="text" name="vlrT" id="vlrT" style="width: 180px;"/>
                            </label>                   
                        </div>                        
                    </div>
                    <div class="p-3 mb-1 d-flex">
                        <div class="mt-2">     
                            <input  type="text" name="codP1" id="codP1" required/>
                        </div>
                        <div>
                            <input class="button-login m-2 p-1" type="submit"  name="btncon"  value="Consultar">
                        </div>
                    </div>
                    <div class="p-3 mb-1 d-flex ms-4">
                        <div class="mt-2">     
                            <input  type="text" name="nomP1" id="nomP1" required/>
                        </div>                                                    
                        <div class="mt-2">
                            <input  type="text" name="cantidad1" id="cantidad1" style="width: 30px; margin-left: 25px;"required/>
                        </div>                       
                    </div>
                    <div class="p-3 mb-1 d-flex" style="margin-left: 2rem;">
                        <div class="mt-2">     
                            <input  type="text" name="vlrT1" id="vlrT1" required/>
                        </div>                                             
                    </div>
                    <div class="p-3 mb-1 d-flex">
                        <div class="mt-2">     
                            <input  type="text" name="codP2" id="codP2" required/>
                        </div>
                        <div>
                            <input class="button-login m-2 p-1" type="submit"  name="btncon"  value="Consultar">
                        </div>
                    </div>
                    <div class="p-3 mb-1 d-flex ms-4">
                        <div class="mt-2">     
                            <input  type="text" name="nomP2" id="nomP2" required/>
                        </div>                                                    
                        <div class="mt-2">
                            <input  type="text" name="cantidad2" id="cantidad2" style="width: 30px; margin-left: 25px;"required/>
                        </div>                       
                    </div>
                    <div class="p-3 mb-1 d-flex " style="margin-left: 2rem;">
                        <div class="mt-2">     
                            <input  type="text" name="vlrT2" id="vlrT2" required/>
                        </div>                                             
                    </div>
                    <div class="p-3 mb-1 d-flex">
                        <div class="">
                            <label class="align label-color" for="totalV">
                                Total Venta
                                <input  type="text" name="totalV" id="totalV" required/>
                            </label>                   
                        </div>                       
                    </div>
                    <div class="p-3 mb-1 d-flex ms-4">
                        <div class="">
                            <label class="align label-color" for="totalI">
                               Total Iva
                                <input  type="text" name="totalI" id="totalI" required/>
                            </label>                   
                        </div>                        
                    </div>
                    <div class="p-3 mb-1 ms-2">
                        <div class="">
                            <label class="align label-color" for="totalConI">
                               Total con Iva
                                <input  type="text" name="totalConI" id="totalConI" style="width: 180px;"/>
                            </label>                   
                        </div>                        
                    </div>
                </div>
            </div>            
            <div class="d-flex p-3" style="align-items: center; margin-left: 25rem !important;">            
                <input class="button-login p-2  me-5" type="submit" style="width: 90px !important;" name="btnconf"  value="Confirmar">            
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
            <p><b>Autores: </b>Carlos Hernandez, Jhon Rubiano, Jamilton Vidal, Sandra Rodríguez</p>
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