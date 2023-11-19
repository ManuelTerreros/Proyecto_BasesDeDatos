package co.edu.unbosque.Modelos.DTO;

public class AfiliadoDTO {
	
	private int id_afiliado;
	private String descrip_afiliado;
	private int puntos;
	private int id_descuento_afiliado;
	
	public AfiliadoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AfiliadoDTO(int id_afiliado, String descrip_afiliado, int puntos, int id_descuento_afiliado) {
		super();
		this.id_afiliado = id_afiliado;
		this.descrip_afiliado = descrip_afiliado;
		this.puntos = puntos;
		this.id_descuento_afiliado = id_descuento_afiliado;
	}

	public int getId_afiliado() {
		return id_afiliado;
	}
	public void setId_afiliado(int id_afiliado) {
		this.id_afiliado = id_afiliado;
	}
	public String getDescrip_afiliado() {
		return descrip_afiliado;
	}
	public void setDescrip_afiliado(String descrip_afiliado) {
		this.descrip_afiliado = descrip_afiliado;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getId_descuento_afiliado() {
		return id_descuento_afiliado;
	}
	public void setId_descuento_afiliado(int id_descuento_afiliado) {
		this.id_descuento_afiliado = id_descuento_afiliado;
	}
	
	

}
