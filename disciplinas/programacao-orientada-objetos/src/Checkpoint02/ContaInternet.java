package Checkpoint02;

import java.util.Scanner;

public class ContaInternet extends ContaCorrente {

    public ContaInternet(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal, double saldo, double investimento) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal, saldo, investimento);
    }

    public ContaInternet(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal);
    }

    public ContaInternet(String nomeCompleto, String cpf, String endereco, String profissao) {
        super(nomeCompleto, cpf, endereco, profissao);
    }

    public Conta criarContaInternet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite a profissão: ");
        String profissao = scanner.nextLine();
        System.out.println("Digite a renda mensal: ");
        double rendaMensal = scanner.nextDouble();
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o investimento: ");
        double investimento = scanner.nextDouble();
        return new ContaInternet(nomeCompleto, cpf, endereco, profissao, rendaMensal, saldo, investimento);
    }

}
