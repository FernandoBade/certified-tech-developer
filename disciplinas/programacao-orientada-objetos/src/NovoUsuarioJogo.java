public class NovoUsuarioJogo {
    public static void main(String[] args) {
        UsuarioJogo usuarioJogo = new UsuarioJogo("Fernando", "F4GUDES", 0, 1);
        usuarioJogo.aumentarPontuacao(500);
        usuarioJogo.bonus(550);

        System.out.println("Nome: " + usuarioJogo.getNome());
        System.out.println("Nickname: " + usuarioJogo.getNickname());
        System.out.println("Pontua��o: " + usuarioJogo.getPontuacao());
        System.out.println("N�vel: " + usuarioJogo.getNivel());

        System.out.println("-------------------------------");

        UsuarioJogo usuarioJogo2 = new UsuarioJogo("Danil", "Dendi", 0, 1);
        usuarioJogo2.aumentarPontuacao(1620);
        usuarioJogo2.bonus(690);

        System.out.println("Nome: " + usuarioJogo2.getNome());
        System.out.println("Nickname: " + usuarioJogo2.getNickname());
        System.out.println("Pontua��o: " + usuarioJogo2.getPontuacao());
        System.out.println("N�vel: " + usuarioJogo2.getNivel());

    }
}
