package Selecao;

public class Jogador {
    private final String sobrenome;
    private final int numeroDaCamisa;
    private String posicao;
    private Escalacao escalacao;

    public Jogador(String sobrenome, int numeroDaCamisa, String posicao, Escalacao escalacao) {
        this.sobrenome = sobrenome;
        this.numeroDaCamisa = numeroDaCamisa;
        this.posicao = posicao;
        this.escalacao = escalacao;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public Escalacao getPosicao() {
        return escalacao;
    }

    public void setEscalacao(Escalacao escalacao) {
        this.posicao = escalacao.toString();
    }

    @Override
    public String toString() {
        return "Nome: " + sobrenome + "; Camisa: " + numeroDaCamisa + "; Posição: " + posicao + System.lineSeparator();
    }
}
