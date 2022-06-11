package Checkpoint01;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessaoDeJogo<Jogador> {
    public String nomeDaAventura;
    public String dificuldade;
    public Date dataEHora;
    public int horasEstimadas;
    public List<Jogador> jogadores;

    public SessaoDeJogo(String nomeDaAventura, String dificuldade, Date dataEHora, int horasEstimadas) {
        this.nomeDaAventura = nomeDaAventura;
        this.dificuldade = dificuldade;
        this.dataEHora = dataEHora;
        this.horasEstimadas = horasEstimadas;
        this.jogadores = new ArrayList<Jogador>();
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

    public Date getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(Date dataEHora) {
        this.dataEHora = dataEHora;
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

    public void adicionarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador){
        this.jogadores.remove(jogador);
    }

    public void imprimirListaDeJogadores(){
        for(Jogador jogador : this.jogadores){
            System.out.println(jogador.toString());
        }
    }
}
