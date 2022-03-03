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

// var cpu = Math.round(Math.random() * 2);
// var vencedor
// switch (cpu) {
//     case 0:
//         cpu = 'pedra';
//         break;
//         case 1:
//             cpu = 'papel';
//             break
//             case 2:
//                 cpu = 'tesoura';
//                 break;
//             }

//             if (jogador == 'pedra') {

//     if (cpu == 'pedra') {
//         vencedor = 'empate';
//     } else if (cpu == 'papel') {
//         vencedor = 'computador';
//     } else if (cpu == 'tesoura') {
//         vencedor = 'jogador';
//     }

// } else if (jogador == 'papel') {

//     if (cpu == 'pedra') {
//         vencedor = 'jogador';
//     } else if (cpu == 'papel') {
//         vencedor = 'empate';
//     } else if (cpu == 'tesoura') {
//         vencedor = 'computador';
//     }

// } else if (jogador == 'tesoura') {
//     if (cpu == 'pedra') {
//         vencedor = 'computador';
//     } else if (cpu == 'papel') {
//         vencedor = 'jogador';
//     } else if (cpu == 'tesoura') {
//         vencedor = 'empate';
//     }

// }


// alert(`Bem-vindo(a) a mais uma partida de Jokenpô!`);

// var jogador = prompt(`Escolha abaixo:\n• pedra; \n• papel; \n• tesoura:`);
// alert (`Ganhador: ${vencedor}`)

// var pontosCpu = 0
// var pontosJogador = 0
// // for (let i = 0; i < jogadas.length; index++) {
// //     const element = array[];

// // }


// let escolhaJogador = prompt("Escolha a sua jogada:\n\n• pedra; \n• papel; \n• tesoura");
// escolhaJogador = escolhaJogador.toLocaleLowerCase();

// let escolhaCpu = Math.round(Math.random() * 2);

// switch (escolhaCpu) {
//     case 0:
//         escolhaCpu === 'pedra';
//         if (escolhaCpu === 'pedra' && escolhaJogador === 'pedra'){
//             console.log(`Você escolheu ${escolhaJogador} e o computador escolheu ${escolhaCpu}. Foi um empate!`);
//         } else if (escolhaCpu === 'pedra' && escolhaJogador === 'papel'){
//                 console.log(`Você escolheu ${escolhaJogador} e o computador escolheu ${escolhaCpu}. Você ganhou 1 ponto`);
            
//         }

//         break;
//     case 1:
//         escolhaCpu = 'papel';
//         break
//     case 2:
//         escolhaCpu = 'tesoura';
//         break;
// }


// var userInput = prompt("What will you shoot")
// userInput = userInput.toLowerCase();
// if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors') {
//   //return userInput;

// } else {
//   console.log("Error!");
// }

// const ComputerChoice = () => {
//   const randomNumber = Math.floor(Math.random() * 3)
//   if (randomNumber === 0) {
//     return "rock";
//   } else if (randomNumber === 1) {
//     return "paper";
//   } else {
//     return "scissors";
//   }
// }

// const determineWinner = (userChoice, computerChoice) => {
//   if (userChoice === computerChoice) {
//     return "Tie, please try again";
//   } else if (userChoice === "paper" && computerChoice === "rock") {
//     return "Player wins";
//   } else if (userChoice === "scissors" && computerChoice === "Paper") {
//     return "Player wins";
//   } else if (userChoice === "rock" && computerChoice === "scissors") {
//     return "Player wins";
//   } else if (userChoice === "bomb") {
//     return "Player wins"
//   } else {
//     return "Computer Wins"
//   }
// }

// const playGame = () => {
//   const userChoice = userInput//getUserChoice('')
//   const computerChoice = ComputerChoice()
//   console.log("you threw a " + userChoice);
//   console.log("The computer threw a " + computerChoice);

//   console.log(determineWinner(userChoice, computerChoice));
// }

// playGame();


var pontosJogador = 1;
var pontosCpu = 1;

function escolhaCPU() {
	var opcoesDeJogadas = ["pedra", "papel", "tesoura"]; 
	var jogadaAleatoria = opcoesDeJogadas[Math.floor(Math.random() * 3)];
	return jogadaAleatoria;
}

function escolhaJogador(){
	var jogada = prompt("Escolha e digite uma das opções abaixo para começar a jogar: \n\n• pedra \n• papel \n• tesoura");
	if (jogada == null) return null;
	return jogada.toLowerCase();
}

function pontuacao(escolha1, escolha2) {
    if (escolha1 === escolha2) {
        return "Foi um empate! Ninguém pontuou.";
    } if (escolha1 === "pedra") {
        if (escolha2 === "tesoura") {
            return "O computador escolheu tesoura e você ganhou! \n\nSua pontuação é: " + pontosJogador++;
        } else {
            return "O computador escolheu papel e você perdeu =( \n\nA pontuação do computador é: " + pontosCpu++;
        }
    } if (escolha1 === "papel") {
        if (escolha2 === "pedra") {
            return "O computador pedra e você ganhou! \n\nSua pontuação é: " + pontosJogador++;
        } else {
            return "O computador escolheu tesoura e você perdeu =( \n\nA pontuação do computador é: " + pontosCpu++;
        }
    } if (escolha1 === "tesoura") {
        if (escolha2 === "papel") {
            return "O computador papel e você ganhou! \n\nSua pontuação é: " + pontosJogador++;
        } else {
            return "O computador escolheu pedra e você perdeu =( \n\nA pontuação do computador é: " + pontosCpu++;
        }
    }
}

while (true) {
    var continuaJogando = escolhaJogador();
    if (continuaJogando == null) break;
    if (pontosCpu == 2){
        alert("O jogo acabou! Dessa vez o computador ganhou.")
        break
    }
    if (pontosJogador == 2){
        alert("O jogo acabou. A vitória é sua!")
        break
    }
    alert(pontuacao(continuaJogando, escolhaCPU()));
}