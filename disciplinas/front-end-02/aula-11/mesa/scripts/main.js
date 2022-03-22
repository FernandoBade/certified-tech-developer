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
    
        Sem espaços: ${nomeCompleto.trim()} <br>
        Em maiúscula: ${nomeCompleto.toUpperCase()} <br>
        Em minúscula: ${nomeCompleto.toLowerCase()} <br>
        "a" = "@", "e" = "3": ${nomeCompleto.replaceAll('a', '@').replaceAll('e', '3')}
        `
}