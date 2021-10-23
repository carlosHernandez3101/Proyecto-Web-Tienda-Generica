package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ClienteDTO;
import modelo.DetalleVenta;
import modelo.DetalleVentaDTO;
import modelo.Producto;
import modelo.ProductoDTO;
import modelo.ProveedorDTO;
import modelo.Venta;
import modelo.VentaDTO;

/**
 * Servlet implementation class ControladorVentas
 */
@WebServlet("/ControladorVentas")
public class ControladorVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClienteDTO clientedto;
	private ProductoDTO productodto;
	private VentaDTO ventadto;
	private DetalleVentaDTO detVentadto;
	private int codigoPrimerProducto;
	private int codigoSegundoProducto;
	private int codigoTercerProducto;
	private double ivaPrimerProducto;
	private double ivaSegundoProducto;
	private double ivaTercerProducto;
	private Cliente clienteEncontrado;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVentas() {
		super();
		this.clienteEncontrado = null;
		this.detVentadto = new DetalleVentaDTO();
		this.ventadto = new VentaDTO();
		this.clientedto = new ClienteDTO();
		this.productodto = new ProductoDTO();
		
		this.codigoPrimerProducto = 0;
		// TODO Auto-generated constructor stub
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
		HttpSession sesion = request.getSession();
		if (request.getParameter("btncon") != null) {
			long numeroCedula = Long.parseLong(request.getParameter("cedula"));
			clienteEncontrado = clientedto.getClienteDao().consultarCliente(numeroCedula);
			sesion.setAttribute("cliente", clienteEncontrado);
			request.getRequestDispatcher("ventas.jsp").forward(request, response);
		}

		if (request.getParameter("btnconp") != null) {

			Producto listaproducto1;
			codigoPrimerProducto = Integer.parseInt(request.getParameter("codP"));
			listaproducto1 = productodto.getProductoDAO().consultarProducto(codigoPrimerProducto);
			if (listaproducto1 == null) {
				JOptionPane.showMessageDialog(null, "Producto no encontrado");
				response.sendRedirect("ventas.jsp");
			} else {
				ivaPrimerProducto = listaproducto1.getIva_compra();
				sesion.setAttribute("producto1", listaproducto1);
				request.getRequestDispatcher("ventas.jsp").forward(request, response);
			}

		}

		if (request.getParameter("btnconp2") != null) {

			Producto listaproducto2;
			codigoSegundoProducto = Integer.parseInt(request.getParameter("codP1"));
			listaproducto2 = productodto.getProductoDAO().consultarProducto(codigoSegundoProducto);
			if (listaproducto2 == null) {
				JOptionPane.showMessageDialog(null, "Producto no encontrado");
				response.sendRedirect("ventas.jsp");
			} else {
				ivaSegundoProducto = listaproducto2.getIva_compra();
				sesion.setAttribute("producto2", listaproducto2);
				request.getRequestDispatcher("ventas.jsp").forward(request, response);
			}

		}
		if (request.getParameter("btnconp3") != null) {

			Producto listaproducto3;
			codigoTercerProducto = Integer.parseInt(request.getParameter("codP2"));
			listaproducto3 = productodto.getProductoDAO().consultarProducto(codigoTercerProducto);
			if (listaproducto3 == null) {
				JOptionPane.showMessageDialog(null, "Producto no encontrado");
				response.sendRedirect("ventas.jsp");
			} else {
				ivaTercerProducto = listaproducto3.getIva_compra();
				sesion.setAttribute("producto3", listaproducto3);
				request.getRequestDispatcher("ventas.jsp").forward(request, response);
			}

		}

		if (request.getParameter("btnconf") != null) {

			double total1, total2, total3, totalsiniva, totaliva, total, precio1, precio2, precio3, res1, res2, res3;
			String x;
			int cantidad1, cantidad2, cantidad3;

			cantidad1 = Integer.parseInt(request.getParameter("cantidad1"));
			cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));
			cantidad3 = Integer.parseInt(request.getParameter("cantidad3"));
			precio1 = Double.parseDouble(request.getParameter("vlrT"));
			precio2 = Double.parseDouble(request.getParameter("vlrT1"));
			precio3 = Double.parseDouble(request.getParameter("vlrT2"));
			total1 = cantidad1 * precio1;
			total2 = cantidad2 * precio2;
			total3 = cantidad3 * precio3;
			res1 = total1 * ivaPrimerProducto / 100;
			res2 = total2 * ivaSegundoProducto / 100;
			res3 = total3 * ivaTercerProducto / 100;
			totalsiniva = total1 + total2 + total3;
			totaliva = res1 + res2 + res3;
			total = totalsiniva + totaliva;
			int i = JOptionPane.showConfirmDialog(null,
					"Articulo 1: $" + total1 + "\n" + "Articulo 2: $" + total2 + "\n" + "Articulo 3: $" + total3 + "\n"
							+ "IVA 1: $" + res1 + "\n" + "IVA 2: $" + res2 + "\n" + "IVA 3: $" + res3 + "\n"
							+ "Total sin IVA: $" + totalsiniva + "\n" + "Total IVA: $" + totaliva + "\n"
							+ "TOTAL A PAGAR: $" + total);

			if (i == 0) {

				int cedula_usuario, cedula_cliente, ID = 0;
				cedula_cliente = (int) clienteEncontrado.getNumeroCedula();
				cedula_usuario = Integer.parseInt(request.getParameter("consecutivo"));
				Venta venta = new Venta(cedula_cliente, cedula_usuario, totaliva, totalsiniva, total);
				//ID = ventadto.getVentaDAO().agregarVenta(venta);

				if (ID == 0) {
					JOptionPane.showMessageDialog(null, "Venta no realizada");
					response.sendRedirect("ventas.jsp");

				} else {
					JOptionPane.showMessageDialog(null, "Venta realizada");
					boolean exitodetalle = false;
					DetalleVenta detaventa1 = new DetalleVenta(cantidad1, codigoPrimerProducto, ID, total1, res1,
							total1 + res1);
					DetalleVenta detaventa2 = new DetalleVenta(cantidad2, codigoSegundoProducto, ID, total2, res2,
							total2 + res2);
					DetalleVenta detaventa3 = new DetalleVenta(cantidad3, codigoTercerProducto, ID, total3, res3,
							total3 + res3);

					exitodetalle = detVentadto.getDetalleVentaDAO().registrarDetalleVenta(detaventa1);
					if (exitodetalle) {
						exitodetalle = false;
						JOptionPane.showMessageDialog(null, "El primer detalle de la venta fue creado");
						exitodetalle = detVentadto.getDetalleVentaDAO().registrarDetalleVenta(detaventa2);
						if (exitodetalle) {
							exitodetalle = false;
							JOptionPane.showMessageDialog(null, "El segundo detalle de la venta fue creado");
							exitodetalle = detVentadto.getDetalleVentaDAO().registrarDetalleVenta(detaventa3);
							if (exitodetalle) {
								JOptionPane.showMessageDialog(null, "El tercer detalle de la venta fue creado");
								response.sendRedirect("ventas.jsp");

							} else {
								JOptionPane.showMessageDialog(null,
										"Existe un problema al crear el tercer detalle de la venta");
								response.sendRedirect("ventas.jsp");

							}
						} else {
							JOptionPane.showMessageDialog(null,
									"Existe un problema al crear el segundo detalle de la venta");
							response.sendRedirect("ventas.jsp");
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Existe un problema al crear el primer detalle de la venta");
						response.sendRedirect("ventas.jsp");
					}

				}
			}

		}

	}

}
