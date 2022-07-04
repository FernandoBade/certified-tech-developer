package CompositeTrain;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularAreaTotal(double raio) {
        return Math.PI * (raio * raio);
    }
}
