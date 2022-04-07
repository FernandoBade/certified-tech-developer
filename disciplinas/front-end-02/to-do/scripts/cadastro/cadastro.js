var nomeCadastro = document.getElementById('nome')
var sobrenomeCadastro = document.getElementById('sobrenome')
var emailCadastro = document.getElementById('email')
var senhaCadastro = document.getElementById('senha')
var senhaConfirma = document.getElementById('senhaConfirma')
var botaoCriarUsuario = document.getElementById('botaoCriarUsuario')


var dadosDeCadastroUsuario = {
    "firstName": "",
    "lastName": "",
    "email": "",
    "password": "",
}

botaoCriarUsuario.addEventListener('click', function (evento) {

    if (nomeCadastro != "" && sobrenomeCadastro != "" && emailCadastro != "" && senhaCadastro != "" && senhaConfirma != "") {

        var emailCadastroNormalizado = retiraEspacosDeUmValor(emailCadastro.value)
        var senhaCadastroNormalizado = retiraEspacosDeUmValor(senhaCadastro.value)
        var emailCadastroFinal = converteValorRecebidoParaMinusculo(emailCadastroNormalizado)

        dadosDeCadastroUsuario.firstName = nomeCadastro.value
        dadosDeCadastroUsuario.lastName = sobrenomeCadastro.value
        dadosDeCadastroUsuario.email = emailCadastroFinal
        dadosDeCadastroUsuario.password = senhaCadastroNormalizado

        console.log(dadosDeCadastroUsuario);
        evento.preventDefault()
    } else {
        alert("Todos os campos devem ser preenchidos")
        evento.preventDefault()
    }
})

var nomeEValido = false
var sobrenomeEValido = false
var senhaEValido = false
var senhaConfirmaEValido = false

//Validaçãoo dos campos

nomeCadastro.addEventListener('blur', function () {
    let nomeMensagemStatus = document.getElementById('nomeMensagemStatus')

    if (nomeCadastro.value != "") {
        nomeMensagemStatus.innerText = ""
        nomeCadastro.style.border = ``
        nomeEValido = true

    } else {
        nomeMensagemStatus.innerText = "Campo obrigatório"
        nomeMensagemStatus.style.color = "#EE1729EC"
        nomeMensagemStatus.style.fontSize = "8pt"
        nomeMensagemStatus.style.fontWeight = "bold"
        nomeCadastro.style.border = `1px solid #EE1729EC`
        nomeEValido = false
    }
    validacaoTelaCadastro()
})


function validacaoTelaCadastro() {
    if (nomeEValido) {
        botaoCriarUsuario.removeAttribute('disabled')
        botaoCriarUsuario.innerText = "Acessar";
        return true;
    } else {
        botaoCriarUsuario.setAttribute('disabled', true);
        botaoCriarUsuario.innerText = "Bloqueado";
        return false;
    }

}



// console.log(nomeCadastro);
// console.log(sobrenomeCadastro);
// console.log(emailCadastro);
// console.log(senhaCadastro);
// console.log(senhaConfirma);
// console.log(dadosDeCadastroUsuario);