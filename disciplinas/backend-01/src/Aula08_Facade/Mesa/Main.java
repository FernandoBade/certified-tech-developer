package Aula08_Facade.Mesa;


public class Main {


    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.disponibilidade("S�o Paulo", "10/10/2010", "11/10/2010");
        Voo voo = new Voo();
        voo.disponibilidade("S�o Paulo", "10/10/2010", "11/10/2010");

        FacadeBuscas facadeBuscas = new FacadeBuscas();
        facadeBuscas.buscarPacote("S�o Paulo", "10/10/2010", "11/10/2010");

    }
}
