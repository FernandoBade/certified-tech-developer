// Para essa oportunidade vamos retomar a atividade da aula anterior, você se lembra? Estávamos trabalhando em arrays, acessando-os, modificando-os, adicionando e removendo elementos, e algumas outras coisas. Mas como vimos naquela aula, muitas tarefas foram repetidas mesmo dentro da mesma função, parecia que tínhamos que executar o mesmo passo várias vezes, um número x de vezes. Vamos ver se podemos dar algum dinamismo e eficiência ao nosso código...

// 1.	Começamos a partir de nossa variedade de filmes, que tínhamos o seguinte:

// let peliculas = ["star wars", "totoro",  "rocky", "pulp fiction",  "la vida es bella"]

// e nos pediram para passar todos os elementos para letras maiúsculas, o que na época tínhamos feito de forma "manual". Vamos movê-lo para uma maneira mais automática usando loops.

// function convertirAMayusculas(array){
//   array[0] = array[0].toUpperCase()
//   array[1] = array[1].toUpperCase()
//   array[2] = array[2].toUpperCase()
//   array[3] = array[3].toUpperCase()
//   array[4] = array[4].toUpperCase()
//   return array
// }


// let peliculas = ["star wars", "totoro",  "rocky", "pulp fiction",  "la vida es bella"]

// for (let x = 0; x < peliculas.length; x++){
// console.log(x, " - ", peliculas[x].toUpperCase());
// }

// 2.	Agora precisamos modificar afunçãode passagemde elemento() que nos permite adicionar o conteúdo de nossa matriz de filme animado à matriz de filme original.
// função pasajeDeElementos(array1, array2) { 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array de retorno1  
// }

// let animes = ["naruto", "yu yu hakusho", "dragon ball", "pokémon", "cavaleiros do zodíaco"]

// function passarElemento(array1, array2) {
    
// let qtd = array2.length;
//         for (let i = 0; i < qtd; i++) {
//     array1.push(array2.pop().toUpperCase())
//     }
//     return array1
// }
// console.log(passarElemento(peliculas, animes))

//3.	A partir deste ponto, se você decidiu trabalhar em um arquivo diferente ao invés de modificar o anterior, lembre-se que tivemos um infiltrado dentro de nossos filmes de animação, o qual tivemos que tirar e salvar em outra variável antes de fazer a passagem de elementos de um array para outro!

let animes = ["naruto", "yu yu hakusho", "dragon ball", "pokémon", "cavaleiros do zodíaco"]

function passarElemento(array1, array2) {
let impostor = array2.pop()
let qtd = array2.length;
        for (let i = 0; i < qtd; i++) {
    array1.push(array2.pop().toUpperCase())
    }
    return array1
}
console.log(animes)

//4.	Finalmente, devemos modificar nossa função comparadora para os filmes como temos feito até agora.

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5]; 

function compararClassificacoes(asia, europa) {
  let comparacoesAsiaEuropa = []
  comparacoesAsiaEuropa[0] = asia[0] === europa[0]
  comparacoesAsiaEuropa[1] = asia[1] === europa[1]
  comparacoesAsiaEuropa[2] = asia[2] === europa[2]
  comparacoesAsiaEuropa[3] = asia[3] === europa[3]
}