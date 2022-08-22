package Aula02_TemplateMethod_Test;

import Aula02_TemplateMethod.Contratado;
import Aula02_TemplateMethod.Efetivo;
import Aula02_TemplateMethod.Funcionario;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void calculos(){
        Funcionario funcionario1 = new Efetivo("João", "Silva", "12345", 2500, 125, 350);
        funcionario1.pagamentoSalario();
        Funcionario funcionario2 = new Contratado("Maria", "Santos", "54321", 75, 160);
        funcionario2.pagamentoSalario();
    }
}
