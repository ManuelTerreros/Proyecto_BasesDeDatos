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

import co.edu.unbosque.Modelos.DTO.Categoria_ProdDTO;



@Repository
public class Categoria_ProdDAO {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<Categoria_ProdDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.categoria_prod";
		List<Categoria_ProdDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Categoria_ProdDTO.class));
		return lista;
	}

	public int guardar(Categoria_ProdDTO categoriaProductoDTO) {
		String sql = "INSERT INTO Homecenter.categoria_prod(id_Categoria,descrip_Categ)"
				+ " VALUES(?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, categoriaProductoDTO.getId_Categoria());
                ps.setString(2, categoriaProductoDTO.getDescrip_Categ());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(String id_Categoria) {
		String sql = "DELETE FROM Homecenter.categoria_prod WHERE id_Categoria = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, id_Categoria);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(Categoria_ProdDTO categoriaProductoDTO) {
		String sql = "UPDATE Homecenter.categoria_prod SET descrip_Categ = ? WHERE id_Categoria = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, categoriaProductoDTO.getDescrip_Categ());
            preparedStatement.setString(2, categoriaProductoDTO.getId_Categoria());
            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public Categoria_ProdDTO buscarId(String id_Categoria) {
		String sql = "SELECT * FROM Homecenter.categoria_prod WHERE id_Categoria = ?";
		Categoria_ProdDTO categoriaProductoDTO = jdbctemple1.queryForObject(sql, new Object[] {id_Categoria},
				BeanPropertyRowMapper.newInstance(Categoria_ProdDTO.class));
		return categoriaProductoDTO;
	}
}
