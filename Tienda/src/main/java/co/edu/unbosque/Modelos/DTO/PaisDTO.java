package co.edu.unbosque.Modelos.DTO;

public class PaisDTO {
	private long id_Pais;
	private String nom_Pais;
	private long id_Region;
	
	
	public PaisDTO() {
		// TODO Auto-generated constructor stub
	}


	public PaisDTO(long id_Pais, String nom_Pais, long id_Region) {
		super();
		this.id_Pais = id_Pais;
		this.nom_Pais = nom_Pais;
		this.id_Region = id_Region;
	}


	public long getId_Pais() {
		return id_Pais;
	}


	public void setId_Pais(long id_Pais) {
		this.id_Pais = id_Pais;
	}


	public String getNom_Pais() {
		return nom_Pais;
	}


	public void setNom_Pais(String nom_Pais) {
		this.nom_Pais = nom_Pais;
	}


	public long getId_Region() {
		return id_Region;
	}


	public void setId_Region(long id_Region) {
		this.id_Region = id_Region;
	}
	
}