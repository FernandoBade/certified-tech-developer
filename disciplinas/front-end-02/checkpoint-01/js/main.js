function adicionarReceita (){

//captura do nome

var nomeCompleto = document.getElementById("nomeCompleto").value.toLowerCase().trim()
console.log(nomeCompleto);

//primeira letra do nome maiúscula

var nomeEmMaiusculo = nomeCompleto.split(" ");

for (var i = 0; i < nomeEmMaiusculo.length; i++) {
    nomeEmMaiusculo[i] = nomeEmMaiusculo[i].charAt(0).toUpperCase() + nomeEmMaiusculo[i].slice(1);
}

var nomeCorrigido = nomeEmMaiusculo.join(" ");
console.log(nomeCorrigido);

//captura do título da receita

var tituloReceita = document.getElementById("tituloReceita").value.toLowerCase().trim()
console.log(tituloReceita);

//ajuste do título com primeira em maiúscula

var tituloEmMaiusculo = tituloReceita.split(" ");

for (var i = 0; i < tituloEmMaiusculo.length; i++) {
    tituloEmMaiusculo[i] = tituloEmMaiusculo[i].charAt(0).toUpperCase() + tituloEmMaiusculo[i].slice(1);
}

var tituloCorrigido = tituloEmMaiusculo.join(" ");
console.log(tituloCorrigido);

//captura da URL da imagem

var imgReceita = document.getElementById("imgReceita").value
console.log(imgReceita);

//captura da descrição da receita

var descricaoReceita = document.getElementById("descricaoReceita").value
console.log(descricaoReceita);



}