package ExerciciosIniciais;

public class NovoCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(123,"Fernando",0.0);
        cliente.aumentarDivida(1000.0);
        cliente.pagarDivida(500.0);


        System.out.println("Sua dívida atual é de: " + cliente.getDivida());
    }
}
