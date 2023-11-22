package co.edu.unbosque.Modelos.DTO;

public class InventarioDTO {
	
	private String id_Inventario;
	private long id_Producto;
	private long costo_Producto;
	private long cantidad_Inventario;
	private long costo_Toltal_Inv;
	
	public InventarioDTO() {
		// TODO Auto-generated constructor stub
	}

	public InventarioDTO(String id_Inventario, long id_Producto, long costo_Producto, long cantidad_Inventario,
			long costo_Toltal_Inv) {
		super();
		this.id_Inventario = id_Inventario;
		this.id_Producto = id_Producto;
		this.costo_Producto = costo_Producto;
		this.cantidad_Inventario = cantidad_Inventario;
		this.costo_Toltal_Inv = costo_Toltal_Inv;
	}

	public String getId_Inventario() {
		return id_Inventario;
	}

	public void setId_Inventario(String id_Inventario) {
		this.id_Inventario = id_Inventario;
	}

	public long getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(long id_Producto) {
		this.id_Producto = id_Producto;
	}

	public long getCosto_Producto() {
		return costo_Producto;
	}

	public void setCosto_Producto(long costo_Producto) {
		this.costo_Producto = costo_Producto;
	}

	public long getCantidad_Inventario() {
		return cantidad_Inventario;
	}

	public void setCantidad_Inventario(long cantidad_Inventario) {
		this.cantidad_Inventario = cantidad_Inventario;
	}

	public long getCosto_Toltal_Inv() {
		return costo_Toltal_Inv;
	}

	public void setCosto_Toltal_Inv(long costo_Toltal_Inv) {
		this.costo_Toltal_Inv = costo_Toltal_Inv;
	}

}
