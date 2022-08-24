//Enunciado
//        Pedimos que voc�s criem uma aplica��o que calcule a m�dia dos valores, o m�ximo e o m�nimo em uma lista de inteiros:
//        List<Integer> listaInteiros
//        Devem gerar os seguintes logs:
//        Quando a lista tiver mais de 5 itens;
//        Quando a lista tiver mais de 10 itens;
//        A m�dia;
//        Gerar um erro se a lista n�o tiver elementos e gere o log.
//        Em seguida, devem criar uma classe principal (main), onde criamos uma lista para cada um dos itens e verificamos se os logs existem.
//
//        A sa�da deve ser algo como:
//
//        [2021-07-18 18:15:11] [ INFO ] [ListaMedia:16] O comprimento da lista � maior que 5
//        [2021-07-18 18:15:11] [ INFO ] [ListaMedia:16] O comprimento da lista � maior que 5
//        [2021-07-18 18:15:11] [ INFO ] [ListaMedia:19] O comprimento da lista � maior que 10
//        [2021-07-18 18:15:11] [ ERROR] [Test:24] A lista � igual a zero.
//        java.lang.Exception
//        at com.logging.ListaMedia.<init>(ListaMedia.java:22)
//        at com.logging.Test.main(Test.java:22)


package Mesa;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class ListaInteirosApp {

    private static final Logger logger = Logger.getLogger(ListaInteirosApp.class);

    public static void main(String[] args) throws Exception {
        //alternativa para a configura��o do log4j.proprieties
        BasicConfigurator.configure();
        ListaInteiros lista1 = new ListaInteiros();
        ListaInteiros lista2 = new ListaInteiros();
        ListaInteiros lista3 = new ListaInteiros();
        ListaInteiros lista4 = new ListaInteiros();

        lista1.criaLista(5);
        lista2.criaLista(10);
        lista4.criaLista(15);
        lista4.calculaMedia();
        lista3.criaLista(0);
    }


}
