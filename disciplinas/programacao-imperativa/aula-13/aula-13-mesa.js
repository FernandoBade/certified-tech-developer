// Descrição do problema
// A partir de um banco eles entram em contato conosco para criar um aplicativo que possa facilitar o manuseio de informações e facilitar as ações que ele precisa. 
// Nosso líder de tecnologia nos pede para pensar em como representar usuários, ou contas bancárias, em vez disso. Cada uma dessas contas tem as seguintes informações:
// ● Número da conta (somente números)
// ● Tipo de conta (conta corrente ou poupança em $)
// ● Saldo em $ (valor apenas)
// ● Titular da conta (nome completo)

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

function banco(listaDeContas)

console.log(banco);


//======================================================================

function ContaBancaria(numConta, tipoConta, saldo, titular){
    this.numConta = numConta;
    this.tipoConta = tipoConta;
    this.saldo = saldo;
    this.titular = titular;
}

let banco = {
    nome: "Break Room 2",
    clientes : [
    new ContaBancaria(5486273622, 'Conta Corrente', 27771, 'Abigael Natte'),
    new ContaBancaria(1183971869, 'Conta Poupança', 8675, 'Ramon Connell'),
    new ContaBancaria(9582019689, 'Conta Poupança', 27363, 'Jarret Lafuente'),
    new ContaBancaria(1761924656, 'Conta Poupança', 32415, 'Ansel Ardley'),
    new ContaBancaria(7401971607, 'Conta Poupança', 18789, 'Jacki Shurmer'),
    new ContaBancaria(630841470, 'Conta Corrente', 28776, 'Jobi Mawtus'),
    new ContaBancaria(4223508636, 'Conta Corrente', 2177, 'Thomasin Latour'),
    new ContaBancaria(185979521,	'Conta Poupança',	25994, 'Lonnie Verheijden'),
    new ContaBancaria(3151956165,	'Conta Corrente',	7601, 'Alonso Wannan'),
    new ContaBancaria(2138105881,	'Conta Poupança',	33196,	'Bendite Huggett')
    ],
    consultarCliente : function(titularAcc){
      return this.clientes.find(obj => obj.titular === titularAcc)
    },

    deposito : function(titularAcc, qntDeposito){
       return `Depósito realizado, seu novo saldo é: ${this.clientes.find(obj => obj.titular === titularAcc).saldo+=qntDeposito}`;
    },
    saque: function(titularAcc, qntSaque){
        
        let newSaldo = this.clientes.find(obj => obj.titular === titularAcc).saldo-=qntSaque;
        if(newSaldo < 0){
            return"Fundos Insuficientes";
        }else{
            return 'Extração feita com sucesso, seu novo saldo é: ' + newSaldo;
        }
        
    }
}

console.log(banco.consultarCliente("Jacki Shurmer"));
console.log(banco.deposito("Jacki Shurmer", 80000));
console.log(banco.saque("Jacki Shurmer", 8000));
