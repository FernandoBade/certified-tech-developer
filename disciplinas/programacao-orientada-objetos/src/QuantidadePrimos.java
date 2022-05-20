//Desafio 1
//      Implemente um programa que nos permita exibir os primeiros "n" números primos
//      pelo console, onde "n" é um valor numérico inserido pelo usuário. Por exemplo:
//      Com n = 7, o que o programa deve retornar é "Os primeiros 7 números primos são:
//      2, 3, 5, 7, 11, 13, 17;".

//Mesa:
//
//      Fernando Bade
//      Issao Toribio Takeuchi
//      Luiz Souza
//      Matheus Abreu


import java.util.Scanner;

public class QuantidadePrimos {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escolha um total de primos para serem exibidos: ");
        int n = scanner.nextInt();
        int contador = 0;
        if (n == 0) {
            System.out.println("Nenhum número primo para exibir.");
        } else if (n == 1) {
            System.out.println("Mostrando " + n + " número primo:");
            System.out.println("---------------------------");
            System.out.println("2");
            System.out.println("---------------------------");

        } else {
            System.out.println("Mostrando " + n + " números primos:");
            System.out.println("---------------------------");

            for (int i = 2; contador < n; i++) {

                boolean ehPrimo = true;
                for (int x = 2; x <= i / 2; x++) {
                    if (i % x == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo == true) {

                    System.out.print(i + "  ");
                    contador++;
                }
            }
            System.out.println("");
            System.out.println("---------------------------");
        }
    }
}