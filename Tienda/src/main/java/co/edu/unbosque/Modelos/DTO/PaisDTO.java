package co.edu.unbosque.Modelos.DTO;

public class PaisDTO {
	private String id_Pais;
	private String nom_Pais;
	private String id_Region;
	
	public PaisDTO() {
		// TODO Auto-generated constructor stub
	}

	public PaisDTO(String id_Pais, String nom_Pais, String id_Region) {
		super();
		this.id_Pais = id_Pais;
		this.nom_Pais = nom_Pais;
		this.id_Region = id_Region;
	}

	public String getId_Pais() {
		return id_Pais;
	}
	public void setId_Pais(String id_Pais) {
		this.id_Pais = id_Pais;
	}
	public String getNom_Pais() {
		return nom_Pais;
	}
	public void setNom_Pais(String nom_Pais) {
		this.nom_Pais = nom_Pais;
	}

	public String getId_Region() {
		return id_Region;
	}

	public void setId_Region(String id_Region) {
		this.id_Region = id_Region;
	}
}