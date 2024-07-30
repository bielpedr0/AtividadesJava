package wrapper;

import java.util.ArrayList;
import java.util.List;

public class StringsToIntegers {
	 public static void main(String[] args) {
	        List<String> strings = List.of("1", "2", "3", "4");
	        List<Integer> inteiros = converterParaInteiros(strings);
	        System.out.println("Lista de inteiros: " + inteiros);
	    }

	    public static List<Integer> converterParaInteiros(List<String> strings) {
	        List<Integer> inteiros = new ArrayList<>();
	        for (String s : strings) {
	            inteiros.add(Integer.parseInt(s));
	        }
	        return inteiros;
	    }
}
