package co.edu.unbosque.Modelos.DAO;

import java.util.List;

public interface ICrud1 <clase> {

	public List<clase> listar();
	public int guardar(clase dto);
	public int actualizar(clase dto);
    public int borrar(String id);
    public clase buscarId(String id);
}
