//Enunciado
//        Em uma empresa, voc� deseja controlar a qualidade de um produto. Desta forma, s�o considerados tr�s controles diferentes
//        e em cada um � verificado se o produto est� de acordo com os padr�es de qualidade. De acordo com os controles:
//
//        Lote: deve estar entre 1000 e 2000.
//        Peso: deve estar entre 1200 e 1300.
//        Embalagem: deve ser igual a ?saud�vel? ou ?quase saud�vel?.
//
//        Se n�o atender a nenhum dos crit�rios, deve ser informado que foi rejeitado ou, se atender a todos os requisitos,deve ser relatado que foi aceito.
//        O artigo pertence a uma classe de artigo que possui quatro informa��es:
//        Nome: String.
//        Lote: int.
//        Peso: int.
//        Embalagem: String (?saud�vel?, ?quase saud�vel?, etc.).
//
//        Deseja-se que uma classe CheckQuality envie o artigo para cada um dos controles. Primeiro, � o lote: se estiver correto,
//        ir� para o controle de peso. Se n�o estiver correto, ele informa que o lote est� errado. A sequ�ncia de cada controle continua at� que
//        ao passar em todos os controles, ele deve informar que est� correto.
//
//        Finalmente, deve ser feita uma classe que crie um artigo e, em seguida, pe�a a CheckQuality para verific�-lo.


package Aula04_ChainOfResponsability_Test.Mesa;


import Aula04_ChainOfResponsability.Mesa.*;
import org.junit.jupiter.api.Test;

class CheckQualityTest {

    Gerenciador gerenciador = new GerenciadorLote().setGerenciadorSeguinte(new GerenciadorPeso().setGerenciadorSeguinte(new GerenciadorEmbalagem()));

    @Test
    void TestaProduto(){
        Produto p1 = new Produto("Produto 1", 1200, 1250, "Saud�vel");
        Produto p2 = new Produto("Produto 2", 250, 1250, "Saud�vel");
        Produto p3 = new Produto("Produto 3", 1200, 1400, "Saud�vel");
        Produto p4 = new Produto("Produto 4", 1200, 1250, "Ruim");
        gerenciador.verificar(p1);
        gerenciador.verificar(p2);
        gerenciador.verificar(p3);
        gerenciador.verificar(p4);
    }
}