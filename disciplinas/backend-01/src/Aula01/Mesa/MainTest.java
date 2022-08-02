//Exerc�cio para as mesas de trabalho: Testes unit�rios JUnit
//
//        Crie uma classe Figura e duas subclasses de Figura. Uma deve ser chamada de c�rculo e a segunda de quadrado.
//        Para cada uma, criamos um m�todo calcularPerimetro e adicionamos as seguintes fun��es:
//        Para o c�rculo: 2? para o raio
//        Para o quadrado: 4 * lado
//
//        Aten��o!
//        Devemos criar um teste para os c�rculos e um teste para os quadrados.
//        Em seguida, confirme se as duas f�rmulas foram calculadas corretamente.

package Aula01.Mesa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static Figura c1, q1;

    @BeforeAll
    static void setUp() {
        c1 = new Circulo(10);
        q1 = new Quadrado(10);
    }

    @Test
    void calcularPerimetro() {
        System.out.println(c1.calcularPerimetro());
        System.out.println(q1.calcularPerimetro());
        double expected = q1.calcularPerimetro();
        assertEquals(40, q1.calcularPerimetro());
    }
}