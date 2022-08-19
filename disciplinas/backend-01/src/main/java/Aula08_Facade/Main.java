package Aula08_Facade;

public class Main {
    public static void main(String args[]){
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("33443344223433","Star Bank");
        Produto produto = new Produto("Skol 350ml","Lata");

        System.out.println("\nDesconto: "+facadeDesconto.desconto(cartao,produto,1));
    }
}