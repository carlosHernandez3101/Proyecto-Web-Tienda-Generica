package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.Proveedor;
import modelo.ProveedorDTO;

/**
 * Servlet implementation class ControladorGestionProveedor
 */
@WebServlet("/ControladorGestionProveedor")
public class ControladorGestionProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProveedorDTO proveedorDTO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorGestionProveedor() {
        super();
        this.proveedorDTO = new ProveedorDTO();
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
		String nit = request.getParameter("nit");
		String nombreCompleto = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		String ciudad = request.getParameter("ciudad");
		if(request.getParameter("btnins") != null) {
			Proveedor proveedor = new Proveedor(nit, nombreCompleto, direccion, telefono, ciudad);
			boolean provAgregado = proveedorDTO.getProveedoresDao().agregarProveedor(proveedor);
			if(provAgregado) {
				JOptionPane.showMessageDialog(null, "Proveedor agregado con exito");
				response.sendRedirect("proveedores_crear.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Proveedor no agregado con exito");
				response.sendRedirect("proveedores_crear.jsp");
			}
		} else if(request.getParameter("btncon") != null) {
			Proveedor proveedor = new Proveedor(nit);
			Proveedor proveedorEncontrado = proveedorDTO.getProveedoresDao().buscarProveedor(proveedor);
			if(proveedorEncontrado != null) {
				JOptionPane.showMessageDialog(null, proveedorEncontrado.toString());
				response.sendRedirect("proveedores_consultar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
				response.sendRedirect("proveedores_consultar.jsp");
			}
		} else if (request.getParameter("btneli") != null) {
			Proveedor proveedor = new Proveedor(nit);
			boolean provEliminado = proveedorDTO.getProveedoresDao().eliminarProveedor(proveedor);
			if(provEliminado) {
				JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito");
				response.sendRedirect("proveedores_eliminar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Proveedor no eliminado");
				response.sendRedirect("proveedores_eliminar.jsp");
			}			
		} else if(request.getParameter("btnact") != null) {
			Proveedor proveedor = new Proveedor(nit, nombreCompleto, direccion, telefono, ciudad);
			boolean proveedorActualizado = proveedorDTO.getProveedoresDao().modificarProveedor(proveedor);
			if(proveedorActualizado) {
				JOptionPane.showMessageDialog(null, "El proveedor ha sido actualizado");
				response.sendRedirect("proveedores_actualizar.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "El proveedor no ha sido actualizado");
				response.sendRedirect("proveedores_actualizar.jsp");
			}
		}
		
	}

}
