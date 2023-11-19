package co.edu.unbosque.Modelos.DTO;

import java.sql.Date;

public class EnvioDTO {
	private int id_venta, id_Empleado, id_Sucursal ;
	private String id_Envio, dir_Entrega, id_Vehiculo;
	private Date fecha_entrega, fecha_despacho ;
	
	public EnvioDTO() {
		// TODO Auto-generated constructor stub
	}

	public EnvioDTO(int id_venta, int id_Empleado, int id_Sucursal, String id_Envio, String dir_Entrega,
			String id_Vehiculo, Date fecha_entrega, Date fecha_despacho) {
		super();
		this.id_venta = id_venta;
		this.id_Empleado = id_Empleado;
		this.id_Sucursal = id_Sucursal;
		this.id_Envio = id_Envio;
		this.dir_Entrega = dir_Entrega;
		this.id_Vehiculo = id_Vehiculo;
		this.fecha_entrega = fecha_entrega;
		this.fecha_despacho = fecha_despacho;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public int getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(int id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public int getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public String getId_Envio() {
		return id_Envio;
	}

	public void setId_Envio(String id_Envio) {
		this.id_Envio = id_Envio;
	}

	public String getDir_Entrega() {
		return dir_Entrega;
	}

	public void setDir_Entrega(String dir_Entrega) {
		this.dir_Entrega = dir_Entrega;
	}

	public String getId_Vehiculo() {
		return id_Vehiculo;
	}

	public void setId_Vehiculo(String id_Vehiculo) {
		this.id_Vehiculo = id_Vehiculo;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Date getFecha_despacho() {
		return fecha_despacho;
	}

	public void setFecha_despacho(Date fecha_despacho) {
		this.fecha_despacho = fecha_despacho;
	}
	
	
	
}
