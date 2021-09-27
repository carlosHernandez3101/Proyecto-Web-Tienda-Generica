package modelo;

public class Usuario {

	private long numeroCedula;
	private String nombres;
	private String apellidos;
	private String correoPersonal;
	private String usuario;
	private String contrasenia;

	public Usuario(long numeroCedula) {
		this.numeroCedula = 0;
		this.nombres = "";
		this.apellidos = "";
		this.correoPersonal = "";
		this.usuario = "";
		this.contrasenia = "";
	}

	public Usuario() {
		this.numeroCedula = 0;
		this.nombres = "";
		this.apellidos = "";
		this.correoPersonal = "";
		this.usuario = "";
		this.contrasenia = "";
	}

	public Usuario(long numeroCedula, String nombres, String apellidos, String correoPersonal, String usuario,
			String contrasenia) {
		this.numeroCedula = numeroCedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correoPersonal = correoPersonal;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

	public long getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(long numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
