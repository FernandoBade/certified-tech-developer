package JogoDeNaves;

public class Asteroide extends Objeto{
    private int danos;

    public Asteroide(int posicaoX, int posicaoY, char direcao, int danos) {
        super(posicaoX, posicaoY, direcao);
        this.danos = danos;
    }

}
