package Aula05.Mesa;

public class ServicoDownloadProxy implements ServicoDownload{

    @Override
    public String downloadMusica(String identificador, String tipoUsuario, String nomeMusica) {
        if(tipoUsuario.equals("Premium")) {
            return "Link para assistir sua m�sica: www.spotify.com/" + nomeMusica.toLowerCase().replaceAll("[^a-z]", "") + "/download";
        } else {
            return "Voc� n�o tem permiss�o para fazer download de m�sicas.";
        }
    }
}
