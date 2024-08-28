package Ex02_ArrayDeque;
import java.util.ArrayDeque;
import java.util.Queue;

public class FilaArrayDeque {

	public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        fila.add("Primeiro");
        fila.add("Segundo");
        fila.add("Terceiro");

        String removido = fila.poll();
        System.out.println("Elemento removido: " + removido);
    }
}
