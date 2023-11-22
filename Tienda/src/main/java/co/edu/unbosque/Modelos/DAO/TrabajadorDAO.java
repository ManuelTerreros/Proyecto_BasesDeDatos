package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.TrabajadorDTO;

@Repository
public class TrabajadorDAO implements ICrud<TrabajadorDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	 @Override
	    public List<TrabajadorDTO> listar() {
	        String sql = "SELECT * FROM Homecenter.trabajador";
	        List<TrabajadorDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(TrabajadorDTO.class));
	        return lista;
	    }

	 @Override
	    public int guardar(TrabajadorDTO trabajadorDTO) {
	        String sql = "INSERT INTO Homecenter.trabajador(id_Empleado, tipo_Doc, primer_Nom, primer_Apellido, fecha_Contratacion, id_Depto, id_Cargo, id_Sucursal)"
	                + " VALUES(?,?,?,?,?,?,?,?)";

	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, trabajadorDTO.getId_Empleado());
	            preparedStatement.setString(2, trabajadorDTO.getTipo_Doc());
	            preparedStatement.setString(3, trabajadorDTO.getPrimer_Nom());
	            preparedStatement.setString(4, trabajadorDTO.getPrimer_Apellido());
	            preparedStatement.setString(5, trabajadorDTO.getFecha_Contratacion());
	            preparedStatement.setLong(6, trabajadorDTO.getId_Depto());
	            preparedStatement.setString(7, trabajadorDTO.getId_Cargo());
	            preparedStatement.setString(8, trabajadorDTO.getId_Sucursal());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	 @Override
	    public int actualizar(TrabajadorDTO trabajadorDTO) {
	        String sql = "UPDATE Homecenter.trabajador SET tipo_Doc = ?, primer_Nom = ?, primer_Apellido = ?, fecha_Contratacion = ?, id_Depto = ?, id_Cargo = ?, id_Sucursal = ? WHERE id_Empleado = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, trabajadorDTO.getTipo_Doc());
	            preparedStatement.setString(2, trabajadorDTO.getPrimer_Nom());
	            preparedStatement.setString(3, trabajadorDTO.getPrimer_Apellido());
	            preparedStatement.setString(4, trabajadorDTO.getFecha_Contratacion());
	            preparedStatement.setLong(5, trabajadorDTO.getId_Depto());
	            preparedStatement.setString(6, trabajadorDTO.getId_Cargo());
	            preparedStatement.setString(7, trabajadorDTO.getId_Sucursal());
	            preparedStatement.setLong(8, trabajadorDTO.getId_Empleado());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public int borrar(long idEmpleado) {
	        String sql = "DELETE FROM Homecenter.trabajador WHERE id_Empleado = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idEmpleado);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public TrabajadorDTO buscarId(long idEmpleado) {
	        String sql = "SELECT * FROM Homecenter.trabajador WHERE id_Empleado = ?";
	        TrabajadorDTO trabajadorDTO = jdbcTemplate.queryForObject(sql, new Object[]{idEmpleado},
	                BeanPropertyRowMapper.newInstance(TrabajadorDTO.class));
	        return trabajadorDTO;
	    }

	}