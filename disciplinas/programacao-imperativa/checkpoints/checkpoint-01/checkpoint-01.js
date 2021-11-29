/* Olá, você foi contratado para executar este projeto. É importante que você analise, entenda o pedido do cliente e desenvolva conforme solicitado. Veja abaixo os requisitos do projeto:

- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); 

- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado for maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!".*/

 
////////// Versão inicial 1.0

// function aquecerComida(prato, tempo) {
//     var tempoIdeal = 0
//     var tempoInsulficiente = "Tempo Insulficiente!"
//     var tempo3x = "KABOOOM!!!"
//     var tempo2x = "Seu prato queimou!"
//     var tempoMedio = "Prato Pronto! Bom Apetiete!"
//     var pratoIncorreto = "Prato Inexistente!"

//     switch (prato) {

//         case "Pipoca":
//             tempoIdeal = 10
//             if (tempo < tempoIdeal) {
//                 return tempoInsulficiente
//             } else if (tempo >= (3 * tempoIdeal)) {
//                 return tempo3x
//             } else if (tempo >= (2 * tempoIdeal)) {
//                 return tempo2x
//             }
//             else {
//                 return tempoMedio
//             } 

//         case "Macarrão":
//             tempoIdeal = 8
//             if (tempo < tempoIdeal) {
//                 return tempoInsulficiente
//             } else if (tempo >= (3 * tempoIdeal)) {
//                 return tempo3x
//             } else if (tempo >= (2 * tempoIdeal)) {
//                 return tempo2x
//             }
//             else {
//                 return tempoMedio
//             } 

//         case "Carne":
//             tempoIdeal = 15
//             if (tempo < tempoIdeal) {
//                 return tempoInsulficiente
//             } else if (tempo >= (3 * tempoIdeal)) {
//                 return tempo3x
//             } else if (tempo >= (2 * tempoIdeal)) {
//                 return tempo2x
//             }
//             else {
//                 return tempoMedio
//             } 

//         case "Feijão":
//             tempoIdeal = 12
//             if (tempo < tempoIdeal) {
//                 return tempoInsulficiente
//             } else if (tempo >= (3 * tempoIdeal)) {
//                 return tempo3x
//             } else if (tempo >= (2 * tempoIdeal)) {
//                 return tempo2x
//             }
//             else {
//                 return tempoMedio
//             } 

//         case "Brigadeiro":
//             tempoIdeal = 8
//             if (tempo < tempoIdeal) {
//                 return tempoInsulficiente
//             } else if (tempo >= (3 * tempoIdeal)) {
//                 return tempo3x
//             } else if (tempo >= (2 * tempoIdeal)) {
//                 return tempo2x
//             }
//             else {
//                 return tempoMedio
//             } 

//         default: return pratoIncorreto
//     }

// }

//////////  Versão aprimorada 2.0

function aquecerComida(prato, tempo) {

    switch (prato) {

        case "Pipoca":
            return validaAquecimento(tempo,10);
            
        case "Macarrão":
            return validaAquecimento(tempo,8);

        case "Carne":
            return validaAquecimento(tempo,15);

        case "Feijão":
            return validaAquecimento(tempo,12);

        case "Brigadeiro":
            return validaAquecimento(tempo,8);

        default: return "Prato Inexistente!"
    }

}

function validaAquecimento (tempo, tempoIdeal){

        if (tempo < tempoIdeal) {
            return "Tempo insulficiente!"
        } else if (tempo >= (3 * tempoIdeal)) {
            return "KABOOM!"
        } else if (tempo >= (2 * tempoIdeal)) {
            return "Seu prato queimou"
        }
        else {
            return "Prato pronto! Bom apetite!"
        }

}

console.log(aquecerComida("Pipoca", 5)); //Tempo insulficiente!
console.log(aquecerComida("Pipoca", 10)); //Prato pronto! Bom apetite!
console.log(aquecerComida("Pipoca", 25)); //Seu prato queimou
console.log(aquecerComida("Pipoca", 50)); //KABOOM!
console.log(aquecerComida("Frango", 25)); //Prato Inexistente!
console.log(aquecerComida("Macarrão", 20)); //Seu prato queimou!
console.log(aquecerComida("Brigadeiro", 15)); //Prato Pronto! Bom Apetiete! 