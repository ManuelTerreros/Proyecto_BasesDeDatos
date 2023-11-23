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
public class Venta_ProductoDAO implements ICrud<Venta_ProductoDTO>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Venta_ProductoDTO> listar() {
		String sql = "SELECT * FROM HomeCenter.Venta_Producto";
		List<Venta_ProductoDTO> lista = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(Venta_ProductoDTO.class));
		return lista;
	}

	@Override
	public int guardar(Venta_ProductoDTO venta_ProductoDTO) {
		String sql = "INSERT INTO Homecenter.Venta_Producto(id_Venta, id_Producto, cantidad, precio_Total)"
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
		String sql = "UPDATE Homecenter.Venta_Producto SET cantidad = ?, precio_Total = ? WHERE id_Venta = ? AND id_Producto = ?";
		return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
			preparedStatement.setLong(1, venta_ProductoDTO.getCantidad());
			preparedStatement.setLong(2, venta_ProductoDTO.getPrecio_Total());
			preparedStatement.setLong(3, venta_ProductoDTO.getId_Venta());
			preparedStatement.setLong(4, venta_ProductoDTO.getId_Producto());
			return preparedStatement.execute() ? 1 : 0;
		});
	}

	@Override
	public int borrar(long id_Venta) {
		String sql = "DELETE FROM Homecenter.Venta_Producto WHERE id_Venta = ?";
		return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
			ps.setLong(1, id_Venta);
			return ps.execute() ? 1 : 0;
		});
	}

	@Override
	public Venta_ProductoDTO buscarId(long id_Venta) {
		String sql = "SELECT * FROM Homecenter.Venta_Producto WHERE id_Venta = ?";
		Venta_ProductoDTO venta_ProductoDTO = jdbcTemplate.queryForObject(sql, new Object[] { id_Venta},
				BeanPropertyRowMapper.newInstance(Venta_ProductoDTO.class));
		return venta_ProductoDTO;
	}
}
