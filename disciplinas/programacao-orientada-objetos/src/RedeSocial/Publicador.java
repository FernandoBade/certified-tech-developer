package RedeSocial;

public interface Publicador {
    void adicionar(Observador observador);

    void remover(Observador observador);

    void notificar();

    int numeroDeNotificacoes();
}
