package Checkpoint01;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem {

    List<String> listaDeMagias = new ArrayList<>();

    public Mago(
            String nome,
            String classe,
            String raca,
            String sexo,
            String descricao,
            Integer forca,
            Integer destreza,
            Integer constituicao,
            Integer inteligencia,
            Integer sabedoria,
            Integer carisma
    ) {
        super(nome, classe, raca, sexo, descricao, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        this.inteligencia = inteligencia + 2;
        this.sabedoria = sabedoria + 2;
        this.forca = forca - 2;
        this.constituicao = constituicao - 2;
    }

    //Método para refletir magias recebidas com 25% de chance de sucesso. Se o mago conhecer a magia, a chance de sucesso é de 50%
    public Boolean refletirMagiaRecebida(String magia) {
        return listaDeMagias.contains(magia) ? Math.random() < 0.5 : Math.random() < 0.25;
    }

    //O mago pode aprender magias com uma chance de 75% de sucesso
    public String aprenderMagia(String magia) {
        if (Math.random() < 0.75) {
            listaDeMagias.add(magia);
            return getNome() + " aprendeu a magia " + magia;
        } else {
            return getNome() + " não conseguiu aprender " + magia;
        }
    }

    //Método para usar uma magia, caso já a tenha aprendido
    public String usarMagia(String magia) {
        return listaDeMagias.contains(magia) ? getNome() + " usou a magia " + magia : getNome() + " não sabe a magia " + magia;
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
                "Lista de magias: " + this.listaDeMagias + "\n";
    }
}
