package co.edu.unbosque.Modelos.DTO;

import java.sql.Date;

public class TrabajadorDTO {
	
	private int id_Trabajador;
	private String nom_Trabajador;
	private String tipo_Doc;
	private Date fecha_Contratacion;
	private int id_Depto;
	private int id_Cargo;
	
	public TrabajadorDTO() {
		// TODO Auto-generated constructor stub
	}

	public TrabajadorDTO(int id_Trabajador, String nom_Trabajador, String tipo_Doc, Date fecha_Contratacion,
			int id_Depto, int id_Cargo) {
		super();
		this.id_Trabajador = id_Trabajador;
		this.nom_Trabajador = nom_Trabajador;
		this.tipo_Doc = tipo_Doc;
		this.fecha_Contratacion = fecha_Contratacion;
		this.id_Depto = id_Depto;
		this.id_Cargo = id_Cargo;
	}

	public int getId_Trabajador() {
		return id_Trabajador;
	}

	public void setId_Trabajador(int id_Trabajador) {
		this.id_Trabajador = id_Trabajador;
	}

	public String getNom_Trabajador() {
		return nom_Trabajador;
	}

	public void setNom_Trabajador(String nom_Trabajador) {
		this.nom_Trabajador = nom_Trabajador;
	}

	public String getTipo_Doc() {
		return tipo_Doc;
	}

	public void setTipo_Doc(String tipo_Doc) {
		this.tipo_Doc = tipo_Doc;
	}

	public Date getFecha_Contratacion() {
		return fecha_Contratacion;
	}

	public void setFecha_Contratacion(Date fecha_Contratacion) {
		this.fecha_Contratacion = fecha_Contratacion;
	}

	public int getId_Depto() {
		return id_Depto;
	}

	public void setId_Depto(int id_Depto) {
		this.id_Depto = id_Depto;
	}

	public int getId_Cargo() {
		return id_Cargo;
	}

	public void setId_Cargo(int id_Cargo) {
		this.id_Cargo = id_Cargo;
	}

}
