package co.edu.unbosque.Modelos.DTO;

public class Categoria_ProdDTO {
	private String  id_Categoria;
	private String descrip_Categ;
	public Categoria_ProdDTO() {
		// TODO Auto-generated constructor stub
	}
	public Categoria_ProdDTO(String id_Categoria, String descrip_Categ) {
		super();
		this.id_Categoria = id_Categoria;
		this.descrip_Categ = descrip_Categ;
	}
	public String getId_Categoria() {
		return id_Categoria;
	}
	public void setId_Categoria(String id_Categoria) {
		this.id_Categoria = id_Categoria;
	}
	public String getDescrip_Categ() {
		return descrip_Categ;
	}
	public void setDescrip_Categ(String descrip_Categ) {
		this.descrip_Categ = descrip_Categ;
	}
	
	
}