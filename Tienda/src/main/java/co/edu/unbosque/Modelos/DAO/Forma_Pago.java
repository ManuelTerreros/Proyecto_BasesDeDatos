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

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.Forma_PagoDTO;

@Repository
public class Forma_Pago implements ICrud1<Forma_PagoDTO>{


	@Autowired
	private JdbcTemplate jdbctemple1;
	
	@Override
	public List<Forma_PagoDTO>listar() {
		String sql = "SELECT * FROM HomeCenter.forma_pago";
		List<Forma_PagoDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Forma_PagoDTO.class));
		return lista;
	}

	@Override
	public int guardar(Forma_PagoDTO formaPagoDTO) {
		String sql = "INSERT INTO Homecenter.forma_pago(id_pago,descrip_Pago)"
				+ " VALUES(?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, formaPagoDTO.getId_pago());
                ps.setString(2, formaPagoDTO.getDescrip_Pago());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	
	@Override
	public int borrar(String id_pago) {
		String sql = "DELETE FROM Homecenter.forma_pago WHERE id_pago = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, id_pago);
            return ps.execute() ? 1 : 0;
        });
	}


	@Override
	public int actualizar(Forma_PagoDTO formaPagoDTO) {
		String sql = "UPDATE Homecenter.forma_pago SET descrip_Pago = ? WHERE id_pago = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, formaPagoDTO.getDescrip_Pago());
            preparedStatement.setString(2, formaPagoDTO.getId_pago());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}
	
	@Override
	public Forma_PagoDTO buscarId(String id) {
		String sql = "SELECT * FROM Homecenter.forma_pago WHERE id_pago = ?";
		Forma_PagoDTO formaPagoDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Forma_PagoDTO.class));
		return formaPagoDTO;
	}
}
