package Ex13_InterfaceComparable;
import java.util.Comparator;

public class NomeProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}