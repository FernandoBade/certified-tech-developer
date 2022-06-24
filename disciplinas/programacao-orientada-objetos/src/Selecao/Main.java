package Selecao;

import java.util.*;

public class Main {
    public static void main(String[] args) throws PosicaoException {
        Jogador jogador1 = new Jogador("Fernando", 1, Posicoes.GOLEIRO);
        Jogador jogador2 = new Jogador("João", 2, Posicoes.DEFENSOR);
        Jogador jogador3 = new Jogador("Maria", 3, Posicoes.DEFENSOR);
        Jogador jogador4 = new Jogador("Pedro", 4, Posicoes.DEFENSOR);
        Jogador jogador5 = new Jogador("José", 5, Posicoes.MEIO_CAMPISTA);
        Jogador jogador6 = new Jogador("Mauro", 6, Posicoes.MEIO_CAMPISTA);
        Jogador jogador7 = new Jogador("Pedro", 7, Posicoes.MEIO_CAMPISTA);
        Jogador jogador8 = new Jogador("Thiago", 8, Posicoes.MEIO_CAMPISTA);
        Jogador jogador9 = new Jogador("Robson", 9, Posicoes.ATACANTE);
        Jogador jogador10 = new Jogador("João", 10, Posicoes.ATACANTE);
        Jogador jogador11 = new Jogador("Adilson", 11, Posicoes.ATACANTE);
        Jogador jogador12 = new Jogador("Cleyton", 12, Posicoes.GOLEIRO);
        Jogador jogador13 = new Jogador("Allejo", 13, Posicoes.DEFENSOR);
        Jogador jogador14 = new Jogador("Ferreira", 14, Posicoes.DEFENSOR);
        Jogador jogador15 = new Jogador("Rafael", 15, Posicoes.MEIO_CAMPISTA);
        Jogador jogador16 = new Jogador("Pepe", 16, Posicoes.MEIO_CAMPISTA);
        Jogador jogador17 = new Jogador("Taffarel", 17, Posicoes.GOLEIRO);
        Jogador jogador18 = new Jogador("Dionísio", 18, Posicoes.DEFENSOR);
        Jogador jogador19 = new Jogador("Ulisses", 19, Posicoes.MEIO_CAMPISTA);
        Jogador jogador20 = new Jogador("Maurici", 20, Posicoes.ATACANTE);
        Jogador jogador21 = new Jogador("Adamastor", 21, Posicoes.ATACANTE);
        Jogador jogador22 = new Jogador("Luciano", 22, Posicoes.GOLEIRO);
        Jogador jogador23 = new Jogador("Gabriel", 23, Posicoes.ATACANTE);

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);
        jogadores.add(jogador4);
        jogadores.add(jogador5);
        jogadores.add(jogador6);
        jogadores.add(jogador7);
        jogadores.add(jogador8);
        jogadores.add(jogador9);
        jogadores.add(jogador10);
        jogadores.add(jogador11);
        jogadores.add(jogador12);
        jogadores.add(jogador13);
        jogadores.add(jogador14);
        jogadores.add(jogador15);
        jogadores.add(jogador16);
        jogadores.add(jogador17);
        jogadores.add(jogador18);
        jogadores.add(jogador19);
        jogadores.add(jogador20);
        jogadores.add(jogador21);
        jogadores.add(jogador22);
        jogadores.add(jogador23);

        Selecao selecao = new Selecao("Brasil", jogadores);
        int totalDeGoleiros = selecao.quantidadeJogadoresPorPosicao(Posicoes.GOLEIRO);
        int totalDeDefensores = selecao.quantidadeJogadoresPorPosicao(Posicoes.DEFENSOR);
        int totalDeMeioCampistas = selecao.quantidadeJogadoresPorPosicao(Posicoes.MEIO_CAMPISTA);
        int totalDeAtacantes = selecao.quantidadeJogadoresPorPosicao(Posicoes.ATACANTE);
        int totalDeGandulas = selecao.quantidadeJogadoresPorPosicao(Posicoes.GANDULA);
//        System.out.println(selecao.quantidadeDeReservas());
        System.out.println("Total de goleiros: " + totalDeGoleiros);
        System.out.println("Total de defensores: " + totalDeDefensores);
        System.out.println("Total de meio campistas: " + totalDeMeioCampistas);
        System.out.println("Total de atacantes: " + totalDeAtacantes);
//        System.out.println(selecao);


    }

}
