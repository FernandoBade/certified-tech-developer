package AtividadeProva;

import java.time.LocalDate;

public abstract class Obra {

    public final String nomeDaObra;
    private final String endereco;
    private final LocalDate dataDeInicio;
    private LocalDate dataPrevisaoTermino;
    private LocalDate dataConclusaoFinal;

    //construtor completo
    public Obra(String nomeDaObra, String endereco, LocalDate dataDeInicio, LocalDate dataPrevisaoTermino, LocalDate dataConclusaoFinal) {
        this.nomeDaObra = nomeDaObra;
        this.endereco = endereco;
        this.dataDeInicio = dataDeInicio;
        this.dataPrevisaoTermino = dataPrevisaoTermino;
        this.dataConclusaoFinal = dataConclusaoFinal;
    }

    //construtor sem a data de conclusão final
    public Obra(String endereco, LocalDate dataDeInicio, LocalDate dataPrevisaoTermino, String nomeDaObra) {
        this(nomeDaObra, endereco, dataDeInicio, dataPrevisaoTermino, null);
    }

    //getters e setters
    public String getNomeDaObra() {
        return nomeDaObra;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public LocalDate getDataPrevisaoTermino() {
        return dataPrevisaoTermino;
    }

    public void setDataPrevisaoTermino(LocalDate dataPrevisaoTermino) {
        this.dataPrevisaoTermino = dataPrevisaoTermino;
    }

    public LocalDate getDataConclusaoFinal() {
        return dataConclusaoFinal;
    }

    public void setDataConclusaoFinal(LocalDate dataConclusaoFinal) {
        this.dataConclusaoFinal = dataConclusaoFinal;
    }

    //método para imprimir os detalhes da obra

    @Override
    public String toString() {
        return super.toString();
    }
}
