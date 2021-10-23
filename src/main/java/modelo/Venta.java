package modelo;

public class Venta {
	private int codigoVenta;
	private int cedula_cliente;
	private int cedula_usuario;
	private double Iva_venta;
	private double Valor_venta;
	private double Total_venta;
	
	
	public Venta(int cedula_cliente, int cedula_usuario, double iva_venta, double valor_venta,
			double total_venta) {
		this.codigoVenta = 0;
		this.cedula_cliente = cedula_cliente;
		this.cedula_usuario = cedula_usuario;
		Iva_venta = iva_venta;
		Valor_venta = valor_venta;
		Total_venta = total_venta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	
	public int getCodigoVenta() {
		return codigoVenta;
	}

	public int getCedula_cliente() {
		return cedula_cliente;
	}


	public void setCedula_cliente(int cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}


	public int getCedula_usuario() {
		return cedula_usuario;
	}


	public void setCedula_usuario(int cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}


	public double getIva_venta() {
		return Iva_venta;
	}


	public void setIva_venta(double iva_venta) {
		Iva_venta = iva_venta;
	}


	public double getValor_venta() {
		return Valor_venta;
	}


	public void setValor_venta(double valor_venta) {
		Valor_venta = valor_venta;
	}


	public double getTotal_venta() {
		return Total_venta;
	}


	public void setTotal_venta(double total_venta) {
		Total_venta = total_venta;
	}

}
