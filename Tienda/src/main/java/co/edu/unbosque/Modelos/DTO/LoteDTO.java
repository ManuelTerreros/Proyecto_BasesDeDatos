package co.edu.unbosque.Modelos.DTO;

public class LoteDTO {
	private int id_Lote, id_Producto, id_Proveedor, id_Sucursal;
	
	public LoteDTO() {
		// TODO Auto-generated constructor stub
	}

	public LoteDTO(int id_Lote, int id_Producto, int id_Proveedor, int id_Sucursal) {
		super();
		this.id_Lote = id_Lote;
		this.id_Producto = id_Producto;
		this.id_Proveedor = id_Proveedor;
		this.id_Sucursal = id_Sucursal;
	}

	public int getId_Lote() {
		return id_Lote;
	}

	public void setId_Lote(int id_Lote) {
		this.id_Lote = id_Lote;
	}

	public int getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}

	public int getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(int id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public int getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}
	
	

}
