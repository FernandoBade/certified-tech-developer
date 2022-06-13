package Checkpoint01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SessaoDeJogo<Jogador> {
    public String nomeDaAventura;
    public String dificuldade;
    public Date data;
    public Integer horasEstimadas;
    public List<Jogador> jogadores;

    public SessaoDeJogo(String nomeDaAventura, String dificuldade, Date data, int horasEstimadas) {
        this.nomeDaAventura = nomeDaAventura;
        this.dificuldade = dificuldade;
        this.data = data;
        this.horasEstimadas = horasEstimadas;
        this.jogadores = new ArrayList<>();
    }

    public String getNomeDaAventura() {
        return nomeDaAventura;
    }

    public void setNomeDaAventura(String nomeDaAventura) {
        this.nomeDaAventura = nomeDaAventura;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        this.jogadores.remove(jogador);
    }

    @Override
    public String toString() {
        return "================================" + "\n" +
                "Nome da aventura: " + this.nomeDaAventura + "\n" +
                "Dificuldade: " + this.dificuldade + "\n" +
                "Data: " + this.data + "\n" +
                "Horas estimadas: " + this.horasEstimadas + "\n" +
                "--------------------------------" + "\n" +
                "Jogadores confirmados: " + this.jogadores.toString() + "\n" +
                "================================" + "\n";

    }

}
