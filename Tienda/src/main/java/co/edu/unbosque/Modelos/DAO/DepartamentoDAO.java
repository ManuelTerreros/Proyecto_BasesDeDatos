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

import co.edu.unbosque.Modelos.DTO.DepartamentoDTO;

@Repository
public class DepartamentoDAO {
	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<DepartamentoDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.departamento";
		List<DepartamentoDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(DepartamentoDTO.class));
		return lista;
	}

	public int guardar(DepartamentoDTO departamentoDTO) {
		String sql = "INSERT INTO Homecenter.departamento(id_Depto,nombre_Depto,telefono,id_Gerente)"
				+ " VALUES(?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, departamentoDTO.getId_Depto());
                ps.setString(2, departamentoDTO.getNombre_Depto());
                ps.setLong(3, departamentoDTO.getTelefono());
                ps.setLong(4, departamentoDTO.getId_Gerente());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(long id_Depto) {
		String sql = "DELETE FROM Homecenter.departamento WHERE id_Depto = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, id_Depto);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(DepartamentoDTO departamentoDTO) {
		String sql = "UPDATE Homecenter.departamento SET nombre_Depto = ?, telefono = ?, id_Gerente = ? WHERE id_Depto = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, departamentoDTO.getNombre_Depto());
            preparedStatement.setLong(2, departamentoDTO.getTelefono());
            preparedStatement.setLong(3, departamentoDTO.getId_Depto());
            preparedStatement.setLong(4, departamentoDTO.getId_Depto());
            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public DepartamentoDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.departamento WHERE id_Depto = ?";
		DepartamentoDTO departamentoDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(DepartamentoDTO.class));
		return departamentoDTO;
	}
}
