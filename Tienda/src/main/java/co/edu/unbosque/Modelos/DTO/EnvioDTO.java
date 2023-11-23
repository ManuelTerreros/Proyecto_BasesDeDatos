package co.edu.unbosque.Modelos.DTO;

import java.sql.Date;

public class EnvioDTO {
	private String id_Envio;
	private String fecha_despacho;
	private String fecha_entrega;
	private String direccion_Entrega;
	private long id_Sucursal;
	private long id_Empleado;
	private String id_Vehiculo;
	
	
	public EnvioDTO() {
		// TODO Auto-generated constructor stub
	}


	public EnvioDTO(String id_Envio, String fecha_despacho, String fecha_entrega,
			String direccion_Entrega, long id_Sucursal, long id_Empleado, String id_Vehiculo) {
		super();
		this.id_Envio = id_Envio;
		this.fecha_despacho = fecha_despacho;
		this.fecha_entrega = fecha_entrega;
		this.direccion_Entrega = direccion_Entrega;
		this.id_Sucursal = id_Sucursal;
		this.id_Empleado = id_Empleado;
		this.id_Vehiculo = id_Vehiculo;
	}


	public String getId_Envio() {
		return id_Envio;
	}


	public void setId_Envio(String id_Envio) {
		this.id_Envio = id_Envio;
	}
	public String getFecha_despacho() {
		return fecha_despacho;
	}


	public void setFecha_despacho(String fecha_despacho) {
		this.fecha_despacho = fecha_despacho;
	}


	public String getFecha_entrega() {
		return fecha_entrega;
	}


	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}


	public String getDireccion_Entrega() {
		return direccion_Entrega;
	}


	public void setDireccion_Entrega(String direccion_Entrega) {
		this.direccion_Entrega = direccion_Entrega;
	}


	public long getId_Sucursal() {
		return id_Sucursal;
	}


	public void setId_Sucursal(long id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}


	public long getId_Empleado() {
		return id_Empleado;
	}


	public void setId_Empleado(long id_Empleado) {
		this.id_Empleado = id_Empleado;
	}


	public String getId_Vehiculo() {
		return id_Vehiculo;
	}


	public void setId_Vehiculo(String id_Vehiculo) {
		this.id_Vehiculo = id_Vehiculo;
	}


	
}