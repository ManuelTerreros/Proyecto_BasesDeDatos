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
	public List<ClienteDTO> Listar() {
		String sql = "select * from HomeCenter.cliente";
		List<ClienteDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(ClienteDTO.class));
		return lista;
	}

	@Override
	public int guardar(ClienteDTO clienteDTO) {
		// TODO Auto-generated method stub
		return 0;
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
	public int borrar(int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}
}
