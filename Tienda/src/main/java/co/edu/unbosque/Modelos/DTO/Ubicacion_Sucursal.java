package co.edu.unbosque.Modelos.DTO;

public class Ubicacion_Sucursal {
	
	private int id_Sucursal;
	private int num_Empleados;
	private String id_pais;
	private String Ciudad;
	private String direccion;
	
	
	public Ubicacion_Sucursal() {
		
	}


	public Ubicacion_Sucursal(int id_Sucursal, int num_Empleados, String id_pais, String ciudad, String direccion) {
		super();
		this.id_Sucursal = id_Sucursal;
		this.num_Empleados = num_Empleados;
		this.id_pais = id_pais;
		Ciudad = ciudad;
		this.direccion = direccion;
	}


	public int getId_Sucursal() {
		return id_Sucursal;
	}


	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}


	public int getNum_Empleados() {
		return num_Empleados;
	}


	public void setNum_Empleados(int num_Empleados) {
		this.num_Empleados = num_Empleados;
	}


	public String getId_pais() {
		return id_pais;
	}


	public void setId_pais(String id_pais) {
		this.id_pais = id_pais;
	}


	public String getCiudad() {
		return Ciudad;
	}


	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
}
