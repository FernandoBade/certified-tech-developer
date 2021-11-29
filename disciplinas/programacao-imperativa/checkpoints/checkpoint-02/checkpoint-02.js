// 1. Após a execução do código abaixo, o que deve ser impresso:

// for (var i=0; i<50; i +=10){
// console.log(i);
// }
// console.log(i)

// Resposta: 0 10 20 30 40 50

//-------------------------------------------------

//2. Uma estrutura de if ternário como vista abaixo, substitui qual estrutura?

// let x=50;
// let resto=50%2;
// resposta = resto==0 ? "Par" : "Ímpar";
// console.log(resposta);

// Resposta: if else

//-------------------------------------------------

// 3) Observando o código abaixo, escolha a alternativa que mostra o que cada função fez , ou seja, o que fez o replace(), toLocaleUpperCase(), split() e o join() respectivamente. Vale ressaltar que as saídas são: D-I-G-I-T-A-L-H-O-U-S-E e C-T-D

// function soletrar (texto){
//     console.log(texto.replace("-", "").toLocalUppercase().split("").join("-"));
// }

// soletrar ("digital-house");
// soletrar("ctd")

// Resposta: Substitui cada hífen por '', transforma o texto em letras maiúsculas, transforma a string em array, junta o array com o separador hífen.

//-------------------------------------------------

// 4) Em relação às CLOSURES é INCORRETO afirmar: 
// Resposta: São funçoes representadas por arrow function

//-------------------------------------------------

// 5) Explique o que significa: instanciar um objeto:

// Resposta: Significa poder utilizar a função "new" para criar novos objetos que foram pré-determinados pela função construtora.

//-------------------------------------------------

// 6) Com relação ao Javascript assinale a alternativa correta:

// Resposta: O operador ++ incrementa 1, o operador -- decrementa 1, o operador % calcula o resto, o operador + concatena ou soma

//-------------------------------------------------

// 7) Qual o código correto para o cálculo do fatorial de um número? 

// let valor = 5;
// let fatorial = 1;
// for (let i = valor; i > 1; i--){
//     fatorial *= i;
// }
// console.log("Fatorial = " + fatorial);

//-------------------------------------------------

// 8) Os métodos .readFileSync(), .appendFileSync(), .parse() e .writeFileSync() respectivamente são utilizados para: *

// Ler um arquivo, adicionar conteúdo ao já existente, transformar dados Json em objetos literais, adicionar conteúdo substituindo o já existente.

//-------------------------------------------------

// 9) Explique os principais métodos para o trabalho de LEITURA E ESCRITA DE ARQUIVOS.

// São eles:

// 1) O método ".readFileSync()", que nos traz um pacote nativo File System que permite ler e recuperar dados de um arquivo;

// 2) O método ".writeFileSync()" que nos permite escrever e sobrescrever arquivos (que caso não existam, serão criados ou substituído por novos, apagando o conteúdo anterior);

// 3) Por fim o método ".appendFileSync()" que permite que adicionemos dados aos arquivos existentes (e caso não existam, serão criados) mas sem correr o risco de apagar o conteúdo existente pois os dados são adicionados ao final do conteúdo prévio do arquivo.

//-------------------------------------------------

// 10) Dado o array: let numeros= [10, 8, 7, 99, 0, 1, 6]. Qual comando devemos executar para que a saída seja: [ 99, 10, 8, 7, 6, 1, 0] ?

// let numeros= [10, 8, 7, 99, 0, 1, 6]
// numeros.sort(function(a,b){ return b-a;});
// console.log(numeros)

// Resposta: numeros.sort(function(a,b){ return b-a;});

//-------------------------------------------------

// 11) Considere o código abaixo e escolha a alternativa que mostra as saídas corretas.

// function soma (a=1, b=3){
//     return a+b
// }

// console.log(soma());
// console.log(soma(3));
// console.log(soma(1,2));

// Resposta: 4 6 3

//-------------------------------------------------

// 12) Observando o código abaixo, escolha a opção que exiba corretamente o valor das variáveis:

// let x = 5;
// let y = x++ + ++x;
// console.log("y= " + y);

// x = 3;
// y = x * (x + 1) * x++;
// x = 5;
// x = 3;
// y *= x + 1

// console.log("x = " + x);
// console.log("y = " + y);

// Resposta: 12, 5 e 18

//-------------------------------------------------

// 13) De acordo com o código abaixo, escolha a opção que mostre os valores das variáveis fruta1, fruta2, fruta3 respectivamente e o conceito utilizado no script.

// let frutasAmarelas = ["Melão", "Mamão", "Limão"];
// let [fruta1, fruta2, fruta3] = frutasAmarelas;

// console.log(fruta1);
// console.log(fruta2);
// console.log(fruta3);
// console.log(frutasAmarelas);

// Resposta: Melão, Mamão e Limão, conceito: desestruturação

//-------------------------------------------------

// 14) Sobre o Node é correto afirmar: 

// O Node é um interpretador da linguagem Javascript, de código aberto, que possibilita a execução de códigos da linguagem do lado do servidor.

//-------------------------------------------------

// 15) Com base no script abaixo, explique cada uma das linhas que contenha código. *

// let frutasAmarelas = ["Melão", "Mamão", "Limão Siciliano"];
// let frutasVermelhas = ["Morango", "Cereja", "Maçã Red"];
// let frutasVerdes = ["Limão", "Kiwi", "Maçã Verde"];

// frutasVermelhas1 =  frutasVermelhas.map (fruta => fruta.toUpperCase());
// let todasFrutas = [...frutasAmarelas, ...frutasVermelhas1,...frutasVerdes];

// console.log(todasFrutas);

// Resposta: 

// Linha 1: Criação da variável frutasAmarelas, que contém um array com 3 strings com nomes de frutas;


// Linha 2: Criação da variável frutasVermelhas, que contém um array com 3 strings com nomes de frutas;


// Linha 3: Criação da variável frutasVerdes que contém um array com 3 strings com nomes de frutas;

// Linha 5: Criação da nova variável frutasVermelhas1 que armazenará o retorno do método map, que utiliza uma Arrow Function para tranformar a variável frutasVermalhas em letras maiúsculas utilizando o .toUpperCase();

// Linha 6: Cria uma nova variável todasFrutas que contém um array com as ordens de inserção redefinidas;

// Linha 7: Retorna o log para o console com a variável com todasFrutas, que no caso, retornará o array: [
//     'Melão',
//     'Mamão',
//     'Limão Siciliano',
//     'MORANGO',
//     'CEREJA',
//     'MAÇÃ RED',
//     'Limão',
//     'Kiwi',
//     'Maçã Verde'
//   ]

//-------------------------------------------------

// 16) Qual o nome de variável que está correto?

// Resposta: nomePessoa

//-------------------------------------------------

// 17) A sigla NPM significa:

// Resposta: Node Package Manager

//-------------------------------------------------

// 18) Numa construção de um IF sem o ELSE o que acontece se o teste da condição retornar FALSE?

// Resposta: Dá uma resposta false

//-------------------------------------------------

// 19) Após a execução do código a seguir, assinale a alternativa correta para o valor de z.

// var z = 0;
// for (var i = 20; i < 50; i += 10){
//     z += i;
// }
// console.log(z);

// Resposta: 90

//-------------------------------------------------

// 20) Quais os operadores utilizados no Javascript para: concatenar uma string, comparar o conteúdo de uma variável e seu tipo, operador de negação e and lógico respectivamente:

// Resposta: + === ! &&

//-------------------------------------------------