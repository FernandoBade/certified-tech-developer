package CompositeTrain;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica retangulo1 = new Retangulo(5,4);
        FormaGeometrica circulo1 = new Circulo(1);
        FormaGeometrica circulo2 = new Circulo(1);
        FormaGeometrica circulo3 = new Circulo(1);

        Vagao vagao1 = new Vagao();
        vagao1.formas.add(retangulo1);
        vagao1.formas.add(circulo1);
        vagao1.formas.add(circulo2);
        vagao1.formas.add(circulo3);
        System.out.println("O vagão tem a superfície total de " + Math.round(vagao1.calcularAreaVagao(vagao1.formas)) + " m²");

        FormaGeometrica retangulo2 = new Retangulo(6,4);
        FormaGeometrica circulo4 = new Circulo(1);
        FormaGeometrica circulo5 = new Circulo(1);
        FormaGeometrica triangulo1 = new Triangulo(2,2);
        Locomotiva locomotiva1 = new Locomotiva();
        locomotiva1.formas.add(retangulo2);
        locomotiva1.formas.add(circulo4);
        locomotiva1.formas.add(circulo5);
        locomotiva1.formas.add(triangulo1);

        System.out.println("A locomotiva tem a superfície total de " + Math.round(locomotiva1.calcularAreaLocomotiva(locomotiva1.formas)) + " m²");

    }
}
