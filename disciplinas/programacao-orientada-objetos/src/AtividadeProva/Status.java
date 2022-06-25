package AtividadeProva;

public enum Status {
    CALCULANDO("Projeto em fase de c�lculo"),
    CONSTRUCAO("Projeto em constru��o"),
    ACABADO("Projeto conclu�do");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Status de projeto: " + descricao;
    }
}
