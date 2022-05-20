//Exerc�cio
//        Na cl�nica veterin�ria, h� diferentes tipos de c�es. Cada um deles come uma
//        quantidade fixa de alimentos balanceados por dia. O provedor de alimentos envia a
//        voc� um pacote com diferentes quantidades de alimentos. Em cada um h�
//        envelopes com pequenas por��es para serem consumidas a cada dia, sabendo-se
//        que devem dar no m�nimo 3 kg por dia para que cada c�o n�o sinta fome e ladre a
//        noite toda.
//        Precisamos fazer um programa que nos ajude a simular a situa��o: primeiro
//        perguntar� o nome e a quantidade de comida que o cachorro come e por meio de
//        uma fun��o chamada quantosPacotes, retorne o nome e quantos pacotes ele
//        usar� por dia. Dada a quantidade necess�ria, a fun��o quantosPacotes pedir� um
//        a um os pesos de cada pacote, at� atingir aquela quantidade dada como par�metro
//        da fun��o.
//        Exemplo:
//        Rintintin come 4 kg di�rios.
//        Pacotes: 1.2    0.7    1.1    1.3
//        Resultado: Rintintin precisa de 4 pacotes.

import java.util.Locale;
import java.util.Scanner;


public class QuantidadePacotesCachorro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do cachorro: ");
        String nomeCachorro = scanner.nextLine();
        System.out.println("Informe a quantidade de comida em Kg: ");
        int quantoCome = scanner.nextInt();
        if (quantoCome < 3) {
            System.out.println("Quantidade menor que 3Kg");
        } else {
            int totalPacotes = quantosPacotes(quantoCome);
            System.out.println(nomeCachorro + " precisa de " + totalPacotes + " pacotes.");
        }

    }

    private static int quantosPacotes(int kg) {
        int quantidadePacotes = 0;
        double somaPeso = 0;
        Scanner scanner = new Scanner(System.in);

        while (somaPeso < kg) {
            System.out.println("Informe o peso do pacote: ");
            double pesoPacote = scanner.nextDouble();
            somaPeso = pesoPacote + somaPeso;
            quantidadePacotes++;
        }

        return quantidadePacotes;
    }

}
