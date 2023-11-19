package co.edu.unbosque.Modelos.DTO;

public class Factura_ventaDTO {
	
	private int id_venta;
	private int id_trabajador;
	private int id_clinte;
	private String id_envio;
	private int id_promocion_afili;
	
	public Factura_ventaDTO(int id_venta, int id_trabajador, int id_clinte, String id_envio, int id_promocion_afili) {
		super();
		this.id_venta = id_venta;
		this.id_trabajador = id_trabajador;
		this.id_clinte = id_clinte;
		this.id_envio = id_envio;
		this.id_promocion_afili = id_promocion_afili;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public int getId_trabajador() {
		return id_trabajador;
	}
	public void setId_trabajador(int id_trabajador) {
		this.id_trabajador = id_trabajador;
	}
	public int getId_clinte() {
		return id_clinte;
	}
	public void setId_clinte(int id_clinte) {
		this.id_clinte = id_clinte;
	}
	public String getId_envio() {
		return id_envio;
	}
	public void setId_envio(String id_envio) {
		this.id_envio = id_envio;
	}
	public int getId_promocion_afili() {
		return id_promocion_afili;
	}
	public void setId_promocion_afili(int id_promocion_afili) {
		this.id_promocion_afili = id_promocion_afili;
	}
	
	

}
