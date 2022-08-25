package com.veiculo.veiculo.model;

public class Veiculo {

    public String nome;
    public String marca;
    public String logo;

    public Veiculo(String nome, String marca, String logo) {
        this.nome = nome;
        this.marca = marca;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}