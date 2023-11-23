package co.edu.unbosque.Modelos.DAO;

import java.util.List;

public interface ICrud2 <clase> {

	public List<clase> listar();
	public int guardar(clase dto);
	public int actualizar(clase dto);
    public int borrar(long id, long idP);
    public clase buscarId(long id, long idP);
}
