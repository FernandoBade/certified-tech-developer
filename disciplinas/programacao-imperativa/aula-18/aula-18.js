// 1) Loop de Pares
// Você deve criar uma função chamada loopDePares que receba um número como parâmetro e faça loops de 0 a 100 mostrando cada número do loop no console.
// Caso o número da iteração somado com o número passado pelo parâmetro seja par, aparecerá no console: "O número x é par"

// function loopDePares(numero){
//     for(let i = 0 ; i <= 100; i++){
//         console.log(i)
//     }

function loopDePares(numero) {
    for (let i = 0; i <= 100; i++) {
        if ((numero + --i) % 2 == 0) {
            return console.log(`O número ${numero} é par`)
        }
    }
}
loopDePares(8)
