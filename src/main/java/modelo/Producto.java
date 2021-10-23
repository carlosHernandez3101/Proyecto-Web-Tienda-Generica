package modelo;

public class Producto {
	private int Codigo;
	private String Nombre_producto;
	private int NIT_proveedor;
	private double Precio_compra;
	private double Iva_compra;
	private double Precio_venta;

	public Producto(int codigo, String nombre_producto, int nIT_proveedor, double precio_compra, double iva_compra,
			double precio_venta) {
		super();
		Codigo = codigo;
		Nombre_producto = nombre_producto;
		NIT_proveedor = nIT_proveedor;
		Precio_compra = precio_compra;
		Iva_compra = iva_compra;
		Precio_venta = precio_venta;
	}

	public Producto (int codigo) {
		Codigo = codigo;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getNIT_proveedor() {
		return NIT_proveedor;
	}

	public void setNIT_proveedor(int nIT_proveedor) {
		NIT_proveedor = nIT_proveedor;
	}

	public String getNombre_producto() {
		return Nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		Nombre_producto = nombre_producto;
	}

	public double getPrecio_compra() {
		return Precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		Precio_compra = precio_compra;
	}

	public double getIva_compra() {
		return Iva_compra;
	}

	public void setIva_compra(double iva_compra) {
		Iva_compra = iva_compra;
	}

	public double getPrecio_venta() {
		return Precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		Precio_venta = precio_venta;
	}
}
