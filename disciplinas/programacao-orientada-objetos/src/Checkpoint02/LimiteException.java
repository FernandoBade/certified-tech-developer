package Checkpoint02;

public class LimiteException extends RuntimeException{
    public LimiteException(String limiteMuitoAlto) {
        super("O limite do cart�o n�o pode ser maior do que 50% da renda mensal.");
    }

}
