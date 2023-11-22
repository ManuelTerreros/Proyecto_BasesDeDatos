package co.edu.unbosque.Modelos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Factura_ventaDTO;


@Repository
public class Factura_VentaDAO {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<Factura_ventaDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.factura_venta";
		List<Factura_ventaDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Factura_ventaDTO.class));
		return lista;
	}

	public int guardar(Factura_ventaDTO facturaVentaDTO) {
		String sql = "INSERT INTO Homecenter.factura_venta(id_Factura_Venta,id_Venta,id_Trabajador,id_Cliente,id_Envio,id_Forma_Pago,id_Promocion_Afi)"
				+ " VALUES(?,?,?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, facturaVentaDTO.getId_Factura_Venta());
                ps.setLong(2, facturaVentaDTO.getId_Venta());
                ps.setLong(3, facturaVentaDTO.getId_Trabajador());
                ps.setLong(4, facturaVentaDTO.getId_Cliente());
                ps.setString(5, facturaVentaDTO.getId_Envio());
                ps.setString(6, facturaVentaDTO.getId_Forma_Pago());
                ps.setLong(7, facturaVentaDTO.getId_Promocion_Afi());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(long id_Factura_Venta) {
		String sql = "DELETE FROM Homecenter.factura_venta WHERE id_Factura_Venta = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, id_Factura_Venta);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(Factura_ventaDTO facturaVentaDTO) {
		String sql = "UPDATE Homecenter.factura_venta SET id_Venta = ?, id_Trabajador = ?, id_Cliente = ?, id_Envio = ?, id_Forma_Pago = ?, id_Promocion_Afi = ? WHERE id_Factura_Venta = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setLong(1, facturaVentaDTO.getId_Venta());
            preparedStatement.setLong(2, facturaVentaDTO.getId_Trabajador());
            preparedStatement.setLong(3, facturaVentaDTO.getId_Cliente());
            preparedStatement.setString(4, facturaVentaDTO.getId_Envio());
            preparedStatement.setString(5, facturaVentaDTO.getId_Forma_Pago());
            preparedStatement.setLong(6, facturaVentaDTO.getId_Promocion_Afi());
            preparedStatement.setLong(7, facturaVentaDTO.getId_Factura_Venta());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public Factura_ventaDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.factura_venta WHERE id_Venta = ?";
		Factura_ventaDTO facturaVentaDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Factura_ventaDTO.class));
		return facturaVentaDTO;
	}
}
