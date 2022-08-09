package Aula04_ChainOfResponsability;

public abstract class Gerenciador {
    protected Gerenciador gerenciadorSeguinte;

    public Gerenciador getSeguinte() {
        return this.gerenciadorSeguinte;
    }

    public void setSeguinte(Gerenciador m) {
        this.gerenciadorSeguinte = m;
    }

    public abstract void verificar(Mail email);

}
