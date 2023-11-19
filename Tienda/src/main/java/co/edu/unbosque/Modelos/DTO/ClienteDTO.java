package co.edu.unbosque.Modelos.DTO;

public class ClienteDTO {

	private int id_clientes;
	private String tipo_doc;
	private String nombres;
	private String apellidos;
	private String fecha_registro;
	private int telefono;
	private String ciudad;
	private String direccion;
	private int id_afiliado;
	
	public ClienteDTO(int id_clientes, String tipo_doc, String nombres, String apellidos, String fecha_registro,
			int telefono, String ciudad, String direccion, int id_afiliado) {
		super();
		this.id_clientes = id_clientes;
		this.tipo_doc = tipo_doc;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_registro = fecha_registro;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.id_afiliado = id_afiliado;
	}

	public int getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(int id_clientes) {
		this.id_clientes = id_clientes;
	}
	public String getTipo_doc() {
		return tipo_doc;
	}
	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
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
	public int getId_afiliado() {
		return id_afiliado;
	}
	public void setId_afiliado(int id_afiliado) {
		this.id_afiliado = id_afiliado;
	}
	
	
}
