//Enunciado
//        Na empresa Colmeia existem três departamentos: gerencial, comercial e técnico. Ao receberem um e-mail (no domínio colmeia.com),
//        desejam que seja controlado de acordo com as regras de inteligência artificial da empresa e enviá-lo ao departamento correspondente.
//        Vamos simular esse controle, presumindo que:
//
//        Se algum dos seguintes critérios for atendido:                                                      Deve ser enviado para
//        --------------------------------------------------------------------------------------------------------------------------
//        Assunto (subject)                                       E-mail de destino                           Departamento
//        --------------------------------------------------------------------------------------------------------------------------
//        Gerência                                                gerencia@colmeia.com                        Gerencial
//        Comercial                                               comercial@colmeia.com                       Comercial
//        Técnico                                                 tecnica@colmeia.com                         Técnico
//        Qualquer outro                                         qualquer outro                               Marcado como SPAM
//
//
//        Para isso, iremos mostrar na tela onde o pedido é recebido em cada caso. O e-mail pertence a uma classe de Mail que possui três dados tipo string:
//        a origem, o destino e o assunto (ou assunto).
//        Você deseja fazer uma classe CheckMail que crie uma corrente de responsabilidades.
//        Esta classe funcionará verificando cada elemento (parte da corrente). Se o e-mail for para a Gerência, irá informá-lo,
//        caso contrário, continua com a próxima verificação, que testa se é para Técnico, e continuará até saber a quem corresponde.
//        Se não for de ninguém, será marcado como SPAM. Por fim, a partir de uma classe ProcessaMail, é criado um e-mail e o CheckMail
//        é solicitado a processá-lo e informar para onde deve ir.
//
//        Bons estudos!

package Aula04;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    CheckMail processo;

    @BeforeEach
    void setUpEmails() {
        processo = new CheckMail();

    }

    @Test
    void testarProcesso() {
        processo.verificar(new Mail("email@email.com", "tecnica@digitalhouse.com", "Reclamação"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com", "Gerencia"));
        processo.verificar(new Mail("email@email.com", "juan@pepelegal.com", "Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnica@colmeia.com", "tecnica"));
    }
}
