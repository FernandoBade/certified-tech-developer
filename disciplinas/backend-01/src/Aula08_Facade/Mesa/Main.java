package Aula08_Facade.Mesa;


import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        FacadeBuscas buscarPacote = new FacadeBuscas();

        Viagem pacote1 = new Viagem("São Paulo", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 2));
        Viagem pacote2 = new Viagem("São Paulo", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 2));

        System.out.println(buscarPacote.buscarPacote(pacote1));
        System.out.println(buscarPacote.buscarPacote(pacote2));

    }
}
