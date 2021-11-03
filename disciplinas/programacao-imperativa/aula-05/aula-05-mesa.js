// 1) Crie uma função que converta polegadas em centímetros. 
// Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.

function conversorPolCm(x){
    return (x + " polegadas equivalem a "+(x * 2.54)+ " centímetros.")
}

conversorPolCm(5);

console.log(conversorPolCm(5));


// 2) Crie uma função que receba uma string e a converta em um URL.
// ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"

function conversorURL(x){
    return ("http://www."+x+".com.br");
}

conversorURL()

console.log(conversorURL("teste"));


// 3) Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).
function adicionaExc(x){
    return (x + "!")
}

adicionaExc()

console.log(adicionaExc("Frase de teste"));


// 4) Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.

function idadeCachorro(x){
    return (x + " anos humanos equivalem a " + (x * 7) + " anos caninos.")
}

console.log (idadeCachorro(10));


// 5) Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
// PS: considere que você trabalhe 160 horas no mês.

function valorHoraTrabalho (x){
    return ("Para um salário de R$"+(x.toFixed(2))+ " a sua hora de trabalho equivale a R$" + (x / 160).toFixed(2)+".");
}

console.log(valorHoraTrabalho(2500));


// 6) Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas. Em seguida, execute a função, testando diferentes valores. 

function calculoIMC(x, y){
    return ("Para um peso de "+ x + "Kg e altura de " + y + "m o seu IMC será de " + (x / (y*y)).toFixed(2))+".";
}

console.log(calculoIMC(120, 1.92));

// 7) Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne. 

function convertUpperCase(x){
    return x.toUpperCase();
}

console.log(convertUpperCase("catapimbas"));

// 8) Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro.

function tipoDeDado(x){
    return ("O dado "+ x +" é do tipo " + (typeof x)+".");
}
console.log(tipoDeDado("teste"));

// 9) Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência.

function raioParaCirc(x){
    return  ("Para um raio no valor de "+ x +" a sua circunferência será de " +(2 * x * Math.PI.toFixed(2))+".");
}

console.log(raioParaCirc(3));