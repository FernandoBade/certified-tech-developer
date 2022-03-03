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
