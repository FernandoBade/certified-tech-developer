package CompositeTrain;

import java.util.List;

// Um vagão com um retângulo de 5 x 4 e três círculos de raio 1 e calcular a superfície total.
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
