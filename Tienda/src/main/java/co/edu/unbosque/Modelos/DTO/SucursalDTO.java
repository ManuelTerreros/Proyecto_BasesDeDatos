package co.edu.unbosque.Modelos.DTO;

public class SucursalDTO {
	private int id_sucursal;
	private int num_empleados;
	public SucursalDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SucursalDTO(int id_sucursal, int num_empleados) {
		super();
		this.id_sucursal = id_sucursal;
		this.num_empleados = num_empleados;
	}

	public int getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public int getNum_empleados() {
		return num_empleados;
	}

	public void setNum_empleados(int num_empleados) {
		this.num_empleados = num_empleados;
	}
	
	
}
