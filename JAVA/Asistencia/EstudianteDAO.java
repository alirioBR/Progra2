package Asistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements IEstudianteDAO {
    private Connection conexion;

    public EstudianteDAO() {
        this.conexion = Conexion.conectar();
        if (this.conexion == null) {
            System.out.println("Error: No se pudo establecer la conexión a la base de datos.");
        }
    }

    @Override
    public boolean insertar(Estudiante estudiante) {
        String sql = "INSERT INTO Estudiantes (nombre, apellido, codigo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellido());
            stmt.setString(3, estudiante.getCodigo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar estudiante: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizar(Estudiante estudiante) {
        String sql = "UPDATE Estudiantes SET nombre = ?, apellido = ?, codigo = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellido());
            stmt.setString(3, estudiante.getCodigo());
            stmt.setInt(4, estudiante.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar estudiante: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM Estudiantes WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Estudiante> listar() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM Estudiantes";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("codigo")
                );
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar estudiantes: " + e.getMessage());
        }
        return estudiantes;
    }

public boolean marcarAsistencia(int id, String estado) {
    String sql = "UPDATE Estudiantes SET estado = ? WHERE id = ?";
    try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setString(1, estado);
        stmt.setInt(2, id);
        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al marcar asistencia: " + e.getMessage());
        return false;
    }
}
}