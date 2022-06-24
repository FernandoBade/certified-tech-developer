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
            containers.add(new Container("012", "Container de eletr�nicos", "China", false));
            containers.add(new Container("125", "Container de metais", "EUA", false));
            containers.add(new Container("350", "Container de Petr�leo", "Brasil", false));
            containers.add(new Container("179", "Container de Alimentos", "R�ssia", false));
            containers.add(new Container("985", "Container de L�mpadas", "Canad�", false));
            containers.add(new Container("275", "Container de Papel", "Desconhecido", true));
            containers.add(new Container("349", "Container de Vidro", "Desconhecido", true));
            containers.add(new Container("593", "Container de Pl�stico", "Desconhecido", true));
            containers.add(new Container("133", "Container de Metal", "Desconhecido", true));
            containers.add(new Container("652", "Container de Eletr�nicos", "Desconhecido", true));


            Porto porto = new Porto("Buenos Aires", containers);
            porto.ordenarContainersPorNumero();
            System.out.println(porto);


        }
}
