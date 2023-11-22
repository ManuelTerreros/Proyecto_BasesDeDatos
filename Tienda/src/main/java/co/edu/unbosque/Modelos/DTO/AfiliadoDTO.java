package co.edu.unbosque.Modelos.DTO;

public class AfiliadoDTO {
	
	private long id_afiliado;
	private String descrip_Afiliacion;
	private long puntos;
	private long id_Descuentos_Afiliado;
	
	public AfiliadoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AfiliadoDTO(long id_afiliado, String descrip_Afiliacion, long puntos, long id_Descuentos_Afiliado) {
		super();
		this.id_afiliado = id_afiliado;
		this.descrip_Afiliacion = descrip_Afiliacion;
		this.puntos = puntos;
		this.id_Descuentos_Afiliado = id_Descuentos_Afiliado;
	}

	public long getId_afiliado() {
		return id_afiliado;
	}

	public void setId_afiliado(long id_afiliado) {
		this.id_afiliado = id_afiliado;
	}

	public String getDescrip_Afiliacion() {
		return descrip_Afiliacion;
	}

	public void setDescrip_Afiliacion(String descrip_Afiliacion) {
		this.descrip_Afiliacion = descrip_Afiliacion;
	}

	public long getPuntos() {
		return puntos;
	}

	public void setPuntos(long puntos) {
		this.puntos = puntos;
	}

	public long getId_Descuentos_Afiliado() {
		return id_Descuentos_Afiliado;
	}

	public void setId_Descuentos_Afiliado(long id_Descuentos_Afiliado) {
		this.id_Descuentos_Afiliado = id_Descuentos_Afiliado;
	}

	
}
