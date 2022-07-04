package CompositeTrain;

public class Triangulo extends Forma {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaTotal(double base, double altura) {
        return (base * altura) / 2;
    }


}
