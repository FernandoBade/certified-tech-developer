package Checkpoint01;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    public String nome;
    public String whatsapp;
    public List<Personagem> personagens;

    public Jogador(String nome, String whatsapp, List<Personagem> personagens) {
        this.nome = nome;
        this.whatsapp = whatsapp;
        this.personagens = personagens;
    }

    public Jogador(String nome, String whatsapp) {
        this.nome = nome;
        this.whatsapp = whatsapp;
        this.personagens = new ArrayList<>();
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.personagens = new ArrayList<>();
    }

    //Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    //Adiciona personagens criados para determinado jogador
    public void adicionarPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    //Remove personagens criados para determinado jogador
    public void removePersonagem(Personagem personagem) {
        this.personagens.remove(personagem);
    }

    @Override
    public String toString() {
        return "" + "\n" +
                "Jogador(a): " + "\n" +
                "--------------------------------" + "\n" +
                "Nome: " +  nome + "\n" +
                "Whatsapp: " + whatsapp + "\n" +
                "Personagens: " + personagens + "\n" +
                "" + "\n";
    }

}
