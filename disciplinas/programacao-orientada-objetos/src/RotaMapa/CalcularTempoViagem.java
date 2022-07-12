package RotaMapa;

public interface CalcularTempoViagem {
    double ponto1 = 0;
    double ponto2 = 0;

    double calcularTempo(double ponto1, double ponto2, Object tipoTransporte);
}
