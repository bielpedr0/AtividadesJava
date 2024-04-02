package Ex06;

import java.util.Scanner;

public class Livro {
    private int paginaAtual;
    private int paginas;

    public Livro(int paginas) {
        this.paginas = paginas;
        this.paginaAtual = 1;
    }

    public void lerPagina() {
        Scanner ler = new Scanner(System.in); 
        
        while(paginaAtual != paginas) {
            System.out.println("\nPara finalizar a leitura, leia até a última página do livro."
                    + " O livro possui " + paginas + " páginas!");
            System.out.print("\nDigite a página que deseja ler: ");
            paginaAtual = ler.nextInt();
            try {
                if(paginaAtual > paginas || paginaAtual < 1) {
                    throw new Exception("\n Não foi possível fazer a leitura.\n"
                            + "O livro possui apenas " + paginas + " páginas!\n");
                }
                else {
                    System.out.println("\nPágina lida!\n");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("\nParabéns! Você concluiu o livro!");
        ler.close();
    }

}
