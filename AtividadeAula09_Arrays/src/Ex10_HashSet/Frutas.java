package Ex10_HashSet;
import java.util.LinkedHashSet;

public class Frutas {
	  public static void main(String[] args) {
	        LinkedHashSet<String> frutas = new LinkedHashSet<>();
	        frutas.add("Maçã");
	        frutas.add("Melancia");
	        frutas.add("Maçã");

	        System.out.println("Conjunto de frutas: " + frutas);
	    }
}
