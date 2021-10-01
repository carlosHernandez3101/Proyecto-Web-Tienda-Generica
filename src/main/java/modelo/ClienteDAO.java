package modelo;

import java.sql.*;

import javax.swing.JOptionPane;

import controlador.ConexionBD;

public class ClienteDAO {
	
	private ConexionBD conexion;
	
	public ClienteDAO(ConexionBD conexion) {
		this.conexion = conexion;		
	}
	
	public boolean insertarCliente(Cliente cliente) {
		PreparedStatement ps;
		String sql = "INSERT INTO cliente VALUES (?,?,?,?,?)";
		try {
			conexion.establecerConexionBD();
			ps = conexion.getCnn().prepareStatement(sql);
			ps.setLong(1, cliente.getNumeroCedula());
			ps.setString(2, cliente.getNombreCompleto());
			ps.setString(3, cliente.getDireccion());
			ps.setLong(4, cliente.getTelefono());
			ps.setString(5, cliente.getCorreoElectronico());
			int result = ps.executeUpdate();
			if(result > 0) {
				conexion.cerrarConexionBD();
				return true;
			} else {
				conexion.cerrarConexionBD();
				return false;
			}			
		} catch (Exception e) {
			return false;
		}		
	}
	
	public Cliente consultarCliente(long numeroCedula) {
		Cliente clienteEncontrado = null;
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM cliente WHERE cli_numero_cedula = " + numeroCedula;
		try {
			conexion.establecerConexionBD();
			ps = conexion.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				long numeroCedulaE = Long.parseLong(rs.getString(1));
				String nombreCompleto = rs.getString(2);
				String direccion = rs.getString(3);
				long telefono = Long.parseLong(rs.getString(4));
				String correoElectronico = rs.getString(5);
				clienteEncontrado = new Cliente(numeroCedulaE, nombreCompleto, direccion, telefono, correoElectronico);
			}
			conexion.cerrarConexionBD();
		} catch (Exception e) {
			clienteEncontrado = null;
		}
		return clienteEncontrado;
	}

}
