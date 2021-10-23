package modelo;

import java.sql.*;

import javax.swing.JOptionPane;

import controlador.ConexionBD;

public class VentaDAO {

	private ConexionBD cnn;

	public VentaDAO(ConexionBD conexion) {
		this.cnn = conexion;
	}

	public boolean agregarVenta(Venta venta) {
		PreparedStatement ps;
		ResultSet rs;
		int resultado = 0;
		String sql = "INSERT INTO ventas(cli_numero_cedula, usu_numero_cedula, venta_iva, venta_total, venta_valor) VALUES(?,?,?,?,?)";
		try {
			cnn.establecerConexionBD();
			ps = cnn.getCnn().prepareStatement(sql);
			ps.setInt(1, venta.getCedula_cliente());
			ps.setInt(2, venta.getCedula_usuario());
			ps.setDouble(3, venta.getIva_venta());
			ps.setDouble(4, venta.getValor_venta());
			ps.setDouble(5, venta.getTotal_venta());
			int result = ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (result > 0) {
				cnn.cerrarConexionBD();
				return true;
			} else {
				cnn.cerrarConexionBD();
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}
	
	public Venta consultarVenta() {
		
		
		return null;
	}

}
