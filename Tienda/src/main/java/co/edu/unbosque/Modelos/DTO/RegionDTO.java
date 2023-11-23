package co.edu.unbosque.Modelos.DTO;

public class RegionDTO {
	private String id_Region;
	private String nom_Region;
	
	
	public RegionDTO() {
		// TODO Auto-generated constructor stub
	}
	public RegionDTO(String id_Region, String nom_Region) {
		super();
		this.id_Region = id_Region;
		this.nom_Region = nom_Region;
	}

	public String getId_Region() {
		return id_Region;
	}
	public void setId_Region(String id_Region) {
		this.id_Region = id_Region;
	}
	public String getNom_Region() {
		return nom_Region;
	}

	public void setNom_Region(String nom_Region) {
		this.nom_Region = nom_Region;
	}
}
