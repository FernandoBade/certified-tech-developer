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

    //M�todo para refletir magias recebidas com 25% de chance de sucesso. Se o mago conhecer a magia, a chance de sucesso � de 50%
    public Boolean refletirMagiaRecebida(String magia) {
        return listaDeMagias.contains(magia) ? Math.random() < 0.5 : Math.random() < 0.25;
    }

    //O mago pode aprender magias com uma chance de 75% de sucesso
    public String aprenderMagia(String magia) {
        if (Math.random() < 0.75) {
            listaDeMagias.add(magia);
            return getNome() + " aprendeu a magia " + magia;
        } else {
            return getNome() + " n�o conseguiu aprender " + magia;
        }
    }

    //M�todo para usar uma magia, caso j� a tenha aprendido
    public String usarMagia(String magia) {
        return listaDeMagias.contains(magia) ? getNome() + " usou a magia " + magia : getNome() + " n�o sabe a magia " + magia;
    }

    //Impress�o da ficha do personagem
    @Override
    public String toString() {
        return "" + "\n" +
                "Ficha completa do personagem: " + "\n" +
                "--------------------------------" + "\n" +
                "Nome: " + getNome() + ":\n" +
                "Classe: " + getClasse() + "\n" +
                "Ra�a: " + getRaca() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "N�vel: " + getNivel() + "\n" +
                "Experi�ncia: " + getExperiencia() + "\n" +
                "Hist�ria: " + getHistoria() + "\n" +
                "--------------------------------" + "\n" +
                "For�a: " + this.forca + "\n" +
                "Destreza: " + this.destreza + "\n" +
                "Constitui��o: " + this.constituicao + "\n" +
                "Intelig�ncia: " + this.inteligencia + "\n" +
                "Sabedoria: " + this.sabedoria + "\n" +
                "Carisma: " + this.carisma + "\n" +
                "--------------------------------" + "\n" +
                "Lista de magias: " + this.listaDeMagias + "\n";
    }
}
