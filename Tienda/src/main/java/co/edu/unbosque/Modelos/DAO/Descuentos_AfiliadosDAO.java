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
import co.edu.unbosque.Modelos.DTO.Descuentos_afiliadosDTO;
@Repository
public class Descuentos_AfiliadosDAO implements ICrud<Descuentos_afiliadosDTO>{

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	@Override
	public List<Descuentos_afiliadosDTO> listar() {
		String sql = "SELECT * FROM HomeCenter.descuento_afiliado";
		List<Descuentos_afiliadosDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Descuentos_afiliadosDTO.class));
		return lista;
	}

	@Override
	public int guardar(Descuentos_afiliadosDTO dto) {
		String sql = "INSERT INTO HomeCenter.descuento_afiliado(id_Descuentos_Afiliado"
				+ ",descrip_Descuento,condiciones_Descuento)"
				+ " VALUES(?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, dto.getId_Descuentos_Afiliado());
                ps.setString(2, dto.getDescrip_Descuento());
                ps.setNString(3, dto.getCondiciones_Descuento());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}

	@Override
	public int actualizar(Descuentos_afiliadosDTO dto) {
		String sql = "UPDATE HomeCenter.descuento_afiliado SET descrip_Descuento = ? ,condiciones_Descuento = ? WHERE id_Descuentos_Afiliado = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, dto.getDescrip_Descuento());
            preparedStatement.setNString(2, dto.getCondiciones_Descuento());
            preparedStatement.setLong(3, dto.getId_Descuentos_Afiliado());
            
            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	@Override
	public int borrar(long id) {
	
		return 0;
	}

	@Override
	public Descuentos_afiliadosDTO buscarId(long id) {
		String sql = "SELECT * FROM HomeCenter.descuento_afiliado WHERE id_Descuentos_Afiliado = ?";
		Descuentos_afiliadosDTO descuentos_afiliadosDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Descuentos_afiliadosDTO.class));
		return descuentos_afiliadosDTO;
	}

}
