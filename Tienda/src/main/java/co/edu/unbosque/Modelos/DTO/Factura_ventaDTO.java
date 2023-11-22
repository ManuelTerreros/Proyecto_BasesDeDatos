package co.edu.unbosque.Modelos.DTO;

public class Factura_ventaDTO {
	
	private long id_Factura_Venta;
	private long id_Venta;
	private long id_Trabajador;
	private long id_Cliente;
	private String id_Envio;
	private String  id_Forma_Pago;
	private long id_Promocion_Afi;
	
	public Factura_ventaDTO() {
		// TODO Auto-generated constructor stub
	}

	public Factura_ventaDTO(long id_Factura_Venta, long id_Venta, long id_Trabajador, long id_Cliente, String id_Envio,
			String id_Forma_Pago, long id_Promocion_Afi) {
		super();
		this.id_Factura_Venta = id_Factura_Venta;
		this.id_Venta = id_Venta;
		this.id_Trabajador = id_Trabajador;
		this.id_Cliente = id_Cliente;
		this.id_Envio = id_Envio;
		this.id_Forma_Pago = id_Forma_Pago;
		this.id_Promocion_Afi = id_Promocion_Afi;
	}

	public long getId_Factura_Venta() {
		return id_Factura_Venta;
	}

	public void setId_Factura_Venta(long id_Factura_Venta) {
		this.id_Factura_Venta = id_Factura_Venta;
	}

	public long getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(long id_Venta) {
		this.id_Venta = id_Venta;
	}

	public long getId_Trabajador() {
		return id_Trabajador;
	}

	public void setId_Trabajador(long id_Trabajador) {
		this.id_Trabajador = id_Trabajador;
	}

	public long getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(long id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getId_Envio() {
		return id_Envio;
	}

	public void setId_Envio(String id_Envio) {
		this.id_Envio = id_Envio;
	}

	public String getId_Forma_Pago() {
		return id_Forma_Pago;
	}

	public void setId_Forma_Pago(String id_Forma_Pago) {
		this.id_Forma_Pago = id_Forma_Pago;
	}

	public long getId_Promocion_Afi() {
		return id_Promocion_Afi;
	}

	public void setId_Promocion_Afi(long id_Promocion_Afi) {
		this.id_Promocion_Afi = id_Promocion_Afi;
	}

	
}
