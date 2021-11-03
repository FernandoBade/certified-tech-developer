function somar(a, b){
    //  console.log(a + b);
    return (a + b)
}

somar (10,5);

function nomePessoa(nome, idade){
    return nome+" tem a idade de "+idade+" anos.";
}
console.log(nomePessoa("Marcos", 25));
console.log(nomePessoa("João", 30));
console.log(nomePessoa("Ana", 27));

let sub = function(x,y){ //função anônima
    console.log(x-y);
}

sub(5, 2);


console.log(Math.random());