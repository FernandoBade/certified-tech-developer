//Enunciado
//        Em uma empresa, você deseja controlar a qualidade de um produto. Desta forma, são considerados três controles diferentes
//        e em cada um é verificado se o produto está de acordo com os padrões de qualidade. De acordo com os controles:
//
//        Lote: deve estar entre 1000 e 2000.
//        Peso: deve estar entre 1200 e 1300.
//        Embalagem: deve ser igual a ?saudável? ou ?quase saudável?.
//
//        Se não atender a nenhum dos critérios, deve ser informado que foi rejeitado ou, se atender a todos os requisitos,deve ser relatado que foi aceito.
//        O artigo pertence a uma classe de artigo que possui quatro informações:
//        Nome: String.
//        Lote: int.
//        Peso: int.
//        Embalagem: String (?saudável?, ?quase saudável?, etc.).
//
//        Deseja-se que uma classe CheckQuality envie o artigo para cada um dos controles. Primeiro, é o lote: se estiver correto,
//        irá para o controle de peso. Se não estiver correto, ele informa que o lote está errado. A sequência de cada controle continua até que
//        ao passar em todos os controles, ele deve informar que está correto.
//
//        Finalmente, deve ser feita uma classe que crie um artigo e, em seguida, peça a CheckQuality para verificá-lo.


package Aula04_ChainOfResponsability_Test.Mesa;


import Aula04_ChainOfResponsability.Mesa.*;
import org.junit.jupiter.api.Test;

class CheckQualityTest {

    Gerenciador gerenciador = new GerenciadorLote().setGerenciadorSeguinte(new GerenciadorPeso().setGerenciadorSeguinte(new GerenciadorEmbalagem()));

    @Test
    void TestaProduto(){
        Produto p1 = new Produto("Produto 1", 1200, 1250, "Saudável");
        Produto p2 = new Produto("Produto 2", 250, 1250, "Saudável");
        Produto p3 = new Produto("Produto 3", 1200, 1400, "Saudável");
        Produto p4 = new Produto("Produto 4", 1200, 1250, "Ruim");
        gerenciador.verificar(p1);
        gerenciador.verificar(p2);
        gerenciador.verificar(p3);
        gerenciador.verificar(p4);
    }
}