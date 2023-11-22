package co.edu.unbosque.Modelos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.EnvioDTO;

public class EnvioDAO implements ICrud1<EnvioDTO>{
	@Autowired
	private JdbcTemplate jdbctemple1;
	
	@Override
	public List<EnvioDTO>listar() {
		String sql = "SELECT * FROM HomeCenter.envio";
		List<EnvioDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(EnvioDTO.class));
		return lista;
	}

	@Override
	public int guardar(EnvioDTO envioDTO) {
		String sql = "INSERT INTO Homecenter.envio(id_Envio,id_Factura_Venta,fecha_despacho,fecha_entrega,direccion_Entrega,id_Sucursal,id_Empleado,id_Vehiculo)"
				+ " VALUES(?,?,?,?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, envioDTO.getId_Envio());
                ps.setLong(2, envioDTO.getId_Factura_Venta());
                ps.setString(3, envioDTO.getFecha_despacho());
                ps.setString(4, envioDTO.getFecha_entrega());
                ps.setString(5, envioDTO.getDireccion_Entrega());
                ps.setLong(6, envioDTO.getId_Sucursal());
                ps.setLong(7, envioDTO.getId_Empleado());
                ps.setString(8, envioDTO.getId_Vehiculo());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	
	@Override
	public int borrar(String id_Envio) {
		String sql = "DELETE FROM Homecenter.envio WHERE id_Envio = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, id_Envio);
            return ps.execute() ? 1 : 0;
        });
	}


	@Override
	public int actualizar(EnvioDTO envioDTO) {
		String sql = "UPDATE Homecenter.envio SET id_Factura_Venta = ?, fecha_despacho = ?, fecha_entrega = ?, direccion_Entrega = ?, id_Sucursal = ?, id_Empleado = ?, id_Vehiculo = ? WHERE id_Envio = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setLong(1, envioDTO.getId_Factura_Venta());
            preparedStatement.setString(2, envioDTO.getFecha_despacho());
            preparedStatement.setString(3, envioDTO.getFecha_entrega());
            preparedStatement.setString(4, envioDTO.getDireccion_Entrega());
            preparedStatement.setLong(5, envioDTO.getId_Sucursal());
            preparedStatement.setLong(6, envioDTO.getId_Empleado());
            preparedStatement.setString(7, envioDTO.getId_Vehiculo());
            preparedStatement.setString(8, envioDTO.getId_Envio());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	@Override
	public EnvioDTO buscarId(String id) {
		String sql = "SELECT * FROM Homecenter.envio WHERE id_Envio = ?";
		EnvioDTO envioDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(EnvioDTO.class));
		return envioDTO;
	}
}
