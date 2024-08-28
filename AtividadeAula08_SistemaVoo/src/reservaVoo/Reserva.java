package reservaVoo;

public class Reserva implements Runnable{

	 private final Voo voo;

	    public Reserva(Voo voo) {
	        this.voo = voo;
	    }

	    @Override
	    public void run() {
	        if (!voo.reservarAssento()) {
	            System.out.println("Reserva falhou. Sem assentos disponíveis.");
	        }

	    }
}