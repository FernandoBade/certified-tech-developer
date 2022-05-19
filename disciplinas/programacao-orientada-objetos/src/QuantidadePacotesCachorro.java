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
