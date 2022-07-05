package CompositeTrain;

import java.util.List;

// Um vag�o com um ret�ngulo de 5 x 4 e tr�s c�rculos de raio 1 e calcular a superf�cie total.
public class Vagao  {
    public List<FormaGeometrica> formas;
    public double criarVagao(List<FormaGeometrica> formas) {
        this.formas = formas;
        double area = 0;
        for (FormaGeometrica forma : formas) {
            area += forma.calcularArea();
        }
        return area;
    }

}
