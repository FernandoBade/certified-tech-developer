package MuseuNacional;

public class Licitante {
    private String nome;
    private String sobrenome;
    private String identidade;
    private double valorMaximo;

    public Licitante(String nome, String sobrenome, String identidade, double valorMaximo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identidade = identidade;
        this.valorMaximo = valorMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public void update(Leilao leilao) {
        if (leilao.getValor() < this.valorMaximo) {
            System.out.println(this.nome + " " + this.sobrenome + " está dando um lance de " + leilao.getValor() + " para o leilão do item " + leilao.getDescricao());
        } else if (leilao.getValor() >= this.valorMaximo) {
            System.out.println(this.nome + " " + this.sobrenome + " saiu da disputa.");
        }

    }

}
