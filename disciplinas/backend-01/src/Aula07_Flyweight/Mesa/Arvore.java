//Enunciado

//        Em uma empresa, eles precisam plantar �rvores para poder ver quanto espa�o ocupariam. O programa que existe atualmente tem
//        um alto consumo de recursos. Voc� precisa plantar 1.000.000 de �rvores. O processo de planta��o das �rvores considera que cada
//        �rvore possui uma Altura, Largura, cor e tipo de �rvore. Os tipos de �rvores que existem s�o:
//
//        - Ornamentais
//            Altura: 200.
//            Largura: 400.
//            Cor: verde.
//
//        - Frut�feras
//            Altura: 500.
//            Largura: 300.
//            Cor: vermelho.
//
//        - Flor�fera
//            Altura: 100.
//            Largura: 200.
//            Cor: azul.
//
//        A floresta � um conjunto de �rvores e permitir� o plantio de �rvores. ArvoreFactory ser� o local onde os diferentes
//        tipos de �rvores ser�o armazenados. Isso permitir�, antes de criar o objeto, validar se j� existe um id�ntico
//        ao que est� sendo solicitado. Em caso afirmativo, retorna o objeto existente; se n�o existir, ele cria o novo objeto e
//        o armazena em cache para ser reutilizado posteriormente.
//
//        Voc� precisa de um sistema que mostre 1.000.000 de �rvores, metade vermelhas e metade verdes e, em seguida, imprima na
//        tela as �rvores e quanta mem�ria est� sendo utilizada.
//
//        Usando esta declara��o, voc� pode ver a mem�ria usada:
//        Runtime runtime = Runtime.getRuntime();
//        System.out.println("Mem�ria utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
//
//        As classes necess�rias devem ser desenvolvidas para atingir o processo de prepara��o explicado.


package Aula07_Flyweight.Mesa;

public class Arvore {
    private String nome;
    private int altura;
    private int largura;
    private String cor;

    public Arvore(String nome, int altura, int largura, String cor) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                '}';
    }
}