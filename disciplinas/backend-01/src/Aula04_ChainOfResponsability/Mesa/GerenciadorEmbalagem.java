package Aula04_ChainOfResponsability.Mesa;

public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Produto produto) {
        if(produto.getEmbalagem()=="Saud�vel" || produto.getEmbalagem()=="Quase saud�vel"){
            if(this.gerenciadorSeguinte!=null) {
                System.out.println("O Produto "+produto.getNome()+" passou no teste de Embalagem");
                this.gerenciadorSeguinte.verificar(produto);
            }
            else{
                System.out.println("O Produto "+produto.getNome()+" passou no teste de Embalagem");
                System.out.println("O Produto passou no teste de qualidade.");
            }
        }
        else{
            System.out.println("O Produto "+produto.getNome()+" n�o passou no teste de qualidade. Emabalagem fora do padr�o.");
        }
    }
}