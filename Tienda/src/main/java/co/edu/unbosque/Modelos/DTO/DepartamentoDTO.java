package co.edu.unbosque.Modelos.DTO;

public class DepartamentoDTO {
	
	private long id_Depto;
	private String nombre_Depto;
	private long telefono;
	
	public DepartamentoDTO() {
		// TODO Auto-generated constructor stub
	}

	public DepartamentoDTO(long id_Depto, String nombre_Depto, long telefono) {
		super();
		this.id_Depto = id_Depto;
		this.nombre_Depto = nombre_Depto;
		this.telefono = telefono;
	}

	public long getId_Depto() {
		return id_Depto;
	}

	public void setId_Depto(long id_Depto) {
		this.id_Depto = id_Depto;
	}

	public String getNombre_Depto() {
		return nombre_Depto;
	}

	public void setNombre_Depto(String nombre_Depto) {
		this.nombre_Depto = nombre_Depto;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	

}
