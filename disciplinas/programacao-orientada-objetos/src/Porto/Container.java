package Porto;

public class Container {
    private final String numeroDeIdentificacao;
    private final String descricao;
    private final String pais;
    private boolean perigoso;

    public Container(String numeroDeIdentificacao, String descricao, String pais, boolean perigoso) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.descricao = descricao;
        this.pais = pais;
        this.perigoso = perigoso;
    }

    public String getNumero() {
        return numeroDeIdentificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPais() {
        return pais;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public String toString() {
        return "Ficha cadastral do Contêiner: " + System.lineSeparator()
                + "Número de identificação: " + numeroDeIdentificacao + System.lineSeparator()
                + "Descrição: " + descricao + System.lineSeparator()
                + "Pais de origem: " + pais + System.lineSeparator()
                + "Carga perigosa?: " + perigoso + System.lineSeparator();
    }
}
