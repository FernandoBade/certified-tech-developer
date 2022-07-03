package Checkpoint02;

public class Main {

    public static void main(String[] args) throws SaldoException {
        PeladoBank peladoBank = new PeladoBank();
        ContaCorrente contaCorrente = new ContaCorrente(
                "Joseph Climber",
                "123.456.789-00",
                "Rua dos Correios, 123",
                "Peso de Papel",
                3000.00);
        contaCorrente.depositar(1000.00);
        contaCorrente.sacar(250.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                "Maria Antonieta de Las Neves",
                "987.654.321-00",
                "Vila do Chaves, 72",
                "Aposentada"
                ,2500.00);

        ContaInvestimento contaInvestimento = new ContaInvestimento(
                "Billy Butcher",
                "654.321.987-00",
                "Vought Seven Tower, 7",
                "Investigador",
                10000.00);

        contaInvestimento.depositar(5000.00);
        contaInvestimento.sacar(1000.00);
        contaInvestimento.fazerInvestimento(3000);
        contaInvestimento.verificarRentabilidade();
        contaPoupanca.depositar(5000.00);

        peladoBank.adicionarConta(contaCorrente);
        peladoBank.adicionarConta(contaPoupanca);
        peladoBank.adicionarConta(contaInvestimento);
//        peladoBank.listarContasPorSaldo();
        contaCorrente.pedirCartaoDeCredito();
    }
}
