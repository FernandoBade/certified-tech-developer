//Exerc�cio
//        Para representar cada uma das caracter�sticas do animal de estima��o, crie uma vari�vel e atribua a ela o valor correspondente no Replit.
//        N�o se esque�a de dar o tipo certo ao que queremos que contenha.
//        Para cada animal listado na tabela a seguir, teremos que exibir as informa��es correspondentes.
//        As informa��es ser�o exibidas como o seguinte exemplo:
//
//        ?Shesheu 2 anos?
//        ?Shesheu come um 1kg e meio e faz au au?
//
//
//        Shesheu
//        2 anos
//        1kg e meio
//        Como � o latido?
//
//        Nemo
//        1 ano
//        140 gramas
//        Que som suas bolhas de ar fazem na �gua?
//
//        Snow
//        3 anos
//        meio quilo
//        Como soa seu miado?



class QuantoComeAnimais {
    public static void main(String[] args) {

        String cachorro = "Shesheu";
        int idadeCachorro = 2;
        double comidaCachorro = 1.5;
        String latido = "au au";

        // System.out.println(cachorro + " tem " + idadeCachorro + " anos, come " +
        // comidaCachorro + "kg e faz " + latido);

        String peixe = "Nemo";
        int idadePeixe = 1;
        int comidaPeixe = 140;
        String bolhasDeAr = "glub glub";

        // System.out.println(peixe + " tem " + idadePeixe + " ano, come " + comidaPeixe
        // + " gramas e faz " + bolhasDeAr);

        String gato = "Snow";
        int idadeGato = 2;
        double comidaGato = 0.5;
        String miado = "miau";

        // System.out.println(gato + " tem " + idadeGato + " anos, come " + comidaGato +
        // "kg e faz " + miado);

        String mensagemCachorro = String.format("O %s tem %s anos, come %s kg e faz %s.", cachorro, idadeCachorro,
                comidaCachorro, latido);
        String mensagemPeixe = String.format("O %s tem %s anos, come %s kg e faz %s.", peixe, idadePeixe, comidaPeixe,
                bolhasDeAr);
        String mensagemGato = String.format("O %s tem %s anos, come %s kg e faz %s.", gato, idadeGato, comidaGato,
                miado);

        System.out.println(mensagemCachorro);
        System.out.println(mensagemPeixe);
        System.out.println(mensagemGato);

    }
}