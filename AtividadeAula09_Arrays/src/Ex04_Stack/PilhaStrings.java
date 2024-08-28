package Ex04_Stack;
import java.util.Stack;

public class PilhaStrings {
	   public static void main(String[] args) {
	        Stack<String> pilha = new Stack<>();
	        pilha.push("Primeiro");
	        pilha.push("Segundo");
	        pilha.push("Terceiro");

	        String removido = pilha.pop();
	        System.out.println("Elemento removido: " + removido);
	    }
}
