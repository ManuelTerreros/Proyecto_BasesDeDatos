package co.edu.unbosque.Modelos.DTO;

public class Forma_PagoDTO {
	private String id_pago;
	private String descrip_Pago;
	public Forma_PagoDTO() {

	}
	
	public Forma_PagoDTO(String id_pago, String descrip_Pago) {
		super();
		this.id_pago = id_pago;
		this.descrip_Pago = descrip_Pago;
	}
	
	

	public String getId_pago() {
		return id_pago;
	}

	public void setId_pago(String id_pago) {
		this.id_pago = id_pago;
	}

	public String getDescrip_Pago() {
		return descrip_Pago;
	}
	public void setDescrip_Pago(String descrip_forma) {
		this.descrip_Pago = descrip_forma;
	}
	
}
