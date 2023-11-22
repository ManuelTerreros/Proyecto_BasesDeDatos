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

import co.edu.unbosque.Modelos.DTO.CargoDTO;

@Repository
public class CargoDAO {


	@Autowired
	private JdbcTemplate jdbctemple1;
	
	public List<CargoDTO>Listar() {
		String sql = "SELECT * FROM HomeCenter.cargo";
		List<CargoDTO> lista = jdbctemple1.query(sql, BeanPropertyRowMapper.newInstance(CargoDTO.class));
		return lista;
	}

	public int guardar(CargoDTO cargoDTO) {
		String sql = "INSERT INTO Homecenter.cargo(id_Cargo,descrip_Cargo,cant_Trabajadores,sal_Min,sal_Max)"
				+ " VALUES(?,?,?,?,?)";
		return jdbctemple1.execute((Connection connection) -> {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, cargoDTO.getId_Cargo());
                ps.setString(2, cargoDTO.getDescrip_Cargo());
                ps.setLong(3, cargoDTO.getCant_Trabajadores());
                ps.setLong(4, cargoDTO.getSal_Min());
                ps.setLong(5, cargoDTO.getSal_Max());
                return ps.execute() ? 0 : -1;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
	}
	

	public int borrar(String id_Cargo) {
		String sql = "DELETE FROM Homecenter.cargo WHERE id_Cargo = ?";
        return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) ps -> {
            ps.setString(1, id_Cargo);
            return ps.execute() ? 1 : 0;
        });
	}

	public int actualizar(CargoDTO cargoDTO) {
		String sql = "UPDATE Homecenter.cargo SET descrip_Cargo = ?, cant_Trabajadores = ?, sal_Min = ?, sal_Max = ? WHERE id_Cargo = ?";
		return jdbctemple1.execute(sql, (PreparedStatementCallback<Integer>) preparedStatement -> {
            preparedStatement.setString(1, cargoDTO.getDescrip_Cargo());
            preparedStatement.setLong(2, cargoDTO.getCant_Trabajadores());
            preparedStatement.setLong(3, cargoDTO.getSal_Min());
            preparedStatement.setLong(4, cargoDTO.getSal_Max());
            preparedStatement.setString(5, cargoDTO.getId_Cargo());

            return preparedStatement.execute() ? 1 : 0; 
        });
	}

	public CargoDTO buscarId(String id) {
		String sql = "SELECT * FROM Homecenter.cargo WHERE id_Cargo = ?";
		CargoDTO cargodto = jdbctemple1.queryForObject(sql, new Object[] {id},
				BeanPropertyRowMapper.newInstance(CargoDTO.class));
		return cargodto;
	}
}
