package reservaVoo;

public class Voo {

	 private final String numeroVoo;
	    private final int capacidadeTotal;
	    private int assentosReservados;

	    public Voo(String numeroVoo, int capacidadeTotal) {
	        this.numeroVoo = numeroVoo;
	        this.capacidadeTotal = capacidadeTotal;
	        this.assentosReservados = 0;
	    }

	    public synchronized boolean reservarAssento() {
	        if (assentosReservados < capacidadeTotal) {
	            assentosReservados++;
	            System.out.println("Assento reservado no voo " + numeroVoo + ". Assentos reservados: " + assentosReservados);
	            return true;
	        } else {
	            System.out.println("Voo " + numeroVoo + " está lotado.");
	            return false;
	        }
	    }

	    public int getAssentosDisponiveis() {
	        return capacidadeTotal - assentosReservados;
	    }
}
