package Checkpoint02;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    private boolean possuiCartaoDeCredito = false;

    public ContaCorrente(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal);
    }

    public String pedirCartaoDeCredito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá " + getNomeCompleto().split(" (?!.* )")[0] + "!" + System.lineSeparator()
                + "Bem vindo(a) ao formulário de solicitação de cartão de crédito. Vamos começar! " + System.lineSeparator()
                + "-----------------------------------------------------" + System.lineSeparator()
                + "Comece digitando o nome completo do titular: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite seu o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite sua profissão: ");
        String profissao = scanner.nextLine();
        System.out.println("Digite sua renda mensal: ");
        double rendaMensal = scanner.nextDouble();
        System.out.println("Quanto você gostaria de limite no cartão de crédito?");
        double limite = scanner.nextDouble();
        boolean aprovado = limite <= rendaMensal / 2;

        if (aprovado) {
            System.out.println("Parabéns! Sua solicitação foi aprovada! Seu novo cartão de crédito com um limite de R$" + limite +  " chegará no seu endereço em até 10 dias úteis.");
            possuiCartaoDeCredito = true;
        } else {
            System.out.println("Infelizmente, não pudemos solicitar um novo cartão de crédito. Fale com seu gerente para uma nova tentativa");
        }
        return "Processo finalizado";
    }

}
