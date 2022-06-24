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
            containers.add(new Container("001", "Container de eletrônicos", "China", false));
            containers.add(new Container("002", "Container de metais", "EUA", false));
            containers.add(new Container("003", "Container de Petróleo", "Brasil", false));
            containers.add(new Container("004", "Container de Alimentos", "Rússia", false));
            containers.add(new Container("005", "Container de Lâmpadas", "Canadá", false));
            containers.add(new Container("006", "Container de Papel", "Desconhecido", true));
            containers.add(new Container("007", "Container de Vidro", "Desconhecido", true));
            containers.add(new Container("008", "Container de Plástico", "Desconhecido", true));
            containers.add(new Container("009", "Container de Metal", "Desconhecido", true));
            containers.add(new Container("010", "Container de Eletrônicos", "Desconhecido", true));


            Porto porto = new Porto("Buenos Aires", containers);
            System.out.println(porto);
            System.out.println("--------------------------------");
            System.out.println(porto.containers.get(0));
        }
}
