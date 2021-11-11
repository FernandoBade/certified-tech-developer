let nome ="Fernando Ramos Bade"

console.log(nome);
console.log(nome.length);
console.log(nome.trim());
nome = nome.trim();
console.log(nome.split(" "));

let lista = ["Gandalf", "Frodo", "Legolas", "Aragorn", "Sam", "Gimili", 11, true];

console.log(lista[4]); //exibe uma posição dentro do array
lista[4] = "Elrond;"
console.log(lista[4]); 

lista.push("Galadriel", "Gandalf", "Sauron", "Gandalf"); //insere dado no final da lista
console.log(lista);

let deletarUltimoDaLista = lista.pop() //deleta o último da lista
console.log(lista)
console.log(deletarUltimoDaLista)

let deletarPrimeiroDaLista = lista.shift(); //deleta o primeiro da lista
console.log(lista)
console.log(deletarPrimeiroDaLista)

let colocarInicioDaLista = lista.unshift("Galdalf"); //insere dado no iníncio da lista
console.log(lista);

let transformaEmString = lista.join(" • "); // Transdorma o array numa ínica string, onde pode-se escolher o separador
console.log(transformaEmString);

console.log(lista.indexOf("Frodo")) // Pesquisa na lista
console.log(lista.lastIndexOf("Frodo")) // Pesquisa a ordem na lista de trás para frente
console.log(lista.lastIndexOf("Harry Potter")) // Caso a pesquisa não tenha resultados, retorna -1

console.log(lista)
