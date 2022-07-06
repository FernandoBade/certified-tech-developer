package RedeSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa implements Publicador {
    public List<Observador> observadors;

    public Usuario(String nome, String sobrenome) {
        super(nome, sobrenome);
        observadors = new ArrayList<>();
    }

    @Override
    public void adicionar(Observador observador) {
        observadors.add(observador);
    }

    @Override
    public void remover(Observador observador) {
        observadors.remove(observador);
    }

    @Override
    public void notificar() {
        for (Observador observador : observadors) {
            observador.receberNotificacao(getNome());
        }
    }

    @Override
    public int numeroDeNotificacoes() {
        return observadors.size();

    }

    public void publicarFoto() {
        notificar();
    }
}
