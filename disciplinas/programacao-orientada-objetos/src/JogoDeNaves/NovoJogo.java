package JogoDeNaves;

public class NovoJogo {
    public static void main(String[] args) {
        Objeto player = new Objeto(0, 0, 'n');

        Nave nave = new Nave(0, 0, 'n', 1.0, 10);

        Objeto asteroid = new Objeto(0, 0, 'n');

        System.out.println(player);
        System.out.println("---------------");
        System.out.println(nave);
        System.out.println("---------------");
        System.out.println(asteroid);
        System.out.println("---------------");

        player.mover('s');
        nave.girar('l');
        System.out.println(player);
        System.out.println(nave);

    }
}
