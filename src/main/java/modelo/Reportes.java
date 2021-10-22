package modelo;

public class Reportes {
	private long cedula_cliente;
	private String Nombre_cliente;
	private double ventas;

	public Reportes(long cedula_cliente, String nombre_cliente, double ventas) {
		super();
		this.cedula_cliente = cedula_cliente;
		Nombre_cliente = nombre_cliente;
		this.ventas = ventas;
	}

	public long getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getNombre_cliente() {
		return Nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		Nombre_cliente = nombre_cliente;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

}
