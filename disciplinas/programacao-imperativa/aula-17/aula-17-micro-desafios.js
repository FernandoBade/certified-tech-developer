
let num = [1,5,9,3,7];

let juntar = num.reduce(function(juntados, numero){
        return juntados + " - " + numero;
    });

console.log(juntar);



let nomes = ["Maria", "Mariano", "Marcela", "Marcos", "Maria Aparecida", "Maria"];

let marias = nomes.filter(function(nomes){
    return nomes == "Maria";
});

console.log(marias);
