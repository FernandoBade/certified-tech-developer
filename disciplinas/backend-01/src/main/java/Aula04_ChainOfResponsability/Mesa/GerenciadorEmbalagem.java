package Aula04_ChainOfResponsability.Mesa;

public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Produto produto) {
        if(produto.getEmbalagem()=="Saudável" || produto.getEmbalagem()=="Quase saudável"){
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
            System.out.println("O Produto "+produto.getNome()+" não passou no teste de qualidade. Emabalagem fora do padrão.");
        }
    }
}