package modelo;

public class Usuario {

	private long numeroCedula;
	private String nombreCompleto;
	private String correoPersonal;
	private String usuario;
	private String contrasenia;

	public Usuario(long numeroCedula) {
		this.numeroCedula = 0;
		this.nombreCompleto = "";
		this.correoPersonal = "";
		this.usuario = "";
		this.contrasenia = "";
	}

	public Usuario() {
		this.numeroCedula = 0;
		this.nombreCompleto = "";
		this.correoPersonal = "";
		this.usuario = "";
		this.contrasenia = "";
	}

	public Usuario(long numeroCedula, String nombreCompleto, String correoPersonal, String usuario,
			String contrasenia) {
		this.numeroCedula = numeroCedula;
		this.nombreCompleto = nombreCompleto;
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

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombres) {
		this.nombreCompleto = nombres;
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

	@Override
	public String toString() {
		return "Cedula: " + numeroCedula + "\nNombre: " + nombreCompleto + "\nCorreo personal: "
				+ correoPersonal+"\nUsuario: "+usuario+"\nContraseña: "+contrasenia;
	}

