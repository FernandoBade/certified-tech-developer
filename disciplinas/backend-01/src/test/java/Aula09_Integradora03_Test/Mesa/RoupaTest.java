package Aula09_Integradora03_Test.Mesa;

import Aula09_Integradora03.Mesa.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoupaTest {

    @Test
    void testeInsereRoupas(){
        Roupa roupa1 = FlyweightFactory.inserirRoupa("M", "calça", true, true);
        Roupa roupa2 = FlyweightFactory.inserirRoupa("M", "calça", true, true);
        Roupa roupa3 = FlyweightFactory.inserirRoupa("M", "calça", true, false);
        Roupa roupa4 = FlyweightFactory.inserirRoupa("P", "calça", true, true);

        Roupa roupa5 = FlyweightFactory.inserirRoupa("G", "camiseta", false, true);

        Roupa roupa6 = FlyweightFactory.inserirRoupa("M", "camisa", true, false);
        Roupa roupa7 = FlyweightFactory.inserirRoupa("M", "camisa", true, true);

        System.out.println(roupa1.toString());
        System.out.println(roupa2.toString());
        System.out.println(roupa3.toString());
        System.out.println(roupa4.toString());
        System.out.println(roupa5.toString());
        System.out.println(roupa6.toString());
        System.out.println(roupa7.toString());

        assertEquals(FlyweightFactory.tamanhos.size(), 3);
        assertEquals(FlyweightFactory.tipoMap.size(), 3);
        assertEquals(FlyweightFactory.ehNovoMap.size(), 2);
        assertEquals(FlyweightFactory.ehImportadaMap.size(), 2);
    }
}
