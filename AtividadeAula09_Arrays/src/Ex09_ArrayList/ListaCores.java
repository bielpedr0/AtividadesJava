package Ex09_ArrayList;
import java.util.ArrayList;

public class ListaCores {

	  public static void main(String[] args) {
	        ArrayList<String> cores = new ArrayList<>();
	        cores.add("Amarelo");
	        cores.add("Vermelho");
	        cores.add("Azul");

	        System.out.println("Cor no segundo índice: " + cores.get(1));
	    }
}
