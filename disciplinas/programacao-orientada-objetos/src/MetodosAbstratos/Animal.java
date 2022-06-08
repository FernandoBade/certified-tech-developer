package MetodosAbstratos;

public abstract class Animal {
    private String nome;
    private Integer idade;

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal: " + "\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + idade + " anos" + "\n";

    }

}
