package Dentista;

public class Dentista {
    private int id;
    private String nome;
    private String sobrenome;
    private String matricula;

    public Dentista(int id, String nome, String sobrenome, String matricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String setMatricula(String matricula) {
        this.matricula = matricula;
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}