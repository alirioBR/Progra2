import java.util.LinkedList;
import java.util.Queue;

public class MemoriaFIFO {
public static void main(String[] args) {

    Queue<Integer> memoria = new LinkedList<>();
// Asignar memoria

    memoria.offer(1);
    memoria.offer(2);
    memoria.offer(3);
// Liberar memoria

int liberada = memoria.poll();
System.out.println("Memoria liberada: " + liberada);
}
}