package co.edu.unbosque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjemploJDBC {

    public static void main(String[] args) {
        try {
            // Establecer la conexión
            Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "icarvajals" 
            );// password changeme

            // Preparar la consulta
            String query = "SELECT * FROM HOMECENTER.Ejemplo";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Procesar los resultados
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getLong("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Descripción: " + resultSet.getString("descripcion"));
                // Agregar más columnas según sea necesario
            }

            // Cerrar recursos
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}