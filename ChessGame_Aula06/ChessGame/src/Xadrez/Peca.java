package Xadrez;

public abstract class Peca {
    protected int x, y;

    public Peca(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean mover(int novoX, int novoY);
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().charAt(0) + "(" + x + "," + y + ")";
    }
}

