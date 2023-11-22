package co.edu.unbosque.Modelos.DTO;

public class SucursalesDTO {
	
	private long id_Sucursal;
	private long num_Empleados;
	private String ciudad;
	private String direccion;
	private String id_Pais;
	
public SucursalesDTO() {
	// TODO Auto-generated constructor stub
}



	public SucursalesDTO(long id_Sucursal, long num_Empleados, String ciudad, String direccion, String id_Pais) {
	super();
	this.id_Sucursal = id_Sucursal;
	this.num_Empleados = num_Empleados;
	this.ciudad = ciudad;
	this.direccion = direccion;
	this.id_Pais = id_Pais;
}



	public long getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(long id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public long getNum_Empleados() {
		return num_Empleados;
	}

	public void setNum_Empleados(long num_Empleados) {
		this.num_Empleados = num_Empleados;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getId_Pais() {
		return id_Pais;
	}

	public void setId_Pais(String id_Pais) {
		this.id_Pais = id_Pais;
	}

	
}
