package Mesa;



import java.time.LocalDate;

public class AppHotel {


    public static void main(String[] args) {
        FacadeBuscas buscarPacote = new FacadeBuscas();

        Viagem pacote1 = new Viagem("S�o Paulo", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 2));
        Viagem pacote2 = new Viagem("Florian�polis", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 2));

        System.out.println(buscarPacote.buscarPacote(pacote1));
        System.out.println(buscarPacote.buscarPacote(pacote2));

    }
}
