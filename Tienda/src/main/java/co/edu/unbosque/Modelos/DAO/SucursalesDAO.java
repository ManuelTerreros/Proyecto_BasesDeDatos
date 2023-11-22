package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.SucursalesDTO;

@Repository
public class SucursalesDAO implements ICrud<SucursalesDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate1;

	 @Override
	    public List<SucursalesDTO> listar() {
	        String sql = "SELECT * FROM Homecenter.sucursal";
	        List<SucursalesDTO> lista = jdbcTemplate1.query(sql, BeanPropertyRowMapper.newInstance(SucursalesDTO.class));
	        return lista;
	    }

	    @Override
	    public int guardar(SucursalesDTO SucursalDTO) {
	        String sql = "INSERT INTO Homecenter.sucursal(id_Sucursal, num_Empleados, ciudad, direccion, id_Pais)"
	                + " VALUES(?,?,?,?,?)";

	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, SucursalDTO.getId_Sucursal());
	            preparedStatement.setLong(2, SucursalDTO.getNum_Empleados());
	            preparedStatement.setString(3, SucursalDTO.getCiudad());
	            preparedStatement.setString(4, SucursalDTO.getDireccion());
	            preparedStatement.setString(5, SucursalDTO.getId_Pais());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	    @Override
	    public int actualizar(SucursalesDTO SucursalDTO) {
	        String sql = "UPDATE Homecenter.sucursal SET num_Empleados = ?, ciudad = ?, direccion = ?, id_Pais = ? WHERE id_Sucursal = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, SucursalDTO.getNum_Empleados());
	            preparedStatement.setString(2, SucursalDTO.getCiudad());
	            preparedStatement.setString(3, SucursalDTO.getDireccion());
	            preparedStatement.setString(4, SucursalDTO.getId_Pais());
	            preparedStatement.setLong(5, SucursalDTO.getId_Sucursal());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	    @Override
	    public int borrar(long idSucursal) {
	        String sql = "DELETE FROM Homecenter.sucursal WHERE idSucursal = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idSucursal);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	    @Override
	    public SucursalesDTO buscarId(long idSucursal) {
	        String sql = "SELECT * FROM Homecenter.Ubicacion_Sucursal WHERE idSucursal = ?";
	        SucursalesDTO SucursalDTO = jdbcTemplate1.queryForObject(sql, new Object[]{idSucursal},
	                BeanPropertyRowMapper.newInstance(SucursalesDTO.class));
	        return SucursalDTO;
	    }

	}

