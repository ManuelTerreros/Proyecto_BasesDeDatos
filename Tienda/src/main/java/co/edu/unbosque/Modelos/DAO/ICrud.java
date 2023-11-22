package co.edu.unbosque.Modelos.DAO;

import java.util.List;
import co.edu.unbosque.Modelos.DTO.AfiliadoDTO;

public interface ICrud<clase> {

	public List<clase> listar();
	public int guardar(clase dto);
	public int actualizar(clase dto);
    public int borrar(long id);
    public clase buscarId(long id);
	
}
