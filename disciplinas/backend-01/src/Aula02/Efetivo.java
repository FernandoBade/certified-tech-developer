package Aula02;

public class Efetivo extends Funcionario {
    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Recibo de pagamento");
        System.out.println("Nome: " + getNome() + " " + getSobrenome());
        System.out.println("Salário: R$" + salarioBase);
        System.out.println("Bonificações: R$" + bonificacoes);
        System.out.println("Descontos: R$" + descontos);
        System.out.println("Saldo: R$" + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Depósito de R$" + quantia + " na conta " + getNumeroConta());
    }
}

