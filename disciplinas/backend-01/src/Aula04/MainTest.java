//Enunciado
//        Na empresa Colmeia existem tr�s departamentos: gerencial, comercial e t�cnico. Ao receberem um e-mail (no dom�nio colmeia.com),
//        desejam que seja controlado de acordo com as regras de intelig�ncia artificial da empresa e envi�-lo ao departamento correspondente.
//        Vamos simular esse controle, presumindo que:
//
//        Se algum dos seguintes crit�rios for atendido:                                                      Deve ser enviado para
//        --------------------------------------------------------------------------------------------------------------------------
//        Assunto (subject)                                       E-mail de destino                           Departamento
//        --------------------------------------------------------------------------------------------------------------------------
//        Ger�ncia                                                gerencia@colmeia.com                        Gerencial
//        Comercial                                               comercial@colmeia.com                       Comercial
//        T�cnico                                                 tecnica@colmeia.com                         T�cnico
//        Qualquer outro                                         qualquer outro                               Marcado como SPAM
//
//
//        Para isso, iremos mostrar na tela onde o pedido � recebido em cada caso. O e-mail pertence a uma classe de Mail que possui tr�s dados tipo string:
//        a origem, o destino e o assunto (ou assunto).
//        Voc� deseja fazer uma classe CheckMail que crie uma corrente de responsabilidades.
//        Esta classe funcionar� verificando cada elemento (parte da corrente). Se o e-mail for para a Ger�ncia, ir� inform�-lo,
//        caso contr�rio, continua com a pr�xima verifica��o, que testa se � para T�cnico, e continuar� at� saber a quem corresponde.
//        Se n�o for de ningu�m, ser� marcado como SPAM. Por fim, a partir de uma classe ProcessaMail, � criado um e-mail e o CheckMail
//        � solicitado a process�-lo e informar para onde deve ir.
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
        processo.verificar(new Mail("email@email.com", "tecnica@digitalhouse.com", "Reclama��o"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com", "Gerencia"));
        processo.verificar(new Mail("email@email.com", "juan@pepelegal.com", "Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnica@colmeia.com", "tecnica"));
    }
}
