import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Locale ptBr = new Locale("pt", "BR");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas na semana: ");
        int horasTrabalhadas = scanner.nextInt();
        double salarioPorHora = 21.87;
        double salarioPorHoraExtra = 32.80;

        if (horasTrabalhadas <= 40) {
            System.out.println(
                    "O salário semanal para " + horasTrabalhadas + " é de "
                            + NumberFormat.getCurrencyInstance().format((salarioPorHora * horasTrabalhadas)) + ".");
        } else {
            System.out.println("Salário semanal: " + System.lineSeparator()
                    + "---------------------------" + System.lineSeparator()
                    + horasTrabalhadas + " horas comuns = " + NumberFormat.getCurrencyInstance().format((salarioPorHora * 40)) + System.lineSeparator()
                    + "        + " + System.lineSeparator()
                    + (horasTrabalhadas - 40) + " horas extras = " + NumberFormat.getCurrencyInstance().format((salarioPorHoraExtra * (horasTrabalhadas - 40))) + System.lineSeparator()
                    + System.lineSeparator() + System.lineSeparator()
                    + "Total:          " +NumberFormat.getCurrencyInstance().format((salarioPorHora * 40) + (salarioPorHoraExtra * (horasTrabalhadas - 40))) + System.lineSeparator()
                    + "---------------------------" + System.lineSeparator());
        }

    }
}
