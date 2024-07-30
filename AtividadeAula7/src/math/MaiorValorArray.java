package math;

public class MaiorValorArray {
	  public static void main(String[] args) {
	        int[] numeros = {5, 9, 18, 3, 2};
	        int maior = encontrarMaiorValor(numeros);
	        System.out.println("O maior valor no array é: " + maior);
	    }

	    public static int encontrarMaiorValor(int[] array) {
	        int maior = array[0];
	        for (int numero : array) {
	            if (numero > maior) {
	                maior = numero;
	            }
	        }
	        return maior;
	    }
}
