package ExerciciosIniciais;//Exercício 1
//        Faça uma função que, dado um número, indica se é um número primo ou não. Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
//        Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode ser dividido por 1 e por 17.
//        Para usar esta função que iremos criar, podemos permitir a entrada de apenas um número do usuário para verificar se o número é primo ou não.


import java.util.Scanner;
public class EhPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número: ");
        int numero = scanner.nextInt();

        if(numero >= 2 && ehPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
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
