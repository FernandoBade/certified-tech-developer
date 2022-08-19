//Enunciado

//        Suponha que temos uma produ��o de roupas e temos que exibir diferentes listas de roupas:
//
//        - Lista Tamanho XS;
//        - Lista Tamanho S;
//        - Lista Tamanho M;
//        - Lista Roupas Importadas;
//        - Lista Roupas em M�s Condi��es.
//
//        Em grupo, utilizando o padr�o flyweight, devemos fazer um projeto para gerar o cliente roupa, com os seguintes atributos:
//
//        - Tamanho: � uma string.
//        - Tipo: � uma string que descreve o tipo de vestu�rio. Exemplo: cal�a.
//        - eNovo: flag (bandeira) para saber se � uma vestimenta nova ou n�o.
//        - importada: flag (bandeira) para saber se � uma vestimenta nacional ou internacional.
//
//        Quando inserida uma nova roupa, cada lista deve ser preenchida de acordo com as informa��es passadas. Por exemplo,
//        uma roupa de tamanho M, que � do tipo cal�a, � nova e importada deve ser salva nas listas de Tamanho M e de Roupas Importadas apenas.
//
//        Em seguida, devemos gerar dois testes: um para verificar se a f�brica retorna o item que precisamos e outro, que mede o
//        tamanho da f�brica e mostra que � menor do que o n�mero de pedidos. Por exemplo, se encomendarmos cinco cal�as iguais e
//        duas camisas iguais, o tamanho da f�brica deve ser dois.

package Aula09_Integradora03.Mesa;

public class Roupa {

    private String tamanho;
    private String tipo;
    private boolean ehNovo;
    private boolean ehImportada;

    public Roupa(String tamanho, String tipo, boolean ehNovo, boolean ehImportada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.ehNovo = ehNovo;
        this.ehImportada = ehImportada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEhNovo() {
        return ehNovo;
    }

    public void setEhNovo(boolean ehNovo) {
        this.ehNovo = ehNovo;
    }

    public boolean isEhImportada() {
        return ehImportada;
    }

    public void setEhImportada(boolean ehImportada) {
        this.ehImportada = ehImportada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ehNovo=" + ehNovo +
                ", ehImportada=" + ehImportada +
                '}';
    }
}
