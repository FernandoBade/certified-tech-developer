//Enunciado
//
//        Suponha que tenhamos que programar um sistema de c�lculo de desconto em um supermercado.
//        Existem descontos cumulativos (as percentagens s�o somadas) de acordo com:

//        - Por cart�o: se for do banco Star Bank, tem um desconto extra de 20%.
//        - Por tipo de produto: as latas t�m 10% de desconto.
//        - Por quantidade: se comprarem mais de 12, o desconto � de 15%.

//        Cada pol�tica de desconto � implementada em uma API diferente:

//        - ApiCartao: int desconto(Cartao)
//        - ApiProduto: int desconto(Produto)
//        - ApiQuantidade: int desconto(quantidade)

//        Por tanto, se implementar� uma fachada (facade) que permita expor o c�lculo de desconto de alto nivel que utilize as diferentes APIs.
//        Voc� tamb�m deve modelar as classes:

//        - Produto: nome String e tipo String
//        - Cartao: numero String e banco String

//        Usando o padr�o Facade, queremos criar uma fachada que permita simplificar o c�lculo de desconto com produto, cart�o e quantidade como par�metros.
//        Gerar casos de teste conforme necess�rio para assegurar a qualidade do m�todo calcularDesconto().


public class FacadeDesconto implements IFacadeDesconto{

    //armazenam nas vari�veis uma inst�ncia de uma
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //construtor que cria as inst�ncias
    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //simplifica os descontos
    public int desconto(Cartao cartao,Produto prod, int quantidade){
        int desconto = 0;
        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(prod);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;
    }
}