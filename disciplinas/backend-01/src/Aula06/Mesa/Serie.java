package Aula06.Mesa;

import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.toLowerCase;

public class Serie implements ISerie {

    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getSerie(String nome) {
        return "www.dhflix.com/" + nome.toLowerCase().replaceAll("[^a-z]", "") + "/watch";
    }
}


