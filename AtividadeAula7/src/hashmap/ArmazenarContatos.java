package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArmazenarContatos {
    public static void main(String[] args) {
        Map<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Listar contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefoneAdicionar = scanner.nextLine();
                    contatos.put(nomeAdicionar, telefoneAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    String telefone = contatos.get(nomeBuscar);
                    if (telefone != null) {
                        System.out.println("Telefone do contato \"" + nomeBuscar + "\": " + telefone);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Contatos:");
                    for (Map.Entry<String, String> entry : contatos.entrySet()) {
                        System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

