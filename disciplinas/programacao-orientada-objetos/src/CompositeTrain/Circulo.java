package CompositeTrain;

public class Circulo extends FormaGeometrica {
    private double raio;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * (raio * raio);
        return area;
    }
}

