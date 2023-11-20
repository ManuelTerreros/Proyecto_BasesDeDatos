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
	public int guardarCliente(ClienteDTO clienteDTO);
	
	public ClienteDTO buscarId(int idcliente);
	public int actualizar(ClienteDTO clienteDTO);
	public int borrar (long id);
	public String buscarId(long id);
	public String buscarId(String id);

}
