package co.edu.unbosque.Modelos.DTO;

public class Categoria_ProveedoresDTO {
	private int id_categoria;
	private String descrip_categoria;
	
	public Categoria_ProveedoresDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Categoria_ProveedoresDTO(int id_categoria, String descrip_categoria) {
		super();
		this.id_categoria = id_categoria;
		this.descrip_categoria = descrip_categoria;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getDescrip_categoria() {
		return descrip_categoria;
	}
	public void setDescrip_categoria(String descrip_categoria) {
		this.descrip_categoria = descrip_categoria;
	}

}
