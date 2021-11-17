// Repetir como um papagaio
// Crie um loop utilizando for que se repita 5 vezes. Dentro de cada repetição se deve mostrar no console a mensagem “Olá mundo”.

for (let papagaio = 0 ; papagaio < 5; papagaio++){
    console.log(papagaio, "Olá Mundo! ");
}

// Contando números ímpares
// Crie um loop for de 1 a 10, em que exiba no console apenas o valor das repetições de números ímpares. Dica: A ideia é que nas repetições ímpares de 0 ao 10 (1,3,5,7,9) sejam mostrados os números das repetições no console.

console.log("------------------------");

for (let impares = 0; impares < 10; impares++){
    if (impares%2 != 0){
        console.log("São números ímpares: ", impares);
    }
}


// Criando a tabuada
// Crie uma tabuada utilizando o for. Dica: Para essa tarefa você irá precisar utilizar dois loops (for).

console.log("------------------------");


let escolhaNumero = 7;
for (let tabuada = 0; tabuada <= 10; tabuada++){
    let resultadoTabuada = tabuada * escolhaNumero;

    console.log(escolhaNumero, (" * "), tabuada, (" = "), resultadoTabuada);
}
