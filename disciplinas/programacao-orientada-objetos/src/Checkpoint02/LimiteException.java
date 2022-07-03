package Checkpoint02;

public class LimiteException extends RuntimeException{
    public LimiteException(String limiteMuitoAlto) {
        super("O limite do cartão não pode ser maior do que 50% da renda mensal.");
    }

}
