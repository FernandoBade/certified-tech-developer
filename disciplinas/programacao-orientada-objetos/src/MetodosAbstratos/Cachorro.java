package MetodosAbstratos;

public class Cachorro extends Animal {
    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void correr() {
        System.out.println("Correndo");
    }
}
