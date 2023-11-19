package co.edu.unbosque.Modelos.DTO;

import java.sql.Date;

public class VehiculoDTO {
	private int num_Motor, num_Serie, num_Licencia  ;
	private String estado, id_Vehiculo;
	private Date fecha_Soat, fecha_Tecno;
	
	public VehiculoDTO() {
		// TODO Auto-generated constructor stub
	}

	public VehiculoDTO(int num_Motor, int num_Serie, int num_Licencia, String estado, String id_Vehiculo,
			Date fecha_Soat, Date fecha_Tecno) {
		super();
		this.num_Motor = num_Motor;
		this.num_Serie = num_Serie;
		this.num_Licencia = num_Licencia;
		this.estado = estado;
		this.id_Vehiculo = id_Vehiculo;
		this.fecha_Soat = fecha_Soat;
		this.fecha_Tecno = fecha_Tecno;
	}

	public int getNum_Motor() {
		return num_Motor;
	}

	public void setNum_Motor(int num_Motor) {
		this.num_Motor = num_Motor;
	}

	public int getNum_Serie() {
		return num_Serie;
	}

	public void setNum_Serie(int num_Serie) {
		this.num_Serie = num_Serie;
	}

	public int getNum_Licencia() {
		return num_Licencia;
	}

	public void setNum_Licencia(int num_Licencia) {
		this.num_Licencia = num_Licencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getId_Vehiculo() {
		return id_Vehiculo;
	}

	public void setId_Vehiculo(String id_Vehiculo) {
		this.id_Vehiculo = id_Vehiculo;
	}

	public Date getFecha_Soat() {
		return fecha_Soat;
	}

	public void setFecha_Soat(Date fecha_Soat) {
		this.fecha_Soat = fecha_Soat;
	}

	public Date getFecha_Tecno() {
		return fecha_Tecno;
	}

	public void setFecha_Tecno(Date fecha_Tecno) {
		this.fecha_Tecno = fecha_Tecno;
	}
	
	
}
