package Checkpoint02;

public class Main {

        public static void main(String[] args) {
            Conta conta = new ContaCorrente("Joseph Climber", "123.456.789-00", "Rua dos Correios", "Peso De Papel", 3000.00);
            ContaInvestimento contaInvestimento = new ContaInvestimento("Maria Antonieta de Las Nieves", "987.654.321-00", "Casa n. 72", "Aposentada", 1000.00, 20000.00, 1000.00);
            ContaPoupanca contaPoupanca = new ContaPoupanca("João", "123.456.789-00", "Rua da casa", "Programador", 1000.00);
            conta.depositar(1000.00);
            contaInvestimento.depositar(1000.00);
            contaPoupanca.depositar(1000.00);
            conta.sacar(1000.00);
            contaInvestimento.sacar(1000.00);
            contaPoupanca.sacar(1000.00);

            conta.sacar(2000.00);

        }
}
