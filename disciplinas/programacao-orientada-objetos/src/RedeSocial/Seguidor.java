package RedeSocial;

public class Seguidor extends Pessoa implements Observador {
    public int quantidadeNotificacoes = 0;
    public Seguidor(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.quantidadeNotificacoes = 0;
    }

    @Override
    public void receberNotificacao(String quemEnviou) {
        System.out.println(getNome() + " foi notificado da foto que " + quemEnviou + " enviou");
    }

    public int numeroDeNotificacoes() {
        return quantidadeNotificacoes;
    }
}
