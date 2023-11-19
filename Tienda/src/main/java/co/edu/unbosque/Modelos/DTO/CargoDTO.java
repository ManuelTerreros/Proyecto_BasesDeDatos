package co.edu.unbosque.Modelos.DTO;

public class CargoDTO {
	
	private int id_Cargo;
	private String descrip_Cargo;
	private int cant_Trabajadores;
	private int sal_Min;
	private int sal_Max;
	
	public CargoDTO() {
		// TODO Auto-generated constructor stub
	}

	public CargoDTO(int id_Cargo, String descrip_Cargo, int cant_Trabajadores, int sal_Min, int sal_Max) {
		super();
		this.id_Cargo = id_Cargo;
		this.descrip_Cargo = descrip_Cargo;
		this.cant_Trabajadores = cant_Trabajadores;
		this.sal_Min = sal_Min;
		this.sal_Max = sal_Max;
	}

	public int getId_Cargo() {
		return id_Cargo;
	}

	public void setId_Cargo(int id_Cargo) {
		this.id_Cargo = id_Cargo;
	}

	public String getDescrip_Cargo() {
		return descrip_Cargo;
	}

	public void setDescrip_Cargo(String descrip_Cargo) {
		this.descrip_Cargo = descrip_Cargo;
	}

	public int getCant_Trabajadores() {
		return cant_Trabajadores;
	}

	public void setCant_Trabajadores(int cant_Trabajadores) {
		this.cant_Trabajadores = cant_Trabajadores;
	}

	public int getSal_Min() {
		return sal_Min;
	}

	public void setSal_Min(int sal_Min) {
		this.sal_Min = sal_Min;
	}

	public int getSal_Max() {
		return sal_Max;
	}

	public void setSal_Max(int sal_Max) {
		this.sal_Max = sal_Max;
	}
	
	

}
