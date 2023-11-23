package co.edu.unbosque.Modelos.DTO;

public class ProductoDTO {
	
	private long id_producto;
	private String descrip_producto;
	private float iva;
	private long precio;
	private String id_categ;
	private long id_sucursal;
	private long precio_Despues_Iva;
	private long promocion_Prod;

	
	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}


	public ProductoDTO(long id_producto, String descrip_producto, float iva, long precio, String id_categ, long id_sucursal,
			long precio_Despues_Iva, long promocion_Prod) {
		super();
		this.id_producto = id_producto;
		this.descrip_producto = descrip_producto;
		this.iva = iva;
		this.precio = precio;
		this.id_categ = id_categ;
		this.id_sucursal = id_sucursal;
		this.precio_Despues_Iva = precio_Despues_Iva;
		this.promocion_Prod = promocion_Prod;
	}


	public long getId_producto() {
		return id_producto;
	}


	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}


	public String getDescrip_producto() {
		return descrip_producto;
	}


	public void setDescrip_producto(String descrip_producto) {
		this.descrip_producto = descrip_producto;
	}

	public float getIva() {
		return iva;
	}


	public void setIva(float iva) {
		this.iva = iva;
	}


	public long getPrecio() {
		return precio;
	}


	public void setPrecio(long precio) {
		this.precio = precio;
	}


	public String getId_categ() {
		return id_categ;
	}


	public void setId_categ(String id_categ) {
		this.id_categ = id_categ;
	}


	public long getId_sucursal() {
		return id_sucursal;
	}


	public void setId_sucursal(long id_sucursal) {
		this.id_sucursal = id_sucursal;
	}


	public long getPrecio_Despues_Iva() {
		return precio_Despues_Iva;
	}


	public void setPrecio_Despues_Iva(long precio_Despues_Iva) {
		this.precio_Despues_Iva = precio_Despues_Iva;
	}


	public long getPromocion_Prod() {
		return promocion_Prod;
	}


	public void setPromocion_Prod(long promocion_Prod) {
		this.promocion_Prod = promocion_Prod;
	}

}