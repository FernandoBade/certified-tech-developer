package Selecao;

public class Jogador {
    private final String sobrenome;
    private final int numeroDaCamisa;
    private Posicoes posicao;

    public Jogador(String sobrenome, int numeroDaCamisa, Posicoes posicao) {
        this.sobrenome = sobrenome;
        this.numeroDaCamisa = numeroDaCamisa;
        this.posicao = posicao;

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public Posicoes getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicoes posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Nome: " + sobrenome + "; Camisa: " + numeroDaCamisa + "; Posição: " + posicao + System.lineSeparator();
    }
}
