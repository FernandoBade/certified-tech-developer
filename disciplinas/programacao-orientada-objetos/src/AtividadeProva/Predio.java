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

    //m�todo para comparar dois pr�dios diferentes
    public String comparaPredios(Predio predio2) {
        if (this.totalAndares * this.apartamentosPorAndar < predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O pr�dio " + this.nomeDaObra + " tem menos apartamentos do que o pr�dio " + predio2.nomeDaObra;
        } else if (this.totalAndares * this.apartamentosPorAndar > predio2.totalAndares * predio2.apartamentosPorAndar) {
            return "O pr�dio " + this.nomeDaObra + " tem mais apartamentos do que o pr�dio " + predio2.nomeDaObra;
        } else {
            return "Os pr�dios " + this.nomeDaObra + " e " + predio2.nomeDaObra + " tem o mesmo n�mero de apartamentos.";
        }
    }

}
