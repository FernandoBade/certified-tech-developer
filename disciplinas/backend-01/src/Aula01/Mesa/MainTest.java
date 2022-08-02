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