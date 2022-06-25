package Selecao;

public class EscalacaoException extends Exception {
    public EscalacaoException(String message) {
        super(message);
    }

    public EscalacaoException(String message, Throwable cause) {
        Enum.valueOf(Escalacao.class, message);
    }
}
