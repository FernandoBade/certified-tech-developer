package Aula01_BoasVindas.Mesa;

public class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}
