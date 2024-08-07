package Xadrez;

public class Tabuleiro {
	 private Peca[][] tabuleiro;

	    public Tabuleiro() {
	        tabuleiro = new Peca[8][8];
	    }

	    public void adicionarPeca(Peca peca, int x, int y) {
	        if (validarCoordenadas(x, y)) {
	            tabuleiro[x][y] = peca;
	        }
	    }

	    public boolean moverPeca(int x, int y, int novoX, int novoY) {
	        if (validarCoordenadas(x, y) && validarCoordenadas(novoX, novoY)) {
	            Peca peca = tabuleiro[x][y];
	            if (peca != null && peca.mover(novoX, novoY)) {
	                tabuleiro[novoX][novoY] = peca;
	                tabuleiro[x][y] = null;
	                return true;
	            }
	        }
	        return false;
	    }

	    private boolean validarCoordenadas(int x, int y) {
	        return x >= 0 && x < 8 && y >= 0 && y < 8;
	    }

	    public void imprimirTabuleiro() {
	        for (int y = 7; y >= 0; y--) {
	            for (int x = 0; x < 8; x++) {
	                if (tabuleiro[x][y] == null) {
	                    System.out.print("° ");
	                } else {
	                    System.out.print(tabuleiro[x][y].getClass().getSimpleName().charAt(0) + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
