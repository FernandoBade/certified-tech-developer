package JogoDeNaves;

public class Nave extends Objeto {
    private Double velocidade;
    private Integer vida;

    public Nave(int posicaoX, int posicaoY, char direcao, Double velocidade, Integer vida) {
        super(posicaoX, posicaoY, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public char girar(char direcao) {
        return setDirecao(direcao);
    }

    public int restaVida() {
        return vida;
    }

}
