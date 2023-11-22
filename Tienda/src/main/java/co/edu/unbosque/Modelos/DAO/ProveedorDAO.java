package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.ProveedorDTO;

@Repository
public class ProveedorDAO {
	 @Autowired
	    private JdbcTemplate jdbcTemplate1;

	    public List<ProveedorDTO> listar() {
	        String sql = "SELECT * FROM HomeCenter.proveedor";
	        List<ProveedorDTO> lista = jdbcTemplate1.query(sql, BeanPropertyRowMapper.newInstance(ProveedorDTO.class));
	        return lista;
	    }

	    public int guardarProveedor(ProveedorDTO proveedorDTO) {
	        String sql = "INSERT INTO Homecenter.proveedor(id_Proveedor, razon_Social, fecha_Contratacion, id_Categoria, ultima_Transaccion)"
	                + " VALUES(?,?,?,?,?)";

	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, proveedorDTO.getId_Proveedor());
	            preparedStatement.setString(2, proveedorDTO.getRazon_Social());
	            preparedStatement.setString(3, proveedorDTO.getFecha_Contratacion());
	            preparedStatement.setString(4, proveedorDTO.getId_Categoria());
	            preparedStatement.setString(5, proveedorDTO.getUltima_Transaccion());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	    public int actualizar(ProveedorDTO proveedorDTO) {
	        String sql = "UPDATE Homecenter.proveedor SET razon_Social = ?, fecha_Contratacion = ?, id_Categoria = ?, ultima_Transaccion = ? WHERE id_Proveedor = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, proveedorDTO.getRazon_Social());
	            preparedStatement.setString(2, proveedorDTO.getFecha_Contratacion());
	            preparedStatement.setString(3, proveedorDTO.getId_Categoria());
	            preparedStatement.setString(4, proveedorDTO.getUltima_Transaccion());
	            preparedStatement.setLong(5, proveedorDTO.getId_Proveedor());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	    public int borrar(Long idProveedor) {
	        String sql = "DELETE FROM Homecenter.proveedor WHERE id_Proveedor = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idProveedor);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	    public ProveedorDTO buscarId(Long idProveedor) {
	        String sql = "SELECT * FROM Homecenter.proveedor WHERE id_Proveedor = ?";
	        ProveedorDTO proveedorDTO = jdbcTemplate1.queryForObject(sql, new Object[] {idProveedor},
	                BeanPropertyRowMapper.newInstance(ProveedorDTO.class));
	        return proveedorDTO;
	    }

	}

