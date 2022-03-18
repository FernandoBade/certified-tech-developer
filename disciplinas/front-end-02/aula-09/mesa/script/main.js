function calcularOperacao(){ 
    var select = document.getElementById('operadoresAritmeticos');
    var value = select.options[select.selectedIndex].value;
    if(value == '+'){
        document.getElementById('apresentaResultado').innerHTML = `a conta dá ${somar()}`;
    } else if (value == '-'){
        document.getElementById('apresentaResultado').innerHTML = `a conta dá ${subtrair()}`;
    } else if (value == '*'){
    document.getElementById('apresentaResultado').innerHTML = `a conta dá ${multiplicar()}`;
     } else if (value == '/'){
    document.getElementById('apresentaResultado').innerHTML = `a conta dá ${divisao()}`;
    }
}

document.getElementById('calcular').addEventListener('click', (event) => {
        event.preventDefault()
        calcular()
})