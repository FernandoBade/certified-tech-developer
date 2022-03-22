document.getElementById("enviar").addEventListener("click", (evento) => { evento.preventDefault() });

function sub() { 
    var nome = document.getElementById('nome').value
    var sobrenome = document.getElementById('sobrenome').value
    var nomeCompleto = nome.concat(" ",sobrenome)
    // console.log(nome);
    // console.log(nome.trim());
    // console.log(nome.toUpperCase());
    // console.log(nome.toLowerCase());
    // console.log(nomeCompleto);
    // console.log(nomeCompleto.replaceAll('a', '@').replaceAll('e', '3'))

    var resultado = document.getElementById('resultado')
    resultado.innerHTML = `
        Resultado:<br><br>
        <b>Sem espaços:</b> ${nomeCompleto.trim()} <br>
        <b>Em maiúscula:</b> ${nomeCompleto.toUpperCase()} <br>
        <b>Em minúscula:</b> ${nomeCompleto.toLowerCase()} <br>
        <b>"a" = "@", "e" = "3":</b> ${nomeCompleto.replaceAll('a', '@').replaceAll('e', '3')}
        `
}