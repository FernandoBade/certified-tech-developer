class Main {
    public static void main(String[] args) {
        // String nome = "ernando Bade";
        // char primeiraLetra = 'F';

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