package AtividadeProva;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //casa comum
        Casa casaCantareira = new Casa(
                "Jardins do Elísio",
                "Rua das Flores, 229",
                LocalDate.of(2022, 5, 9),
                LocalDate.of(2022, 7, 1),
                LocalDate.of(2022, 7, 1),
                150,
                2,
                2
        );

        //apartamento com prazo de conclusão estourado e nao é arranha-céu
        Predio apartamentoPerdizes = new Predio(
                "Nascer de Perdizes",
                "Rua Cláudio, 341",
                LocalDate.of(2021, 4, 1),
                LocalDate.of(2022, 1, 25),
                LocalDate.of(2022, 2, 10),
                14,
                2
        );

        //apartamento com prazo de conclusão à vista, dentro do prazo, e é um arranha-céu
        Predio apartamentoPinheiros = new Predio(
                "Parque dos Pinheiros",
                "Avenida Faria Lima, 5000",
                LocalDate.of(2022, 6, 18),
                LocalDate.of(2022, 10, 22),
                25,
                4
        );

        //agregação das obras aos projetos
        Projeto projetoCantareira = new Projeto(
                "CASA-001-2022",
                "Casa de campo",
                "Mairiporã",
                casaCantareira,
                Status.ACABADO
        );

        Projeto projetoPerdizes = new Projeto(
                "APTO-001-2021",
                "Apartamento em Perdizes",
                "São Paulo",
                apartamentoPerdizes,
                Status.ACABADO
        );

        Projeto projetoPinheiros = new Projeto(
                "APTO-002-2022",
                "Apartamento em Pinheiros",
                "São Paulo",
                apartamentoPinheiros,
                Status.CONSTRUCAO
        );

//        testes dos métodos criados na classe Projeto, imprimindo os resultados formatados no console
//        --------------------------------------------------------------------------------------------

//        System.out.println(projetoCantareira.prazoCumprido());
//        System.out.println(projetoCantareira);
//        System.out.println(apartamentoPerdizes.comparaPredios((Predio) apartamentoPinheiros));
//        System.out.println(apartamentoPinheiros.ehArranhaceu());

    }
}
