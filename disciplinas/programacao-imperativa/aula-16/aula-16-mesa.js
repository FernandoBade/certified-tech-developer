// Objetivo
// Neste exercício, você terá que criar uma função "FizzBuzz" que recebe dois parâmetros numéricos.
// A função deve atender aos seguintes requisitos:
// ●	Você deve imprimir os números de 1 a 100;
// ●	Se o número a ser impresso for um múltiplo de seu PRIMEIRO parâmetro, você deve imprimir a palavra “Fizz” em vez do número correspondente;
// ●	Se o número a ser impresso for um múltiplo do seu SEGUNDO parâmetro, você deve imprimir a palavra "Buzz" em vez do número correspondente;
// ●	Se o número for um múltiplo de AMBOS os parâmetros, você deve imprimir a palavra “FizzBuzz”.
function fizzBuzz(n1, n2) {
    for (let i = 0; i <= 100; i++) {

        if (i % n1 === 0 && i % n2 != 0) {
            console.log("fizz")
        }
        else if (i % n2 === 0  && i % n1 != 0) {
            console.log("buzz")
        }
        else if (i % n2 === 0 && i % n1 === 0) {
            console.log("fizz buzz")
        }
        else {
            console.log(i)
        }
    }

}

fizzBuzz(2, 5);
