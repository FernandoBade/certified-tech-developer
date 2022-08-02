package Aula02;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String numeroConta;

    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario() {
        double quantia = 0;
        quantia = calcularSaldo();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

}
