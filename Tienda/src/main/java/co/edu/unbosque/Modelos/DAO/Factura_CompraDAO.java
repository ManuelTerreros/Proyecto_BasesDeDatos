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

import co.edu.unbosque.Modelos.DTO.Factura_CompraDTO;

@Repository
public class Factura_CompraDAO {

	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<Factura_CompraDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.factura_compra";
		List<Factura_CompraDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(Factura_CompraDTO.class));
		return lista;
	}

	public int guardar(Factura_CompraDTO facturaCompraDTO) {
		String sql = "INSERT INTO Homecenter.factura_compra(id_Compra,cantidad,precio_Lote,iva,total,id_Proveedor,fecha_Compra)"
				+ " VALUES(?,?,?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setLong(1, 	facturaCompraDTO.getId_Compra());
                ps.setLong(2, facturaCompraDTO.getCantidad());
                ps.setLong(3, facturaCompraDTO.getPrecio_Lote());
                ps.setFloat(4, facturaCompraDTO.getIva());
                ps.setLong(2, facturaCompraDTO.getTotal());
                ps.setLong(3, facturaCompraDTO.getId_Proveedor());
                ps.setString(4, facturaCompraDTO.getFecha_Compra());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(long id_Compra) {
		String sql = "DELETE FROM Homecenter.factura_compra WHERE id_Compra = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setLong(1, id_Compra);
            return ps.execute() ? 1 : 0;
        });
	}



	public int actualizar(Factura_CompraDTO facturaCompraDTO) {
		String sql = "UPDATE Homecenter.factura_compra SET cantidad = ?, precio_Lote = ?, iva = ?, total = ?, id_Proveedor = ?, fecha_Compra = ? WHERE id_Compra = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setLong(1, facturaCompraDTO.getCantidad());
            preparedStatement.setLong(2, facturaCompraDTO.getPrecio_Lote());
            preparedStatement.setFloat(3, facturaCompraDTO.getIva());
            preparedStatement.setLong(4, facturaCompraDTO.getTotal());
            preparedStatement.setLong(5, facturaCompraDTO.getId_Proveedor());
            preparedStatement.setString(6, facturaCompraDTO.getFecha_Compra());
            preparedStatement.setLong(7, facturaCompraDTO.getId_Compra());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public Factura_CompraDTO buscarId(long id) {
		String sql = "SELECT * FROM Homecenter.factura_compra WHERE id_Compra = ?";
		Factura_CompraDTO facturaCompraDTO = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(Factura_CompraDTO.class));
		return facturaCompraDTO;
	}
}
