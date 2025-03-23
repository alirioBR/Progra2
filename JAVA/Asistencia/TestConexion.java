package Asistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexion {
    private static final String URL = "jdbc:mysql://localhost:3306/asistencia";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "11aa22BB";

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("Error: No se pudo establecer la conexión a la base de datos.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}