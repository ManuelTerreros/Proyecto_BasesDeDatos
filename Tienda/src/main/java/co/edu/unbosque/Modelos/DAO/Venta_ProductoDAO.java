package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.Venta_ProductoDTO;

@Repository
public class Venta_ProductoDAO implements ICrud2<Venta_ProductoDTO>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Venta_ProductoDTO> listar() {
		String sql = "SELECT * FROM HomeCenter.venta_Producto";
		List<Venta_ProductoDTO> lista = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(Venta_ProductoDTO.class));
		return lista;
	}

	@Override
	public int guardar(Venta_ProductoDTO venta_ProductoDTO) {
		String sql = "INSERT INTO Homecenter.venta_Producto(id_Venta, id_Producto, cantidad, precio_Total)"
				+ " VALUES(?,?,?,?)";

		return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
			preparedStatement.setLong(1, venta_ProductoDTO.getId_Venta());
			preparedStatement.setLong(2, venta_ProductoDTO.getId_Producto());
			preparedStatement.setLong(3, venta_ProductoDTO.getCantidad());
			preparedStatement.setLong(4, venta_ProductoDTO.getPrecio_Total());
			return preparedStatement.execute() ? 0 : -1;
		});
	}

	@Override
	public int actualizar(Venta_ProductoDTO venta_ProductoDTO) {
		String sql = "UPDATE Homecenter.venta_Producto SET cantidad = ?, precio_Total = ? WHERE id_Venta = ? AND id_Producto = ?";
		return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
			preparedStatement.setLong(1, venta_ProductoDTO.getCantidad());
			preparedStatement.setLong(2, venta_ProductoDTO.getPrecio_Total());
			preparedStatement.setLong(3, venta_ProductoDTO.getId_Venta());
			preparedStatement.setLong(4, venta_ProductoDTO.getId_Producto());
			return preparedStatement.execute() ? 1 : 0;
		});
	}

	@Override
	public int borrar(long id_Venta, long id_Producto) {
		String sql = "DELETE FROM Homecenter.venta_Producto WHERE id_Venta = ? AND id_Producto = ?";
		return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
			ps.setLong(1, id_Venta);
			ps.setLong(2, id_Producto);
			return ps.execute() ? 1 : 0;
		});
	}

	@Override
	public Venta_ProductoDTO buscarId(long id_Venta, long id_Producto) {
		String sql = "SELECT * FROM Homecenter.venta_Producto WHERE id_Venta = ? AND id_Producto = ?";
		Venta_ProductoDTO venta_ProductoDTO = jdbcTemplate.queryForObject(sql, new Object[] { id_Venta, id_Producto },
				BeanPropertyRowMapper.newInstance(Venta_ProductoDTO.class));
		return venta_ProductoDTO;
	}
}
