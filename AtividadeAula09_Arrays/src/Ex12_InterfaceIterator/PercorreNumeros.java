package Ex12_InterfaceIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PercorreNumeros {

	 public static void main(String[] args) {
	       
	        List<Integer> numeros = new ArrayList<>();
	        numeros.add(10);
	        numeros.add(20);
	        numeros.add(30);
	        numeros.add(40);
	        numeros.add(50);

	      
	        Iterator<Integer> iterator = numeros.iterator();

	        System.out.println("Números na coleção:");
	        while (iterator.hasNext()) {
	            Integer numero = iterator.next();
	            System.out.println(numero);
	        }
	    }

}
