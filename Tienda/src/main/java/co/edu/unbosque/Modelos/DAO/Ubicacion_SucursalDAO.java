package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.Ubicacion_SucursalDTO;

@Repository
public class Ubicacion_SucursalDAO implements ICrud<Ubicacion_SucursalDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate1;

	 @Override
	    public List<Ubicacion_SucursalDTO> listar() {
	        String sql = "SELECT * FROM Homecenter.sucursales";
	        List<Ubicacion_SucursalDTO> lista = jdbcTemplate1.query(sql, BeanPropertyRowMapper.newInstance(Ubicacion_SucursalDTO.class));
	        return lista;
	    }

	    @Override
	    public int guardar(Ubicacion_SucursalDTO ubicacion_SucursalDTO) {
	        String sql = "INSERT INTO Homecenter.sucursales(id_Sucursal, num_Empleados, ciudad, direccion, id_Pais)"
	                + " VALUES(?,?,?,?,?)";

	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, ubicacion_SucursalDTO.getId_Sucursal());
	            preparedStatement.setLong(2, ubicacion_SucursalDTO.getNum_Empleados());
	            preparedStatement.setString(3, ubicacion_SucursalDTO.getCiudad());
	            preparedStatement.setString(4, ubicacion_SucursalDTO.getDireccion());
	            preparedStatement.setString(5, ubicacion_SucursalDTO.getId_Pais());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	    @Override
	    public int actualizar(Ubicacion_SucursalDTO ubicacion_SucursalDTO) {
	        String sql = "UPDATE Homecenter.sucursales SET num_Empleados = ?, ciudad = ?, direccion = ?, id_Pais = ? WHERE id_Sucursal = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, ubicacion_SucursalDTO.getNum_Empleados());
	            preparedStatement.setString(2, ubicacion_SucursalDTO.getCiudad());
	            preparedStatement.setString(3, ubicacion_SucursalDTO.getDireccion());
	            preparedStatement.setString(4, ubicacion_SucursalDTO.getId_Pais());
	            preparedStatement.setLong(5, ubicacion_SucursalDTO.getId_Sucursal());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	    @Override
	    public int borrar(long idSucursal) {
	        String sql = "DELETE FROM Homecenter.sucursales WHERE id_Sucursal = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idSucursal);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	    @Override
	    public Ubicacion_SucursalDTO buscarId(long idSucursal) {
	        String sql = "SELECT * FROM Homecenter.sucursales WHERE id_Sucursal = ?";
	        Ubicacion_SucursalDTO ubicacion_SucursalDTO = jdbcTemplate1.queryForObject(sql, new Object[]{idSucursal},
	                BeanPropertyRowMapper.newInstance(Ubicacion_SucursalDTO.class));
	        return ubicacion_SucursalDTO;
	    }

	}

