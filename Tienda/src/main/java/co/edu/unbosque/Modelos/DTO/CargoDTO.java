package co.edu.unbosque.Modelos.DTO;

public class CargoDTO {
	
	private String id_Cargo;
	private String descrip_Cargo;
	private long cant_Trabajadores;
	private long sal_Min;
	private long sal_Max;
	
	public CargoDTO() {
		// TODO Auto-generated constructor stub
	}

	public CargoDTO(String id_Cargo, String descrip_Cargo, long cant_Trabajadores, long sal_Min, long sal_Max) {
		super();
		this.id_Cargo = id_Cargo;
		this.descrip_Cargo = descrip_Cargo;
		this.cant_Trabajadores = cant_Trabajadores;
		this.sal_Min = sal_Min;
		this.sal_Max = sal_Max;
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

	public long getSal_Min() {
		return sal_Min;
	}

	public void setSal_Min(long sal_Min) {
		this.sal_Min = sal_Min;
	}

	public long getSal_Max() {
		return sal_Max;
	}

	public void setSal_Max(long sal_Max) {
		this.sal_Max = sal_Max;
	}

}
