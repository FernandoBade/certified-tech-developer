package Associados;

public class Associado {

    private String numeroAssociado;
    private String nome;
    private Double valorMensal;
    private String atividade;

    public Associado(String numeroAssociado, String nome, Double valorMensal, String atividade) {
        this.numeroAssociado = numeroAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public Double custoMensal() {
        return valorMensal;
    }

    public String toString() {
        return "Associado: " + System.lineSeparator()
                + "Número: " + numeroAssociado + System.lineSeparator()
                + "Nome: " + nome + System.lineSeparator()
                + "Valor mensal: " + valorMensal + System.lineSeparator()
                + "Atividade: " + atividade + System.lineSeparator();

    }
}
