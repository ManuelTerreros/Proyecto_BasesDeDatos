package co.edu.unbosque.Modelos.DTO;

public class LoteDTO {
	private long id_Lote, id_Producto, id_Proveedor, id_Sucursal;
	
	public LoteDTO() {
		// TODO Auto-generated constructor stub
	}

	public LoteDTO(long id_Lote, long id_Producto, long id_Proveedor, long id_Sucursal) {
		super();
		this.id_Lote = id_Lote;
		this.id_Producto = id_Producto;
		this.id_Proveedor = id_Proveedor;
		this.id_Sucursal = id_Sucursal;
	}

	public long getId_Lote() {
		return id_Lote;
	}

	public void setId_Lote(long id_Lote) {
		this.id_Lote = id_Lote;
	}

	public long getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(long id_Producto) {
		this.id_Producto = id_Producto;
	}

	public long getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(long id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public long getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(long id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}
	
	

}
