package ExerciciosIniciais;//Exerc�cio 1
//        Fa�a uma fun��o que, dado um n�mero, indica se � um n�mero primo ou n�o. Um n�mero primo � aquele que s� pode ser dividido por 1 e ele mesmo.
//        Por exemplo: 25 n�o � primo, pois 25 � divis�vel por 1, 5 e 25. 17 � primo porque s� pode ser dividido por 1 e por 17.
//        Para usar esta fun��o que iremos criar, podemos permitir a entrada de apenas um n�mero do usu�rio para verificar se o n�mero � primo ou n�o.


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
