package modelo;

import controlador.ConexionBD;

public class VentaDTO {
	
	private ConexionBD cnn;
	private VentaDAO ventaDAO;
	
	public VentaDTO() {
		this.cnn = new ConexionBD();
		this.ventaDAO = new VentaDAO(cnn);
	}

	public ConexionBD getCnn() {
		return cnn;
	}

	public void setCnn(ConexionBD cnn) {
		this.cnn = cnn;
	}

	public VentaDAO getVentaDAO() {
		return ventaDAO;
	}

	public void setVentaDAO(VentaDAO ventaDAO) {
		this.ventaDAO = ventaDAO;
	}	

}
