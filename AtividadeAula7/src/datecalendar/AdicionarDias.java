package datecalendar;

import java.util.Calendar;
import java.util.Date;

public class AdicionarDias {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        data.set(2024, Calendar.JULY, 1);
        int diasParaAdicionar = 15;

        Date novaData = adicionarDias(data.getTime(), diasParaAdicionar);
        System.out.println("Nova data: " + novaData);
    }

    public static Date adicionarDias(Date data, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return cal.getTime();
    }
}
