package modelo;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import controlador.ConexionBD;

public class DetalleVentaDAO {
	
	private ConexionBD cnn;
	
	public DetalleVentaDAO(ConexionBD conexion) {
		this.cnn = conexion;
	}
	
	public boolean registrarDetalleVenta(DetalleVenta dv) {
		PreparedStatement ps;
		String sql = "INSERT INTO detalle_ventas(cantidad_productos, prod_codigo_producto,venta_codigo, valor_total, valor_venta, valor_iva) VALUES(?,?,?,?,?,?)";
		try {
			cnn.establecerConexionBD();
			ps=cnn.getCnn().prepareStatement(sql);
		    ps.setInt(1, dv.getCantidad_producto());
		    ps.setInt(2, dv.getCodigo_producto());
		    ps.setInt(3, dv.getCodigo_venta());
		    ps.setDouble(4, dv.getValor_venta());
		    ps.setDouble(5, dv.getValor_IVA());
		    ps.setDouble(6, dv.getValor_total());
		    int result = ps.executeUpdate();
		    
		    if(result > 0) {
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

}
