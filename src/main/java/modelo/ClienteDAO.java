package modelo;

import java.sql.*;

import controlador.ConexionBD;

public class ClienteDAO {
	
	private ConexionBD conexion;
	
	public ClienteDAO(ConexionBD conexion) {
		this.conexion = conexion;		
	}
	
	public void insertarCliente(Cliente cliente) {
		PreparedStatement ps;
		String sql = "";
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
