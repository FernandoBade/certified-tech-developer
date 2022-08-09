package Aula02_TemplateMethod;

public class Contratado extends Funcionario {
    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularSaldo() {
        return valorHora * horas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("----------------------------------------");
        System.out.println("Recibo de pagamento");
        System.out.println("Nome: " + getNome() + " " + getSobrenome());
        System.out.println("Salário: R$" + valorHora);
        System.out.println("Horas: " + horas);
        System.out.println("Saldo: R$" + quantia);
        System.out.println("----------------------------------------");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("***");
        System.out.println("Depósito de R$" + quantia + " na conta " + getNumeroConta());
        System.out.println("***");
    }
}
