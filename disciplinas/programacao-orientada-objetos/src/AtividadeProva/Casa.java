package AtividadeProva;

import java.time.LocalDate;

public class Casa extends Obra {

    private double tamanhoTerreno;
    private int totalBanheiros;
    private int totalQuartos;

    //construtor completo
    public Casa(String nomeDaObra,
                String endereco,
                LocalDate dataDeInicio,
                LocalDate dataPrevisaoTermino,
                LocalDate dataConclusaoFinal,
                double tamanhoTerreno,
                int totalBanheiros,
                int totalQuartos
    ) {
        super(nomeDaObra, endereco, dataDeInicio, dataPrevisaoTermino, dataConclusaoFinal);
        this.tamanhoTerreno = tamanhoTerreno;
        this.totalBanheiros = totalBanheiros;
        this.totalQuartos = totalQuartos;
    }

    //construtor sem a data de conclusão final
    public Casa(String endereco,
                LocalDate dataDeInicio,
                LocalDate dataPrevisaoTermino,
                String nomeDaObra,
                double tamanhoTerreno,
                int totalBanheiros,
                int totalQuartos
    ) {
        super(endereco, dataDeInicio, dataPrevisaoTermino, nomeDaObra);
        this.tamanhoTerreno = tamanhoTerreno;
        this.totalBanheiros = totalBanheiros;
        this.totalQuartos = totalQuartos;
    }


    //getters e setters
    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }

    public void setTamanhoTerreno(double tamanhoTerreno) {
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public int getTotalBanheiros() {
        return totalBanheiros;
    }

    public void setTotalBanheiros(int totalBanheiros) {
        this.totalBanheiros = totalBanheiros;
    }

    public int getTotalQuartos() {
        return totalQuartos;
    }

    public void setTotalQuartos(int totalQuartos) {
        this.totalQuartos = totalQuartos;
    }

    //impressao dos detalhes da casa
    @Override
    public String toString() {
        return "---------------------------------" +
               super.toString() + System.lineSeparator() +
               "Tamanho do terreno: " + tamanhoTerreno + System.lineSeparator() +
               "Total de banheiros: " + totalBanheiros + System.lineSeparator() +
               "Total de quartos: " + totalQuartos + System.lineSeparator() +
                "---------------------------------";
    }
}
