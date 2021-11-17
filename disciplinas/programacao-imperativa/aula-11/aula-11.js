for (let contador = 0; contador <= 3; contador++){
console.log("Contador: " + contador);
}


for (let contador = 0; contador <= 5; contador++){
    let resultado = contador * 2;
    console.log("Contador: " + contador, "* 2 é igual a ", resultado);
}

let lista = ["Gandalf", "Frodo", "Legolas", "Aragorn", "Sam", "Gimili"];

console.log(lista);

for (let x = 0; x < lista.length; x++)
console.log(x, " - ", lista[x]);


let contagem = 1
while(contagem <= 5){
    console.log("A contagem está em ", contagem);
    contagem++;
}