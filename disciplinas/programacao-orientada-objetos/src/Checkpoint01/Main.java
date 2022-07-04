package Checkpoint01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Cria uma nova sess�o de jogo
        SessaoDeJogo<Jogador> sessaoDeJogo = new SessaoDeJogo<>("A escurid�o de Bahamut", "Dif�cil", new Date(2022, 6, 20, 22,0), 30);

        //Cria��o de jogadores
        Jogador jogador1 = new Jogador("Fernando", "(11) 9 9999-9999");
        Jogador jogador2 = new Jogador("Daniel", "(12) 8 8888-8888");
        Jogador jogador3 = new Jogador("Amanda", "(13) 7 7777-7777");

        //Adicionando jogadores � sess�o
        sessaoDeJogo.adicionarJogador(jogador1);
        sessaoDeJogo.adicionarJogador(jogador2);
        sessaoDeJogo.adicionarJogador(jogador3);

        //Cria��o de um novo personagem da classe Mago
        Mago elanor = new Mago(
                "Elanor",
                "Feiticeira de Fogo | Mago",
                "�lfica",
                "Feminino",
                "Ap�s acordar muito ferida nas profundezas da Floresta das M�goas, Eleanor n�o se lembra "+ System.lineSeparator() +
                        "          de nada que aconteceu e n�o tem certeza de sua pr�pria idade. Hoje procura nos livros de "+ System.lineSeparator()+
                        "          magia alguma forma de descobrir seu verdadeiro nome e os segredos sobre o seu passado.",
                9,
                11,
                8,
                12,
                10,
                10);

        //Adi��o de novas magias ao personagem da classe Mago. Cada uma das magias tem 75% de chance de ser aprendida
        elanor.aprenderMagia("Bola de Fogo");
        elanor.aprenderMagia("Parede de Fogo");
        elanor.aprenderMagia("M�sseis M�gicos");
        elanor.aprenderMagia("Curar Ferimentos Leves");

        //Adi��o de experi�ncia ao personagem
        elanor.ganharExperiencia(7000);
        elanor.subirDeNivel();

        //Cria��o de um novo personagem da classe B�rbaro
        Barbaro signar = new Barbaro(
                "Signar Bulak",
                "Mestre dos Machados Irm�os | B�rbaro",
                "Humano",
                "Masculino",
                "Depois de d�cadas lutando pelo ex�rcito do Rei Bjorn e sendo temido nos campos de " + System.lineSeparator() +
                        "          batalha, a vida de Signar Bulak mudou quando encontrou uma jovem beirando " + System.lineSeparator()+
                        "          a morte durante uma de suas miss�es. Tocado pela crueldade com que foi atacada " + System.lineSeparator() +
                        "          e pela  familiaridade de seu rosto, agora busca encontrar os respons�veis " + System.lineSeparator() +
                        "          por toda a crueldade que fizeram com ela.",
                12,
                11,
                11,
                8,
                10,
                8);

        //Adi��o de novas habilidades ao personagem da classe B�rbaro. Cada uma das habilidades tem 75% de chance de ser aprendida
        signar.aprenderHabilidade("Per�cia com Machados");
        signar.aprenderHabilidade("Arreme�ar Machados");
        signar.aprenderHabilidade("Defesa Cruzada");
        signar.aprenderHabilidade("Estancar Sangramento");

        //Cria��o de um novo personagem da classe Ladr�o
        Ladrao sarah = new Ladrao(
                "Sarah Linday",
                "Ladina do Sono | Ladr�o",
                "Halfling",
                "Feminino",
                "Se esgueirando pelas sombras e utilizando seus venenos para entrar e sair das masmorras " + System.lineSeparator() +
                        "          mais profundas dos 9 reinos, a pequenina com menos de 80 cent�metros consegue " + System.lineSeparator() +
                        "          desmaiar o maior dos orcs sem deixar nenhum rastro por onde passa. Gananciosa e muito" + System.lineSeparator() +
                        "          astuciosa, � procurada pro toda a Terra M�dia e tem uma recompensa por sua cabe�a.",
                9,
                15,
                7,
                9,
                8,
                12) {

        };

        //Adi��o de novos venenos ao personagem da classe Ladr�o. Cada um dos venenos tem 75% de chance de ser aprendido
        sarah.aprenderVeneno("Veneno do Sono Profundo");
        sarah.aprenderVeneno("Veneno Paralisante");
        sarah.aprenderVeneno("Veneno da Morte");
        sarah.aprenderVeneno("Veneno da Verdade");


        //Adicionando os personagens para seus respectivos jogadores
        jogador1.adicionarPersonagem(elanor);
        jogador2.adicionarPersonagem(signar);
        jogador3.adicionarPersonagem(sarah);

        System.out.println(sessaoDeJogo);

    }

}