package Paciente;

public class DateException extends Exception {
    public DateException() {
        super("A data da internacao nao pode ser posterior a data de hoje");
    }
}

