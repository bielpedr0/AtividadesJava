package Ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<String> listaMercado = new ArrayList<String>();
		
		String[] itens = {"Morango", "Banana", "Alface", "Cebola", "Iogurte" };
		
		for(int i=0; i<5; i++) {
			listaMercado.add(itens[i]);
		}
		
		
		System.out.println("Lista do mercado: ");
		for(String item : listaMercado) {
			System.out.println(item);
		}
	}
}