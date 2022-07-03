package Checkpoint02;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    private boolean possuiCartaoDeCredito = false;

    public ContaCorrente(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal);
    }

    public String pedirCartaoDeCredito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ol� " + getNomeCompleto().split(" (?!.* )")[0] + "!" + System.lineSeparator()
                + "Bem vindo(a) ao formul�rio de solicita��o de cart�o de cr�dito. Vamos come�ar! " + System.lineSeparator()
                + "-----------------------------------------------------" + System.lineSeparator()
                + "Comece digitando o nome completo do titular: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite seu o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu endere�o: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite sua profiss�o: ");
        String profissao = scanner.nextLine();
        System.out.println("Digite sua renda mensal: ");
        double rendaMensal = scanner.nextDouble();
        System.out.println("Quanto voc� gostaria de limite no cart�o de cr�dito?");
        double limite = scanner.nextDouble();
        boolean aprovado = limite <= rendaMensal / 2;

        if (aprovado) {
            System.out.println("Parab�ns! Sua solicita��o foi aprovada! Seu novo cart�o de cr�dito com um limite de R$" + limite +  " chegar� no seu endere�o em at� 10 dias �teis.");
            possuiCartaoDeCredito = true;
        } else {
            System.out.println("Infelizmente, n�o pudemos solicitar um novo cart�o de cr�dito. Fale com seu gerente para uma nova tentativa");
        }
        return "Processo finalizado";
    }

}
