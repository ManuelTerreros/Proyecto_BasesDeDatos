package co.edu.unbosque.Modelos.DTO;

public class RegionDTO {
	private String nom_region;
	private int id_Region;
	
	public RegionDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegionDTO(String nom_region, int id_Region) {
		super();
		this.nom_region = nom_region;
		this.id_Region = id_Region;
	}

	public String getNom_region() {
		return nom_region;
	}

	public void setNom_region(String nom_region) {
		this.nom_region = nom_region;
	}

	public int getId_Region() {
		return id_Region;
	}

	public void setId_Region(int id_Region) {
		this.id_Region = id_Region;
	}
	
	

}
