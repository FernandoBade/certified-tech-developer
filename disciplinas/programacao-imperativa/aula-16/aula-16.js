// Arrow Functions

// let bemVindo = () => "Olá Mundo!";

// let dobro = numero => numero * 2;

// let soma = (a, b) => a + b

// let horaAtual = () => {
//     let data = new Date();
//     return data.getHours() + ":" + data.getMinutes();
// }

// console.log(horaAtual());

// Callbacks 
//------------------------------------
// setTimeout(function(){
//     console.log("Olá");
// }, 2000)
//------------------------------------
// function minhaFuncao(){
//     "Olá"
// }
//------------------------------------
// setTimeout(minhaFuncao, 2000)

// function nomeCompleto (nome, sobrenome){
//     return nome[0] + "" + sobrenome[0];
// };

// function bomDia (nome, sobrenome, callback){
//     return "Olá, " + callback(nome, sobrenome);
// };

// console.log(bomDia("Amanda", "Ferreira", nomeCompleto));

// Crie uma função acaoCarro(), que receberá uma callback como parâmetro. Após isso, crie duas funções: andar() – deve exibir uma mensagem dizendo que o carro está andando – e parar() – deve exibir uma mensagem dizendo que o carro parou.
// Execute ambas as ações utilizando a função acaoCarro(), passando suas ações como callbacks.

function acaoCarro(cb){
    return cb();

};

let andar = () => console.log("O carro está andando");
let andapararr = () => console.log("O carro parou");

acaoCarro(andar)