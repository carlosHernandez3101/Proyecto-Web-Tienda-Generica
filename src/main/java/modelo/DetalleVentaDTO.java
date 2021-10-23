package modelo;

import controlador.ConexionBD;

public class DetalleVentaDTO {
	
	private ConexionBD cnn;
	private DetalleVentaDAO detalleVentaDAO;
	
	public DetalleVentaDTO() {
		this.cnn = new ConexionBD();
		this.detalleVentaDAO = new DetalleVentaDAO(cnn);
	}

	public ConexionBD getCnn() {
		return cnn;
	}

	public void setCnn(ConexionBD cnn) {
		this.cnn = cnn;
	}

	public DetalleVentaDAO getDetalleVentaDAO() {
		return detalleVentaDAO;
	}

	public void setDetalleVentaDAO(DetalleVentaDAO detalleVentaDAO) {
		this.detalleVentaDAO = detalleVentaDAO;
	}	

}
