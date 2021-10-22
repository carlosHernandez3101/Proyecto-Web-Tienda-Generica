package modelo;

import java.sql.*;
import java.util.ArrayList;
import controlador.ConexionBD;

public class ReportesDAO {
	private ConexionBD conexionBD;

	public ReportesDAO(ConexionBD conexionBD) {
		this.conexionBD = conexionBD;
	}

	public ArrayList<Usuario> listarusuarios() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT usuarios.*, cuentas.cue_nombre_usuario, cuentas.cue_contrasenia FROM bd_tienda_generica.usuarios join cuentas on usuarios.usu_numero_cedula=cuentas.usu_numero_cedula";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Usuario us = new Usuario(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				lista.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public ArrayList<Cliente> listadoclientes() {
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM clientes ";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cliente cli = new Cliente(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getLong(4),
						rs.getString(5));
				lista.add(cli);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;

	}

	public ArrayList<Reportes> listadoventas() {
		ArrayList<Reportes> lista = new ArrayList<Reportes>();
		ArrayList<Cliente> clientes = listadoclientes();
		PreparedStatement ps;
		ResultSet rs;

		for (Cliente cli : clientes) {
			int totalventas = 0;
			try {
				conexionBD.establecerConexionBD();
				ps = conexionBD.getCnn().prepareStatement("SELECT total_venta FROM ventas WHERE cedula_cliente=?");
				ps.setLong(1, cli.getNumeroCedula());
				rs = ps.executeQuery();
				while (rs.next()) {

					totalventas += rs.getInt(1);

				}

				if (totalventas != 0) {
					Reportes rep = new Reportes(cli.getNumeroCedula(), cli.getNombreCompleto(), totalventas);
					lista.add(rep);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return lista;

	}

}