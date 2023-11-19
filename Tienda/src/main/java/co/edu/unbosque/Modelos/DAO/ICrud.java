package co.edu.unbosque.Modelos.DAO;

import java.util.List;
import co.edu.unbosque.Modelos.DTO.ClienteDTO;
/**
 * Esta interfaz lo que hará es que cada DAO va a implementar y permitirá realizar el CRUD en la BD.
 * @author Manue
 *
 */
public interface ICrud {
	
	public List<ClienteDTO> Listar();
	public int guardar(ClienteDTO clienteDTO);
	public ClienteDTO buscarId(int idcliente);
	public int actualizar(ClienteDTO clienteDTO);
	public int borrar (int idcliente);

}
