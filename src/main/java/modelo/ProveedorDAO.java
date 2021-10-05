package modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.ConexionBD;

public class ProveedorDAO {
	private ConexionBD conexionBD;

	public ProveedorDAO(ConexionBD conexionBD) {
		this.conexionBD = conexionBD;
	}

	public boolean agregarProveedor(Proveedor proveedor) {
		PreparedStatement ps;
		String sql = "INSERT INTO proveedores VALUES(?,?,?,?,?)";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(1, proveedor.getNIT());
			ps.setString(2, proveedor.getNombreProveedor());
			ps.setString(3, proveedor.getDireccion());
			ps.setString(4, proveedor.getTelefono());
			ps.setString(5, proveedor.getCiudad());
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

	public Proveedor buscarProveedor(Proveedor prov) {
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM proveedores WHERE prov_nit = ?";
		Proveedor proveedorEncontrado = null;
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(1, prov.getNIT());
			rs = ps.executeQuery();
			if (rs.next()) {
				String NIT = rs.getString(1);
				String NombreProveedor = rs.getString(2);
				String Direccion = rs.getString(3);
				String Telefono = rs.getString(4);
				String Ciudad = rs.getString(5);
				proveedorEncontrado = new Proveedor(NIT, NombreProveedor, Direccion, Telefono, Ciudad);
			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			proveedorEncontrado = null;
		}

		return proveedorEncontrado;
	}

	public boolean modificarProveedor(Proveedor prov) {
		PreparedStatement ps;
		String sql = "UPDATE proveedores SET prov_nombre = ? , prov_direccion = ?, prov_telefono = ?, prov_ciudad = ? WHERE prov_nit = ?";
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			ps.setString(5, prov.getNIT());
			ps.setString(1, prov.getNombreProveedor());
			ps.setString(2, prov.getDireccion());
			ps.setString(3, prov.getTelefono());
			ps.setString(4, prov.getCiudad());
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

	public boolean eliminarProveedor(Proveedor prov) {
		PreparedStatement ps;
		String sql = "DELETE FROM proveedores WHERE prov_nit = " + prov.getNIT();
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
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

	public String mostrarDirectorioProveedores() {
		ArrayList<Proveedor> lstProveedor = new ArrayList<Proveedor>();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM proveedores";
		String listado = "";

		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Proveedor prov = new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				lstProveedor.add(prov);
			}
			for (Proveedor Proveedor : lstProveedor) {
				listado = listado.concat(Proveedor.toString() + "\n\n");
			}
			conexionBD.cerrarConexionBD();
		} catch (Exception e) {
			return "";
		}
		return listado;
	}

}
