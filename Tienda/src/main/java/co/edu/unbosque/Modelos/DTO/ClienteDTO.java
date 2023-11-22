package co.edu.unbosque.Modelos.DTO;

public class ClienteDTO {

	private long id_Cliente;
	private String tipo_Doc;
	private String primer_Nom;
	private String primer_Apellido;
	private String fecha_Registro;
	private String telefono;
	private String ciudad;
	private String direccion;
	private long id_Afiliado;
	
	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ClienteDTO(long id_Cliente, String tipo_Doc, String primer_Nom, String primer_Apellido,
			String fecha_Registro, String telefono, String ciudad, String direccion, long id_Afiliado) {
		super();
		this.id_Cliente = id_Cliente;
		this.tipo_Doc = tipo_Doc;
		this.primer_Nom = primer_Nom;
		this.primer_Apellido = primer_Apellido;
		this.fecha_Registro = fecha_Registro;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.id_Afiliado = id_Afiliado;
	}
	public long getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(long id_Cliente) {
		this.id_Cliente = id_Cliente;
	}



	public void setId_Afiliado(long id_Afiliado) {
		this.id_Afiliado = id_Afiliado;
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

	public String getFecha_Registro() {
		return fecha_Registro;
	}

	public void setFecha_Registro(String fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public long getId_Afiliado() {
		return id_Afiliado;
	}

	
	
}
