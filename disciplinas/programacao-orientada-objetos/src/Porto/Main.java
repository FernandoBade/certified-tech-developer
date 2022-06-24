//        O porto de Buenos Aires precisa administrar os cont�ineres que entram no dia a dia.
//        Estes possuem um n�mero que os identifica, uma descri��o, o pa�s de origem
//        (China, EUA, Brasil, R�ssia, Canad�, Desconhecido) e uma marca que indica se
//        est� transportando materiais perigosos. O sistema deve permitir ao porto a entrada
//        de cont�ineres, mostr�-los ordenados de acordo com o n�mero que os identifica
//        e poder calcular a quantidade de cont�ineres perigosos de origem "Desconhecida".

package Porto;


import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<Container> containers = new ArrayList<>();
            containers.add(new Container("001", "Container de eletr�nicos", "China", false));
            containers.add(new Container("002", "Container de metais", "EUA", false));
            containers.add(new Container("003", "Container de Petr�leo", "Brasil", false));
            containers.add(new Container("004", "Container de Alimentos", "R�ssia", false));
            containers.add(new Container("005", "Container de L�mpadas", "Canad�", false));
            containers.add(new Container("006", "Container de Papel", "Desconhecido", true));
            containers.add(new Container("007", "Container de Vidro", "Desconhecido", true));
            containers.add(new Container("008", "Container de Pl�stico", "Desconhecido", true));
            containers.add(new Container("009", "Container de Metal", "Desconhecido", true));
            containers.add(new Container("010", "Container de Eletr�nicos", "Desconhecido", true));


            Porto porto = new Porto("Buenos Aires", containers);
            System.out.println(porto);
            System.out.println("--------------------------------");
            System.out.println(porto.containers.get(0));
        }
}
