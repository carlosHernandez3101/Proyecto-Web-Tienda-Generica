package modelo;

import controlador.ConexionBD;

public class ProductoDTO {
	
	private ProductoDAO productoDAO;
	private ConexionBD conexionBD;
	
	public ProductoDTO() {
		this.conexionBD = new ConexionBD();
		this.productoDAO = new ProductoDAO(conexionBD);
	}

	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public ConexionBD getConexionBD() {
		return conexionBD;
	}

	public void setConexionBD(ConexionBD conexionBD) {
		this.conexionBD = conexionBD;
	}	

}
