package Aula02.Mesa;



public class Funcionario extends Vendedor {

    private int tempoDeCasa;

    public Funcionario(String nome, int pontos, int tempoDeCasa) {
        super(nome, pontos);
        this.tempoDeCasa = tempoDeCasa;
    }

    public Funcionario(String nome, int pontos) {
        super(nome, pontos);
        this.tempoDeCasa = 0;
    }

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void vender(int qtdVendas) {
        this.pontos = this.pontos + (qtdVendas * 5);
    }

    public void obterAfiliado(int qtdAfiliados) {
        this.pontos = this.pontos + (qtdAfiliados * 10);
    }

}
