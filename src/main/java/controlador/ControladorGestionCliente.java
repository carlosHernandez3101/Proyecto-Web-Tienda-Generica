package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ClienteDTO;
import modelo.UsuarioDTO;

/**
 * Servlet implementation class ControladorGestionCliente
 */
@WebServlet("/ControladorGestionCliente")
public class ControladorGestionCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorGestionCliente() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClienteDTO clienteDTO = new ClienteDTO();
		if(request.getParameter("btncon") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			String nombreCompleto = request.getParameter("nombre");
			String direccion = request.getParameter("");
			long telefono = Long.parseLong(request.getParameter("cedula"));
			String correoElectronico = request.getParameter("correo");
			Cliente cliente = new Cliente(12123, "dfsdfs", "cssdd", 14556, "dsd@sds");
			boolean clienteCreado = clienteDTO.getClienteDao().insertarCliente(cliente);
			if (clienteCreado) {
				JOptionPane.showMessageDialog(null, "Cliente agregado con exito");				
			} else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar");
			}
		}
	}

}
