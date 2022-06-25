package Selecao;

import java.util.*;

public class Selecao {
    private final String nome;
    private List<Jogador> jogadores;

    public Selecao(String nome, List<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Selecao(List<Jogador> jogadores) {
        this.jogadores = jogadores;
        this.nome = "Nome não definido";
    }

    public String getNome() {
        return nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionaJogadores(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removeJogadores(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public void ordenaJogadores() {
        jogadores.iterator().forEachRemaining(jogador -> {
            jogadores.remove(jogador);
            jogadores.add(jogador);
        });
    }

    public int quantidadeJogadoresPorPosicao(Enum posicao) throws EscalacaoException {
        try {


            int quantidade = 0;
            for (Jogador jogador : jogadores) {
                if (jogador.getPosicao() == posicao) {
                    quantidade++;
                }
            }
            return quantidade;
        } catch (Exception e) {
            throw new EscalacaoException("Posição inválida");
        }
    }


    public int quantidadeDeReservas() {
        int reservas = 0;
        if (jogadores.size() > 5) {
            jogadores = jogadores.subList(jogadores.size() - 5, jogadores.size());
        }
        return jogadores.size();
    }

    public String toString() {
        return "Nome da selecao: " + nome + System.lineSeparator()
                + "Lista de jogadores: " + jogadores + System.lineSeparator();
    }

    public void ordenaJogadoresPorNumeroDaCamisa() {
        jogadores.sort(Comparator.comparingInt(Jogador::getNumeroDaCamisa));
    }

    public void ordenarJogadoresPorEscalacao() {
        jogadores.sort(Comparator.comparing(Jogador::getPosicao));
    }

}
