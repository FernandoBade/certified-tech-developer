package Checkpoint01;

import java.util.ArrayList;
import java.util.List;

public abstract class Ladrao extends Personagem {

    List<String> listaDeVenenos = new ArrayList<>();

    public Ladrao(String nome,
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
        this.destreza = destreza + 2;
        this.carisma = carisma + 2;
        this.constituicao = constituicao - 2;
        this.sabedoria = sabedoria - 2;
    }

    //Método para tentar destrancar uma fechadura ou tranca com 50% de chance de sucesso
    public Boolean destrancarFechadura() {
        return Math.random() < 0.5;
    }

    //Método para aprender um novo veneno com uma chance de 75% de sucesso
    public String aprenderVeneno(String veneno) {
        if (Math.random() < 0.75) {
            listaDeVenenos.add(veneno);
            return getNome() + " aprendeu o veneno " + veneno;
        } else {
            return getNome() + " não conseguiu aprender " + veneno;
        }
    }

    //Metodo para utilizar/aplicar um veneno, caso já tenha aprendido
    public String usarVeneno(String veneno) {
        return listaDeVenenos.contains(veneno) ? getNome() + " aplicou o veneno " + veneno : getNome() + " não sabe o veneno " + veneno;
    }

    //Impressão da ficha do personagem
    @Override
    public String toString() {
        return "" + "\n" +
                "Ficha completa do personagem: " + "\n" +
                "--------------------------------" + "\n" +
                "Nome: " + getNome() + ":\n" +
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
                "Lista de venenos: " + this.listaDeVenenos + "\n";
    }
}
