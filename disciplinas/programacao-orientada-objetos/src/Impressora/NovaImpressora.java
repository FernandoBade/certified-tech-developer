package Impressora;

import java.time.LocalDate;

public class NovaImpressora {
    public static void main(String[] args) {
        Impressora impressoraSemPapel = new Impressora(
                "HP",
                "Wireless",
                LocalDate.of(2020, 5, 25));
        Impressora impressoraComPapel = new Impressora(
                "Epson",
                "USB",
                LocalDate.now(),
                100);

        impressoraSemPapel.imprimir("Olá, mundo!");
        impressoraComPapel.imprimir("Olá, mundo!");
    }
}
