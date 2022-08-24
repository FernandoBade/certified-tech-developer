import org.testng.annotations.Test;

public class FuncionarioTest {

    @Test
    void calculos(){
        Funcionario funcionario1 = new Efetivo("João", "Silva", "12345", 2500, 125, 350);
        funcionario1.pagamentoSalario();
        Funcionario funcionario2 = new Contratado("Maria", "Santos", "54321", 75, 160);
        funcionario2.pagamentoSalario();
    }
}
