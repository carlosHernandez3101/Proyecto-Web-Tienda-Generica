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


/**
 * Servlet implementation class ControladorGestionCliente
 */
@WebServlet("/ControladorGestionCliente")
public class ControladorGestionCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClienteDTO clienteDTO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorGestionCliente() {
		super();
		this.clienteDTO = new ClienteDTO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * long numeroCedula = Long.parseLong(request.getParameter("cedula")); String
		 * nombreCompleto = request.getParameter("nombre"); String direccion =
		 * request.getParameter("direccion"); long telefono =
		 * Long.parseLong(request.getParameter("telefono")); String correoElectronico =
		 * request.getParameter("correo");
		 */
		
		if (request.getParameter("btnins") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			String nombreCompleto = request.getParameter("nombre");
			String direccion = request.getParameter("direccion");
			long telefono = Long.parseLong(request.getParameter("telefono"));
			String correoElectronico = request.getParameter("correo");
			Cliente cliente = new Cliente(numeroCedula, nombreCompleto, direccion, telefono, correoElectronico);
			boolean clienteCreado = clienteDTO.getClienteDao().insertarCliente(cliente);
			if (clienteCreado) {
				JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
				response.sendRedirect("clients_crear.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar");
				response.sendRedirect("clients_crear.jsp");
			}
		} 
		if (request.getParameter("btncon") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			Cliente clienteEncontrado = clienteDTO.getClienteDao().consultarCliente(numeroCedula);
			if (clienteEncontrado != null) {
				JOptionPane.showMessageDialog(null, clienteEncontrado.toString());
				response.sendRedirect("clients_consultar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Cliente no encontrado");
				response.sendRedirect("clients_consultar.jsp");
			}
		} else if (request.getParameter("btneli") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			boolean clienteEliminado = clienteDTO.getClienteDao().eliminarCliente(numeroCedula);
			if (clienteEliminado) {
				JOptionPane.showMessageDialog(null, "Cliente eliminado");
				response.sendRedirect("clients_eliminar.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "Cliente no fue eliminado");
				response.sendRedirect("clients_consultar.jsp");
			}
		} else if(request.getParameter("btnact") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			String nombreCompleto = request.getParameter("nombre");
			String direccion = request.getParameter("direccion");
			long telefono = Long.parseLong(request.getParameter("telefono"));
			String correoElectronico = request.getParameter("correo");
			Cliente cliente = new Cliente(numeroCedula, nombreCompleto, direccion, telefono, correoElectronico);
			boolean clienteModificado = clienteDTO.getClienteDao().modificarDatosCliente(cliente);
			if(clienteModificado) {
				JOptionPane.showMessageDialog(null, "El cliente ha sido modificado");
				response.sendRedirect("clients_actualizar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "El cliente no ha sido modificado");
				response.sendRedirect("clients_actualizar.jsp");
			}
		}
	}

}
