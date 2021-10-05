package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.Usuario;
import modelo.UsuarioDTO;

/**
 * Servlet implementation class ControladorLogin
 */
@WebServlet("/ControladorGestionUsuario")
public class ControladorGestionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorGestionUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario, contrasenia;
		UsuarioDTO userDTO = new UsuarioDTO();
		// validacion modulo login
		if (request.getParameter("btnlogin") != null) {
			usuario = request.getParameter("username");
			contrasenia = request.getParameter("contrasenia");
			Usuario user = userDTO.getUsuarioDao().existeCuentaUsuario(usuario, contrasenia);
			if (user != null) {
				response.sendRedirect("navUser.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no se encuentra creado");
				response.sendRedirect("index.jsp");
			}
			// fin validacion modulo login
		} else if (request.getParameter("btnins") != null) { // Validacion navegacion usuario
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			String nombreCompleto = request.getParameter("nombre");
			String correoElectronico = request.getParameter("correo");
			usuario = request.getParameter("usuario");
			contrasenia = request.getParameter("contraseña");
			boolean userCreado = userDTO.getUsuarioDao().agregarUsuario(numeroCedula, nombreCompleto,
					correoElectronico);
			boolean cuentaCreada = userDTO.getUsuarioDao().creaCuenta(numeroCedula, usuario, contrasenia);
			if (nombreCompleto == "" || correoElectronico == "" || usuario == "" || contrasenia == "") {
				userCreado = false;
				cuentaCreada = false;
				JOptionPane.showMessageDialog(null, "Faltan datos del usuario");
				response.sendRedirect("usuarios_crear.jsp");
			} else if (userCreado && cuentaCreada) {
				JOptionPane.showMessageDialog(null, "El usuario fue creado");
				response.sendRedirect("usuarios_crear.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no fue creado ");
				response.sendRedirect("usuarios_crear.jsp");
			}
		} else if (request.getParameter("btncon") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			Usuario user = userDTO.getUsuarioDao().buscarUsuario(numeroCedula);
			if (user != null) {
				JOptionPane.showMessageDialog(null, user.toString());
				response.sendRedirect("usuarios_consultar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no fue encontrado");
				response.sendRedirect("usuarios_consultar.jsp");
			}
		} else if (request.getParameter("btneli") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			boolean userEliminado = userDTO.getUsuarioDao().eliminarUsuario(numeroCedula);
			if (userEliminado) {
				JOptionPane.showMessageDialog(null, "El usuario ha sido eliminado");
				response.sendRedirect("usuarios_eliminar.jsp");
			}
		} else if(request.getParameter("btnact") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			String nombreCompleto = request.getParameter("nombre");
			String correoElectronico = request.getParameter("correo");
			boolean userModificado = userDTO.getUsuarioDao().modificarUsuario(numeroCedula, nombreCompleto, correoElectronico);
			if(userModificado) {
				JOptionPane.showMessageDialog(null, "El usuario ha sido modificado");
				response.sendRedirect("usuarios_actualizar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no ha sido modificado");
				response.sendRedirect("usuarios_actualizar.jsp");
			}
		}
		// Fin validacion navegacion de usuario
	}

}
