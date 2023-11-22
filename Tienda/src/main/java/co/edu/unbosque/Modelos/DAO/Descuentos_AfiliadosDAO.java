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

import co.edu.unbosque.Modelos.DTO.Descuentos_afiliadosDTO;


@Repository
public class Descuentos_AfiliadosDAO {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<Descuentos_afiliadosDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.descuento_afiliado";
		List<Descuentos_afiliadosDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Descuentos_afiliadosDTO.class));
		return lista;
	}

	public int guardar(Descuentos_afiliadosDTO descuentoAfiliadoDTO) {
		String sql = "INSERT INTO Homecenter.descuento_afiliado(id_Descuentos_Afiliado,descrip_Descuento,condiciones_Descuento)"
				+ " VALUES(?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, descuentoAfiliadoDTO.getId_Descuentos_Afiliado());
                ps.setString(2, descuentoAfiliadoDTO.getDescrip_Descuento());
                ps.setString(3, descuentoAfiliadoDTO.getCondiciones_Descuento());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(long id_Descuentos_Afiliado) {
		String sql = "DELETE FROM Homecenter.descuento_afiliado WHERE id_Descuentos_Afiliado = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, id_Descuentos_Afiliado);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(Descuentos_afiliadosDTO descuentoAfiliadoDTO) {
		String sql = "UPDATE Homecenter.descuento_afiliado SET descrip_Descuento = ?, condiciones_Descuento = ? WHERE id_Descuentos_Afiliado = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, descuentoAfiliadoDTO.getDescrip_Descuento());
            preparedStatement.setString(2, descuentoAfiliadoDTO.getCondiciones_Descuento());
            preparedStatement.setLong(3, descuentoAfiliadoDTO.getId_Descuentos_Afiliado());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public Descuentos_afiliadosDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.descuento_afiliado WHERE id_Descuentos_Afiliado = ?";
		Descuentos_afiliadosDTO descuentoAfiliadoDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Descuentos_afiliadosDTO.class));
		return descuentoAfiliadoDTO;
	}
}
