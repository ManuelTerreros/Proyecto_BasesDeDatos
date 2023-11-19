package co.edu.unbosque.Modelos.DTO;

import java.sql.Date;

public class ProveedorDTO {
	private int id_Proveedor, id_Categoria;
	private String nom_Empresa, id_sucursal_prov;
	private Date fecha_Contratación, ult_Transaccion;
	
	public ProveedorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProveedorDTO(int id_Proveedor, int id_Categoria, String nom_Empresa, String id_sucursal_prov,
			Date fecha_Contratación, Date ult_Transaccion) {
		super();
		this.id_Proveedor = id_Proveedor;
		this.id_Categoria = id_Categoria;
		this.nom_Empresa = nom_Empresa;
		this.id_sucursal_prov = id_sucursal_prov;
		this.fecha_Contratación = fecha_Contratación;
		this.ult_Transaccion = ult_Transaccion;
	}

	public int getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(int id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public int getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getNom_Empresa() {
		return nom_Empresa;
	}

	public void setNom_Empresa(String nom_Empresa) {
		this.nom_Empresa = nom_Empresa;
	}

	public String getId_sucursal_prov() {
		return id_sucursal_prov;
	}

	public void setId_sucursal_prov(String id_sucursal_prov) {
		this.id_sucursal_prov = id_sucursal_prov;
	}

	public Date getFecha_Contratación() {
		return fecha_Contratación;
	}

	public void setFecha_Contratación(Date fecha_Contratación) {
		this.fecha_Contratación = fecha_Contratación;
	}

	public Date getUlt_Transaccion() {
		return ult_Transaccion;
	}

	public void setUlt_Transaccion(Date ult_Transaccion) {
		this.ult_Transaccion = ult_Transaccion;
	}
	
	
	

}
