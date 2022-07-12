package RotaMapa;

import java.util.List;

public class CriarMapa{
    public List<Ponto> pontos;

    public CriarMapa(List<Ponto> pontos){
        this.pontos = pontos;
    }

    public void addPontos(Ponto ponto){
        this.pontos.add(ponto);
    }

}
