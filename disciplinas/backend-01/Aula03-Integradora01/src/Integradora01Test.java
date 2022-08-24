//Desafio I
//        Uma empresa de vendas digitais nos pede para modificar a modelagem de seu sistema.
//        Atualmente, o sistema permite que os vendedores sejam classificados de acordo com o  cumprimento de determinados requisitos.
//        Os seguintes aspectos são considerados:
//
//        Tanto funcionários quanto afiliados são vendedores;
//        Cada vendedor retorna uma categoria (mostrarCategoria) de acordo com o número de pontos obtidos.
//        O objetivo dos funcionários é conseguir afiliados (obterAfiliado) e realizar vendas (vender). Cada um recebe 10 pontos por cada novo afiliado,
//        5 pontos por cada venda que fizer e 5 pontos por cada ano de antiguidade que tiver.
//        O objetivo dos afiliados é realizar vendas (vender), mas o cálculo dos pontos é diferente: eles ganham 15 pontos a cada nova venda.
//
//        Os vendedores são categorizados da seguinte forma:
//        Menos de 20 pontos = novato;
//        Entre 20 e 30 pontos = aprendiz;
//        Entre 31 e 40 pontos = bom;
//        Mais de 40 pontos = mestre.
//        Deve ser implementado um método mostrarCategoria que deve primeiro calcularPontos, depois recategorizar de acordo com
//        a pontuação obtida no método anterior e, finalmente, exibir o nome do vendedor, total de pontos e categoria por console.


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Integradora01Test {

    static Funcionario f1, f2, f3;
    static Afiliados a1, a2, a3;

    @BeforeAll
    static void doBefore() {
        f1 = new Funcionario("João", 0);
        f1.vender(1);
        f1.obterAfiliado(1);
        f2 = new Funcionario("Maria");
        f2.vender(3);
        f2.obterAfiliado(1);
        f3 = new Funcionario("Pedro", 10, 5);
        f3.vender(5);
        f3.obterAfiliado(1);
        a1 = new Afiliados("José", 10);
        a1.vender(1);
        a2 = new Afiliados("Luiz");
        a2.vender(5);
        a3 = new Afiliados("Camila", 20);
        a3.vender(10);
    }

    @Test
    public void testImpressaoCategorias() {
        f1.mostrarCategoria();
        f2.mostrarCategoria();
        f3.mostrarCategoria();
        a1.mostrarCategoria();
        a2.mostrarCategoria();
        a3.mostrarCategoria();
        assertEquals("Novato", f1.getCategoria());
        assertEquals("Aprendiz", f2.getCategoria());
        assertEquals("Bom", f3.getCategoria());
        assertEquals("Novato", a1.getCategoria());
        assertEquals("Mestre", a2.getCategoria());
        assertEquals("Mestre", a3.getCategoria());

    }

    @Test
    public void confirmaTempoDeCasa() {
        assertEquals(0, f1.getTempoDeCasa());
        assertEquals(0, f2.getTempoDeCasa());
        assertEquals(5, f3.getTempoDeCasa());
    }

    @Test
    public void confirmaPontos() {
        assertEquals(15, f1.getPontos());
        assertEquals(25, f2.getPontos());
        assertEquals(35, f3.getPontos());
        assertEquals(15, a1.getPontos());
        assertEquals(75, a2.getPontos());
        assertEquals(150, a3.getPontos());
    }


}
