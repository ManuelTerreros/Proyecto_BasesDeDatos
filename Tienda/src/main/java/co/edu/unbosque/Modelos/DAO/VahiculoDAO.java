package co.edu.unbosque.Modelos.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;
import co.edu.unbosque.Modelos.DTO.VehiculoDTO;

@Repository
public class VahiculoDAO implements ICrud1<VehiculoDTO>{
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
    public List<VehiculoDTO> listar() {
        String sql = "SELECT * FROM HomeCenter.vehiculo";
        List<VehiculoDTO> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(VehiculoDTO.class));
        return lista;
    }

	@Override
    public int guardar(VehiculoDTO vehiculoDTO) {
        String sql = "INSERT INTO Homecenter.vehiculo(id_Vehiculo, num_Motor, num_Serie, num_LicTransito, estado, fecha_Soat, fecha_Tecno)"
                + " VALUES(?,?,?,?,?,?,?)";

        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, vehiculoDTO.getId_Vehiculo());
            preparedStatement.setLong(2, vehiculoDTO.getNum_Motor());
            preparedStatement.setLong(3, vehiculoDTO.getNum_Serie());
            preparedStatement.setLong(4, vehiculoDTO.getNum_LicTransito());
            preparedStatement.setString(5, vehiculoDTO.getEstado());
            preparedStatement.setString(6, vehiculoDTO.getFecha_Soat());
            preparedStatement.setString(7, vehiculoDTO.getFecha_Tecno());
            return preparedStatement.execute() ? 0 : -1;
        });
    }

	@Override
    public int actualizar(VehiculoDTO vehiculoDTO) {
        String sql = "UPDATE Homecenter.vehiculo SET num_Motor = ?, num_Serie = ?, num_LicTransito = ?, estado = ?, fecha_Soat = ?, fecha_Tecno = ? WHERE id_Vehiculo = ?";
        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setLong(1, vehiculoDTO.getNum_Motor());
            preparedStatement.setLong(2, vehiculoDTO.getNum_Serie());
            preparedStatement.setLong(3, vehiculoDTO.getNum_LicTransito());
            preparedStatement.setString(4, vehiculoDTO.getEstado());
            preparedStatement.setString(5, vehiculoDTO.getFecha_Soat());
            preparedStatement.setString(6, vehiculoDTO.getFecha_Tecno());
            preparedStatement.setString(7, vehiculoDTO.getId_Vehiculo());

            return preparedStatement.execute() ? 1 : 0;
        });
    }

	@Override
    public int borrar(String idVehiculo) {
        String sql = "DELETE FROM Homecenter.vehiculo WHERE id_Vehiculo = ?";
        return jdbcTemplate.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, idVehiculo);
            return ps.execute() ? 1 : 0;
        });
    }

	@Override
    public VehiculoDTO buscarId(String idVehiculo) {
        String sql = "SELECT * FROM Homecenter.vehiculo WHERE id_Vehiculo = ?";
        VehiculoDTO vehiculoDTO = jdbcTemplate.queryForObject(sql, new Object[] {idVehiculo},
                BeanPropertyRowMapper.newInstance(VehiculoDTO.class));
        return vehiculoDTO;
    }
}
