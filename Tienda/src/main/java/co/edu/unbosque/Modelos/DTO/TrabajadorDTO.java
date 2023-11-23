package co.edu.unbosque.Modelos.DTO;

public class TrabajadorDTO {
	
	private Long id_Empleado;
	private String tipo_Doc;
	private String primer_Nom;
	private String primer_Apellido;
	private String fecha_Contratacion;
	private Long id_Depto;
	private String id_Cargo;
	private String id_Sucursal;
	
	public TrabajadorDTO() {
		// TODO Auto-generated constructor stub
	}

	public TrabajadorDTO(Long id_Empleado, String tipo_Doc, String primer_Nom, String primer_Apellido,
			String fecha_Contratacion, Long id_Depto, String id_Cargo, String id_Sucursal) {
		super();
		this.id_Empleado = id_Empleado;
		this.tipo_Doc = tipo_Doc;
		this.primer_Nom = primer_Nom;
		this.primer_Apellido = primer_Apellido;
		this.fecha_Contratacion = fecha_Contratacion;
		this.id_Depto = id_Depto;
		this.id_Cargo = id_Cargo;
		this.id_Sucursal = id_Sucursal;
	}

	public Long getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(Long id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public String getTipo_Doc() {
		return tipo_Doc;
	}

	public void setTipo_Doc(String tipo_Doc) {
		this.tipo_Doc = tipo_Doc;
	}

	public String getPrimer_Nom() {
		return primer_Nom;
	}

	public void setPrimer_Nom(String primer_Nom) {
		this.primer_Nom = primer_Nom;
	}

	public String getPrimer_Apellido() {
		return primer_Apellido;
	}

	public void setPrimer_Apellido(String primer_Apellido) {
		this.primer_Apellido = primer_Apellido;
	}

	public String getFecha_Contratacion() {
		return fecha_Contratacion;
	}

	public void setFecha_Contratacion(String fecha_Contratacion) {
		this.fecha_Contratacion = fecha_Contratacion;
	}

	public Long getId_Depto() {
		return id_Depto;
	}

	public void setId_Depto(Long id_Depto) {
		this.id_Depto = id_Depto;
	}

	public String getId_Cargo() {
		return id_Cargo;
	}

	public void setId_Cargo(String id_Cargo) {
		this.id_Cargo = id_Cargo;
	}

	public String getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(String id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	

		
}
