import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MedicamentoServiceTest {

    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore() {
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void guardarMedicamento() {
        Medicamento medicamento1 = new Medicamento("Paracetamol", "Laboratorio 1", 300, 10.0);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId() != null);
        System.out.println("ID do medicamento: " + medicamento1.getId());

        Medicamento medicamento2 = new Medicamento("Tylenol", "Laboratorio 2", 500, 15.0);
        medicamentoService.salvar(medicamento2);
        assertTrue(medicamento2.getId() != null);
        System.out.println("ID do medicamento: " + medicamento2.getId());
    }

    @Test
    public void buscarMedicamento() {
        Medicamento medicamento1 = new Medicamento("Paracetamol", "Laboratorio 1", 300, 10.0);
        medicamentoService.buscar(medicamento1.getId());
        assertEquals(medicamento1.getNome(), "Paracetamol");
        System.out.println("Nome do medicamento encontrado: " + medicamento1.getNome());

    }
}
