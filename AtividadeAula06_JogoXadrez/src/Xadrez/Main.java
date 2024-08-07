package Xadrez;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
        Peca rei = new Rei(4, 0);
        Peca rainha = new Rainha(3, 0);
        Peca bispo = new Bispo(2, 0);
        Peca cavalo = new Cavalo(1, 0);
        Peca torre = new Torre(0, 0);
        Peca peao = new Peao(4, 1);

        System.out.println("Início do jogo:");
        tabuleiro.adicionarPeca(rei, 4, 0);
        tabuleiro.adicionarPeca(rainha, 3, 0);
        tabuleiro.adicionarPeca(bispo, 2, 0);
        tabuleiro.adicionarPeca(cavalo, 1, 0);
        tabuleiro.adicionarPeca(torre, 0, 0);
        tabuleiro.adicionarPeca(peao, 4, 1);

        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo peças:");
        tabuleiro.moverPeca(4, 0, 5, 1); 
        tabuleiro.moverPeca(3, 0, 7, 4);
        tabuleiro.moverPeca(2, 0, 4, 2); 
        tabuleiro.moverPeca(1, 0, 2, 2); 
        tabuleiro.moverPeca(0, 0, 0, 5);
        tabuleiro.moverPeca(4, 1, 4, 3);

        tabuleiro.imprimirTabuleiro();
    }


}
