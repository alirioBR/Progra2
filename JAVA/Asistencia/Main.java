import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE ESTUDIANTES ---");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Actualizar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Listar estudiantes");
            System.out.println("5. Marcar asistencia");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    
                    Estudiante nuevoEstudiante = new Estudiante(0, nombre, apellido, codigo);
                    if (estudianteDAO.insertar(nuevoEstudiante)) {
                        System.out.println("✅ Estudiante insertado correctamente.");
                    } else {
                        System.out.println("❌ Error al insertar estudiante.");
                    }
                    break;
                
                case 2:
                    System.out.print("ID del estudiante a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo apellido: ");
                    String nuevoApellido = scanner.nextLine();
                    System.out.print("Nuevo código: ");
                    String nuevoCodigo = scanner.nextLine();

                    Estudiante estudianteActualizado = new Estudiante(idActualizar, nuevoNombre, nuevoApellido, nuevoCodigo);
                    if (estudianteDAO.actualizar(estudianteActualizado)) {
                        System.out.println("✅ Estudiante actualizado correctamente.");
                    } else {
                        System.out.println("❌ Error al actualizar estudiante.");
                    }
                    break;
                
                case 3:
                    System.out.print("ID del estudiante a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (estudianteDAO.eliminar(idEliminar)) {
                        System.out.println("✅ Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("❌ Error al eliminar estudiante.");
                    }
                    break;
                
                case 4:
                    List<Estudiante> estudiantes = estudianteDAO.listar();
                    System.out.println("\n--- LISTA DE ESTUDIANTES ---");
                    for (Estudiante e : estudiantes) {
                        System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre() + " " + e.getApellido() + 
                                           " | Código: " + e.getCodigo() + " | Estado: " + e.getEstado());
                    }
                    break;

                case 5:
                    System.out.print("ID del estudiante a marcar asistencia: ");
                    int idAsistencia = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    System.out.print("Estado (Presente/Ausente): ");
                    String estado = scanner.nextLine();

                    if (estudianteDAO.marcarAsistencia(idAsistencia, estado)) {
                        System.out.println("✅ Asistencia marcada correctamente.");
                    } else {
                        System.out.println("❌ Error al marcar asistencia.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("❌ Opción no válida, intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
