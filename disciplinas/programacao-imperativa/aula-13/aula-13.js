let carro1 = {
    marca: "Ford",
    modelo: "Ecosport",
    cor: "prata",
    placa: "ABC1234",
    andar: function () {
        return `O carro do modelo ${this.marca} e placa ${this.placa} não possui débitos pendentes`;
    }
}

function Carro(marca, modelo, cor, placa){
this.marca = marca;
this.modelo = modelo;
this.cor = cor;
this.placa = placa;
}


let carro2 = new Carro("Tesla","Model X", "Vermelho", "XYZ1234");
let carro3 = new Carro("Volvo", "XC60", "Preto", "ASD1234");


//console.log(carro1, carro2, carro3);

let dadosCarro = {
    "cor" : "Branco",
    "placa": "QWE1234",
    "portas": "4"
}

let strCarro = JSON.stringify(dadosCarro);

console.log(dadosCarro);