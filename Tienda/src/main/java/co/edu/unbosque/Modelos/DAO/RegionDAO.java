package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.RegionDTO;

@Repository
public class RegionDAO implements ICrud1<RegionDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	 @Override
	    public List<RegionDTO> listar() {
	        String sql = "SELECT * FROM Homecenter.Region";
	        List<RegionDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(RegionDTO.class));
	        return lista;
	    }

	 @Override
	    public int guardar(RegionDTO regionDTO) {
	        String sql = "INSERT INTO Homecenter.Region(id_Region, nom_Region)"
	                + " VALUES(?,?)";

	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, regionDTO.getId_Region());
	            preparedStatement.setString(2, regionDTO.getNom_Region());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	 @Override
	    public int actualizar(RegionDTO regionDTO) {
	        String sql = "UPDATE Homecenter.Region SET nom_Region = ? WHERE id_Region = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, regionDTO.getNom_Region());
	            preparedStatement.setString(2, regionDTO.getId_Region());
	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public int borrar(String idRegion) {
	        String sql = "DELETE FROM Homecenter.Region WHERE id_Region = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setString(1, idRegion);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public RegionDTO buscarId(String idRegion) {
	        String sql = "SELECT * FROM Homecenter.Region WHERE id_Region = ?";
	        RegionDTO regionDTO = jdbcTemplate.queryForObject(sql, new Object[]{idRegion},
	                BeanPropertyRowMapper.newInstance(RegionDTO.class));
	        return regionDTO;
	    }

	}



