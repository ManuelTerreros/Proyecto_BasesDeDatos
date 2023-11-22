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

import co.edu.unbosque.Modelos.DTO.Detalle_CompraDTO;

@Repository
public class Detalle_CompraDAO {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<Detalle_CompraDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.detalle_compra";
		List<Detalle_CompraDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Detalle_CompraDTO.class));
		return lista;
	}

	public int guardar(Detalle_CompraDTO detalleCompraDTO) {
		String sql = "INSERT INTO Homecenter.detalle_compra(id_Compra,id_lote)"
				+ " VALUES(?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, detalleCompraDTO.getId_Compra());
                ps.setLong(2, detalleCompraDTO.getId_lote());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(String id_Compra) {
		String sql = "DELETE FROM Homecenter.detalle_compra WHERE id_Compra = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, id_Compra);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(Detalle_CompraDTO detalleCompraDTO) {
		String sql = "UPDATE Homecenter.detalle_compra SET id_lote = ? WHERE id_Compra = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setLong(1, detalleCompraDTO.getId_lote());
            preparedStatement.setString(2, detalleCompraDTO.getId_Compra());
            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public Detalle_CompraDTO buscarId(String id) {
		String sql = "SELECT * FROM Homecenter.detalle_compra WHERE id_Compra = ?";
		Detalle_CompraDTO detalleCompraDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Detalle_CompraDTO.class));
		return detalleCompraDTO;
	}
}
