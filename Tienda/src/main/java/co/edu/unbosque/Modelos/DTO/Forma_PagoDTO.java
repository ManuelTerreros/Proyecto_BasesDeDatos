package co.edu.unbosque.Modelos.DTO;

public class Forma_PagoDTO {
	private int id_pago;
	private String descrip_forma;
	public Forma_PagoDTO() {

	}
	public Forma_PagoDTO(int id_pago, String descrip_forma) {
		super();
		this.id_pago = id_pago;
		this.descrip_forma = descrip_forma;
	}
	public int getId_pago() {
		return id_pago;
	}
	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}
	public String getDescrip_forma() {
		return descrip_forma;
	}
	public void setDescrip_forma(String descrip_forma) {
		this.descrip_forma = descrip_forma;
	}
	
}
