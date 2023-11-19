package co.edu.unbosque.Modelos.DTO;

public class Venta_ProductoDTO {
	
	private int venta;
	private int id_Producto;
	private int cantidad;
	private int precio_Total;
	
	public Venta_ProductoDTO() {
	
	}

	public Venta_ProductoDTO(int venta, int id_Producto, int cantidad, int precio_Total) {
		super();
		this.venta = venta;
		this.id_Producto = id_Producto;
		this.cantidad = cantidad;
		this.precio_Total = precio_Total;
	}

	public int getVenta() {
		return venta;
	}

	public void setVenta(int venta) {
		this.venta = venta;
	}

	public int getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio_Total() {
		return precio_Total;
	}

	public void setPrecio_Total(int precio_Total) {
		this.precio_Total = precio_Total;
	}

}
