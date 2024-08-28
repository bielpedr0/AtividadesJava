package Ex06_Iterable;


import java.util.Iterator;
import java.util.ArrayList;

public class ColecaoPersonalizada implements Iterable<String> {
    private ArrayList<String> elementos = new ArrayList<>();

    public void adicionar(String elemento) {
        elementos.add(elemento);
    }

    @Override
    public Iterator<String> iterator() {
        return elementos.iterator();
    }

    public static void main(String[] args) {
        ColecaoPersonalizada colecao = new ColecaoPersonalizada();
        colecao.adicionar("Elemento1");
        colecao.adicionar("Elemento2");
        colecao.adicionar("Elemento3");

        for (String elemento : colecao) {
            System.out.println(elemento);
        }
    }
}

