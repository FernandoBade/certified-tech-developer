//Enunciado
//        No servi�o Spotify pago, voc� pode baixar m�sicas para ouvir offline. Quando um usu�rio solicita o
//        download de uma m�sica, o servi�o Spotify verifica se ele � um usu�rio premium para dar acesso a essa funcionalidade.
//        Os usu�rios possuem um identificador e uma string com o tipo de usu�rio ("Free", "Premium").
//
//        Implementar uma classe servicoDownload que permita baixar uma m�sica e mediante o Proxy pattern comprovar se � poss�vel faz�-lo.


package Aula05.Mesa;

public interface ServicoDownload {

        public String downloadMusica(String idUsuario, String tipoUsuario, String nomeMusica);


}
