//Enunciado
//
//        Uma empresa precisa montar computadores com especifica��es diferentes, bem como reutilizar as mesmas especifica��es.
//        Os tipos de computadores est�o organizados por diferentes Sistemas Operacionais. S�o eles:
//
//        Windows
//          ? Ram: 16 GB
//          ? HD: 128 GB

//        Mac
//          ? Ram: 8 GB
//          ? HD: 500 GB
//
//        � necess�rio que a aplica��o n�o gere altos custos de recursos: ela tem que ser otimizada. Os computadores ter�o os seguintes atributos:
//
//        ? Ram
//        ? HD
//        ? Id
//        ? Contador (servir� para armazenar o n�mero de inst�ncias)

//        ComputadorFactory ser� o container que armazenar� os diferentes tipos de computadores. Ser� necess�rio verificar se o computador j� existe.
//        Se existir obtenha-o, se n�o existir crie-o. Em seguida, imprima na tela os computadores criados.

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
