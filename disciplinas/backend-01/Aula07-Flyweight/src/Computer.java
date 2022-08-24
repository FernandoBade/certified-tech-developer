//Enunciado
//
//        Uma empresa precisa montar computadores com especificações diferentes, bem como reutilizar as mesmas especificações.
//        Os tipos de computadores estão organizados por diferentes Sistemas Operacionais. São eles:
//
//        Windows
//          ? Ram: 16 GB
//          ? HD: 128 GB

//        Mac
//          ? Ram: 8 GB
//          ? HD: 500 GB
//
//        É necessário que a aplicação não gere altos custos de recursos: ela tem que ser otimizada. Os computadores terão os seguintes atributos:
//
//        ? Ram
//        ? HD
//        ? Id
//        ? Contador (servirá para armazenar o número de instâncias)

//        ComputadorFactory será o container que armazenará os diferentes tipos de computadores. Será necessário verificar se o computador já existe.
//        Se existir obtenha-o, se não existir crie-o. Em seguida, imprima na tela os computadores criados.

public class Computer {

    private int ram;
    private int hd;

    private static int contador;

    public Computer(int ram, int hd) {
        super();
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("Contador: " + contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hd='" + hd + '\'' +
                '}';
    }
}
