package co.edu.unbosque.Modelos.DTO;

public class PromocionesDTO {

	private int id_promocion;
	private String nombre_prom;
	private String descrip_prom;
	private String fecha_inicio;
	private String fecha_final;
	private String condiciones_prom; 
	
	public PromocionesDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public PromocionesDTO(int id_promocion, String nombre_prom, String descrip_prom, String fecha_inicio,
			String fecha_final, String condiciones_prom) {
		super();
		this.id_promocion = id_promocion;
		this.nombre_prom = nombre_prom;
		this.descrip_prom = descrip_prom;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
		this.condiciones_prom = condiciones_prom;
	}

	public int getId_promocion() {
		return id_promocion;
	}

	public void setId_promocion(int id_promocion) {
		this.id_promocion = id_promocion;
	}

	public String getNombre_prom() {
		return nombre_prom;
	}

	public void setNombre_prom(String nombre_prom) {
		this.nombre_prom = nombre_prom;
	}

	public String getDescrip_prom() {
		return descrip_prom;
	}

	public void setDescrip_prom(String descrip_prom) {
		this.descrip_prom = descrip_prom;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(String fecha_final) {
		this.fecha_final = fecha_final;
	}
	public String getCondiciones_prom() {
		return condiciones_prom;
	}
	public void setCondiciones_prom(String condiciones_prom) {
		this.condiciones_prom = condiciones_prom;
	}
}
