//Enunciado
//        No serviço Spotify pago, você pode baixar músicas para ouvir offline. Quando um usuário solicita o
//        download de uma música, o serviço Spotify verifica se ele é um usuário premium para dar acesso a essa funcionalidade.
//        Os usuários possuem um identificador e uma string com o tipo de usuário ("Free", "Premium").
//
//        Implementar uma classe servicoDownload que permita baixar uma música e mediante o Proxy pattern comprovar se é possível fazê-lo.


package Aula05.Mesa;

public interface ServicoDownload {

        public String downloadMusica(String idUsuario, String tipoUsuario, String nomeMusica);


}
