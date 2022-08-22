package Aula05_Proxy_Test.Mesa;

import Aula05_Proxy.Mesa.ServicoDownloadProxy;
import org.junit.jupiter.api.Test;

public class DownloadTest {

    @Test
    void setUp() {
        ServicoDownloadProxy proxy = new ServicoDownloadProxy();
        System.out.println(proxy.downloadMusica("1", "Premium", "Bohemian Rhapsody"));
        System.out.println(proxy.downloadMusica("2", "Free", "In the End"));
        System.out.println(proxy.downloadMusica("3", "Premium", "Despacito"));
    }

}
