//Desafio 2
//        Faça um programa que permita jogar o jogo "Pedra-Papel-Tesoura". Primeiro, o
//        aplicativo solicita o nome de cada jogador e, em seguida, qual a opção esse jogador
//        escolhe para jogar: pedra, papel ou tesoura. O jogo consiste em perguntar qual
//        opção cada um escolhe e somar pontos ao vencedor (se houver). Defina e use
//        uma função chamada whichWin ou quemGanha com dois parâmetros com as
//        jogadas de cada um dos jogadores, que retorna 0 em caso de empate, 1 se o
//        primeiro vencer, 2 se o segundo vencer. O jogo termina quando o primeiro escolhe
//        "*" como indicador de fim.

import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        int ptsJogador1 = 0;
        int ptsJogador2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        boolean jogando = true;

        while (jogando) {
            System.out.println(nomeJogador1 + ", escolha uma opção: " + System.lineSeparator()
                    + "1 - Pedra;" + System.lineSeparator()
                    + "2 - Papel;" + System.lineSeparator()
                    + "3 - Tesoura;" + System.lineSeparator()
                    + "* - Sair.");
            String opcaoJogador1 = scanner.nextLine();
            System.out.println(nomeJogador2 + ", escolha uma opção: " + System.lineSeparator()
                    + "1 - Pedra;" + System.lineSeparator()
                    + "2 - Papel;" + System.lineSeparator()
                    + "3 - Tesoura;" + System.lineSeparator()
                    + "* - Sair.");
            String opcaoJogador2 = scanner.nextLine();

            if (opcaoJogador1.equals("*") || opcaoJogador2.equals("*")) {
                jogando = false;
            }

            switch (opcaoJogador1) {
                case "1":
                    if (opcaoJogador1.equals(opcaoJogador2)) {
                        System.out.println("É um empate! Ninguém pontuou" + System.lineSeparator() + "-------------------------------");
                    } else if (opcaoJogador2.equals("2")) {
                        System.out.println(nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else if (opcaoJogador2.equals("3")) {
                        System.out.println(nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }
                    break;
                case "2":
                    if (opcaoJogador1.equals(opcaoJogador2)) {
                        System.out.println("É um empate! Ninguém pontuou" + System.lineSeparator() + "-------------------------------");
                    } else if (opcaoJogador2.equals("1")) {
                        System.out.println(nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else if (opcaoJogador2.equals("3")) {
                        System.out.println(nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }
                    break;
                case "3":
                    if (opcaoJogador1.equals(opcaoJogador2)) {
                        System.out.println("É um empate! Ninguém pontuou" + System.lineSeparator() + "-------------------------------");
                    } else if (opcaoJogador2.equals("1")) {
                        System.out.println(nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else if (opcaoJogador2.equals("2")) {
                        System.out.println(nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }
                    break;
                case "*":
                    System.out.println("O jogo acabou!" + System.lineSeparator() + "-------------------------------");
                    System.out.println(nomeJogador1 + ": " + ptsJogador1 + " pontos");
                    System.out.println(nomeJogador2 + ": " + ptsJogador2 + " pontos");
                    System.out.println("-------------------------------");
                    jogando = false;
                    break;
            }
        }
    }
}





