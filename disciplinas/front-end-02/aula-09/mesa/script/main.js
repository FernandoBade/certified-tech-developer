// function input(numero) {
//     let numeros = document.getElementById("resultado").innerHTML;
//     parseInt(document.getElementById("resultado").innerHTML = numeros + numero);

// }


// function limpar() {
//     document.getElementById("resultado").innerHTML = ""
// }

// function deletar() {
//     let resultado = document.getElementById("resultado").innerHTML;
//     document.getElementById("resultado").innerHTML = resultado.substring(0, resultado.length - 1);
// }


var v1 = document.getElementById('n1');
var v2 = document.getElementById('n2');

document.getElementById('calcular').addEventListener('click', (event) => {
    event.preventDefault()
    calcular()
})

// console.log(n1)
function calcular(){

    console.log(v1.value);    
    console.log(v2.value);    
    teste.innerText = parseInt(v1) + parseInt(v2)
    // console.log(n1.value + n2.value)
}

