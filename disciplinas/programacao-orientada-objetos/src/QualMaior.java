import java.util.Scanner;

public class QualMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 n�meros para descobrir qual � o maior: ");
        System.out.println("Digite o primeiro n�mero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro n�mero: ");
        int numero3 = scanner.nextInt();

            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O maior n�mero � " + numero1);
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior n�mero � " + numero2);
            } else {
                System.out.println("O maior n�mero � " + numero3);
            }

    }
}
