package co.edu.unbosque.Modelos.DTO;

public class Categoria_ProveedorDTO {
	private String id_Categoria_Proveedor;
	private String descripcion_Categ;
	public Categoria_ProveedorDTO() {
		// TODO Auto-generated constructor stub
	}
	public Categoria_ProveedorDTO(String id_Categoria_Proveedor, String descripcion_Categ) {
		super();
		this.id_Categoria_Proveedor = id_Categoria_Proveedor;
		this.descripcion_Categ = descripcion_Categ;
	}
	public String getId_Categoria_Proveedor() {
		return id_Categoria_Proveedor;
	}
	public void setId_Categoria_Proveedor(String id_Categoria_Proveedor) {
		this.id_Categoria_Proveedor = id_Categoria_Proveedor;
	}
	public String getDescripcion_Categ() {
		return descripcion_Categ;
	}
	public void setDescripcion_Categ(String descripcion_Categ) {
		this.descripcion_Categ = descripcion_Categ;
	}
	
	
	
}
	
	
	
	