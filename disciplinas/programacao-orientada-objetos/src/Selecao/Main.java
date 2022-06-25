package Selecao;

import java.util.*;

public class Main {
    public static void main(String[] args) throws EscalacaoException {
        Jogador jogador1 = new Jogador("Messi", 11, "Atacante", Escalacao.TITULAR);
        Jogador jogador2 = new Jogador("Neymar", 8, "Meio campista", Escalacao.TITULAR);
        Jogador jogador3 = new Jogador("Suarez", 9, "Meio campista", Escalacao.TITULAR);
        Jogador jogador4 = new Jogador("Coutinho", 7, "Defensor", Escalacao.TITULAR);
        Jogador jogador5 = new Jogador("Marcelo", 6, "Defensor", Escalacao.TITULAR);
        Jogador jogador6 = new Jogador("Pirlo", 5, "Atacante", Escalacao.TITULAR);
        Jogador jogador7 = new Jogador("Rafinha", 4, "Atacante", Escalacao.TITULAR);
        Jogador jogador8 = new Jogador("Paco", 3, "Meio campista", Escalacao.TITULAR);
        Jogador jogador9 = new Jogador("Pirlo", 2, "Defensor", Escalacao.TITULAR);
        Jogador jogador10 = new Jogador("Rafinha", 1, "Goleiro", Escalacao.TITULAR);
        Jogador jogador11 = new Jogador("Paco", 10, "Atacante", Escalacao.TITULAR);
        Jogador jogador12 = new Jogador("Paco", 22, "Meio campista", Escalacao.SUPLENTE);
        Jogador jogador13 = new Jogador("Pirlo", 13, "Defensor", Escalacao.SUPLENTE);
        Jogador jogador14 = new Jogador("Rafinha", 8, "Meio campista", Escalacao.SUPLENTE);
        Jogador jogador15 = new Jogador("Paco", 71, "Defensor", Escalacao.SUPLENTE);
        Jogador jogador16 = new Jogador("Marcos", 62, "Meio campista", Escalacao.SUPLENTE);
        Jogador jogador17 = new Jogador("Allejo", 15, "Atacante", Escalacao.SUPLENTE);
        Jogador jogador18 = new Jogador("Sandro", 42, "Defensor", Escalacao.SUPLENTE);
        Jogador jogador19 = new Jogador("Arce", 53, "Meio campista", Escalacao.RESERVA);
        Jogador jogador20 = new Jogador("Ferreira", 22, "Meio campista", Escalacao.RESERVA);
        Jogador jogador21 = new Jogador("Marco", 17, "Atacante", Escalacao.RESERVA);
        Jogador jogador22 = new Jogador("Robson", 19, "Meio campista", Escalacao.RESERVA);
        Jogador jogador23 = new Jogador("Anderson", 91, "Goleiro", Escalacao.RESERVA);


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

//        System.out.println(selecao.quantidadeDeReservas());
        selecao.ordenaJogadoresPorNumeroDaCamisa();
        System.out.println(selecao);


    }

}
