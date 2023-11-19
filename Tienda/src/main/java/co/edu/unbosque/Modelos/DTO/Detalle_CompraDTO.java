package co.edu.unbosque.Modelos.DTO;

public class Detalle_CompraDTO {
	private int id_Compra;
	private int id_Lote;
	public Detalle_CompraDTO() {
		// TODO Auto-generated constructor stub
	}
	public Detalle_CompraDTO(int id_Compra, int id_Lote) {
		super();
		this.id_Compra = id_Compra;
		this.id_Lote = id_Lote;
	}
	public int getId_Compra() {
		return id_Compra;
	}
	public void setId_Compra(int id_Compra) {
		this.id_Compra = id_Compra;
	}
	public int getId_Lote() {
		return id_Lote;
	}
	public void setId_Lote(int id_Lote) {
		this.id_Lote = id_Lote;
	}
	
}
