package co.edu.unbosque.Modelos.DTO;

public class Categoria_ProdDTO {
	private long id_categoria;
	private String descrip_categ;
	public Categoria_ProdDTO() {
		// TODO Auto-generated constructor stub
	}
	public Categoria_ProdDTO(long id_categoria, String descrip_categ) {
		super();
		this.id_categoria = id_categoria;
		this.descrip_categ = descrip_categ;
	}
	public long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getDescrip_categ() {
		return descrip_categ;
	}
	public void setDescrip_categ(String descrip_categ) {
		this.descrip_categ = descrip_categ;
	}
	
}