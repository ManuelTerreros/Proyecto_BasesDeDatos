package co.edu.unbosque.Modelos.DTO;

public class ProductoDTO {
	
	private int id_producto;
	private String descrip_producto;
	private int iva;
	private int precio;
	private String id_categoria;
	private int id_sucursal;
	private int precioTotal;
	private int id_promocion;
	
	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductoDTO(int id_producto, String descrip_producto, int iva, int precio, String id_categoria, int id_sucursal,
			int precioTotal, int id_promocion) {
		super();
		this.id_producto = id_producto;
		this.descrip_producto = descrip_producto;
		this.iva = iva;
		this.precio = precio;
		this.id_categoria = id_categoria;
		this.id_sucursal = id_sucursal;
		this.precioTotal = precioTotal;
		this.id_promocion = id_promocion;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getDescrip_producto() {
		return descrip_producto;
	}

	public void setDescrip_producto(String descrip_producto) {
		this.descrip_producto = descrip_producto;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(String id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getId_promocion() {
		return id_promocion;
	}

	public void setId_promocion(int id_promocion) {
		this.id_promocion = id_promocion;
	}

}
