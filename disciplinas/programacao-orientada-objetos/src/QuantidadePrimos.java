//Desafio 1
//        Implemente um programa que nos permita exibir os primeiros &quot;n&quot; n�meros primos
//        pelo console, onde &quot;n&quot; � um valor num�rico inserido pelo usu�rio. Por exemplo:
//        Com n = 7, o que o programa deve retornar � &quot;Os primeiros 7 n�meros primos s�o:
//        2, 3, 5, 7, 11, 13, 17;.

// Mesa:

import java.util.Scanner;

public class QuantidadePrimos {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escolha o n�mero limite: ");
        int numero = scanner.nextInt();

        for (int n = 2; n <= numero; n++) {
            boolean ehPrimo = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo == true)
                System.out.println(n);
        }
    }
}