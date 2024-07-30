package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaiorEMenor {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 8, 3, 15, 2, 10);

        int maior = encontrarMaiorValor(numeros);
        int menor = encontrarMenorValor(numeros);

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }

    public static int encontrarMaiorValor(List<Integer> lista) {
        int maior = lista.get(0);
        for (int valor : lista) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(List<Integer> lista) {
        int menor = lista.get(0);
        for (int valor : lista) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }
}
