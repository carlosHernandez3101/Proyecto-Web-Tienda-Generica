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
		String usuario, contrasenia;
		UsuarioDTO userDTO = new UsuarioDTO();
		if (request.getParameter("btnlogin") != null) {
			usuario = request.getParameter("username");
			contrasenia = request.getParameter("contrasenia");
			Usuario user = userDTO.getUsuarioDao().existeCuentaUsuario(usuario, contrasenia);
			if(user != null) {
				JOptionPane.showMessageDialog(null, "El usuario se encuentra creado: " + user.getNumeroCedula());
				response.sendRedirect("navUser.jsp");				
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no se encuentra creado");
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
