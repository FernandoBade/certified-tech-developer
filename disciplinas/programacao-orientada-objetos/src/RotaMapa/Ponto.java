package RotaMapa;

import static java.lang.Math.abs;

public class Ponto {
    public double latitude;
    public double longitude;

    public Ponto(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String calcularDistancia (Ponto ponto2) {
        double distancia = 0;
        distancia = abs(this.latitude - ponto2.latitude) + abs(this.longitude - ponto2.longitude);
        return "A distância entre os pontos é de " + distancia + "km.";
    }

}
