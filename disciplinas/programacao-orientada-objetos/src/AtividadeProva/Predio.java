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
    }

//construtor sem a data de conclusão final
    public Predio(String endereco,
                  LocalDate dataDeInicio,
                  LocalDate dataPrevisaoTermino,
                  String nomeDaObra,
                  int totalAndares,
                  int apartamentosPorAndar
    ) {
        super(endereco, dataDeInicio, dataPrevisaoTermino, nomeDaObra);
        this.totalAndares = totalAndares;
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
}
