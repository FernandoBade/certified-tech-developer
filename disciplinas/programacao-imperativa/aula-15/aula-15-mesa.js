/*
SEGUINDO A MESA DE TRABALHO DA AULA 13. DESENVOLVA ESSE ALGORITMO 
1 - CRIE UMA FUNÇÃO CONSTRUTORA PARA O OBJETO CONTA BANCARIA COM AS SEGUINTES PROPRIEDADES:

● Número da conta (somente números)
● Tipo de conta (conta corrente ou poupança em $)
● Saldo em $ (valor apenas)
● Titular da conta (nome completo)

2 - MOLDE AS INFORMAÇÕES DO ARQUIVO https://drive.google.com/file/d/16L2NejZU49mCLbo6RTmSKtuElOTOYUXv/view
PARA O FORMATO JSON, E EXPORTE ESSE JSON COMO MODULO

3 - DESENVOLVA UM ALGORITOMO QUE IRA RECEBER O MODULO ARRAY DE JSON E CRIE DINAMICAMENTE OS 
OBJETOS CONTA BANCARIA EM UM SEGUNDO ARRAY LISTA USUARIOS ARMAZENE ESSE OBJETOS 

4 - CRIE DE UM OBJETO LITERAL CHAMADO BANCO QUE TERÁ UMA PROPRIEDADE CHAMADA CLIENTES, ELE SERÁ COMPOSTO 
PELA LISTA DE OBJETOS GERADOS NO PONTO ANTERIOR.

5 - O OBJETO DO BANCO CRIARÁ UM MÉTODO CHAMADO CONSULTARCLIENTE QUE RECEBERÁ UM
NOME (TITULAR) POR PARÂMETRO E DEVE PESQUISAR NA LISTA DE CONTAS E RETORNAR AO
OBJETO DO CLIENTE QUE CORRESPONDE A ESSE NOME INSERIDO.

*/

function Conta(nroConta, tipoConta, saldo, nomeCompleto){
    this.nroConta = nroConta;
    this.tipoConta = tipoConta;
    this.saldo = saldo;
    this.nomeCompleto = nomeCompleto;
}

let contaTeste = new Conta("0000000009", "Conta Corrente", 250000, "Danielle Alves")

let conta1 = new Conta(5486273622, "Conta Corrente",27771,"Abigael Natte");
let conta2 = new Conta(1183971869, "Conta Poupança",8675,"Ramon Connell");
let conta3 = new Conta(9582019689,"Conta Poupança",27363,"Jarret Lafuente");
let conta4 = new Conta(1761924656,"Conta Poupança",32415,"Ansel Ardley");
let conta5 = new Conta(7401971607,"Conta Poupança",18789,"Jacki Shurmer");
let conta6 = new Conta(630841470,"Conta Corrente",28776,"Jobi Mawtus");
let conta7 = new Conta(4223508636,"Conta Corrente",2177,"Thomasin Latour");
let conta8 = new Conta(185979521,"Conta Poupança",25994,"Lonnie Verheijden");
let conta9 = new Conta(3151956165,"Conta Corrente",7601,"Alonso Wannan");
let conta10 = new Conta(2138105881,"Conta Poupança",33196,"Bendite Huggett");

let listaDeContas = [conta1, conta2, conta3, conta4, conta5, conta6, conta7, conta8, conta9, conta10]

console.log(listaDeContas);

