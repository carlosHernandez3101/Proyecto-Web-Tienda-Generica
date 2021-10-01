package modelo;

public class Cliente {
	
	private long numeroCedula;
	private String nombreCompleto;
	private String direccion;
	private long telefono;
	private String correoElectronico;
	
	public Cliente() {
		this.numeroCedula = 0;
		this.nombreCompleto = "";
		this.direccion = "";
		this.telefono = 0;
		this.correoElectronico = "";
	}

	public Cliente(long numeroCedula, String nombreCompleto, String direccion, long telefono,
			String correoElectronico) {
		this.numeroCedula = numeroCedula;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
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

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Cliente [numeroCedula=" + numeroCedula + ", nombreCompleto=" + nombreCompleto + ", direccion="
				+ direccion + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + "]";
	}	
}
