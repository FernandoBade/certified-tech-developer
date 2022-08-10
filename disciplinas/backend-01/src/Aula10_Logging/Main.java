//Enunciado
//
//        Crie uma aplica��o onde tenhamos duas classes: Le�o e Tigre.
//        Cada uma deve ter dois atributos:
//
//        - nome: String
//        - idade: int
//
//        e para a classe Le�o, vamos adicionar o atributo:
//
//        - eAlfa: boolean
//
//        Para os dois animais vamos criar um m�todo correr que ir� registrar uma informa��o de que est� correndo e
//        criaremos outro m�todo que calcule se � maior de 10 anos e se � alfa, se for, voc� deve registrar a informa��o.
//        Devemos tamb�m lan�ar uma Exce��o (Exception) se a idade do animal for menor que zero e adicionar um log de erro.
//
//        Criaremos uma classe main (principal), onde criaremos le�es e tigres e executaremos os m�todos:
//
//        public void correr()
//        public void eMaiorQue10()
//
//        Devemos tamb�m verificar os logs. A sa�da deve ser algo como:
//
//        [2021-07-18 18:27:46] [ INFO ] [Leao:37] O Le�o Simba est� correndo//
//        [2021-07-18 18:27:46] [ INFO ] [Leao:37] O Le�o Mufasa est� correndo
//        [2021-07-18 18:27:46] [ ERROR] [Leao:45] A idade n�o pode ser negativa
//        [2021-07-18 18:27:46] [ ERROR] [Test:30] A idade do Le�o Mufasa est� incorreta
//
//        java.lang.Exception
//        at com.main.Leao.eMaiorQue10(Leao.java:46)
//        at com.main.Test.main(Test.java:28)
//        [2021-07-18 18:27:46] [ INFO ] [Tigre:28] O Tigre est� correndo
//        [2021-07-18 18:27:46] [ INFO ] [Tigre:28] O Tigre est� correndo

package Aula10_Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        //alternativa para a configura��o do log4j.proprieties
        BasicConfigurator.configure();

        //cria��o de um novo objeto Leao
        Leao simba = new Leao("Simba", 8, true);
        Tigre tigrao = new Tigre("Tigr�o", 11);

        try {

            simba.correr();
            simba.ehMaiorQue10();

        } catch (Exception e) {
            logger.error("A idade do le�o " + simba.getNome() + " est� incorreta.");
        }

        tigrao.correr();
        tigrao.ehMaiorQue10();

    }

}
