package co.edu.unbosque.Modelos.DTO;

public class InventarioDTO {
	
	private int id_Inventario;
	private int id_Producto;
	private int costo_Producto;
	private int cantidad_Inventario;
	private int costo_Toltal_Inv;
	
	public InventarioDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public InventarioDTO(int id_Inventario, int id_Producto, int costo_Producto, int cantidad_Inventario,
			int costo_Toltal_Inv) {
		super();
		this.id_Inventario = id_Inventario;
		this.id_Producto = id_Producto;
		this.costo_Producto = costo_Producto;
		this.cantidad_Inventario = cantidad_Inventario;
		this.costo_Toltal_Inv = costo_Toltal_Inv;
	}

	public int getId_Inventario() {
		return id_Inventario;
	}

	public void setId_Inventario(int id_Inventario) {
		this.id_Inventario = id_Inventario;
	}

	public int getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}

	public int getCosto_Producto() {
		return costo_Producto;
	}

	public void setCosto_Producto(int costo_Producto) {
		this.costo_Producto = costo_Producto;
	}

	public int getCantidad_Inventario() {
		return cantidad_Inventario;
	}

	public void setCantidad_Inventario(int cantidad_Inventario) {
		this.cantidad_Inventario = cantidad_Inventario;
	}

	public int getCosto_Toltal_Inv() {
		return costo_Toltal_Inv;
	}

	public void setCosto_Toltal_Inv(int costo_Toltal_Inv) {
		this.costo_Toltal_Inv = costo_Toltal_Inv;
	}

}
