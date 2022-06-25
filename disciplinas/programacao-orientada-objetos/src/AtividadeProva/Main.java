package AtividadeProva;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //casa comum
        Obra casaCantareira = new Casa(
                "Jardins do Elísio",
                "Rua das Flores, 229",
                LocalDate.of(2022, 5, 9),
                LocalDate.of(2022, 7, 1),
                LocalDate.of(2022, 7, 1),
                150,
                2,
                2
        );


        //apartamento com prazo de conclusão estourado
        Obra apartamentoPerdizes = new Predio(
                "Nascer de Perdizes",
                "Rua Cláudio, 341",
                LocalDate.of(2021, 4, 1),
                LocalDate.of(2022, 1, 25),
                LocalDate.of(2022, 2, 10),
                14,
                2
        );

        //apartamento com prazo de conclusão à vista, dentro do prazo.
        Obra apartamentoPinheiros = new Predio(
                "Parque dos Pinheiros",
                "Avenida Faria Lima, 5000",
                LocalDate.of(2022, 6, 18),
                LocalDate.of(2022, 10, 22),
                25,
                4
        );

        //agragação das obras aos projetos
        Projeto projetoCantareira = new Projeto(
                "CASA001",
                "Casa de campo",
                "Mairipirã",
                casaCantareira,
                Status.ACABADO
                );

        System.out.println(projetoCantareira.prazoCumprido());


    }
}
