package RotaMapa;

//Enunciado

// Fernando Bade
// Andre Pedresqui
// Geyson Kaio
// Guilherme Carvalho
// Arthur Campolina
// Luiz delgado
// Matheus Abreu

//        Trata-se de encontrar e informar o tempo de uma rota no mapa dado dois pontos. Cada ponto est� localizado no
//        mapa de acordo com os dois valores: latitude e longitude. A forma de calcular o tempo de viagem � de acordo
//        com a movimenta��o da pessoa, que pode ser de carro, bicicleta ou a p�.

//        O tempo em minutos pode ser calculado com a seguinte f�rmula:

//        Caminhando: dist�ncia / 0.20366 * 13
//        Autom�vel: dist�ncia / 0.40366 * 4
//        Bicicleta: dist�ncia / 0.050366 * 1.5

//        Sendo a dist�ncia = abs(latitude1 - latitude2) + abs(longitude1 - longitude2).

//        Eles devem desenvolver as seguintes funcionalidades:
//        Ser capaz de calcular o tempo de viagem, dado dois pontos e uma maneira de se locomover.
//        Poder definir uma classe pontos que ter� um construtor com par�metros que ser�o latitude e longitude.

//        Poder calcular a dist�ncia entre dois pontos com um m�todo da classe pontos que recebe outro ponto como par�metro.

//        Reproduza a seguinte situa��o em uma classe CalculaMapa que cont�m o m�todo main:

//        Crie alguns pontos em um mapa.

//        Calcule e mostre os tempos de viagem de acordo com as diferentes formas de transporte.

//        Nota: o valor absoluto � calculado usando o m�todo abs da classe Math: java.lang.Math.abs

public class Main {
}
