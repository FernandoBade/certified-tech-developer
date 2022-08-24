package Mesa;

public class FacadeBuscas implements IFacadeBuscas {

    private Hotel novoHotel;
    private Voo novoVoo;

    public FacadeBuscas() {
        novoHotel = new Hotel();
        novoVoo = new Voo();
    }

    @Override
    public Viagem buscarPacote(String destino, String dataIda, String dataVolta) {
        return null;
    }

    @Override
    public Viagem buscarPacote(Viagem viagem) {
        viagem.setCompanhia(novoVoo.buscarVoo(viagem.getDestino(),viagem.getDataPartida(), viagem.getDataRetorno()));
        viagem.setHotel(novoHotel.buscarHotel(viagem.getDestino(), viagem.getDataPartida(), viagem.getDataRetorno()));
        return viagem;
    }
}

