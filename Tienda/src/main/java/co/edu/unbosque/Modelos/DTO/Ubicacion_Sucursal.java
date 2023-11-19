package co.edu.unbosque.Modelos.DTO;

public class Ubicacion_Sucursal {
	private int id_ubicacion;
	private String ciudad;
	private int id_pais;
	private String direccion;
	
	public Ubicacion_Sucursal() {
		// TODO Auto-generated constructor stub
	}

	public Ubicacion_Sucursal(int id_ubicacion, String ciudad, int id_pais, String direccion) {
		super();
		this.id_ubicacion = id_ubicacion;
		this.ciudad = ciudad;
		this.id_pais = id_pais;
		this.direccion = direccion;
	}

	public int getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(int id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
