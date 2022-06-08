package MetodosAbstratos;

public class Cavalo extends Animal {
    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchando");
    }

    public void correr() {
        System.out.println("Correndo");
    }
}

