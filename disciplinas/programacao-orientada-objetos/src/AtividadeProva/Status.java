package AtividadeProva;

public enum Status {
    CALCULANDO("Projeto em fase de cálculo"),
    CONSTRUCAO("Projeto em construção"),
    ACABADO("Projeto concluído");

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
