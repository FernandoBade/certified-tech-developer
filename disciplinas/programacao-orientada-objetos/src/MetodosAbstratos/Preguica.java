package MetodosAbstratos;

public class Preguica extends Animal {
    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Bocejando");
    }

    public void subirEmArvores() {
        System.out.println("Subindo em árvores");
    }
}

