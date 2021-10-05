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
		String sql = "INSERT INTO clientes VALUES (?,?,?,?,?)";
		try {
			conexion.establecerConexionBD();
			ps = conexion.getCnn().prepareStatement(sql);
			ps.setLong(1, cliente.getNumeroCedula());
			ps.setString(2, cliente.getNombreCompleto());
			ps.setString(3, cliente.getDireccion());
			ps.setLong(4, cliente.getTelefono());
			ps.setString(5, cliente.getCorreoElectronico());
			int result = ps.executeUpdate();
			if (result > 0) {
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
		String sql = "SELECT * FROM clientes WHERE cli_numero_cedula = " + numeroCedula;
		try {
			conexion.establecerConexionBD();
			ps = conexion.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
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

	public boolean eliminarCliente(long numeroCedula) {
		PreparedStatement ps;
		String sql = "DELETE FROM clientes WHERE cli_numero_cedula = "+ numeroCedula ;
		try {
			conexion.establecerConexionBD();
			ps = conexion.getCnn().prepareStatement(sql);
			//ps.setLong(1, numeroCedula);
			int result = ps.executeUpdate();
			if (result > 0) {
				conexion.cerrarConexionBD();
				return true;
			} else {
				conexion.cerrarConexionBD();
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}

	public boolean modificarDatosCliente(Cliente cliente) {
		PreparedStatement ps;
		String sql = "UPDATE clientes SET cli_nombre_completo = ?, cli_direccion = ?, cli_telefono = ?, cli_correo_electronico = ? WHERE cli_numero_cedula = "
				+ cliente.getNumeroCedula();		
		try {
			conexion.establecerConexionBD();
			ps = conexion.getCnn().prepareStatement(sql);
			ps.setString(1, cliente.getNombreCompleto());
			ps.setString(2, cliente.getDireccion());
			ps.setLong(3, cliente.getTelefono());
			ps.setString(4, cliente.getCorreoElectronico());
			int result = ps.executeUpdate();
			if (result > 0) {
				conexion.cerrarConexionBD();
				return true;
			} else {
				conexion.cerrarConexionBD();
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}

}
