package Aula03_Integradora01;

public class Afiliados extends Vendedor {

    public Afiliados(String nome, int pontos) {
        super(nome, pontos);
    }

    public Afiliados(String nome) {
        super(nome);
    }

    @Override
    public void vender(int qtdVendas) {
        this.pontos = this.pontos + (qtdVendas * 15);
    }

    @Override
    public void calculaPontos() {
    }

}
