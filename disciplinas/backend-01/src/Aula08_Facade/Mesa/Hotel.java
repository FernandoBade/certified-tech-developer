package Aula08_Facade.Mesa;

public class Hotel {

    public String destino;
    public String dataIda;
    public String dataVolta;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String disponibilidade(String destino, String dataIda, String dataVolta) {
        return "Busca de hotel para: " + destino + ", de " + dataIda + " até " + dataVolta;
    }
}
