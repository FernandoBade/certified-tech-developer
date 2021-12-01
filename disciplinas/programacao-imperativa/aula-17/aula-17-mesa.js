// 1) Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os valores divididos pela soma de toda a matriz, usando map() e reduce().

// let numeros = [1,2,3,4];

// let reduzir = numeros.reduce(function (acumulador, item) {
//     return acumulador+item;

// });

// let conta = numeros.map(function (item) {
//     return item/reduzir;
// });
// console.log(reduzir);
// console.log(conta);


// 2) Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ())

let arrayPalavras = ["Abacate", "Bola", "Casa", "Dicionário", "Escola", 3]

let filtro = arrayPalavras.filter(function (palavras) {
    return palavras.lengh > arrayPalavras.pop()
})
console.log(arrayPalavras);

function test (array, num){
    let array1 = array.filter(string => {
         return string.length > num;
      })

      return array1;
 }
