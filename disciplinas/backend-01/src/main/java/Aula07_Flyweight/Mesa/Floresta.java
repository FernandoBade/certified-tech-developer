package Aula07_Flyweight.Mesa;

public class Floresta {
    public static void main(String[] args) {

        int vermelho = 0;
        int verde = 0;
        int arvoresTotais = 0;

        ArvoreFactory arvoreFactory = new ArvoreFactory();
        Arvore ornamental = arvoreFactory.getArvore("ornamental", 200, 400,"verde");
        Arvore frutifera = arvoreFactory.getArvore("frutifera", 500, 300, "vermelho");

        for (int i = 0; i < 500000; i++){
            verde ++;
            System.out.println(ornamental.toString());
        }
        for (int i = 0; i < 500000; i++){
            vermelho ++;
            System.out.println(frutifera.toString());
        }

        System.out.println("Total de arvores verdes: " + verde);
        System.out.println("Total de arvores vermelhas: " + vermelho);
        System.out.println("Total de arvores: " + (verde + vermelho));

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }

}
