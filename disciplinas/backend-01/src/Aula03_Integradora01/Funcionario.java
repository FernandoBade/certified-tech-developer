package Aula03_Integradora01;


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

    @Override
    public void calculaPontos() {
        this.pontos = this.pontos + (this.tempoDeCasa * 5);
    }

    public void obterAfiliado(int qtdAfiliados) {
        this.pontos = this.pontos + (qtdAfiliados * 10);
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }


}
