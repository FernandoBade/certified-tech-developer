package Aula06_Integradora02_Test;

import Aula06_Integradora02.Mesa.Serie;
import Aula06_Integradora02.Mesa.SerieException;
import Aula06_Integradora02.Mesa.SerieProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {

    Serie s1, s2, s3, s4, s5, s6;

    @BeforeEach
    void setUp() {
        s1 = new Serie("Game of Thrones");
        s2 = new Serie("The Big Bang Theory");
        s3 = new Serie("The Flash");
        s4 = new Serie("The Walking Dead");
        s5 = new Serie("The Simpsons");
        s6 = new Serie("The Big Bang Theory");
    }

    @Test
    void testGetSerie() {
        SerieProxy seriesProxy = new SerieProxy();
        try {
            System.out.println(seriesProxy.getSerie(s1));
            System.out.println(seriesProxy.getSerie(s2));
            System.out.println(seriesProxy.getSerie(s3));
            System.out.println(seriesProxy.getSerie(s4));
            System.out.println(seriesProxy.getSerie(s5));
            System.out.println(seriesProxy.getSerie(s6));
        } catch (SerieException e) {
            System.out.println(e.getMessage());
        }
    }
}
