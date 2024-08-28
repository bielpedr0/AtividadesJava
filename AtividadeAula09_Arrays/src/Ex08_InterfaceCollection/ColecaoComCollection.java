package Ex08_InterfaceCollection;

import java.util.ArrayList;
import java.util.Collection;

public class ColecaoComCollection {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Número total de elementos: " + numeros.size());
    }
}