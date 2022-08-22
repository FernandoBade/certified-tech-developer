//Enunciado
//
//        Uma clínica odontológica precisa informatizar suas operações. Por isso, nos pedem um sistema para
//        gerenciamento de seus pacientes, onde possam cadastrá-los, buscá-los, excluí-los e modificá-los.\
//        Ao cadastrar um paciente, os seguintes dados serão solicitados:
//
//        - Nome
//        - Sobrenome
//        - RG
//        - Data de cadastro
//        - Endereço
//            - Rua
//            - Número
//            - Cidade
//            - Bairro
//
//        Além disso, adicionaremos um ID com auto-incremento para pacientes e endereços.
//        Utilize o H2 como banco de dados, aplicando o padrão DAO e testes com o JUnit.
//        Lembre que a modelagem dos dados deve ter no mínimo 2 classes, Paciente e Endereço.
//
//        Antes de iniciar os testes unitários, salve no banco de dados 2 ou mais pacientes com seus respectivos endereços.
//
//        Utilizando a camada de serviço:
//
//        - Adicione um paciente com endereço e pesquise no banco de dados pelo ID;
//        - Exclua o paciente criado anteriormente e procure-o;
//        - Pesquise e imprima no console todos os pacientes com seus endereços, serão listados todos os pacientes
//        que incluímos antes de realizar o primeiro teste.

package Aula18_Maven.Paciente;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

        PacienteService pacienteService;
        EnderecoService enderecoService;

        @BeforeEach
        void doBefore(){
            enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfiguracaoJDBC()));
            pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracaoJDBC()));
        }

        @Test
        public void mesaTeste(){
            Endereco endereco = new Endereco("Rua 1", 1, "Cidade 1", "Bairro 1");
            enderecoService.salvar(endereco);
            enderecoService.buscar(1);


            Paciente paciente = new Paciente("José", "Silva", "123456789", "01/01/2001", endereco.getId());
            pacienteService.cadastrar(paciente);
            assertTrue(paciente.getId()!=null);

            pacienteService.buscar(1);
            pacienteService.excluir(1);
            pacienteService.buscar(1);
        }

    }

