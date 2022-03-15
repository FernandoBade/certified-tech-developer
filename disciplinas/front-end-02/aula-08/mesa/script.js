//evitar que o submit recarregue a página

document.getElementById("enviar").addEventListener("click", (evento) => { evento.preventDefault() });

//alerta ao terminar de carregar a página, com delay de 2 segundos

// setTimeout(()=>{window.onload = alert("Página carregada com sucesso")}, 2000);

//texto do botão muda ao passar o mouse

document.getElementById('btn').addEventListener('mouseover', passaOMouse)

function passaOMouse() {
    document.getElementById('btn').style.backgroundColor = "crimson"
    document.getElementById('btn').style.fontSize = "20px"
    document.getElementById('btn').style.color = "white"
    document.getElementById('btn').innerText = "( ͡° ͜ʖ ͡°)"
}

//texto do botão ao retirar o mouse

document.getElementById('btn').addEventListener('mouseout', tiraOMouse)

function tiraOMouse() {
    document.getElementById('btn').style.backgroundColor = "purple"
    document.getElementById('btn').style.fontSize = "20px"
    document.getElementById('btn').innerText = "( ͡° ʖ̯ ͡°)"
}

//insert do conteúdo do input no textarea

function contador() {
    let contagem = document.getElementById('nome').value.length + 1
    if (contagem === 1) {
        document.getElementById('texto').innerHTML = `Sua frase tem ${contagem} caractere.`
    } else {
        document.getElementById('texto').innerHTML = `Sua frase tem ${contagem} caracteres.`
    }
}
