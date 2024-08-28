package Ex01_ArrayOrdenado;

import java.util.Arrays;

public class ArrayOrdenado {
    public static void main(String[] args) {
        String[] nomes = {"Luana", "Naiara", "Gustavo"};
        Arrays.sort(nomes);

        int posicao = Arrays.binarySearch(nomes, "Luana");
        System.out.println("Posição de 'Luana': " + posicao);
    }
}
