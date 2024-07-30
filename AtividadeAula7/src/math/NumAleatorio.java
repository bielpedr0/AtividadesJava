package math;

public class NumAleatorio {
	  public static void main(String[] args) {
	        int numeroAleatorio = gerarNumeroAleatorio(1, 100);
	        System.out.println("Número aleatório entre 1 e 100: " + numeroAleatorio);
	    }

	    public static int gerarNumeroAleatorio(int min, int max) {
	        return min + (int)(Math.random() * (max - min + 1));
	    }
}
