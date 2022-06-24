package Selecao;

public class PosicaoException extends Exception {
    public PosicaoException(String message) {
        super(message);
    }

    public PosicaoException(String message, Throwable cause) {
        Enum.valueOf(Posicoes.class, message);
    }
}
