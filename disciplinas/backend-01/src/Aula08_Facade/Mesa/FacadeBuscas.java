package Aula08_Facade.Mesa;

public class FacadeBuscas implements IFacadeBuscas {

    private Hotel hotel;
    private Voo voo;

    public String buscarPacote(String destino, String dataIda, String dataVolta) {
        if (destino != null && dataIda != null && dataVolta != null) {
            if (destino.equals(this.hotel.getDestino()) && dataIda.equals(hotel.getDataIda()) && dataVolta.equals(hotel.getDataVolta())) {
                return "Pacote de hotel para: " + destino + ", de " + dataIda + " at� " + dataVolta;
            } else {
                return "N�o foram encontrados hot�is para: " + destino + ", de " + dataIda + " at� " + dataVolta;
            }
        }
        if (destino != null && dataIda != null) {
            if (destino.equals(voo.getDestino()) && dataIda.equals(voo.getDataIda())) {
                return "Pacote de voo para: " + destino + ", de " + dataIda;
            } else {
                return "N�o foram encontrados voos para: " + destino + ", de " + dataIda;
            }
        }

        return null;
    }
}

