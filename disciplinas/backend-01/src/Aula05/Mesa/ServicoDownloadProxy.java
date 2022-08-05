package Aula05.Mesa;

public class ServicoDownloadProxy implements ServicoDownload{

    @Override
    public String downloadMusica(String identificador, String tipoUsuario, String nomeMusica) {
        if(tipoUsuario.equals("Premium")) {
            return "Link para assistir sua música: www.spotify.com/" + nomeMusica.toLowerCase().replaceAll("[^a-z]", "") + "/download";
        } else {
            return "Você não tem permissão para fazer download de músicas.";
        }
    }
}
