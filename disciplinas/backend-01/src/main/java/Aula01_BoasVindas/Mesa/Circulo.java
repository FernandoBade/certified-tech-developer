package Aula01_BoasVindas.Mesa;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
