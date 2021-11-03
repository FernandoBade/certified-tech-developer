function adicionar(x,y) {
    return x+y
  }
function subtrair(x,y) {
    return x-y
  }
function multiplicacao(x,y) {
    return x*y
  }
function divisao(x,y) {
    return x/y
  }
  
  console.log ("-------------- Teste de Operações / Calculadora --------------")

  console.log("Números utilizados: 5 e 8")

  console.log("Resultado da soma: " + adicionar(5,8));

  console.log("Resultado da subtração: " + subtrair(5,8));

  console.log("Resultado da multiplicação: " + multiplicacao(5,8));

  console.log("Resultado da divisao: " + divisao(5,8));

  console.log("Resultado da divisao por zero: " + divisao(5,0));


//Crie uma função chamada quadradoDoNumero, que recebe um número como parâmetro e deve retornar esse número multiplicado por ele mesmo, ou seja, ao quadrado.

function quadradoNumero(x) {
  return x*x
}
console.log ("-------------- Calculadora Avançada --------------")

  console.log("Resultado da elevação ao quadrado: 9^2 = " + quadradoNumero(9));


//Crie a função mediaDeTresNumeros, ela deve calcular a média de 3 números, que serão inseridos por parâmetro.


  function mediaDeTresNumeros(x, y, z) {
      return (x + y + z) /(3)
  }

  console.log("Resultado da média de 3 números: 18, 27 e 35 = " + mediaDeTresNumeros(18, 27 ,35).toFixed(2));

//Crie a função calculaPorcentagem, que receberá dois parâmetros: o número total e a porcentagem que deseja calcular, e que deverá retornar x% de totalPorcentagem.

function calculaPorcentagem(x, y) {
    return ((y*x)/100).toFixed(2)
}

console.log("Resultado da porcentagem: 25% de 300 = " + (calculaPorcentagem(300,25))+"%");

// Crie uma função geradorDePorcentagem que leva dois parâmetros, e que deverá retornar a porcentagem do primeiro em relação ao segundo parâmetro.

function geradorDePorcentagem(x, y) {
    return ((x/y)*100).toFixed(2)
}

console.log("Resultado da porcentagem solicitada: 2 de 200 = " + (geradorDePorcentagem(2,200))+"%");
