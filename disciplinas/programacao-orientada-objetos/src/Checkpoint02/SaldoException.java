package Checkpoint02;

public class SaldoException extends Exception {

    public SaldoException(String saldo_insuficiente) {
        super("Saldo insuficiente");
    }

}
