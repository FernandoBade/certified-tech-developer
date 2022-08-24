package Mesa;

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
        return "Link para assistir sua série: www.dhflix.com/" + nome.toLowerCase().replaceAll("[^a-z]", "") + "/watch";
    }
}


