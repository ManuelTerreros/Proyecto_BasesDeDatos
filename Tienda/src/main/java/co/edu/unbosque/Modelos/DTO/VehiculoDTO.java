package co.edu.unbosque.Modelos.DTO;


public class VehiculoDTO {
	private String id_Vehiculo;
	private String fecha_Soat;
	private String fecha_Tecno;
	private String estado;
	private long num_Motor;
	private long num_LicTransito;
	private long num_Serie; 
	
	public VehiculoDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public VehiculoDTO(String id_Vehiculo, String fecha_Soat, String fecha_Tecno, String estado, long num_Motor,
			long num_LicTransito, long num_Serie) {
		super();
		this.id_Vehiculo = id_Vehiculo;
		this.fecha_Soat = fecha_Soat;
		this.fecha_Tecno = fecha_Tecno;
		this.estado = estado;
		this.num_Motor = num_Motor;
		this.num_LicTransito = num_LicTransito;
		this.num_Serie = num_Serie;
	}



	public String getId_Vehiculo() {
		return id_Vehiculo;
	}



	public void setId_Vehiculo(String id_Vehiculo) {
		this.id_Vehiculo = id_Vehiculo;
	}



	public String getFecha_Soat() {
		return fecha_Soat;
	}



	public void setFecha_Soat(String fecha_Soat) {
		this.fecha_Soat = fecha_Soat;
	}



	public String getFecha_Tecno() {
		return fecha_Tecno;
	}



	public void setFecha_Tecno(String fecha_Tecno) {
		this.fecha_Tecno = fecha_Tecno;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public long getNum_Motor() {
		return num_Motor;
	}



	public void setNum_Motor(long num_Motor) {
		this.num_Motor = num_Motor;
	}



	public long getNum_LicTransito() {
		return num_LicTransito;
	}



	public void setNum_LicTransito(long num_LicTransito) {
		this.num_LicTransito = num_LicTransito;
	}



	public long getNum_Serie() {
		return num_Serie;
	}



	public void setNum_Serie(long num_Serie) {
		this.num_Serie = num_Serie;
	}
	
	

	
	
}
