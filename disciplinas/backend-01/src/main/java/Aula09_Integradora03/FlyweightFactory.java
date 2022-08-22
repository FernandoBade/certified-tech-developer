//Desafio
//        Temos que administrar um criador de figuras Tri�ngulo e um de figuras Quadrado. As figuras Tri�ngulo
//        podemos diferenciar pela cor, enquanto as Quadradas, diferenciamos pelo tamanho.
//
//        Os atributos de ambos s�o:
//
//        - Cor (String)
//        - Tamanho (integer)
//
//        Pedimos que usem o padr�o Flyweight para criar uma f�brica que gerencie a quantidade de tri�ngulos a serem criados,
//        e uma para gerenciar a quantidade de quadrados criados.

//        Os tri�ngulos devem ser diferidos uns dos outros pela cor. Por exemplo: tri�ngulo vermelho de tamanho 2 e tri�ngulo
//        vermelho de tamanho 1 devem armazenar em cache apenas 1 objeto.

//        Os quadrados devem ser diferidos uns dos outros pelo tamanho. Por exemplo: quadrado azul de tamanho 4 e quadrado verde
//        de tamanho 4 devem armazenar em cache apenas 1 objeto.

//        Ap�s isso, usando o padr�o Facade, queremos criar uma fachada que permita simplificar o acesso �s f�bricas.
//        Em seguida, deve-se gerar casos de teste conforme necess�rio para assegurar a qualidade das f�bricas criadas.


        package Aula09_Integradora03;

import java.util.HashMap;


public class FlyweightFactory {
    static HashMap<String, Triangulo> trianguloMap = new HashMap<>();

    public static Triangulo obterTriangulo(String cor) {
        Triangulo triangulo = trianguloMap.get(cor);

        if (triangulo == null) {
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor, triangulo);
        }
        return triangulo;
    }
}
