let numeros = [1,5,9,3,5,7];
let dobro = numeros.map(function(item){
    return item * 2;
});

console.log(dobro);

let idades = [15,12,16,20,25,30,36];

let maiores = idades.filter(function(item) {
    console.log(item);
    return item >= 18;
});

console.log(maiores);
