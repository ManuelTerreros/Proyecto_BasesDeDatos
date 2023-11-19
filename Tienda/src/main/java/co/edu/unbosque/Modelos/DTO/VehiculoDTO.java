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
	
	
}
