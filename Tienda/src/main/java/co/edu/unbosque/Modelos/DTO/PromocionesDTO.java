package co.edu.unbosque.Modelos.DTO;

public class PromocionesDTO {

	private long id_Promocion;
	private String descriP_Prom;
	private String fecha_Inicial;
	private String fecha_Final;
	private String condiciones_Promocion; 
	
	public PromocionesDTO() {
		// TODO Auto-generated constructor stub
	}

	public PromocionesDTO(long id_Promocion, String descriP_Prom, String fecha_Inicial, String fecha_Final,
			String condiciones_Promocion) {
		super();
		this.id_Promocion = id_Promocion;
		this.descriP_Prom = descriP_Prom;
		this.fecha_Inicial = fecha_Inicial;
		this.fecha_Final = fecha_Final;
		this.condiciones_Promocion = condiciones_Promocion;
	}

	public long getId_Promocion() {
		return id_Promocion;
	}

	public void setId_Promocion(long id_Promocion) {
		this.id_Promocion = id_Promocion;
	}

	public String getDescriP_Prom() {
		return descriP_Prom;
	}

	public void setDescriP_Prom(String descriP_Prom) {
		this.descriP_Prom = descriP_Prom;
	}

	public String getFecha_Inicial() {
		return fecha_Inicial;
	}

	public void setFecha_Inicial(String fecha_Inicial) {
		this.fecha_Inicial = fecha_Inicial;
	}

	public String getFecha_Final() {
		return fecha_Final;
	}

	public void setFecha_Final(String fecha_Final) {
		this.fecha_Final = fecha_Final;
	}

	public String getCondiciones_Promocion() {
		return condiciones_Promocion;
	}

	public void setCondiciones_Promocion(String condiciones_Promocion) {
		this.condiciones_Promocion = condiciones_Promocion;
	}

	
}
