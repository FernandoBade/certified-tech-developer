package RedeSocial;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jorge", "Domingo");
        Observador juan = new Seguidor ("Juan", "Escobar");
        Observador pedro = new Seguidor("Pedro", "Silva");

        usuario.adicionar(juan);
        usuario.adicionar(pedro);
        usuario.publicarFoto();

        System.out.println("Quantidade de notificações: " + (usuario).numeroDeNotificacoes());
    }
}
