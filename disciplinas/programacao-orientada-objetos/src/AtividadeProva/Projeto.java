package AtividadeProva;

public class Projeto {
    private final String identificador;
    private String nomeDoProjeto;
    private final String cidade;
    public Obra obra;
    private Status status; //busca as 3 opções de status pelo Enum "Status"

    public Projeto(String identificador, String nomeDoProjeto, String cidade, Obra obra, Status status) {
        this.identificador = identificador;
        this.nomeDoProjeto = nomeDoProjeto;
        this.cidade = cidade;
        this.obra = obra;
        this.status = status;
    }

    //caso não seja fornecido um status inicial, será setada a opção "CALCULANDO"
    public Projeto(String identificador, String nomeDoProjeto, Obra obra, String cidade) {
        this(identificador, nomeDoProjeto, cidade, obra, Status.CALCULANDO);
    }

    //getters e setters
    public String getIdentificador() {
        return identificador;
    }


    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public String getCidade() {
        return cidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //método para alterar o status do projeto
    public void alterarStatus(Status status) {
        this.status = status;
    }

    //método para imprimir o projeto
    public String imprimirProjeto() {
        return "---------------------------------" + System.lineSeparator() +
                "Identificador: " + identificador + System.lineSeparator() +
                "Nome do projeto: " + nomeDoProjeto + System.lineSeparator() +
                "Cidade: " + cidade + System.lineSeparator() +
                "Detalhes da obra: " + obra.toString() + System.lineSeparator() +
                "Status: " + status.getDescricao() + System.lineSeparator() +
                "---------------------------------" + System.lineSeparator();
    }

    //metodo para saber se o prazo foi cumprido
    public String prazoCumprido() {
        int comparaAsDatas = obra.getDataPrevisaoTermino().compareTo(obra.getDataConclusaoFinal());
        if (comparaAsDatas == 0) {
            return "O prazo foi cumprido";
        } else if (comparaAsDatas < 0) {
            return "O prazo não foi cumprido";
        } else {
            return "O prazo foi cumprido";
        }
    }
}
