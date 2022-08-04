package Aula04.Mesa;

public class GerenciadorLote extends Gerenciador{

    @Override
    public void verificar(Produto produto) {
        if(produto.getLote()>1000 && produto.getLote()<2000){
            if(this.gerenciadorSeguinte!=null) {
                System.out.println("O Produto "+produto.getNome()+" passou no teste de lote");
                this.gerenciadorSeguinte.verificar(produto);
            }
            else{
                System.out.println("O Produto "+produto.getNome()+" passou no teste de lote");
                System.out.println("O Produto passou no teste de qualidade.");
            }
        }
        else{
            System.out.println("O Produto "+produto.getNome()+" não passou no teste de qualidade. Lote fora do padrão.");
        }
    }
}