package MuseuNacional;

import java.util.ArrayList;
import java.util.List;

public class Leilao implements Lances {
    private double valor;
    private String descricao;
    List<Licitante> licitantes = new ArrayList<>();

    public Leilao(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarLicitante(Licitante licitante) {
        this.licitantes.add(licitante);
    }

    public void removerLicitante(Licitante licitante) {
        this.licitantes.remove(licitante);
    }

    @Override
    public void aumentarLances(double valor) {
        this.valor += valor;
    }

    public String notificarLicitantes() {
        for (Licitante licitante : this.licitantes) {
            licitante.update(this);
            aumentarLances(100);
        }
        return "Leilão finalizado";
    }
}
