package modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.ConexionBD;
import modelo.Usuario;

public class UsuarioDAO {

	private ConexionBD conexionBD;

	public UsuarioDAO(ConexionBD conexionBD) {
		this.conexionBD = conexionBD;
	}

	public Usuario existeCuentaUsuario(String username, String contrasenia) {
		PreparedStatement ps;
		ResultSet rs;
		Usuario userEncontrado = null;
		String sql = "SELECT CUE_NOMBRE_USUARIO, USU_NUMERO_CEDULA FROM cuenta where CUE_NOMBRE_USUARIO = ? and CUE_CONTRASENIA = ?";
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

	public boolean agregarUsuario() {
		PreparedStatement ps;
		String sql = "INSERT INTO estudiantes VALUES(?,?,?,?,?,?,?,?)";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			// ps.setString();

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

	public Usuario buscarUsuario(String correoInstitucional) {
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT nombres, apellidos, fecha_nacimiento, correo_institucional, correo_personal, numero_telefonico_celular, numero_telefonico_fijo, programa_academico FROM estudiantes WHERE correo_institucional = ?";
		Usuario userEncontrado = null;
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(1, correoInstitucional);
			rs = ps.executeQuery();
			if (rs.next()) {
				String nombres = rs.getString(1);

			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			userEncontrado = null;
		}

		return userEncontrado;
	}

	public boolean modificarUsuario(String correoInstitucional, String correoPersonal, long numeroTelefonicoCelular,
			long numeroTelefonicoFijo, String programaAcademico) {

		PreparedStatement ps;
		String sql = "UPDATE estudiantes SET correo_personal = ? , numero_telefonico_celular = ?, numero_telefonico_fijo = ?, programa_academico = ? WHERE correo_institucional = ?";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(5, correoInstitucional);
			ps.setString(1, correoPersonal);
			ps.setLong(2, numeroTelefonicoCelular);
			ps.setLong(3, numeroTelefonicoFijo);
			ps.setString(4, programaAcademico);
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

	public boolean eliminarUsuario(String correoInstitucional) {
		PreparedStatement ps;
		String sql = "DELETE FROM estudiantes WHERE correo_institucional = ?";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(1, correoInstitucional);
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

	public String mostrarDirectorioEstudiantes() {
		ArrayList<Usuario> lstUsuarios = new ArrayList<Usuario>();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM bd_estudiantes.estudiantes";
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
