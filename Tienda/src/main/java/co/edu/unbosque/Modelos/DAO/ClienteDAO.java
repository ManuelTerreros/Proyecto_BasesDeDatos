package co.edu.unbosque.Modelos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import co.edu.unbosque.Modelos.DTO.ClienteDTO;

@Repository
public class ClienteDAO implements ICrud<ClienteDTO> {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public int guardarCliente(ClienteDTO clienteDTO) {
		String sql = "INSERT INTO Homecenter.cliente(id_Cliente, tipo_Doc,primer_Nom,primer_Apellido,fecha_Registro,telefono,ciudad,direccion,id_Afiliado)"
				+ " VALUES(?,?,?,?,?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, clienteDTO.getId_Cliente());
                ps.setString(2, clienteDTO.getTipo_Doc());
                ps.setString(3, clienteDTO.getPrimer_Nom());
                ps.setString(4, clienteDTO.getPrimer_Apellido());
                ps.setString(5, clienteDTO.getFecha_Registro());
                ps.setString(6, clienteDTO.getTelefono());
                ps.setString(7, clienteDTO.getCiudad());
                ps.setString(8, clienteDTO.getDireccion());
                ps.setLong(9, clienteDTO.getId_Afiliado());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
		
	@Override
	public int borrar(long idclientes) {
		String sql = "DELETE FROM Homecenter.cliente WHERE id_Cliente = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, idclientes);
            return ps.execute() ? 1 : 0;
        });
	}

	@Override
	public int actualizar(ClienteDTO clienteDTO) {
		String sql = "UPDATE Homecenter.cliente SET tipo_Doc = ?, primer_Nom = ?, primer_Apellido = ?, telefono = ?, ciudad = ?, direccion = ?, id_Afiliado = ?, fecha_Registro = fecha_Registro WHERE id_Cliente = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, clienteDTO.getTipo_Doc());
            preparedStatement.setString(2, clienteDTO.getPrimer_Nom());
            preparedStatement.setString(3, clienteDTO.getPrimer_Apellido());
            preparedStatement.setString(4, clienteDTO.getTelefono());
            preparedStatement.setString(5, clienteDTO.getCiudad());
            preparedStatement.setString(6, clienteDTO.getDireccion());
            preparedStatement.setLong(7, clienteDTO.getId_Afiliado());
            preparedStatement.setLong(8, clienteDTO.getId_Cliente());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}
	
	@Override
	public ClienteDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.cliente WHERE id_Cliente = ?";
		ClienteDTO clientedto = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(ClienteDTO.class));
		return clientedto;
	}

	@Override
	public List<ClienteDTO> listar() {
		String sql = "SELECT * FROM HomeCenter.cliente";
		List<ClienteDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(ClienteDTO.class));
		for(int i=0; i<lista.size();i++) {
			LocalDateTime localDateTime = LocalDateTime.parse(lista.get(i).getFecha_Registro(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		    String fechaFormateada = localDateTime.format(DateTimeFormatter.ofPattern("dd/M/yyyy"));
		    lista.get(i).setFecha_Registro(fechaFormateada);
			}
		return lista;
	}

	@Override
	public int guardar(ClienteDTO clienteDTO) {
		String sql = "INSERT INTO Homecenter.cliente(id_Cliente, tipo_Doc,primer_Nom,primer_Apellido,fecha_Registro,telefono,ciudad,direccion,id_Afiliado)"
				+ " VALUES(?,?,?,?,?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, clienteDTO.getId_Cliente());
                ps.setString(2, clienteDTO.getTipo_Doc());
                ps.setString(3, clienteDTO.getPrimer_Nom());
                ps.setString(4, clienteDTO.getPrimer_Apellido());
                ps.setString(5, clienteDTO.getFecha_Registro());
                ps.setString(6, clienteDTO.getTelefono());
                ps.setString(7, clienteDTO.getCiudad());
                ps.setString(8, clienteDTO.getDireccion());
                ps.setLong(9, clienteDTO.getId_Afiliado());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
}
