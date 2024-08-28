package reservaVoo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SistemaReservas {
    public static void main(String[] args) {
        
        Voo voo = new Voo("AB123", 10);

        
        ExecutorService executor = Executors.newFixedThreadPool(5);

        
        for (int i = 0; i < 15; i++) {
            executor.submit(new Reserva(voo));
        }

         
        executor.shutdown();

        try {
            
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Processamento de reservas concluído.");
    }
}

