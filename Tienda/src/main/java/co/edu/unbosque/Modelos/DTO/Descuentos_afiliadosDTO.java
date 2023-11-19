package co.edu.unbosque.Modelos.DTO;

public class Descuentos_afiliadosDTO {
	
	private int id_descuentos_afiliados;
	private String descrip_descuento;
	private String condiciones_descuento;
	
	public Descuentos_afiliadosDTO(int id_descuentos_afiliados, String descrip_descuento, String condiciones_descuento) {
		super();
		this.id_descuentos_afiliados = id_descuentos_afiliados;
		this.descrip_descuento = descrip_descuento;
		this.condiciones_descuento = condiciones_descuento;
	}

	public int getId_descuentos_afiliados() {
		return id_descuentos_afiliados;
	}

	public void setId_descuentos_afiliados(int id_descuentos_afiliados) {
		this.id_descuentos_afiliados = id_descuentos_afiliados;
	}

	public String getDescrip_descuento() {
		return descrip_descuento;
	}

	public void setDescrip_descuento(String descrip_descuento) {
		this.descrip_descuento = descrip_descuento;
	}

	public String getCondiciones_descuento() {
		return condiciones_descuento;
	}

	public void setCondiciones_descuento(String condiciones_descuento) {
		this.condiciones_descuento = condiciones_descuento;
	}

}
