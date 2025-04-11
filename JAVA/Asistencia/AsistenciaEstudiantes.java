package Asistencia;

import java.sql.*;

    public class AsistenciaEstudiantes {
        
        private static final String URL = "jdbc:mysql://localhost:3306/Asistencia";
        private static final String USER = "root";
        private static final String PASSWORD = "11aa22BB";
        
        public static void marcarAsistencia(int idEstudiante, String estado) {
            String query = "UPDATE Estudiantes SET asistencia = ? WHERE id = ?";
            
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                
                // Establecer el estado de asistencia (presente o ausente)
                stmt.setString(1, estado); // 'presente' o 'ausente'
                stmt.setInt(2, idEstudiante);
                
                // Ejecutar la actualización
                int filasAfectadas = stmt.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Asistencia actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el estudiante.");
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
        public static void main(String[] args) {
            // Ejemplo de uso: marcar al estudiante con id 1 como presente
            marcarAsistencia(1, "presente");
        }
    }
    