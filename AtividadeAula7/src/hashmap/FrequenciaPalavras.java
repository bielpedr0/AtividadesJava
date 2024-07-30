package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        Map<String, Integer> frequencias = contarFrequenciaPalavras(texto);
        System.out.println("Frequência das palavras: " + frequencias);
        scanner.close();
    }

    public static Map<String, Integer> contarFrequenciaPalavras(String texto) {
        Map<String, Integer> frequencias = new HashMap<>();
        String[] palavras = texto.split("\\s+");
        for (String palavra : palavras) {
            palavra = palavra.toLowerCase();
            frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
        }
        return frequencias;
    }
}
