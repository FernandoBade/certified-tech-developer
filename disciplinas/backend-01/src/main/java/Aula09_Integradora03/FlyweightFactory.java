//Desafio
//        Temos que administrar um criador de figuras Triângulo e um de figuras Quadrado. As figuras Triângulo
//        podemos diferenciar pela cor, enquanto as Quadradas, diferenciamos pelo tamanho.
//
//        Os atributos de ambos são:
//
//        - Cor (String)
//        - Tamanho (integer)
//
//        Pedimos que usem o padrão Flyweight para criar uma fábrica que gerencie a quantidade de triângulos a serem criados,
//        e uma para gerenciar a quantidade de quadrados criados.

//        Os triângulos devem ser diferidos uns dos outros pela cor. Por exemplo: triângulo vermelho de tamanho 2 e triângulo
//        vermelho de tamanho 1 devem armazenar em cache apenas 1 objeto.

//        Os quadrados devem ser diferidos uns dos outros pelo tamanho. Por exemplo: quadrado azul de tamanho 4 e quadrado verde
//        de tamanho 4 devem armazenar em cache apenas 1 objeto.

//        Após isso, usando o padrão Facade, queremos criar uma fachada que permita simplificar o acesso às fábricas.
//        Em seguida, deve-se gerar casos de teste conforme necessário para assegurar a qualidade das fábricas criadas.


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
