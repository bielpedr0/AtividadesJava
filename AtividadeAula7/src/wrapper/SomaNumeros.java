package wrapper;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma lista de números separados por espaço: ");
        String entrada = scanner.nextLine();
        String[] numerosComoString = entrada.split(" ");
        int soma = calcularSoma(numerosComoString);
        System.out.println("Soma total: " + soma);
        scanner.close();
    }

    public static int calcularSoma(String[] numerosComoString) {
        int soma = 0;
        for (String numero : numerosComoString) {
            soma += Integer.parseInt(numero);
        }
        return soma;
    }
}
