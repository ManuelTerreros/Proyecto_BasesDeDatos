package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.ProductoDTO;

@Repository
public class ProductoDAO implements ICrud<ProductoDTO>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate1;

	 @Override
	    public List<ProductoDTO> listar() {
	        String sql = "SELECT * FROM HomeCenter.producto";
	        List<ProductoDTO> lista = jdbcTemplate1.query(sql, BeanPropertyRowMapper.newInstance(ProductoDTO.class));
	        return lista;
	    }

	 @Override
	    public int guardar(ProductoDTO productoDTO) {
	        String sql = "INSERT INTO Homecenter.producto(id_producto, descrip_producto, iva, precio, id_categ, id_sucursal, precio_Despues_Iva, promocion_Prod)"
	                + " VALUES(?,?,?,?,?,?,?,?)";

	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setLong(1, productoDTO.getId_producto());
	            preparedStatement.setString(2, productoDTO.getDescrip_producto());
	            preparedStatement.setFloat(3, productoDTO.getIva());
	            preparedStatement.setLong(4, productoDTO.getPrecio());
	            preparedStatement.setLong(5, productoDTO.getId_categ());
	            preparedStatement.setLong(6, productoDTO.getId_sucursal());
	            preparedStatement.setLong(7, productoDTO.getPrecio_Despues_Iva());
	            preparedStatement.setLong(8, productoDTO.getPromocion_Prod());
	            return preparedStatement.execute() ? 0 : -1;
	        });
	    }

	 @Override
	    public int actualizar(ProductoDTO productoDTO) {
	        String sql = "UPDATE Homecenter.producto SET descrip_producto = ?, iva = ?, precio = ?, id_categ = ?, id_sucursal = ?, precio_Despues_Iva = ?, promocion_Prod = ? WHERE id_producto = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
	            preparedStatement.setString(1, productoDTO.getDescrip_producto());
	            preparedStatement.setFloat(2, productoDTO.getIva());
	            preparedStatement.setLong(3, productoDTO.getPrecio());
	            preparedStatement.setLong(4, productoDTO.getId_categ());
	            preparedStatement.setLong(5, productoDTO.getId_sucursal());
	            preparedStatement.setLong(6, productoDTO.getPrecio_Despues_Iva());
	            preparedStatement.setLong(7, productoDTO.getPromocion_Prod());
	            preparedStatement.setLong(8, productoDTO.getId_producto());

	            return preparedStatement.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public int borrar(long idProducto) {
	        String sql = "DELETE FROM Homecenter.producto WHERE id_producto = ?";
	        return jdbcTemplate1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
	            ps.setLong(1, idProducto);
	            return ps.execute() ? 1 : 0;
	        });
	    }

	 @Override
	    public ProductoDTO buscarId(long idProducto) {
	        String sql = "SELECT * FROM Homecenter.producto WHERE id_producto = ?";
	        ProductoDTO productoDTO = jdbcTemplate1.queryForObject(sql, new Object[] {idProducto},
	                BeanPropertyRowMapper.newInstance(ProductoDTO.class));
	        return productoDTO;
	    }

	}

