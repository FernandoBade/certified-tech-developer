package Aula06.Mesa;

public class SerieProxy {

    private int qtdViews = 0;

    public SerieProxy() {}

    public String getSerie(Serie serie) {
        if(qtdViews < 5) {
            qtdViews++;
            return serie.getSerie(serie.getNome());
        } else {
            throw new SerieException("Excede o n�mero de reprodu��es permitidas");
        }
    }
}
