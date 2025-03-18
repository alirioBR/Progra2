package Asistencia;

import java.sql.*;nnection;
import java.util.ArrayList;er;
import java.util.List;eption;

public class EstudianteDAO implements IEstudianteDAO {
    private Connection conexion;URL = "jdbc:mysql://localhost:3306/Asistencia";
    private static final String USUARIO = "root";
    public EstudianteDAO() {ing CONTRASEÑA = "11aa22BB";
        this.conexion = Conexion.conectar();
        if (this.conexion == null) {ublic static Connection conectar() {
            System.out.println("Error: No se pudo establecer la conexión a la base de datos.");        Connection conexion = null;
        }
    });

    @Override
    public boolean insertar(Estudiante estudiante) {
        String sql = "INSERT INTO Estudiantes (nombre, apellido, codigo) VALUES (?, ?, ?)"; driver de MySQL.");
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {studiante.getCodigo());
            stmt.setString(1, estudiante.getNombre());ate() > 0;
            stmt.setString(2, estudiante.getApellido());ror al conectar a la base de datos: " + e.getMessage());   } catch (SQLException e) {
            stmt.setString(3, estudiante.getCodigo());studiante: " + e.getMessage());
            return stmt.executeUpdate() > 0;rn false;
        } catch (SQLException e) {
            System.out.println("Error al insertar estudiante: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizar(Estudiante estudiante) {
        String sql = "UPDATE Estudiantes SET nombre = ?, apellido = ?, codigo = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {?, apellido = ?, codigo = ? WHERE id = ?";
            stmt.setString(1, estudiante.getNombre());prepareStatement(sql)) {
            stmt.setString(2, estudiante.getApellido());Nombre());
            stmt.setString(3, estudiante.getCodigo());diante.getApellido());
            stmt.setInt(4, estudiante.getId());
            return stmt.executeUpdate() > 0;, estudiante.getId());
        } catch (SQLException e) {   return stmt.executeUpdate() > 0;
            System.out.println("Error al actualizar estudiante: " + e.getMessage());   } catch (SQLException e) {
            return false;            System.out.println("Error al actualizar estudiante: " + e.getMessage());
        }eturn false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM Estudiantes WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {Estudiantes WHERE id = ?";
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;, id);
        } catch (SQLException e) {   return stmt.executeUpdate() > 0;
            System.out.println("Error al eliminar estudiante: " + e.getMessage());   } catch (SQLException e) {
            return false;            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        }eturn false;
    }

    @Override
    public List<Estudiante> listar() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM Estudiantes";antes = new ArrayList<>();
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {reateStatement();
            while (rs.next()) {ql)) {
                Estudiante estudiante = new Estudiante(
                        rs.getInt("id"),tudiante(
                        rs.getString("nombre"),      rs.getInt("id"),
                        rs.getString("apellido"),"),
                        rs.getString("codigo")           rs.getString("apellido"),
                );ng("codigo")
                estudiantes.add(estudiante);
            }       estudiantes.add(estudiante);
        } catch (SQLException e) {
            System.out.println("Error al listar estudiantes: " + e.getMessage());   } catch (SQLException e) {
        }           System.out.println("Error al listar estudiantes: " + e.getMessage());
        return estudiantes;        }



}    }        return estudiantes;
    }
}
