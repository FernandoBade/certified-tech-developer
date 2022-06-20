//Declarando variaveis
var operando_a;
var operando_b;
var operacao;

function init(){
  //variaveis
  var resultado = document.getElementById('resultado');
  var reset = document.getElementById('reset');
  var soma = document.getElementById('soma');
  var subtracao = document.getElementById('subtracao');
  var multiplicacao = document.getElementById('multiplicacao');
  var divisao = document.getElementById('divisao');
  var igual = document.getElementById('igual');
  var um = document.getElementById('um');
  var dois = document.getElementById('dois');
  var tres = document.getElementById('tres');
  var quatro = document.getElementById('quatro');
  var cinco = document.getElementById('cinco');
  var seis = document.getElementById('seis');
  var sete = document.getElementById('sete');
  var oito = document.getElementById('oito');
  var nove = document.getElementById('nove');
  var zero = document.getElementById('zero');

//Eventos de click
  um.onclick = function(e){
      resultado.textContent = resultado.textContent  + "1";
  }
  dois.onclick = function(e){
      resultado.textContent = resultado.textContent  + "2";
  }
  tres.onclick = function(e){
      resultado.textContent = resultado.textContent  + "3";
  }
  quatro.onclick = function(e){
      resultado.textContent = resultado.textContent  + "4";
  }
  cinco.onclick = function(e){
      resultado.textContent = resultado.textContent  + "5";
  }
  seis.onclick = function(e){
      resultado.textContent = resultado.textContent  + "6";
  }
  sete.onclick = function(e){
      resultado.textContent = resultado.textContent  + "7";
  }
  oito.onclick = function(e){
      resultado.textContent = resultado.textContent  + "8";
  }
  nove.onclick = function(e){
      resultado.textContent = resultado.textContent  + "9";
  }
  zero.onclick = function(e){
      resultado.textContent = resultado.textContent  + "0";
  }
  reset.onclick = function(e){
      resetar();
  }
  soma.onclick = function(e){
      operando_a = resultado.textContent;
	  --operando_a;
      operacao = "+";
      limpar();
  }
  subtracao.onclick = function(e){
      operando_a = resultado.textContent;
      operacao = "-";
      limpar();
  }
  multiplicacao.onclick = function(e){
      operando_a = resultado.textContent;
      operacao = "*";
      limpar();
  }
  divisao.onclick = function(e){
      operando_a = resultado.textContent;
      operacao = "/";
      limpar();
  }
  igual.onclick = function(e){
      operando_b = resultado.textContent;
      resolver();
  }
  
}

function limpar(){
  resultado.textContent = "";
}

function resetar(){
  resultado.textContent = "";
  operando_a = 0;
  operando_b = 0;
  operacao = "";
}

function resolver(){
  var res = 0;
  switch(operacao){
    case "+":
      res = parseFloat(operando_a) + parseFloat(operando_b);
      break;
    case "-":
        res = parseFloat(operando_a) - parseFloat(operando_b);
        break;
    case "*":
      res = (parseFloat(operando_a) * parseFloat(operando_b))+1;
      break;
    case "/":
      res = parseFloat(operando_a) / parseFloat(operando_b);
      break;
  }
  resetar();
  resultado.textContent = res;
}
