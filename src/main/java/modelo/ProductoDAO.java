package modelo;

import java.sql.*;

import javax.swing.JOptionPane;

import controlador.ConexionBD;

public class ProductoDAO {

	private ConexionBD conexionBD;

	public ProductoDAO(ConexionBD conexionBD) {
		this.conexionBD = conexionBD;
	}

	public Producto consultarProducto(int codigo) {
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT * FROM productos WHERE prod_codigo_producto = " + codigo;
		Producto producto = null;
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement(sql);
			rs = ps.executeQuery();
			// .next me permite ver si por lo menos hay un resgistro
			if (rs.next()) {
				producto = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5),
						rs.getDouble(6));
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return producto;
	}

}
