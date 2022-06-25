package AtividadeProva;

import java.time.LocalDate;

public class Predio extends Obra {

    private int totalAndares;
    private int apartamentosPorAndar;

    //construtor completo
    public Predio(String nomeDaObra,
                  String endereco,
                  LocalDate dataDeInicio,
                  LocalDate dataPrevisaoTermino,
                  LocalDate dataConclusaoFinal,
                  int totalAndares,
                  int apartamentosPorAndar
    ) {
        super(nomeDaObra, endereco, dataDeInicio, dataPrevisaoTermino, dataConclusaoFinal);
        this.totalAndares = totalAndares;
        this.apartamentosPorAndar = apartamentosPorAndar;
    }

    //construtor sem a data de conclusão final
    public Predio(String nomeDaObra,
                  String endereco,
                  LocalDate dataDeInicio,
                  LocalDate dataPrevisaoTermino,
                  int totalAndares,
                  int apartamentosPorAndar
    ) {
        super(endereco, dataDeInicio, dataPrevisaoTermino, nomeDaObra);
        this.totalAndares = totalAndares;
        this.apartamentosPorAndar = apartamentosPorAndar;
    }


    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getApartamentosPorAndar() {
        return apartamentosPorAndar;
    }

    public void setApartamentosPorAndar(int apartamentosPorAndar) {
        this.apartamentosPorAndar = apartamentosPorAndar;
    }

    //impressão dos detalhes do prédio
    @Override
    public String toString() {
        return "---------------------------------" +
                super.toString() + System.lineSeparator() +
                "Total de andares: " + totalAndares + System.lineSeparator() +
                "Apartamentos por andar: " + apartamentosPorAndar + System.lineSeparator() +
                "---------------------------------";
    }

    //método para comparar dois prédios diferentes
    public String comparaPredios(Predio predio2) {
        if (this.totalAndares * this.apartamentosPorAndar < predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O prédio " + this.nomeDaObra + " tem menos apartamentos do que o prédio " + predio2.nomeDaObra;
        } else if (this.totalAndares * this.apartamentosPorAndar > predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O prédio " + this.nomeDaObra + " tem mais apartamentos do que o prédio " + predio2.nomeDaObra;
        } else {
            return "Os prédios " + this.nomeDaObra + " e " + predio2.nomeDaObra + " tem o mesmo número de apartamentos.";
        }
    }

}
