package co.edu.unbosque.Modelos.DTO;

public class Factura_CompraDTO {
	
	private long id_Compra;
	private int cantidad;
	private long precio_Lote;
	private float iva;
	private long total;
	private long id_Proveedor;
	private String fecha_Compra;
	
	public Factura_CompraDTO() {
		// TODO Auto-generated constructor stub
	}

	public Factura_CompraDTO(long id_Compra, int cantidad, long precio_Lote, float iva, long total, long id_Proveedor,
			String fecha_Compra) {
		super();
		this.id_Compra = id_Compra;
		this.cantidad = cantidad;
		this.precio_Lote = precio_Lote;
		this.iva = iva;
		this.total = total;
		this.id_Proveedor = id_Proveedor;
		this.fecha_Compra = fecha_Compra;
	}

	public long getId_Compra() {
		return id_Compra;
	}

	public void setId_Compra(long id_Compra) {
		this.id_Compra = id_Compra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecio_Lote() {
		return precio_Lote;
	}

	public void setPrecio_Lote(long precio_Lote) {
		this.precio_Lote = precio_Lote;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(long id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public String getFecha_Compra() {
		return fecha_Compra;
	}

	public void setFecha_Compra(String fecha_Compra) {
		this.fecha_Compra = fecha_Compra;
	}

}