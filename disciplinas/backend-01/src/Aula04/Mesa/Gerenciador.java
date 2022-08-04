package Aula04.Mesa;

public abstract class Gerenciador {

    protected Gerenciador gerenciadorSeguinte;

    public Gerenciador setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
        return this;
    }

    public Gerenciador getGerenciadorSeguinte() {
        return gerenciadorSeguinte;
    }

    public abstract void verificar(Produto produto);
}