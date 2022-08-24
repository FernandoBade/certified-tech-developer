import Aula05_Proxy.Pessoa;
import Aula05_Proxy.ServicoVacinarProxy;
import Aula05_Proxy.Vacinar;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class VacinaTest {

    Date data = new Date();

    @Test
    public void testVacinarPessoa() {
        Pessoa p1 = new Pessoa("João", "Silva", "123456789", data, "CoronaVAC");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }

}
