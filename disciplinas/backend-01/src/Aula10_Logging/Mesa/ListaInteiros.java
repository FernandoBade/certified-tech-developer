package Aula10_Logging.Mesa;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;


public class ListaInteiros {

    private List<Integer> listaInteiros = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(ListaInteiros.class);


    public ListaInteiros() {}

    public void criaLista(int tamanho) throws Exception {
        for (int i = 0; i < tamanho; i++) {
            listaInteiros.add(i);
        }
        if (listaInteiros.size() >= 5) {
            logger.info("O comprimento da lista é maior que 5");
        }
        if (listaInteiros.size() >= 10) {
            logger.info("O comprimento da lista é maior que 10");
        }
        if (listaInteiros.size() <= 0) {
            logger.error("O comprimento da lista é menor ou igual a zero");
            throw new Exception();
        }
    }

    public void calculaMedia() {
        int soma = 0;
        for (Integer listaInteiro : listaInteiros) {
            soma += listaInteiro;
        }
        int media = soma / listaInteiros.size();
        logger.info("A média dos números da lista é " + media);
    }

    @Override
    public String toString() {
        return "ListaInteiros{" + "listaInteiros=" + listaInteiros + '}';
    }
}
