package co.edu.unbosque.Modelos.DTO;

public class Sucursales_proveedorDTO {
	
	private String id_SucursalP;
	private String ciudad;
	private String id_Pais;
	
	public Sucursales_proveedorDTO() {
		// TODO Auto-generated constructor stub
	}

	public Sucursales_proveedorDTO(String id_SucursalP, String ciudad, String id_Pais) {
		super();
		this.id_SucursalP = id_SucursalP;
		this.ciudad = ciudad;
		this.id_Pais = id_Pais;
	}

	public String getId_SucursalP() {
		return id_SucursalP;
	}

	public void setId_SucursalP(String id_SucursalP) {
		this.id_SucursalP = id_SucursalP;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getId_Pais() {
		return id_Pais;
	}

	public void setId_Pais(String id_Pais) {
		this.id_Pais = id_Pais;
	}
	
	

}
