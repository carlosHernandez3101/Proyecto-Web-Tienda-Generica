package modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.ConexionBD;

public class UsuarioDAO {

	private ConexionBD conexionBD;

	public UsuarioDAO(ConexionBD conexionBD) {
		this.conexionBD = conexionBD;
	}

	public Usuario existeCuentaUsuario(String username, String contrasenia) {
		PreparedStatement ps;
		ResultSet rs;
		Usuario userEncontrado = null;
		String sql = "SELECT CUE_NOMBRE_USUARIO, USU_NUMERO_CEDULA FROM cuentas where CUE_NOMBRE_USUARIO = ? and CUE_CONTRASENIA = ?";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, contrasenia);
			rs = ps.executeQuery();
			if (rs.next()) {
				String usuarioCuenta = rs.getString(1);
				long numeroCedula = Long.parseLong(rs.getString(2));
				userEncontrado = new Usuario();
				userEncontrado.setUsuario(usuarioCuenta);
				userEncontrado.setNumeroCedula(numeroCedula);
			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la conexion " + e);
			userEncontrado = null;
		}
		return userEncontrado;
	}

	public Usuario existeUsuario(long numeroCedula) {
		PreparedStatement ps;
		ResultSet rs;
		Usuario userEncontrado = null;
		String sql = "SELECT usu_numero_cedula, usu_nombre_completo FROM usuarios where usu_numero_cedula = ?";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setLong(1, numeroCedula);
			rs = ps.executeQuery();
			if (rs.next()) {
				long numeroCedulaC = Long.parseLong(rs.getString(1));
				String nombreCompleto = rs.getString(2);
				userEncontrado = new Usuario();
				userEncontrado.setNumeroCedula(numeroCedulaC);
				userEncontrado.setNombreCompleto(nombreCompleto);
			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la conexion " + e);
			userEncontrado = null;
		}
		return userEncontrado;
	}

	public boolean creaCuenta(long numeroCedula, String nombreUsuario, String contrasenia) {
		PreparedStatement ps;
		String sql = "INSERT INTO cuentas VALUES(?,?,?)";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setLong(1, numeroCedula);
			ps.setString(2, nombreUsuario);
			ps.setString(3, contrasenia);
			int result = ps.executeUpdate();
			if (result > 0) {
				conexionBD.cerrarConexionBD();
				return true;
			} else {
				conexionBD.cerrarConexionBD();
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}

	public boolean agregarUsuario(long numeroCedula, String nombreCompleto, String correoElectronico) {
		PreparedStatement ps;
		String sql = "INSERT INTO usuarios VALUES(?,?,?)";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setLong(1, numeroCedula);
			ps.setString(2, nombreCompleto);
			ps.setString(3, correoElectronico);
			int result = ps.executeUpdate();
			if (result > 0) {
				conexionBD.cerrarConexionBD();
				return true;
			} else {
				conexionBD.cerrarConexionBD();
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

	public Usuario buscarUsuario(long numeroCedula) {
		PreparedStatement ps;
		ResultSet rs;
		String sql ="SELECT usuarios.*, cuenta.cue_nombre_usuario, cuenta.cue_contrasenia FROM bd_tienda_generica.usuarios join cuenta on usuarios.usu_numero_cedula=cuenta.usu_numero_cedula where usuarios.usu_numero_cedula= ?";
		//String sql = "SELECT * FROM usuarios WHERE usu_numero_cedula = ?";
		Usuario userEncontrado = null;
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setLong(1, numeroCedula);
			rs = ps.executeQuery();
			if (rs.next()) {
				long numCedula = Long.parseLong(rs.getString(1));
				String nombreCompleto = rs.getString(2);
				String correoElectronico = rs.getString(3);
				String usu =rs.getString(4);
				String contrasenia =rs.getString(5);
				userEncontrado = new Usuario();
				userEncontrado.setNumeroCedula(numeroCedula);
				userEncontrado.setNombreCompleto(nombreCompleto);
				userEncontrado.setCorreoPersonal(correoElectronico);
				userEncontrado.setUsuario(usu);
				userEncontrado.setContrasenia(contrasenia);
			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			userEncontrado = null;
		}

		return userEncontrado;
	}

	public boolean modificarUsuario(long numeroCedula, String nombreCompleto, String correoElectronico) {

		PreparedStatement ps;
		String sql = "UPDATE usuarios SET usu_nombre_completo= ?, usu_correo_electronico= ? WHERE usu_numero_cedula = "
				+ numeroCedula;
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(1, nombreCompleto);
			ps.setString(2, correoElectronico);
			int result = ps.executeUpdate();
			if (result > 0) {
				conexionBD.cerrarConexionBD();
				return true;
			} else {
				conexionBD.cerrarConexionBD();
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	public boolean eliminarUsuario(long numeroCedula) {
		PreparedStatement ps;
		String sql = "DELETE FROM usuarios WHERE usu_numero_cedula = ?";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setLong(1, numeroCedula);
			int result = ps.executeUpdate();
			if (result > 0) {
				conexionBD.cerrarConexionBD();
				return true;
			} else {
				conexionBD.cerrarConexionBD();
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public String mostrarDirectorioUsuarios() {
		ArrayList<Usuario> lstUsuarios = new ArrayList<Usuario>();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM bd_usuariostienda";
		String listado = "";

		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String nombres = rs.getString(1);
				String apellidos = rs.getString(2);

				// lstUsuarios.add(user);
			}
			for (Usuario usuario : lstUsuarios) {
				listado = listado.concat(usuario.toString() + "\n\n");
			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			return "";
		}
		return listado;
	}

}
