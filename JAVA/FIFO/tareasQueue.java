import java.util.Queue;
import java.util.LinkedList;

public class tareasQueue {
public static void main(String[] args) {
    Queue<String> tareas = new LinkedList<>();

    tareas.offer("Tarea 1");
    tareas.offer("Tarea 2");
    tareas.offer("Tarea 3");

while (!tareas.isEmpty()) {
String tarea = tareas.poll();
System.out.println("Ejecutando: " + tarea);
}
}
}