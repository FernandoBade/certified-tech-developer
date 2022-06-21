package Paciente;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(
                "Juan",
                "Perez",
                "12345",
                LocalDate.of(2021, 5, 10)
        );

        paciente.darAlta(LocalDate.of(2021, 5, 9));


    }
}
