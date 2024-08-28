package Ex13_InterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaProdutos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Computador", 3000.0));
        produtos.add(new Produto("Celular", 1500.0));
        produtos.add(new Produto("Televisão", 1000.0));

 
        Collections.sort(produtos);
        System.out.println("Produtos ordenados por preço:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        Collections.sort(produtos, new NomeProdutoComparator());
        System.out.println("\nProdutos ordenados por nome:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}