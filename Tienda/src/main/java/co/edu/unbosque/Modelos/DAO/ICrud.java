package co.edu.unbosque.Modelos.DAO;

import java.util.List;
/**
 * Esta interfaz lo que hará es que cada DAO va a implementar y permitirá realizar el CRUD en la BD.
 * @author Manue
 *
 */
public interface ICrud {
	
	public abstract String agregar(Object registro);
	public abstract List<Object> listar();
	public abstract String eliminar(int id);
	public abstract String eliminarString(String id);
	public abstract String actualizar(Object registro);

}
