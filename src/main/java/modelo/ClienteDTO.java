package modelo;

import controlador.ConexionBD;

public class ClienteDTO {
	
	private ClienteDAO clienteDao;
	private ConexionBD conexion;
	
	public ClienteDTO() {
		this.conexion = new ConexionBD();
		this.clienteDao = new ClienteDAO(conexion);
	}

	public ClienteDAO getClienteDao() {
		return clienteDao;
	}

	public ConexionBD getConexion() {
		return conexion;
	}	

}
