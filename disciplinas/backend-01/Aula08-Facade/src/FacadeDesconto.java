//Enunciado
//
//        Suponha que tenhamos que programar um sistema de cálculo de desconto em um supermercado.
//        Existem descontos cumulativos (as percentagens são somadas) de acordo com:

//        - Por cartão: se for do banco Star Bank, tem um desconto extra de 20%.
//        - Por tipo de produto: as latas têm 10% de desconto.
//        - Por quantidade: se comprarem mais de 12, o desconto é de 15%.

//        Cada política de desconto é implementada em uma API diferente:

//        - ApiCartao: int desconto(Cartao)
//        - ApiProduto: int desconto(Produto)
//        - ApiQuantidade: int desconto(quantidade)

//        Por tanto, se implementará uma fachada (facade) que permita expor o cálculo de desconto de alto nivel que utilize as diferentes APIs.
//        Você também deve modelar as classes:

//        - Produto: nome String e tipo String
//        - Cartao: numero String e banco String

//        Usando o padrão Facade, queremos criar uma fachada que permita simplificar o cálculo de desconto com produto, cartão e quantidade como parâmetros.
//        Gerar casos de teste conforme necessário para assegurar a qualidade do método calcularDesconto().


public class FacadeDesconto implements IFacadeDesconto{

    //armazenam nas variáveis uma instância de uma
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //construtor que cria as instâncias
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