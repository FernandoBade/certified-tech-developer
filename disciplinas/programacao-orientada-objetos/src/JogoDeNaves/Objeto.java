package JogoDeNaves;

public class Player {
    private int posicaoX;
    private int posicaoY;
    private char direcao;

    public Player(int posicaoX, int posicaoY, char direcao) {
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

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public void mover(char direcao) {
        switch (direcao) {
            case 'n':
                this.posicaoY++;
                break;
            case 's':
                this.posicaoY--;
                break;
            case 'l':
                this.posicaoX++;
                break;
            case 'o':
                this.posicaoX--;
                break;
        }
    }

}

