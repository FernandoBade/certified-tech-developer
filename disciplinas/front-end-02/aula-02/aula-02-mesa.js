// if(parseInt(Math.random()*3+1) == 1){
//     jokenpo = "tesoura"
//     console.log(jokenpo)
// } else if (parseInt(Math.random()*3+1) == 2){
//     jokenpo = "papel"
//     console.log(jokenpo)
// } else {
//     jokenpo = "pedra"
//     console.log(jokenpo)
// }

// document.querySelector("h1").innerText = jokenpo

alert(`Bem-vindo(a) a mais uma partida de Jokenpô!`);

var jogador = prompt(`Escolha abaixo:\n• pedra; \n• papel; \n• tesoura:`)


var cpu = Math.round(Math.random() * 2);
switch (cpu) {
    case 0:
        cpu = 'pedra';
        break;
    case 1:
        cpu = 'papel';
        break
    case 2:
        cpu = 'tesoura';
        break;
}

if (jogador == 'pedra') {

    if (cpu == 'pedra') {
        vencedor = 'empate';
    } else if (cpu == 'papel') {
        vencedor = 'computador';
    } else if (cpu == 'tesoura') {
        vencedor = 'jogador';
    }

} else if (jogador == 'papel') {

    if (cpu == 'pedra') {
        vencedor = 'jogador';
    } else if (cpu == 'papel') {
        vencedor = 'empate';
    } else if (cpu == 'tesoura') {
        vencedor = 'computador';
    }

} else if (jogador == 'tesoura') {
    if (cpu == 'pedra') {
        vencedor = 'computador';
    } else if (cpu == 'papel') {
        vencedor = 'jogador';
    } else if (cpu == 'tesoura') {
        vencedor = 'empate';
    }

}

if(vencedor === "computador"){
    pontosCpu = 0
    pontosCpu++
} else if(vencedor === "jogador"){
    pontosJogador = 0
    pontosJogador++
} else {
    document.querySelector("h4").innerText += "Empate! Ninguém pontou";
}

document.querySelector("h2").innerText += `Você escolheu ${jogador} e o computador escolheu ${cpu}.`

document.querySelector("h3").innerText += `Quem ganhou foi: ${vencedor}.`

document.querySelector("h4").innerText += `Você está com ${pontosJogador} pontos. O computador está com ${pontosCpu} pontos. `

