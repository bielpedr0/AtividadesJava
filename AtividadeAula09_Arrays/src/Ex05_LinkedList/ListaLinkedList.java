package Ex05_LinkedList;
import java.util.LinkedList;


public class ListaLinkedList {
	 public static void main(String[] args) {
	        LinkedList<String> lista = new LinkedList<>();
	        lista.add("Elemento1");
	        lista.add("Elemento2");
	        lista.add("Elemento3");

	        lista.addFirst("Inicio");
	        System.out.println("Lista completa: " + lista);
	    }

}
