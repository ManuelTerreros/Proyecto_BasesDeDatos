package co.edu.unbosque.Modelos.DTO;

public class Detalle_CompraDTO {
	private long id_Compra;
	private long id_lote;
	public Detalle_CompraDTO() {
		// TODO Auto-generated constructor stub
	}
	public Detalle_CompraDTO(long id_Compra, long id_lote) {
		super();
		this.id_Compra = id_Compra;
		this.id_lote = id_lote;
	}
	public long getId_Compra() {
		return id_Compra;
	}
	public void setId_Compra(long id_Compra) {
		this.id_Compra = id_Compra;
	}
	public long getId_lote() {
		return id_lote;
	}
	public void setId_lote(long id_lote) {
		this.id_lote = id_lote;
	}


}
