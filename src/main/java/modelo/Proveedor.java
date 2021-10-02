package modelo;

public class Proveedor {

	private String NIT;
	private String nombreProveedor;
	private String direccion;
	private String telefono;
	private String ciudad;

	public Proveedor() {
	}

	public Proveedor(String NIT) {
		this.NIT = NIT;
	}

	public Proveedor(String NIT, String NombreProveedor, String Direccion, String Telefono, String Ciudad) {
		this.NIT = NIT;
		this.nombreProveedor = NombreProveedor;
		this.direccion = Direccion;
		this.telefono = Telefono;
		this.ciudad = Ciudad;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String NIT) {
		this.NIT = NIT;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String NombreProveedor) {
		this.nombreProveedor = NombreProveedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String Direccion) {
		this.direccion = Direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String Telefono) {
		this.telefono = Telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String Ciudad) {
		this.ciudad = Ciudad;
	}

	@Override
	public String toString() {
		return "NIT: " + NIT + "\n" + "Nombre del Proveedor: " + nombreProveedor + "\n" + "Dirección: " + direccion
				+ "\n" + "Teléfono " + telefono + "\n" + "Ciudad: " + ciudad;
	}

}
