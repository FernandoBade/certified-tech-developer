package Associados;

public class NovoAssociado {
    public static void main(String[] args) {

        AssociadoHabilitado a1 = new AssociadoHabilitado("9999", "Fernando Bade", 100.00, "Sim", 50);
        a1.setHabilitado(true);
        System.out.println(a1);
        System.out.println(a1.custoMensal());

        Associado a2 =  new Associado("3333", "Maria",100.0, "Musculação");
        System.out.println(a2);
        System.out.println(a2.custoMensal());
    }
}