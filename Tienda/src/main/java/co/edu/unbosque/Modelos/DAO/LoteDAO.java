package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.LoteDTO;

@Repository
public class LoteDAO implements ICrud<LoteDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate1;

	 @Override
	    public List<LoteDTO> listar() {
	        String sql = "SELECT * FROM HomeCenter.lote";
	        List<LoteDTO> lista = jdbcTemplate1.query(sql, BeanPropertyRowMapper.newInstance(LoteDTO.class));
	        return lista;
	    }
	 @Override
	    public int guardar(LoteDTO loteDTO) {
	        String sql = "INSERT INTO HomeCenter.lote(id_Lote, id_Producto, id_Proveedor, id_Sucursal)"
	                + " VALUES(?,?,?,?,?)";

	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, loteDTO.getId_Lote());
	            preparedStatement.setLong(2, loteDTO.getId_Producto());
	            preparedStatement.setLong(3, loteDTO.getId_Proveedor());
	            preparedStatement.setLong(4, loteDTO.getId_Sucursal());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	 @Override
	    public int actualizar(LoteDTO loteDTO) {
	        String sql = "UPDATE HomeCenter.lote SET id_Producto = ?, id_Proveedor = ?, id_Sucursal = ? WHERE id_Lote = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, loteDTO.getId_Producto());
	            preparedStatement.setLong(2, loteDTO.getId_Proveedor());
	            preparedStatement.setLong(3, loteDTO.getId_Sucursal());
	            preparedStatement.setLong(4, loteDTO.getId_Lote());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public int borrar(long idLote) {
	        String sql = "DELETE FROM HomeCenter.lote WHERE idLote = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idLote);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public LoteDTO buscarId(long idLote) {
	        String sql = "SELECT * FROM HomeCenter.lote WHERE idLote = ?";
	        LoteDTO loteDTO = jdbcTemplate1.queryForObject(sql, new Object[]{idLote},
	                BeanPropertyRowMapper.newInstance(LoteDTO.class));
	        return loteDTO;
	    }
	}

