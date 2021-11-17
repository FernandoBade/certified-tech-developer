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


let peliculas = ["star wars", "totoro",  "rocky", "pulp fiction",  "la vida es bella"]

for (let x = 0; x < peliculas.length; x++){
console.log(x, " - ", peliculas[x].toUpperCase());
}

// 2.	Agora precisamos modificar afunçãode passagemde elemento() que nos permite adicionar o conteúdo de nossa matriz de filme animado à matriz de filme original.
// função pasajeDeElementos(array1, array2) { 
//  array1.push(array2.pop().  toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array1.push(array2.pop(). toUpperCase()) 
//  array de retorno1  
// }

let animes = ["naruto", "yu yu hakusho", "dragon ball", "pokémon", "cavaleiros do zodíaco"]

function trocaArray(array1, array2) {
    let itemRetirado = array2.pop();
        for (let x = 0; x < array2.length; x++) {
        array1.push(array2[x])
 }
    return array1
}
console.log(trocaArray(peliculas, animes))

