package Asistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/asistencia?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "11aa22BB";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Cargar el driver manualmente
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver de MySQL.");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar a la BD: " + e.getMessage());
        }
        return conexion;
    }
}
