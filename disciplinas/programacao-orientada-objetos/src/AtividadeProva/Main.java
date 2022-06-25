package AtividadeProva;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //casa comum
        Casa casaCantareira = new Casa(
                "Jardins do El�sio",
                "Rua das Flores, 229",
                LocalDate.of(2022, 5, 9),
                LocalDate.of(2022, 7, 1),
                LocalDate.of(2022, 7, 1),
                150,
                2,
                2
        );

        //apartamento com prazo de conclus�o estourado e nao � arranha-c�u
        Predio apartamentoPerdizes = new Predio(
                "Nascer de Perdizes",
                "Rua Cl�udio, 341",
                LocalDate.of(2021, 4, 1),
                LocalDate.of(2022, 1, 25),
                LocalDate.of(2022, 2, 10),
                14,
                2
        );

        //apartamento com prazo de conclus�o � vista, dentro do prazo, e � um arranha-c�u
        Predio apartamentoPinheiros = new Predio(
                "Parque dos Pinheiros",
                "Avenida Faria Lima, 5000",
                LocalDate.of(2022, 6, 18),
                LocalDate.of(2022, 10, 22),
                25,
                4
        );

        //agrega��o das obras aos projetos
        Projeto projetoCantareira = new Projeto(
                "CASA-001-2022",
                "Casa de campo",
                "Mairipor�",
                casaCantareira,
                Status.ACABADO
        );

        Projeto projetoPerdizes = new Projeto(
                "APTO-001-2021",
                "Apartamento em Perdizes",
                "S�o Paulo",
                apartamentoPerdizes,
                Status.ACABADO
        );

        Projeto projetoPinheiros = new Projeto(
                "APTO-002-2022",
                "Apartamento em Pinheiros",
                "S�o Paulo",
                apartamentoPinheiros,
                Status.CONSTRUCAO
        );

//        testes dos m�todos criados na classe Projeto, imprimindo os resultados formatados no console
//        --------------------------------------------------------------------------------------------

//        System.out.println(projetoCantareira.prazoCumprido());
//        System.out.println(projetoCantareira);
//        System.out.println(apartamentoPerdizes.comparaPredios((Predio) apartamentoPinheiros));
//        System.out.println(apartamentoPinheiros.ehArranhaceu());

    }
}
