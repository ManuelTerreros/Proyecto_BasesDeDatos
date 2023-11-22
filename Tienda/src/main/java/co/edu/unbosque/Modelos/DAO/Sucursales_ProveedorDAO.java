package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.Sucursales_proveedorDTO;

@Repository
public class Sucursales_ProveedorDAO implements ICrud1<Sucursales_proveedorDTO>{
	  @Autowired
	    private JdbcTemplate jdbcTemplate;

	  @Override
	    public List<Sucursales_proveedorDTO> listar() {
	        String sql = "SELECT * FROM HomeCenter.sucursales_proveedor";
	        List<Sucursales_proveedorDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sucursales_proveedorDTO.class));
	        return lista;
	    }

	    @Override
	    public int guardar(Sucursales_proveedorDTO sucursales_proveedorDTO) {
	        String sql = "INSERT INTO Homecenter.sucursales_proveedor(id_SucursalP, ciudad, id_Pais)"
	                + " VALUES(?,?,?)";

	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, sucursales_proveedorDTO.getId_SucursalP());
	            preparedStatement.setString(2, sucursales_proveedorDTO.getCiudad());
	            preparedStatement.setString(3, sucursales_proveedorDTO.getId_Pais());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	    @Override
	    public int actualizar(Sucursales_proveedorDTO sucursales_proveedorDTO) {
	        String sql = "UPDATE Homecenter.sucursales_proveedor SET ciudad = ?, id_Pais = ? WHERE id_SucursalP = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, sucursales_proveedorDTO.getCiudad());
	            preparedStatement.setString(2, sucursales_proveedorDTO.getId_Pais());
	            preparedStatement.setString(3, sucursales_proveedorDTO.getId_SucursalP());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	    @Override
	    public int borrar(String idSucursalP) {
	        String sql = "DELETE FROM Homecenter.sucursales_proveedor WHERE id_SucursalP = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setString(1, idSucursalP);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	    @Override
	    public Sucursales_proveedorDTO buscarId(String idSucursalP) {
	        String sql = "SELECT * FROM Homecenter.sucursales_proveedor WHERE id_SucursalP = ?";
	        Sucursales_proveedorDTO sucursales_proveedorDTO = jdbcTemplate.queryForObject(sql, new Object[] {idSucursalP},
	                BeanPropertyRowMapper.newInstance(Sucursales_proveedorDTO.class));
	        return sucursales_proveedorDTO;
	    }

	}

