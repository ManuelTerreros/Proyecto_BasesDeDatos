package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.InventarioDTO;

@Repository
public class InventarioDAO {
	   @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public List<InventarioDTO> listar() {
	        String sql = "SELECT * FROM HomeCenter.inventario";
	        List<InventarioDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(InventarioDTO.class));
	        return lista;
	    }

	    public int guardarInventario(InventarioDTO inventarioDTO) {
	        String sql = "INSERT INTO Homecenter.inventario(id_Inventario, id_Producto, costo_Producto, cantidad_Inventario, costo_Toltal_Inv)"
	                + " VALUES(?,?,?,?,?)";

	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, inventarioDTO.getId_Inventario());
	            preparedStatement.setLong(2, inventarioDTO.getId_Producto());
	            preparedStatement.setLong(3, inventarioDTO.getCosto_Producto());
	            preparedStatement.setLong(4, inventarioDTO.getCantidad_Inventario());
	            preparedStatement.setLong(5, inventarioDTO.getCosto_Toltal_Inv());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	    public int actualizar(InventarioDTO inventarioDTO) {
	        String sql = "UPDATE Homecenter.inventario SET id_Producto = ?, costo_Producto = ?, cantidad_Inventario = ?, costo_Toltal_Inv = ? WHERE id_Inventario = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, inventarioDTO.getId_Producto());
	            preparedStatement.setLong(2, inventarioDTO.getCosto_Producto());
	            preparedStatement.setLong(3, inventarioDTO.getCantidad_Inventario());
	            preparedStatement.setLong(4, inventarioDTO.getCosto_Toltal_Inv());
	            preparedStatement.setString(5, inventarioDTO.getId_Inventario());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	    public int borrar(String idInventario) {
	        String sql = "DELETE FROM Homecenter.inventario WHERE idInventario = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setString(1, idInventario);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	    public InventarioDTO buscarId(String idInventario) {
	        String sql = "SELECT * FROM Homecenter.inventario WHERE idInventario = ?";
	        InventarioDTO inventarioDTO = jdbcTemplate.queryForObject(sql, new Object[] {idInventario},
	                BeanPropertyRowMapper.newInstance(InventarioDTO.class));
	        return inventarioDTO;
	    }

	}

