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

    //construtor sem a data de conclus�o final
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

    //impress�o dos detalhes do pr�dio
    @Override
    public String toString() {
        return "---------------------------------" +
                super.toString() + System.lineSeparator() +
                "Total de andares: " + totalAndares + System.lineSeparator() +
                "Apartamentos por andar: " + apartamentosPorAndar + System.lineSeparator() +
                "---------------------------------";
    }

    //m�todo para comparar o total de apartamentos de dois pr�dios diferentes
    public String comparaPredios(Predio predio2) {
        if (this.totalAndares * this.apartamentosPorAndar < predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O pr�dio " + this.getNomeDaObra() + " tem menos apartamentos do que o pr�dio " + predio2.getNomeDaObra() + System.lineSeparator() +
                    this.getNomeDaObra() + ": " + this.totalAndares * this.apartamentosPorAndar + " apartamentos" + System.lineSeparator() +
                    predio2.getNomeDaObra() + ": " + predio2.totalAndares * predio2.apartamentosPorAndar + " apartamentos";
        } else if (this.totalAndares * this.apartamentosPorAndar > predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O pr�dio " + predio2.getNomeDaObra() + " tem menos apartamentos do que o pr�dio " + this.getNomeDaObra() + System.lineSeparator() +
                    predio2.getNomeDaObra() + ": " + predio2.totalAndares * predio2.apartamentosPorAndar + " apartamentos" + System.lineSeparator() +
                    this.getNomeDaObra() + ": " + this.totalAndares * this.apartamentosPorAndar + " apartamentos";
        } else {
            return "O pr�dio " + this.getNomeDaObra() + " tem o mesmo n�mero de apartamentos do que o pr�dio " + predio2.getNomeDaObra() + System.lineSeparator() +
                    this.totalAndares * this.apartamentosPorAndar + " apartamentos cada.";
        }
    }

    //m�todo para saber se � um arranhac�u, com mais de 15 andares
    public String ehArranhaceu() {
        return this.totalAndares > 15 ?
            "O pr�dio " + this.getNomeDaObra() + " tem " + this.totalAndares + " andares e � considerado um arranha-c�u." :
            "O pr�dio " + this.getNomeDaObra() + " tem apenas " + this.totalAndares + " andares e n�o � considerado um arranha-c�u.";
    }

}
