package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 7, 3, 9, 1, 2);

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}
