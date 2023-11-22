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


@Repository
public class Categoria_ProveedorDao {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<Categoria_ProveedorDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.categoria_proveedor";
		List<Categoria_ProveedorDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Categoria_ProveedorDTO.class));
		return lista;
	}

	public int guardar(Categoria_ProveedorDTO categoriaProveedorDTO) {
		String sql = "INSERT INTO Homecenter.categoria_proveedor(id_Categoria_Proveedor,descripcion_Categ)"
				+ " VALUES(?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, categoriaProveedorDTO.getId_Categoria_Proveedor());
                ps.setString(2, categoriaProveedorDTO.getDescripcion_Categ());
    
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(String id_Categoria_Proveedor) {
		String sql = "DELETE FROM Homecenter.categoria_proveedor WHERE id_Categoria_Proveedor = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, id_Categoria_Proveedor);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(Categoria_ProveedorDTO categoriaProveedorDTO) {
		String sql = "UPDATE Homecenter.categoria_proveedor SET descripcion_Categ = ? WHERE id_Categoria_Proveedor = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, categoriaProveedorDTO.getDescripcion_Categ());
            preparedStatement.setString(2, categoriaProveedorDTO.getId_Categoria_Proveedor());
            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public Categoria_ProveedorDTO buscarId(String id) {
		String sql = "SELECT * FROM Homecenter.categoria_proveedor WHERE id_Categoria_Proveedor = ?";
		Categoria_ProveedorDTO categoriaProveedorDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Categoria_ProveedorDTO.class));
		return categoriaProveedorDTO;
	}
}
