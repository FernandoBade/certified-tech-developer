//Enunciado
//        Quando vamos contratar um servi�o de turismo como um voo ou um hotel, temos que solicitar cada um separadamente.
//        Vamos criar um sistema que nos permita procurar um hotel e um voo em um mesmo pedido. Para isso ser� necess�rio interagir com dois sistemas.
//        J� implementamos os sistemas de voos e hot�is que possuem a funcionalidade de busca de acordo com:
//
//        - Busca de voos: por data de partida, data de retorno, origem e destino.
//        - Busca de hot�is: por data de entrada, data de sa�da, cidade.
//
//        Ser� implementada uma fachada simples que permite expor um m�todo que realiza as buscas, tendo o cuidado de interagir
//        com os sistemas de pesquisa e n�o ter que lidar com a complexidade dos referidos sistemas a partir do m�todo main.
//        Voc� precisa ver na tela quais voos e hot�is est�o dispon�veis. Os par�metros de pesquisa s�o apenas a cidade do hotel (String),
//        que � a mesma do destino do voo, e as datas ida-e-volta, que s�o as mesmas para a pesquisa do voo e do hotel.
//
//        O pedido para a fachada, portanto, em uma �nica chamada inclui as outras duas.
//
//        N�o se esque�a de implementar os casos de teste necess�rios a fim de garantir a qualidade do c�digo produzido.
//
//

package Aula08_Facade.Mesa;

public class Voo {

    public String destino;
    public String dataIda;
    public String dataVolta;

        public void disponibilidade(String destino, String dataIda, String dataVolta) {
        }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }
}
