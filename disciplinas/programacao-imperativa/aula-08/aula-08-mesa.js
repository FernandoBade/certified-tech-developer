// Em um parque de diversões nos pedem um programa para verificar se os passageiros da montanha-russa podem entrar no brinquedo.

// 1)	Crie uma função podeSubir() que receba dois parâmetros: 
// -	altura da pessoa;
// -	se está acompanhada.

// Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode subir ou não, baseado nas seguintes condições:
// a)	A pessoa deve medir mais de 1.40m e menos de 2 metros.
// b)	Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
// c)	Se a pessoa medir menos de 1.20m, não poderá subir, nem acompanhada.


// 2)	Modifique a função podeSubir(), de modo que ela exiba uma mensagem de autorização ou de impedimento no acesso ao brinquedo dependendo se a pessoa se enquadra ou não nas condições do exercício anterior. Por exemplo:
// a)	Em caso de autorização, exiba a mensagem: “Acesso autorizado” ou “Acesso autorizado somente com acompanhante”;
// b)	Em caso de impedimento, exiba a mensagem: “Acesso negado.”


function podeSubir(altura, acompanhada) {
    let podeSubir = false;

    if (altura >= 1.40 && altura <= 2) {
        podeSubir = true
        console.log("Acesso autorizado")
    } else if ((altura >= 1.2 && acompanhada) && (altura < 1.4 && acompanhada)) {
        podeSubir = true
        console.log("Acesso autorizado somente com acompanhante")

    } else  {
        podeSubir = false
        console.log("Acesso negado")
    }
    return podeSubir 
}
console.log(podeSubir(1.3, false));


