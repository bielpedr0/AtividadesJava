package datecalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiferencaEmDias {
    public static void main(String[] args) {
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        data1.set(2024, Calendar.JULY, 1);
        data2.set(2024, Calendar.JULY, 30);

        long diferencaDias = calcularDiferencaEmDias(data1.getTime(), data2.getTime());
        System.out.println("Diferença em dias: " + diferencaDias);
    }

    public static long calcularDiferencaEmDias(Date data1, Date data2) {
        long diferenca = data2.getTime() - data1.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }
}
