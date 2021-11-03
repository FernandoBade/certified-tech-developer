// Crie uma função adicionar, que deverá receber dois parâmetros e retornar a soma deles.

function adicionar(x,y) {
    return x+y
  }

// Crie uma função de subtração, que deverá receber dois parâmetros e retornar a subtração do primeiro menos o segundo.

function subtrair(x,y) {
    return x-y
  }

//Crie uma função de multiplicação, que deverá receber dois parâmetros e retornar o resultado de sua multiplicação.

function multiplicacao(x,y) {
    return x*y
  }

// Crie uma função de divisão, que receberá dois parâmetros e retornará o resultado da divisão do primeiro sobre o segundo.

function divisao(x,y) {
    return x/y
  }
  
// No seu arquivo calculadora.js,  a partir das 4 funções feitas anteriormente, crie um console.log no qual você irá colocar uma string para indicar que abaixo dela você começará a testar as funções, por exemplo:

  console.log ("-------------- Teste de Operações / Calculadora --------------")

// Execute a função que soma e a função que subtrai, passando quaisquer dois números como argumentos. Mostrar resultados no console.

  console.log("Números utilizados: 5 e 8")
  console.log("Resultado da soma: " + adicionar(5,8));
  console.log("Resultado da subtração: " + subtrair(5,8));

// Execute a função que multiplica, passando quaisquer dois números como argumentos. Mostre o resultado no console.

  console.log("Resultado da multiplicação: " + multiplicacao(5,8));

// Execute a função que faz divisão, passando quaisquer dois números como argumentos. Mostre o resultado no console.

  console.log("Resultado da divisao: " + divisao(5,8));

// Execute a função que faz divisão, passando agora o número zero como um dos dois argumentos. Mostre o resultado no console.

  console.log("Resultado da divisao por zero: " + divisao(5,0));

// Crie uma função chamada quadradoDoNumero, que recebe um número como parâmetro e deve retornar esse número multiplicado por ele mesmo, ou seja, ao quadrado.

function quadradoNumero(x) {
  return x*x
}
console.log ("-------------- Calculadora Avançada --------------")

  console.log("Resultado da elevação ao quadrado: 9^2 = " + quadradoNumero(9));


// Crie a função mediaDeTresNumeros, ela deve calcular a média de 3 números, que serão inseridos por parâmetro.

  function mediaDeTresNumeros(x, y, z) {
      return (x + y + z) /(3)
  }
  console.log("Resultado da média de 3 números: 18, 27 e 35 = " + mediaDeTresNumeros(18, 27 ,35).toFixed(2));

// Crie a função calculaPorcentagem, que receberá dois parâmetros: o número total e a porcentagem que deseja calcular, e que deverá retornar x% de totalPorcentagem.

function calculaPorcentagem(x, y) {
    return ((y*x)/100).toFixed(2)
}
console.log("Resultado da porcentagem: 25% de 300 = " + (calculaPorcentagem(300,25))+"%");

// Crie uma função geradorDePorcentagem que leva dois parâmetros, e que deverá retornar a porcentagem do primeiro em relação ao segundo parâmetro.

function geradorDePorcentagem(x, y) {
    return ((x/y)*100).toFixed(2)
}
console.log("Resultado da porcentagem solicitada: 2 de 200 = " + (geradorDePorcentagem(2,200))+"%");
