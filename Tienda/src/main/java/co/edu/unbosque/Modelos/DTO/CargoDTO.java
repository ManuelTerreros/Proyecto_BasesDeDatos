package co.edu.unbosque.Modelos.DTO;

public class CargoDTO {
	
	private String id_Cargo;
	private String descrip_Cargo;
	private long cant_Trabajadores;
	
	public CargoDTO() {
		// TODO Auto-generated constructor stub
	}

	public CargoDTO(String id_Cargo, String descrip_Cargo, long cant_Trabajadores) {
		super();
		this.id_Cargo = id_Cargo;
		this.descrip_Cargo = descrip_Cargo;
		this.cant_Trabajadores = cant_Trabajadores;
	}



	public String getId_Cargo() {
		return id_Cargo;
	}

	public void setId_Cargo(String id_Cargo) {
		this.id_Cargo = id_Cargo;
	}

	public String getDescrip_Cargo() {
		return descrip_Cargo;
	}

	public void setDescrip_Cargo(String descrip_Cargo) {
		this.descrip_Cargo = descrip_Cargo;
	}

	public long getCant_Trabajadores() {
		return cant_Trabajadores;
	}

	public void setCant_Trabajadores(long cant_Trabajadores) {
		this.cant_Trabajadores = cant_Trabajadores;
	}

}
