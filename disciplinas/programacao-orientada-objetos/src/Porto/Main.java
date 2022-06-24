//        O porto de Buenos Aires precisa administrar os contêineres que entram no dia a dia.
//        Estes possuem um número que os identifica, uma descrição, o país de origem
//        (China, EUA, Brasil, Rússia, Canadá, Desconhecido) e uma marca que indica se
//        está transportando materiais perigosos. O sistema deve permitir ao porto a entrada
//        de contêineres, mostrá-los ordenados de acordo com o número que os identifica
//        e poder calcular a quantidade de contêineres perigosos de origem "Desconhecida".

package Porto;


import java.util.ArrayList;
import java.util.List;


public class Main {

        public static void main(String[] args) {
            List<Container> containers = new ArrayList<>();
            containers.add(new Container("012", "Container de eletrônicos", "China", false));
            containers.add(new Container("125", "Container de metais", "EUA", false));
            containers.add(new Container("350", "Container de Petróleo", "Brasil", false));
            containers.add(new Container("179", "Container de Alimentos", "Rússia", false));
            containers.add(new Container("985", "Container de Lâmpadas", "Canadá", false));
            containers.add(new Container("275", "Container de Papel", "Desconhecido", true));
            containers.add(new Container("349", "Container de Vidro", "Desconhecido", true));
            containers.add(new Container("593", "Container de Plástico", "Desconhecido", true));
            containers.add(new Container("133", "Container de Metal", "Desconhecido", true));
            containers.add(new Container("652", "Container de Eletrônicos", "Desconhecido", true));


            Porto porto = new Porto("Buenos Aires", containers);
            porto.ordenarContainersPorNumero();
            System.out.println(porto);


        }
}
