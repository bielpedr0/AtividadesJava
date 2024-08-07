package Xadrez;

public class Peao extends Peca {
    
	public Peao(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == x && (novoY == y + 1 || (y == 1 && novoY == y + 2))) {
            y = novoY;
            return true;
        }
        return false;
    }

}
