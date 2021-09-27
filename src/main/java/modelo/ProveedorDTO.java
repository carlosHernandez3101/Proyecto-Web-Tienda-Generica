package modelo;

import controlador.ConexionBD;

public class ProveedorDTO {
	
	private ProveedorDAO proveedorDao;
	private ConexionBD conexion;
	
	public ProveedorDTO() {
		this.conexion = new ConexionBD();
		this.proveedorDao = new ProveedorDAO(conexion);
	}

	public ProveedorDAO getProveedoresDao() {
		return proveedorDao;
	}

	public void setProveedoresDao(ProveedorDAO proveedoresDao) {
		this.proveedorDao = proveedoresDao;
	}	
	
	public ConexionBD getConexion() {
		return conexion;
	}
	
	public void setConexion(ConexionBD conexion) {
		this.conexion = conexion;
	}

}
