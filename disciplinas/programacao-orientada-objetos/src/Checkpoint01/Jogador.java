package Checkpoint01;

public class Jogador {
    public String nome;
    public String whatsapp;
    public List<Personagem> personagens;

    public Jogador(String nome, String whatsapp) {
        this.nome = nome;
        this.whatsapp = whatsapp;
        this.personagens = new ArrayList<Personagem>();
    }

    public String getNome() {
        return nome;
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

    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    public void removePersonagem(Personagem personagem) {
        this.personagens.remove(personagem);
    }


}
