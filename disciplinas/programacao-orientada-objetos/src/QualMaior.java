import java.util.Scanner;

public class QualMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 números para descobrir qual é o maior: ");
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O maior número é " + numero1);
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior número é " + numero2);
            } else {
                System.out.println("O maior número é " + numero3);
            }

    }
}
