package Aula18_Maven_Test;

import Aula18_Maven.Paciente.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PacienteDentistaTest {

    PacienteService pacienteService;
    EnderecoService enderecoService;

    @BeforeEach
    void doBefore() {
        enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfiguracaoJDBC()));
        pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void mesaTeste() {
        Endereco endereco = new Endereco("Rua 1", 1, "Cidade 1", "Bairro 1");
        enderecoService.salvar(endereco);
        enderecoService.buscar(1);

        Paciente paciente = new Paciente("José", "Silva", "123456789", "01/01/2001", endereco.getId());
        pacienteService.cadastrar(paciente);
        pacienteService.buscar(1);
        assertNotNull(paciente.getId());
        pacienteService.excluir(1);
        pacienteService.buscar(1);
    }

}

