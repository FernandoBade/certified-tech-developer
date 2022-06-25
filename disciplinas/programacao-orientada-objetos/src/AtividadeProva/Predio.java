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

    //método para comparar o total de apartamentos de dois prédios diferentes
    public String comparaPredios(Predio predio2) {
        if (this.totalAndares * this.apartamentosPorAndar < predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O prédio " + this.getNomeDaObra() + " tem menos apartamentos do que o prédio " + predio2.getNomeDaObra() + System.lineSeparator() +
                    this.getNomeDaObra() + ": " + this.totalAndares * this.apartamentosPorAndar + " apartamentos" + System.lineSeparator() +
                    predio2.getNomeDaObra() + ": " + predio2.totalAndares * predio2.apartamentosPorAndar + " apartamentos";
        } else if (this.totalAndares * this.apartamentosPorAndar > predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O prédio " + predio2.getNomeDaObra() + " tem menos apartamentos do que o prédio " + this.getNomeDaObra() + System.lineSeparator() +
                    predio2.getNomeDaObra() + ": " + predio2.totalAndares * predio2.apartamentosPorAndar + " apartamentos" + System.lineSeparator() +
                    this.getNomeDaObra() + ": " + this.totalAndares * this.apartamentosPorAndar + " apartamentos";
        } else {
            return "O prédio " + this.getNomeDaObra() + " tem o mesmo número de apartamentos do que o prédio " + predio2.getNomeDaObra() + System.lineSeparator() +
                    this.totalAndares * this.apartamentosPorAndar + " apartamentos cada.";
        }
    }

    //método para saber se é um arranhacéu, com mais de 15 andares
    public String ehArranhaceu() {
        return this.totalAndares > 15 ?
            "O prédio " + this.getNomeDaObra() + " tem " + this.totalAndares + " andares e é considerado um arranha-céu." :
            "O prédio " + this.getNomeDaObra() + " tem apenas " + this.totalAndares + " andares e não é considerado um arranha-céu.";
    }

}
