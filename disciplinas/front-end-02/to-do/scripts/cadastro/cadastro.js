const nomeCadastro = document.getElementById('nome')
const sobrenomeCadastro = document.getElementById('sobrenome')
const emailCadastro = document.getElementById('email')
const senhaCadastro = document.getElementById('senha')
const senhaConfirma = document.getElementById('senhaConfirma')
const botaoCriarUsuario = document.getElementById('botaoCriarUsuario')


const dadosDeCadastroUsuario = {
    "firstName": "",
    "lastName": "",
    "email": "",
    "password": "",
}

botaoCriarUsuario.addEventListener('click', function (evento) {

    if (nomeCadastro != "" && sobrenomeCadastro != "" && emailCadastro != "" && senhaCadastro != "" && senhaConfirma != "") {

        const emailCadastroNormalizado = retiraEspacosDeUmValor(emailCadastro.value)
        const senhaCadastroNormalizado = retiraEspacosDeUmValor(senhaCadastro.value)
        const emailCadastroFinal = converteValorRecebidoParaMinusculo(emailCadastroNormalizado)

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


// console.log(nomeCadastro);
// console.log(sobrenomeCadastro);
// console.log(emailCadastro);
// console.log(senhaCadastro);
// console.log(senhaConfirma);
// console.log(dadosDeCadastroUsuario);