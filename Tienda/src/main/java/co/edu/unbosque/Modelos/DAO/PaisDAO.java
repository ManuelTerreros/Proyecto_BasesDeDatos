package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.PaisDTO;

@Repository
public class PaisDAO {
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public List<PaisDTO> listar() {
	        String sql = "SELECT * FROM HomeCenter.Pais";
	        List<PaisDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(PaisDTO.class));
	        return lista;
	    }

	    public int guardarPais(PaisDTO paisDTO) {
	        String sql = "INSERT INTO Homecenter.Pais(id_Pais, nom_Pais, id_Region)"
	                + " VALUES(?,?,?)";

	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, paisDTO.getId_Pais());
	            preparedStatement.setString(2, paisDTO.getNom_Pais());
	            preparedStatement.setLong(3, paisDTO.getId_Region());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	    public int actualizarPais(PaisDTO paisDTO) {
	        String sql = "UPDATE Homecenter.Pais SET nom_Pais = ?, id_Region = ? WHERE id_Pais = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, paisDTO.getNom_Pais());
	            preparedStatement.setLong(2, paisDTO.getId_Region());
	            preparedStatement.setLong(3, paisDTO.getId_Pais());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	    public int borrarPais(long idPais) {
	        String sql = "DELETE FROM Homecenter.Pais WHERE idPais = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idPais);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	    public PaisDTO buscarPaisPorId(long idPais) {
	        String sql = "SELECT * FROM Homecenter.Pais WHERE idPais = ?";
	        PaisDTO paisDTO = jdbcTemplate.queryForObject(sql, new Object[] {idPais},
	                BeanPropertyRowMapper.newInstance(PaisDTO.class));
	        return paisDTO;
	    }
	}

