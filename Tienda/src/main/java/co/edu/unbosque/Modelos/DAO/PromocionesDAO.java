package co.edu.unbosque.Modelos.DAO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.PromocionesDTO;

@Repository
public class PromocionesDAO implements ICrud<PromocionesDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	 
	 @Override
	    public List<PromocionesDTO> listar() {
	        String sql = "SELECT * FROM Homecenter.promociones";
	        List<PromocionesDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(PromocionesDTO.class));
	        for(int i=0; i<lista.size();i++) {
				LocalDateTime localDateTime = LocalDateTime.parse(lista.get(i).getFecha_Inicial(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				LocalDateTime localDateTime1 = LocalDateTime.parse(lista.get(i).getFecha_Final(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			    String fechaFormateada = localDateTime.format(DateTimeFormatter.ofPattern("dd/M/yyyy"));
			    String fechaFormateada1 = localDateTime1.format(DateTimeFormatter.ofPattern("dd/M/yyyy"));
			    lista.get(i).setFecha_Inicial(fechaFormateada);
			    lista.get(i).setFecha_Final(fechaFormateada1);
				}
	        return lista;
	    }

	 @Override
	    public int guardar(PromocionesDTO promocionesDTO) {
	        String sql = "INSERT INTO Homecenter.promociones(id_Promocion, descriP_Prom, fecha_Inicial, fecha_Final, condiciones_Promocion)"
	                + " VALUES(?,?,?,?,?)";

	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, promocionesDTO.getId_Promocion());
	            preparedStatement.setString(2, promocionesDTO.getDescriP_Prom());
	            preparedStatement.setString(3, promocionesDTO.getFecha_Inicial());
	            preparedStatement.setString(4, promocionesDTO.getFecha_Final());
	            preparedStatement.setString(5, promocionesDTO.getCondiciones_Promocion());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	 @Override
	    public int actualizar(PromocionesDTO promocionesDTO) {
	        String sql = "UPDATE Homecenter.promociones SET descriP_Prom = ?, fecha_Inicial = fecha_Inicial, fecha_Final = fecha_Final, condiciones_Promocion = ?"
	                + " WHERE id_Promocion = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, promocionesDTO.getDescriP_Prom());
	            preparedStatement.setString(2, promocionesDTO.getCondiciones_Promocion());
	            preparedStatement.setLong(3, promocionesDTO.getId_Promocion());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public int borrar(long idPromocion) {
	        String sql = "DELETE FROM Homecenter.promociones WHERE id_Promocion = ?";
	        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idPromocion);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public PromocionesDTO buscarId(long idPromocion) {
	        String sql = "SELECT * FROM Homecenter.promociones WHERE id_Promocion = ?";
	        PromocionesDTO promocionesDTO = jdbcTemplate.queryForObject(sql, new Object[]{idPromocion},
	                BeanPropertyRowMapper.newInstance(PromocionesDTO.class));
	        return promocionesDTO;
	    }

	}

