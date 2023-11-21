package co.edu.unbosque.Modelos.DTO;

public class Factura_ventaDTO {
	
	private int id_Factura_Venta;
	private String id_Venta;
	private int id_trabajador;
	private int id_cliente;
	private String id_envio;
	private String id_Forma_Pago;
	private int id_promocion_afili;
	
	public Factura_ventaDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public Factura_ventaDTO(int id_Factura_Venta, String id_Venta, int id_trabajador, int id_cliente, String id_envio,
			String id_Forma_Pago, int id_promocion_afili) {
		super();
		this.id_Factura_Venta = id_Factura_Venta;
		this.id_Venta = id_Venta;
		this.id_trabajador = id_trabajador;
		this.id_cliente = id_cliente;
		this.id_envio = id_envio;
		this.id_Forma_Pago = id_Forma_Pago;
		this.id_promocion_afili = id_promocion_afili;
	}

	

	public int getId_Factura_Venta() {
		return id_Factura_Venta;
	}


	public void setId_Factura_Venta(int id_Factura_Venta) {
		this.id_Factura_Venta = id_Factura_Venta;
	}


	public String getId_Venta() {
		return id_Venta;
	}


	public void setId_Venta(String id_Venta) {
		this.id_Venta = id_Venta;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getId_Forma_Pago() {
		return id_Forma_Pago;
	}


	public void setId_Forma_Pago(String id_Forma_Pago) {
		this.id_Forma_Pago = id_Forma_Pago;
	}


	

	public int getId_trabajador() {
		return id_trabajador;
	}
	public void setId_trabajador(int id_trabajador) {
		this.id_trabajador = id_trabajador;
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
