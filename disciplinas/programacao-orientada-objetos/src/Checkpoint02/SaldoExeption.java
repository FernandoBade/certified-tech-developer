package Checkpoint02;

public class SaldoExeption extends Exception {

    public SaldoExeption(String saldo_insuficiente) {
        super("Saldo insuficiente");
    }

}
