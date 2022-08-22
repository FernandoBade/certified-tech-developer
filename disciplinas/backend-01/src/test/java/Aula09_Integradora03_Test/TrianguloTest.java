package Aula09_Integradora03_Test;

import Aula09_Integradora03.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTest {

    @Test
    void getTrianguloComTamanho() {
        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(2);
        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo2.setTamanho(4);

        assertEquals(triangulo1.getCor(), "vermelho");
        assertEquals(triangulo2.getTamanho(), 4);

    }
}
