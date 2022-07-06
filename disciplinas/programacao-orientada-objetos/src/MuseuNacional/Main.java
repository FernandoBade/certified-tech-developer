package MuseuNacional;

//Arthur Campolina
//Fernando Bade
//Douglas Nascimento
//Cristian Fernandes
//Guilherme Carvalho
//Victor Leão
//Luiz Delgado
//Luiz Espicalsky
//Lucas Gabriel Johann

//Padrão Observer
//        Objetivo:
//
//        Modelar e programar em Java as classes do problema abaixo utilizando o Padrão Observer.

//        *************************************************************************************************************************

//        O Museu Nacional pede a modelagem de um novo sistema para a realização de leilões.
//        Um leilão tem um valor em real e uma descrição que descreve o que está sendo leiloado. O leilão deve ser instanciado com um valor inicial.
//        Por outro lado, estão os licitantes. Um licitante tem um nome, sobrenome, identidade e um valor máximo que está disposto a gastar no leilão.
//        Deve ter as seguintes funcionalidades:
//
//        1) O leilão deve ser capaz de notificar todos os licitantes sobre o valor do leilão.
//
//        2) Os licitantes devem poder atuar a cada notificação e, caso o valor do leilão seja inferior ao valor que estão dispostos a pagar, deverá ser
//        exibida uma mensagem indicando o nome do licitante e o lance que ele está propondo.
//
//        Você deve ter todos os getters e setters necessários.



public class Main {

    public static void main(String[] args) {
        Leilao leilao = new Leilao(2500, "Coleção de Livros Barsa");
        Licitante licitante1 = new Licitante("Arthur", "Campolina", "123456789-0", 1000);
        Licitante licitante2 = new Licitante("Fernando", "Bade", "123456789-1", 2000);
        Licitante licitante3 = new Licitante("Douglas", "Nascimento", "123456789-2", 3000);
        Licitante licitante4 = new Licitante("Cristian", "Fernandes", "123456789-3", 4000);
        Licitante licitante5 = new Licitante("Guilherme", "Carvalho", "123456789-4", 5000);
        Licitante licitante6 = new Licitante("Victor", "Leão", "123456789-5", 6000);
        Licitante licitante7 = new Licitante("Luiz", "Delgado", "123456789-6", 7000);
        Licitante licitante8 = new Licitante("Luiz", "Espicalsky", "123456789-7", 8000);
        Licitante licitante9 = new Licitante("Lucas", "Gabriel Johann", "123456789-8", 9000);

        leilao.adicionarLicitante(licitante1);
        leilao.adicionarLicitante(licitante2);
        leilao.adicionarLicitante(licitante3);
        leilao.adicionarLicitante(licitante4);
        leilao.adicionarLicitante(licitante5);
        leilao.adicionarLicitante(licitante6);
        leilao.adicionarLicitante(licitante7);
        leilao.adicionarLicitante(licitante8);
        leilao.adicionarLicitante(licitante9);

        System.out.println(leilao.notificarLicitantes());

    }


}
