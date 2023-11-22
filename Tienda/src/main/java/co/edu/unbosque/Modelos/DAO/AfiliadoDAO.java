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
import co.edu.unbosque.Modelos.DTO.AfiliadoDTO;
import co.edu.unbosque.Modelos.DTO.ClienteDTO;

@Repository
public class AfiliadoDAO implements ICrud<AfiliadoDTO>{
	
	@Autowired
	private JdbcTemplate jdbctemple1;

	@Override
	public List<AfiliadoDTO> listar() {
		String sql = "SELECT * FROM HomeCenter.afiliado";
		List<AfiliadoDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(AfiliadoDTO.class));
		return lista;
	}

	@Override
	public int guardar(AfiliadoDTO dto) {
		String sql = "INSERT INTO Homecenter.afiliado(id_afiliado,descrip_Afiliacion,puntos,id_Descuentos_Afiliado)"
				+ " VALUES(?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, dto.getId_afiliado());
                ps.setString(2, dto.getDescrip_Afiliacion());
                ps.setLong(3, dto.getPuntos());
                ps.setLong(4, dto.getId_Descuentos_Afiliado());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}

	@Override
	public int actualizar(AfiliadoDTO dto) {
		String sql = "UPDATE Homecenter.afiliado SET descrip_Afiliacion = ?, puntos = ?,id_Descuentos_Afiliado = ? WHERE id_afiliado = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, dto.getDescrip_Afiliacion());
            preparedStatement.setLong(2, dto.getPuntos());
            preparedStatement.setLong(3, dto.getId_Descuentos_Afiliado());
            preparedStatement.setLong(4, dto.getId_afiliado());
            
            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	@Override
	public int borrar(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AfiliadoDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.afiliado WHERE id_afiliado = ?";
		AfiliadoDTO afiliadodto = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(AfiliadoDTO.class));
		return afiliadodto;
	}


}
