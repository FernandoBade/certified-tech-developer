package JogoDeNaves;

public class Objeto {
    private int posicaoX;
    private int posicaoY;
    private char direcao;

    public Objeto(int posicaoX, int posicaoY, char direcao) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.direcao = direcao;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public char getDirecao() {
        return direcao;
    }

    public char setDirecao(char direcao) {
        this.direcao = direcao;
        return direcao;
    }

    public void mover(char direcao) {
        switch (direcao) {
            case 'n' -> this.posicaoY++;
            case 's' -> this.posicaoY--;
            case 'l' -> this.posicaoX++;
            case 'o' -> this.posicaoX--;
        }
    }

    @Override
    public String toString() {
        return "Objeto{" + "posicaoX=" + posicaoX + ", posicaoY=" + posicaoY + ", direcao=" + direcao + '}';
    }

}

