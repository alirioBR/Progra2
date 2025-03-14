package JAVA.Asistencia;

import java.util.List;

public interface IEstudianteDAO {
    boolean insertar(Estudiante estudiante);
    boolean actualizar(Estudiante estudiante);
    boolean eliminar(int id);
    List<Estudiante> listar();
}
