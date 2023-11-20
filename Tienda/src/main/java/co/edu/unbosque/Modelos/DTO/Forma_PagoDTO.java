package co.edu.unbosque.Modelos.DTO;

public class Forma_PagoDTO {
	private String id_pago;
	private String descrip_forma;
	public Forma_PagoDTO() {

	}
	
	public Forma_PagoDTO(String id_pago, String descrip_forma) {
		super();
		this.id_pago = id_pago;
		this.descrip_forma = descrip_forma;
	}
	
	

	public String getId_pago() {
		return id_pago;
	}

	public void setId_pago(String id_pago) {
		this.id_pago = id_pago;
	}

	public String getDescrip_forma() {
		return descrip_forma;
	}
	public void setDescrip_forma(String descrip_forma) {
		this.descrip_forma = descrip_forma;
	}
	
}
