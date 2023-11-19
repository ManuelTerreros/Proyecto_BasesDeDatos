package co.edu.unbosque.Modelos.DTO;

public class DepartamentoDTO {
	
	private int id_Departamento;
	private String nombre_Depto;
	private int telefono;
	private int id_gerente;
	
	public DepartamentoDTO() {
		// TODO Auto-generated constructor stub
	}

	public DepartamentoDTO(int id_Departamento, String nombre_Depto, int telefono, int id_gerente) {
		super();
		this.id_Departamento = id_Departamento;
		this.nombre_Depto = nombre_Depto;
		this.telefono = telefono;
		this.id_gerente = id_gerente;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}

	public String getNombre_Depto() {
		return nombre_Depto;
	}

	public void setNombre_Depto(String nombre_Depto) {
		this.nombre_Depto = nombre_Depto;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(int id_gerente) {
		this.id_gerente = id_gerente;
	}
	
	

}
