
package co.edu.unbosque.Modelos.DTO;

public class Descuentos_afiliadosDTO {
	
	private long id_Descuentos_Afiliado;
	private String descrip_Descuento;
	private String condiciones_Descuento;
	
	public Descuentos_afiliadosDTO() {
		// TODO Auto-generated constructor stub
	}

	public Descuentos_afiliadosDTO(long id_Descuentos_Afiliado, String descrip_Descuento, String condiciones_Descuento) {
		super();
		this.id_Descuentos_Afiliado = id_Descuentos_Afiliado;
		this.descrip_Descuento = descrip_Descuento;
		this.condiciones_Descuento = condiciones_Descuento;
	}

	public long getId_Descuentos_Afiliado() {
		return id_Descuentos_Afiliado;
	}

	public void setId_Descuentos_Afiliado(long id_Descuentos_Afiliado) {
		this.id_Descuentos_Afiliado = id_Descuentos_Afiliado;
	}

	public void setId_Descuentos_Afiliado(int id_Descuentos_Afiliado) {
		this.id_Descuentos_Afiliado = id_Descuentos_Afiliado;
	}

	public String getDescrip_Descuento() {
		return descrip_Descuento;
	}

	public void setDescrip_Descuento(String descrip_Descuento) {
		this.descrip_Descuento = descrip_Descuento;
	}

	public String getCondiciones_Descuento() {
		return condiciones_Descuento;
	}

	public void setCondiciones_Descuento(String condiciones_Descuento) {
		this.condiciones_Descuento = condiciones_Descuento;
	}
	
	

}
