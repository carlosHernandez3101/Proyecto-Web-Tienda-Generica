package modelo;

import controlador.ConexionBD;
import java.sql.*;

import javax.swing.JOptionPane;

public class CSV {

	private ConexionBD conexionBD;

	public CSV() {
		this.conexionBD = new ConexionBD();
	}
	

	public boolean cargarProducto(String URL) {
		PreparedStatement ps;
		boolean rta = false;
		try {
			conexionBD.establecerConexionBD();
			ps = conexionBD.getCnn().prepareStatement("LOAD DATA INFILE '"+URL+"' INTO TABLE productos FIELDS TERMINATED BY ',' LINES TERMINATED BY '\r\n';");
			JOptionPane.showMessageDialog(null, "en try");

			rta = ps.executeUpdate() > 0;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al registrar producto: " + e);
			// e.printStackTrace();

		}
		return rta;
	}

}
