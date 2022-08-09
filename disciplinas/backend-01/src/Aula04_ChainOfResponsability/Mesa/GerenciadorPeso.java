package Aula04_ChainOfResponsability.Mesa;

public class GerenciadorPeso extends Gerenciador{

    @Override
    public void verificar(Produto produto) {
        if(produto.getPeso()>1200 && produto.getPeso()<1300){
            if(this.gerenciadorSeguinte!=null) {
                System.out.println("O Produto "+produto.getNome()+" passou no teste de peso");
                this.gerenciadorSeguinte.verificar(produto);
            }
            else{
                System.out.println("O Produto "+produto.getNome()+" passou no teste de peso");
                System.out.println("O Produto passou no teste de qualidade.");
            }
        }
        else{
            System.out.println("O Produto "+produto.getNome()+" não passou no teste de qualidade. Peso fora do padrão.");
        }
    }
}