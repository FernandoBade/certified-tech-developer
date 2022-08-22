package com.aula17.main.Paciente;

import com.aula17.main.Dentista.Dentista;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void test() {
        Dentista dentista = new Dentista(1, "José", "da Silva", "111222333456");
        System.out.println(dentista.toString());
        dentista.setMatricula("9999999999");
        System.out.println(dentista.toString());
    }

}
