package co.edu.unbosque.Modelos.DTO;

public class Categoria_ProveedorDTO {
	private long id_categoria_Proveedor;
	private String descrip_categoria;
	public Categoria_ProveedorDTO() {
		// TODO Auto-generated constructor stub
	}
	public Categoria_ProveedorDTO(long id_categoria_Proveedor, String descrip_categoria) {
		super();
		this.id_categoria_Proveedor = id_categoria_Proveedor;
		this.descrip_categoria = descrip_categoria;
	}
	public long getId_categoria_Proveedor() {
		return id_categoria_Proveedor;
	}
	public void setId_categoria_Proveedor(long id_categoria_Proveedor) {
		this.id_categoria_Proveedor = id_categoria_Proveedor;
	}
	public String getDescrip_categoria() {
		return descrip_categoria;
	}
	public void setDescrip_categoria(String descrip_categoria) {
		this.descrip_categoria = descrip_categoria;
	}
	
}
	
	
	
	