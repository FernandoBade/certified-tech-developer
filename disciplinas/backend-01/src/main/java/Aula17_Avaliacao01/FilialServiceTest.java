package Aula17_Avaliacao01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {
    FilialService filialService;

    @BeforeEach
    void doBefore(){
        filialService = new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void salvarFilial(){
        Filial f1 = new Filial("A&F - BH","R. Matuzinho",395,"BH", "MG", true);
        filialService.salvar(f1);
        assertTrue(f1.getId()!=null);

        Filial f2 = new Filial("A&F - FR","R. Belem",1200,"Franca", "SP", true);
        filialService.salvar(f2);
        assertTrue(f2.getId()!=null);
    }
}