package modelo;


/**
 * 
 */
import controlador.ConexionBD;
import java.util.ArrayList;


/**
 * @author MIPC
 *
 */
public class UsuarioDTO {
	
	private UsuarioDAO usuarioDao;
	private ConexionBD conexion;
	
	public UsuarioDTO() {
		this.conexion = new ConexionBD();
		this.usuarioDao = new UsuarioDAO(conexion);
	}

	public UsuarioDAO getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}	
	
	public ConexionBD getConexion() {
		return conexion;
	}
	
	public void setConexion(ConexionBD conexion) {
		this.conexion = conexion;
	}

}
