// function validaArray(arr, num) {
//     try {
//         if (!arr && !num) {
//             throw new ReferenceError("Envie os parâmetros corretamente");
//         }

//         if (typeof arr !== 'object') {
//             throw new TypeError("O array precisa ser do tipo objeto");
//         }

//         if (typeof num !== 'number') {
//             throw new TypeError("O número precisa ser do tipo number");
//         }
//         if (arr.length != num) {
//             throw new RangeError("Tamanho inválido")
//         }
//         return arr
//     } catch (e) {
//         if (e instanceof ReferenceError) {
//             console.log("Esse erro é um ReferenceError");
//             console.log(e.message);
//         } else if (e instanceof TypeError) {
//             console.log("Esse erro é um TypeError");
//             console.log(e.message);
//         } else if (e instanceof RangeError) {
//             console.log("Esse erro é um RangeError");
//             console.log(e.message);
//         } else {
//             console.log("Esse erro é um erro desconhecido" + e);
//             console.log(e.message);
//         }
//     }
// }

// console.log(validaArray([1,2,3,4,5], 5));

// const NovoErro = new Error();

// NovoErro.name = "Novo Erro";
// NovoErro.message = "Este erro nunca ocorreu"

// console.log(NovoErro);

// function validaArray(arr, tamanho) {
//     try {
//       if (!arr.length || arr.length !== tamanho) throw new RangeError("O tamanho do array é inválido");

//       return arr;
//     } catch(e) {
//       if (e instanceof RangeError) {
//         return console.log(e.message);
//       } else {
//         return e;
//       }
//     }
//   } 

//   validaArray();
//   console.log(validaArray());

// const hello = new Promise((res, rej)=>{
//     res('Olá');
// });
// async function saudacoes() {
//     const name = await hello
//         .then(res => res + "tudo")
//         .then(res => res + "be m")
//         .catch(e => console.log(e.message))
//     return name;
// }
// await saudacoes();

// const url = 'GET - https://thatcopy.pw/catapi/rest/'

// const getCats = async () => {
//     try{
//     const data = await fetch(url);
//     const json = await data.json();
//     return json.webpurl;
//     } catch(e) {
//         console.log(e.message);
//     }
// }


class ContaBancaria {
    constructor(agencia, numero, tipo) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this._saldo = 0;
    }
    get saldo() {
        return this._saldo;
    }
    set saldo(valor) {
        this._saldo = valor;
    }
    sacar(valor) {
        if (valor > this._saldo) {
            return "Operação negada";
        }
        this._saldo = this._saldo - valor;
        return this._saldo;
    }
    depositar(valor) {
        this._saldo = this._saldo + valor;
        return this._saldo;
    }

}

class ContaCorrente extends ContaBancaria {
    constructor(agencia, numero, cartaoCredito) {
        super(agencia, numero);
        this.tipo = "Conta Corrente";
        this._cartaoCredito = cartaoCredito;
    }
    get cartaoCredito() {
    return this._cartaoCredito;
}

    set cartaoCredito(valor){
        this._cartaoCredito = valor;
    }
    
}

class ContaPoupanca  extends ContaBancaria {
    constructor(agencia, numero) {
        super(agencia, numero);
        this.tipo = "Conta Poupança";
    }
}

class ContaUniversitaria extends  ContaBancaria{
    constructor(agencia, numero) {
        super(agencia, numero);
        this.tipo = "Conta Universitária";
    }

    sacar(valor){
        if(valor > 500){
            return "Operação negada";
        }
        this._saldo = this._saldo - valor;
    }

}

