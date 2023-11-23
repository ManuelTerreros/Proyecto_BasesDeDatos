package co.edu.unbosque.Modelos.DTO;

public class Venta_ProductoDTO {
	
	private long id_Venta;
	private long id_Producto;
	private long cantidad;
	private long precio_Total;
	
	public Venta_ProductoDTO() {
	
	}

	public Venta_ProductoDTO(long id_Venta, long id_Producto, long cantidad, long precio_Total) {
		super();
		this.id_Venta = id_Venta;
		this.id_Producto = id_Producto;
		this.cantidad = cantidad;
		this.precio_Total = precio_Total;
	}

	public long getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(long id_Venta) {
		this.id_Venta = id_Venta;
	}

	public long getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(long id_Producto) {
		this.id_Producto = id_Producto;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecio_Total() {
		return precio_Total;
	}

	public void setPrecio_Total(long precio_Total) {
		this.precio_Total = precio_Total;
	}
	
	
	
}
