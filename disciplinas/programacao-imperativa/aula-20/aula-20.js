// Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.

// Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:


const listaPessoas = require('./pessoas')

// a média das idades das pessoas que responderam ótimo;

let votaramOtimo = listaPessoas.filter(otimo => otimo.opniao === 3);

let mediaIdadeOtimo = (idadeOtimo) => {
    let { length } = idadeOtimo;
    return idadeOtimo.reduce((x, y) => {
        return x + (y.idade / length);
    }, 0);
};

console.log(`A média de idade das pessoas que responderam ótimo é de ${mediaIdadeOtimo(votaramOtimo).toFixed(1)} anos.`)

// a quantidade de pessoas que responderam regular;

let totalRegular = 0
for (i = 0; i < listaPessoas.length; i++) {
    if (listaPessoas[i].opniao === 1) {
        totalRegular++;
    }
}
console.log(`O total de pessoas que votaram "Regular" é de ${totalRegular}.`)

// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.


let mediaPessoasBom = 0
for (i = 0; i < listaPessoas.length; i++) {
    if (listaPessoas[i].opniao === 2) {
        mediaPessoasBom++;
    }
}
let porcentagem = (mediaPessoasBom/listaPessoas.length)*100
console.log(`A porcentagem de pessoas que responderam "Bom" é de ${porcentagem}%.`)