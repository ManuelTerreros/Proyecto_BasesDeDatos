package co.edu.unbosque.Modelos.DAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import co.edu.unbosque.Modelos.DTO.ClienteDTO;

@Repository
public class ClienteDAO implements ICrud {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	@Override
	public List<ClienteDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.cliente";
		List<ClienteDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(ClienteDTO.class));
		return lista;
	}

	
	// preguntar a Ricardoel update no se uede usar
	public int guardarCliente(ClienteDTO clienteDTO) {
		String sql = "INSERT INTO Homecenter.cliente(idclientes,tipodoc,nombres,apellidos,fecharegistro,telefono,ciudad,direccion,idafiliado) VALUES(?,?,?,?,?,?,?,?,?)";
		return jdbctemple1.update(
				sql, 
				clienteDTO.getIdclientes(), 
				clienteDTO.getTipodoc(),
				clienteDTO.getNombres(),
				clienteDTO.getApellidos(),
				clienteDTO.getFecharegistro(),
				clienteDTO.getTelefono(),
				clienteDTO.getCiudad(), 
				clienteDTO.getDireccion(),
				clienteDTO.getIdafiliado()
				);
	}
	

	@Override
	public ClienteDTO buscarId(int idcliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int actualizar(ClienteDTO clienteDTO) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public int borrar(long id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String buscarId(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String buscarId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
