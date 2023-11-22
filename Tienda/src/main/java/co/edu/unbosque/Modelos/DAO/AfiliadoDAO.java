package co.edu.unbosque.Modelos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import co.edu.unbosque.Modelos.DTO.AfiliadoDTO;



public class AfiliadoDAO{

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<AfiliadoDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.afiliado";
		List<AfiliadoDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(AfiliadoDTO.class));
		return lista;
	}

	public int guardar(AfiliadoDTO afiliadoDTO) {
		String sql = "INSERT INTO Homecenter.afiliado(id_Afiliado,descrip_Afiliacion,puntos,id_Descuentos_Afiliado)"
				+ " VALUES(?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, afiliadoDTO.getId_afiliado());
                ps.setString(2, afiliadoDTO.getDescrip_Afiliacion());
                ps.setLong(3, afiliadoDTO.getPuntos());
                ps.setLong(4, afiliadoDTO.getId_Descuentos_Afiliado());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(long id_Afiliado) {
		String sql = "DELETE FROM Homecenter.afiliado WHERE id_Afiliado = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, id_Afiliado);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(AfiliadoDTO afiliadoDTO) {
		String sql = "UPDATE Homecenter.afiliado SET descrip_Afiliacion = ?, puntos = ?, id_Descuentos_Afiliado = ? WHERE id_Afiliado = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, afiliadoDTO.getDescrip_Afiliacion());
            preparedStatement.setLong(2, afiliadoDTO.getPuntos());
            preparedStatement.setLong(3, afiliadoDTO.getId_Descuentos_Afiliado());
            preparedStatement.setLong(4, afiliadoDTO.getId_afiliado());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public AfiliadoDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.afiliado WHERE id_Afiliado = ?";
		AfiliadoDTO afiliadodto = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(AfiliadoDTO.class));
		return afiliadodto;
	}
}
