public class Cliente {
    private Integer numeroCliente;
    private String nome;
    private Double divida = 0.0;

    public Cliente(Integer numeroCliente, String nome, Double divida) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = divida;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDivida(Double divida) {
        this.divida = divida;
    }

    public Double getDivida() {
        return divida;
    }

    public void aumentarDivida(Double valor) {
        setDivida(this.divida + valor);
    }

    public void pagarDivida(Double valor) {
        if (this.divida <= 0) {
            System.out.println("Sua d�vida j� foi paga!");
            return;
        }
        if (valor > this.divida) {
            System.out.println("Valor maior que a d�vida! A d�vida atual � de R$" + this.divida + " reais.");
            return;
        }

        setDivida(this.divida - valor);

    }
}
