function input(numero) {
    let numeros = document.getElementById("resultado").innerHTML;
    document.getElementById("resultado").innerHTML = numeros + numero;
}


function limpar() {
    document.getElementById("resultado").innerHTML = ""
}

function deletar() {
    let resultado = document.getElementById("resultado").innerHTML;
    document.getElementById("resultado").innerHTML = resultado.substring(0, resultado.length -1);
}