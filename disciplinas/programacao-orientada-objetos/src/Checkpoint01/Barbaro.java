package Checkpoint01;

import java.util.ArrayList;
import java.util.List;

public class Barbaro extends Personagem {

    List<String> listaDeHabilidades = new ArrayList<>();

    public Barbaro(String nome,
                   String classe,
                   String raca,
                   String sexo,
                   String descricao,
                   Integer forca,
                   Integer destreza,
                   Integer constituicao,
                   Integer inteligencia,
                   Integer sabedoria,
                   Integer carisma) {
        super(nome, classe, raca, sexo, descricao, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        this.forca = forca + 2;
        this.constituicao = constituicao + 2;
        this.inteligencia = inteligencia - 2;
        this.carisma = carisma - 2;
    }

    //Método para tentar se curar com 25% de chance de sucesso
    public Boolean tentarSeCurar() {
        return Math.random() < 0.25;
    }

    //Método para aprender uma nova habilidade com uma chance de 75% de sucesso
    public String aprenderHabilidade(String habilidade) {
        if (Math.random() < 0.75) {
            listaDeHabilidades.add(habilidade);
            return getNome() + " aprendeu a habilidade " + habilidade;
        } else {
            return getNome() + " não conseguiu aprender " + habilidade;
        }
    }

    //Método para usar uma habilidade, caso já a tenha aprendido
    public String usarHabilidade(String habilidade) {
        return listaDeHabilidades.contains(habilidade) ? getNome() + " usou a habilidade " + habilidade : getNome() + " não sabe a habilidade " + habilidade;
    }


    //Impressão da ficha do personagem
    @Override
    public String toString() {
        return "" + "\n" +
                "Ficha completa do personagem: " + "\n" +
                "--------------------------------" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Classe: " + getClasse() + "\n" +
                "Raça: " + getRaca() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Nível: " + getNivel() + "\n" +
                "Experiência: " + getExperiencia() + "\n" +
                "História: " + getHistoria() + "\n" +
                "--------------------------------" + "\n" +
                "Força: " + this.forca + "\n" +
                "Destreza: " + this.destreza + "\n" +
                "Constituição: " + this.constituicao + "\n" +
                "Inteligência: " + this.inteligencia + "\n" +
                "Sabedoria: " + this.sabedoria + "\n" +
                "Carisma: " + this.carisma + "\n" +
                "--------------------------------" + "\n" +
                "Lista de habilidades: " + this.listaDeHabilidades + "\n";
    }
}

