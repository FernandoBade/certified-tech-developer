// program for a simple calculator

// take the operator input
// const operator = prompt('Enter operator ( either +, -, * or / ): ');

// // take the operand input
// const number1 = parseFloat(prompt('Enter first number: '));
// const number2 = parseFloat(prompt('Enter second number: '));

let result

// using if...else if... else
if (operator == '+') {
    result = number1 + number2;
}
else if (operator == '-') {
    result = number1 - number2;
}
else if (operator == '*') {
    result = number1 * number2;
}
else {
    result = number1 / number2;
}

// display the result
console.log(`${number1} ${operator} ${number2} = ${result}`);










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


// var v1 = document.getElementById('n1');
// var v2 = document.getElementById('n2');
// var operacao = document.getElementById('operacao').innerHTML;

// document.getElementById('teste').innerHTML = operacaoEscolhida
// // var valor = operacao.options[operacao.selectedIndex].value
// var operacaoEscolhida = operacao.innerText;

// console.log(operacaoEscolhida);
// console.log(v1.innerText);



// document.getElementById('calcular').addEventListener('click', (event) => {
//     event.preventDefault()
//     calcular()
// })







// const junta = document.getElementById('junta').innerText
// const tira = document.getElementById('tira').innerText
// const vezes = document.getElementById('vezes').innerText
// const reparte = document.getElementById('reparte').innerText
// const operacao = ""

// console.log(vezes)

// function soma(v1, v2) {
//     let resultado = parseFloat(v1) + parseFloat(v2)
//     console.log(resultado)
// }

// function calcular() {
//         soma()
// }

// if somar (valor1, valor2)
