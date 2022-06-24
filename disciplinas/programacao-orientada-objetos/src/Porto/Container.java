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
        return "Ficha cadastral do Cont�iner: " + System.lineSeparator()
                + "N�mero de identifica��o: " + numeroDeIdentificacao + System.lineSeparator()
                + "Descri��o: " + descricao + System.lineSeparator()
                + "Pais de origem: " + pais + System.lineSeparator()
                + "Carga perigosa?: " + perigoso + System.lineSeparator();
    }
}
