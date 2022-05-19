import java.util.Scanner;

public class EhPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um n�mero: ");
        int numero = scanner.nextInt();

        if(numero >= 2 && ehPrimo(numero)) {
            System.out.println("O n�mero � primo.");
        } else {
            System.out.println("O n�mero n�o � primo.");
        }
    }

    private static boolean ehPrimo(int numero){
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        return primo;
    }

}
