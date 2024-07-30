package datecalendar;

import java.util.Calendar;
import java.util.Date;

public class CompararDatas {
    public static void main(String[] args) {
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        data1.set(2024, Calendar.JULY, 1);
        data2.set(2024, Calendar.AUGUST, 1);

        int resultado = compararDatas(data1.getTime(), data2.getTime());
        if (resultado < 0) {
            System.out.println("A primeira data é anterior à segunda.");
        } else if (resultado > 0) {
            System.out.println("A primeira data é posterior à segunda.");
        } else {
            System.out.println("As datas são iguais.");
        }
    }

    public static int compararDatas(Date data1, Date data2) {
        return data1.compareTo(data2);
    }
}
