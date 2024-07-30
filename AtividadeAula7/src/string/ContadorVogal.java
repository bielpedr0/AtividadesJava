package string;

public class ContadorVogal {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("Número de Vogais: " + contaVogais(s));
    }

    public static int contaVogais(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
