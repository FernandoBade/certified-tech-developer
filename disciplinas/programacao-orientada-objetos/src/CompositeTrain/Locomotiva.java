package CompositeTrain;

import java.util.List;

//Uma locomotiva com um retângulo de 6 x 4, dois círculos de raio 1, um triângulo de 2 x 2 e calcular a superfície total da locomotiva
public class Locomotiva {

    public List<FormaGeometrica> formas;

    public Locomotiva() {
        this.formas = new java.util.ArrayList<FormaGeometrica>();
    }

    public double calcularAreaLocomotiva(List<FormaGeometrica> formas) {
        this.formas = formas;
        double area = 0;
        for (FormaGeometrica forma : formas) {
            area += forma.calcularArea();
        }
        return area;
    }

}

