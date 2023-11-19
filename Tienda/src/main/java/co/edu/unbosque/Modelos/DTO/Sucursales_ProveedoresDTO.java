package co.edu.unbosque.Modelos.DTO;

// TOCA ACLARAR ESTA CLASE CON UBICACIÓN SUCURSAL
public class Sucursales_ProveedoresDTO {
	
	private int id_Sucursal;
	private int id_pais;
	private String Ciudad;
	
	public Sucursales_ProveedoresDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Sucursales_ProveedoresDTO(int id_Sucursal, int id_pais, String ciudad) {
		super();
		this.id_Sucursal = id_Sucursal;
		this.id_pais = id_pais;
		Ciudad = ciudad;
	}

	public int getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	
	
}
