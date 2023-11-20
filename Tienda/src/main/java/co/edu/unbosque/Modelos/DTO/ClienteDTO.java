package co.edu.unbosque.Modelos.DTO;

public class ClienteDTO {

	private int idclientes;
	private String tipodoc;
	private String nombres;
	private String apellidos;
	private String fecharegistro;
	private String telefono;
	private String ciudad;
	private String direccion;
	private int idafiliado;
	
	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO(int idclientes, String tipodoc, String nombres, String apellidos, String fecharegistro,
			String telefono, String ciudad, String direccion, int idafiliado) {
		super();
		this.idclientes = idclientes;
		this.tipodoc = tipodoc;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecharegistro = fecharegistro;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.idafiliado = idafiliado;
	}

	public int getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
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

	public String getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
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

	public int getIdafiliado() {
		return idafiliado;
	}

	public void setIdafiliado(int idafiliado) {
		this.idafiliado = idafiliado;
	}
	
	
}
