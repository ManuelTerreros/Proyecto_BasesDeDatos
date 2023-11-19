package co.edu.unbosque.Modelos.DTO;

public class Factura_CompraDTO {
	
	private int id_Compra;
	private int cantidad;
	private int precio_Lote;
	private int iva;
	private int total;
	private int id_Proveedor;
	
	public Factura_CompraDTO() {
		// TODO Auto-generated constructor stub
	}

	public Factura_CompraDTO(int id_Compra, int cantidad, int precio_Lote, int iva, int total, int id_Proveedor) {
		super();
		this.id_Compra = id_Compra;
		this.cantidad = cantidad;
		this.precio_Lote = precio_Lote;
		this.iva = iva;
		this.total = total;
		this.id_Proveedor = id_Proveedor;
	}

	public int getId_Compra() {
		return id_Compra;
	}

	public void setId_Compra(int id_Compra) {
		this.id_Compra = id_Compra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio_Lote() {
		return precio_Lote;
	}

	public void setPrecio_Lote(int precio_Lote) {
		this.precio_Lote = precio_Lote;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(int id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}
	
	

}
