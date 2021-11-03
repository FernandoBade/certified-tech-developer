const nome = "José";
let sobrenome = "da Silva";
let idade = 27;
let peso = 83.5;
let altura = 1.70;
let plano = true;
let imc =  peso /(altura*altura);
imc = imc.toFixed(2);

console.log("O senhor", nome, sobrenome, "tem", idade, "anos e seu IMC é de", imc, ".");