package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventarioProdutos {
	public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    inventario.put(nomeAdicionar, quantidadeAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    inventario.remove(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do produto a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    Integer quantidade = inventario.get(nomeBuscar);
                    if (quantidade != null) {
                        System.out.println("Quantidade do produto \"" + nomeBuscar + "\": " + quantidade);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Inventário:");
                    for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                        System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
