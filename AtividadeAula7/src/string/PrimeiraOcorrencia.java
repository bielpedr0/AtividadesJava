package string;

public class PrimeiraOcorrencia {
    public static void main(String[] args) {
        String s = "Hello, World!";
        char c = 'o';
        System.out.println("Primeira Ocorrência de: '" + c + "': " + primeiraOcorrencia(s, c));
    }

    public static int primeiraOcorrencia(String s, char c) {
        return s.indexOf(c);
    }
}
