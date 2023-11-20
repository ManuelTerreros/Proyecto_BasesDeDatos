package co.edu.unbosque.Modelos.DTO;

public class Venta_ProductoDTO {
	
	private String id_venta;
	private int id_Producto;
	private int cantidad;
	private int precio_Total;
	
	public Venta_ProductoDTO() {
	
	}
	
	
	
	public Venta_ProductoDTO(String id_venta, int id_Producto, int cantidad, int precio_Total) {
		super();
		this.id_venta = id_venta;
		this.id_Producto = id_Producto;
		this.cantidad = cantidad;
		this.precio_Total = precio_Total;
	}

	

	public String getId_venta() {
		return id_venta;
	}



	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
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
