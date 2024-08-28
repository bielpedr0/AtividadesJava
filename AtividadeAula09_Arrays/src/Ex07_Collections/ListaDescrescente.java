package Ex07_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDescrescente {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Banana");
        lista.add("Uva");
        lista.add("Limão");

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista em ordem decrescente: " + lista);
    }
}