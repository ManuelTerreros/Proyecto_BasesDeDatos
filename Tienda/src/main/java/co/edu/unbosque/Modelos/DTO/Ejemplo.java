package co.edu.unbosque.Modelos.DTO;

public class Ejemplo {
	private String nombre, descripcion;
	private Long id;
	
	public Ejemplo() {
		// TODO Auto-generated constructor stub
	}

	public Ejemplo(String nombre, String descripcion, Long id) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}


