package co.edu.unbosque.Modelos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
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

	public int guardarCliente(ClienteDTO clienteDTO) {
		String sql = "INSERT INTO Homecenter.cliente(idclientes,tipodoc,nombres,apellidos,fecharegistro,telefono,ciudad,direccion,idafiliado)"
				+ " VALUES(?,?,?,?,?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, clienteDTO.getIdclientes());
                ps.setString(2, clienteDTO.getTipodoc());
                ps.setString(3, clienteDTO.getNombres());
                ps.setString(4, clienteDTO.getApellidos());
                ps.setString(5, clienteDTO.getFecharegistro());
                ps.setString(6, clienteDTO.getTelefono());
                ps.setString(7, clienteDTO.getCiudad());
                ps.setString(8, clienteDTO.getDireccion());
                ps.setLong(9, clienteDTO.getIdafiliado());
                
                System.out.println(clienteDTO.getNombres());
                return ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	
	@Override
	public ClienteDTO buscarId(int idcliente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int borrar(long idclientes) {
		String sql = "DELETE FROM Homecenter.cliente WHERE idclientes = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, idclientes);
            return ps.execute() ? 1 : 0;
        });
	}

	@Override
	public String buscarId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int actualizar(ClienteDTO clienteDTO) {
		String sql = "UPDATE Homecenter.cliente SET tipodoc = ?, nombres = ?, apellidos = ?, fecharegistro = ?, telefono = ?, ciudad = ?, direccion = ?, idafiliado = ? WHERE idclientes = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, clienteDTO.getTipodoc());
            preparedStatement.setString(2, clienteDTO.getNombres());
            preparedStatement.setString(3, clienteDTO.getApellidos());
            preparedStatement.setString(4, clienteDTO.getFecharegistro());
            preparedStatement.setString(5, clienteDTO.getTelefono());
            preparedStatement.setString(6, clienteDTO.getCiudad());
            preparedStatement.setString(7, clienteDTO.getDireccion());
            preparedStatement.setLong(8, clienteDTO.getIdafiliado());
            preparedStatement.setLong(9, clienteDTO.getIdclientes());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}
	
	@Override
	public ClienteDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.cliente WHERE idclientes = ?";
		ClienteDTO clientedto = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(ClienteDTO.class));
		return clientedto;
	}
}
