package co.edu.unbosque.Modelos.DTO;

import java.sql.Date;

public class ProveedorDTO {
	
	private long id_Proveedor;
	private String razon_Social;
	private String fecha_Contratacion;
	private String id_Categoria;
	private String ultima_Transaccion;
	
	public ProveedorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProveedorDTO(long id_Proveedor, String razon_Social, String fecha_Contratacion, String id_Categoria,
			String ultima_Transaccion) {
		super();
		this.id_Proveedor = id_Proveedor;
		this.razon_Social = razon_Social;
		this.fecha_Contratacion = fecha_Contratacion;
		this.id_Categoria = id_Categoria;
		this.ultima_Transaccion = ultima_Transaccion;
	}

	public long getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(long id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public String getRazon_Social() {
		return razon_Social;
	}

	public void setRazon_Social(String razon_Social) {
		this.razon_Social = razon_Social;
	}

	public String getFecha_Contratacion() {
		return fecha_Contratacion;
	}

	public void setFecha_Contratacion(String fecha_Contratacion) {
		this.fecha_Contratacion = fecha_Contratacion;
	}

	public String getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(String id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getUltima_Transaccion() {
		return ultima_Transaccion;
	}

	public void setUltima_Transaccion(String ultima_Transaccion) {
		this.ultima_Transaccion = ultima_Transaccion;
	}
	

}
