//Capturando as informações
let campoNome = document.getElementById('inputNome');
let campoSobrenome = document.getElementById('inputSobrenome');
let campoEmail = document.getElementById('inputEmail');
let campoSenha = document.getElementById('inputSenha');
let campoRepetirSenha = document.getElementById('inputRepetirSenha');
let botaoCriarConta = document.getElementById('botaoCriarConta');

let campoNomeNormalizado;
let campoSobrenomeNormalizado;
let campoEmailNormalizado;
let campoSenhaNormalizado;
let campoRepetirSenhaNormalizado;


//variável de controle da validação
let nomeEValido = false;
let sobrenomeEValido = false;
let emailEValido = false;
let senhaEValido = false;
let repetirSenhaEValido = false;
let senhasEValido = false;

//Definindo objeto
const usuarioObjeto = {
    firstName: "",
    lastName: "",
    email: "",
    password: "",
}

botaoCriarConta.addEventListener('click', function (evento) {
    mostrarSpinner();
    if (validacaoTelaDeSignup()) {
        evento.preventDefault();
        //Normalizando as informações
        campoNomeNormalizado = retiraEspacosDeUmValor(campoNome.value);
        campoSobrenomeNormalizado = retiraEspacosDeUmValor(campoSobrenome.value);
        campoEmailNormalizado = retiraEspacosDeUmValor(campoSobrenome.value);

        campoEmailNormalizado = retiraEspacosDeUmValor(campoEmail.value);
        campoEmailNormalizado = converteValorRecebidoParaMinusculo(campoEmailNormalizado);

        campoSenhaNormalizado = retiraEspacosDeUmValor(campoSenha.value);
        campoRepetirSenhaNormalizado = retiraEspacosDeUmValor(campoRepetirSenha.value);


        //Populando o objeto com as informações normalizadas
        usuarioObjeto.firstName = campoNomeNormalizado;
        usuarioObjeto.lastName = campoSobrenomeNormalizado;
        usuarioObjeto.email = campoEmailNormalizado;
        usuarioObjeto.password = campoSenhaNormalizado;

        console.log(usuarioObjeto);

        let endPointLogin = "https://ctd-todo-api.herokuapp.com/v1/users";
        let signupUsarioJson = JSON.stringify(usuarioObjeto);
        let configuracaoRequisicao = {
            method: 'POST',
            body: signupUsarioJson,
            headers: {
                'content-type': 'application/json'
            }
        }

        fetch(endPointLogin, configuracaoRequisicao).then(
            resultado => {
                if (resultado.status == 201) {
                    return resultado.json();
                }
                throw resultado;
            }).then(
                resultado => {
                    cadastroSucesso(resultado.jwt)


                }).catch(
                    erro => {
                        cadastroErro(erro)

                    });



    } else {
        alert("Todos os campos devem ser informados")
        evento.preventDefault(); //Não permite que o formulário seja executado / realizado o 'submit'
    }
});

function cadastroSucesso(jsonRecebido) {
    console.log("Json recebido ao cadastrar");
    console.log(jsonRecebido);
    alert("Usuário cadastrado com sucesso")
    window.location.href = "index.html"
}

function cadastroErro(statusRecebido) {
    console.log("Erro ao cadastrar");
    console.log(statusRecebido);
    if (erro.status == 400) {
        alert("Usuário já cadastrado")

    }
}



//Validando o campo do Nome
campoNome.addEventListener('blur', function () {
    //Captura o elemento "small"
    let inputNomeValidacao = document.getElementById('inputNomeValidacao');

    ///Se o campo estiver com algum valor...
    if (campoNome.value != "") {
        inputNomeValidacao.innerText = ""
        campoNome.style.border = ``
        nomeEValido = true;

        //Se o campo estiver sem nenhum valor...
    } else {
        inputNomeValidacao.innerText = "Campo obrigatório";
        inputNomeValidacao.style.color = "#EE1729EC"
        inputNomeValidacao.style.fontSize = "8pt"
        inputNomeValidacao.style.fontWeight = "bold"
        campoNome.style.border = `1px solid #EE1729EC`
        nomeEValido = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeSignup();


})


//Validando o campo do Sobrenome
campoSobrenome.addEventListener('blur', function () {
    //Captura o elemento "small"
    let inputSobrenomeValidacao = document.getElementById('inputSobrenomeValidacao');

    ///Se o campo estiver com algum valor...
    if (campoSobrenome.value != "") {
        inputSobrenomeValidacao.innerText = ""
        campoSobrenome.style.border = ``
        sobrenomeEValido = true;

        //Se o campo estiver sem nenhum valor...
    } else {
        inputSobrenomeValidacao.innerText = "Campo obrigatório";
        inputSobrenomeValidacao.style.color = "#EE1729EC"
        inputSobrenomeValidacao.style.fontSize = "8pt"
        inputSobrenomeValidacao.style.fontWeight = "bold"
        campoSobrenome.style.border = `1px solid #EE1729EC`
        nomeEValido = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeSignup();


})



//Validando o campo de Email
campoEmail.addEventListener('blur', function () {
    //Captura o elemento "small"
    let inputEmailValidacao = document.getElementById('inputEmailValidacao');

    //Se o campo estiver com algum valor...
    if (campoEmail.value != "") {
        inputEmailValidacao.innerText = ""
        campoEmail.style.border = ``
        emailEValido = true;

        //Se o campo estiver sem nenhum valor...
    } else {
        inputEmailValidacao.innerText = "Campo obrigatório";
        inputEmailValidacao.style.color = "#EE1729EC"
        inputEmailValidacao.style.fontSize = "8pt"
        inputEmailValidacao.style.fontWeight = "bold"
        campoEmail.style.border = `1px solid #EE1729EC`
        emailEValido = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeSignup();
});

var getPassword = document.querySelector('.password');

function caracterLength() {
    if (getPassword.value.length >= 6 && getPassword.value.length <= 8) {
        document.querySelector('.length').style.color = "#6e62fe";
        document.querySelector('.length').style.fontWeight = "bold";
        document.querySelector('.length').style.listStyleType = "disc";


    } else {
        document.querySelector('.length').style.listStyleType = "circle";
        document.querySelector('.length').style.color = null;
        document.querySelector('.length').style.fontWeight = null;
        botaoCriarConta.setAttribute('disabled', true);

    }
}

function lowerCase() {
    var regex = /^(?=.*[a-z]).+$/

    if (regex.test(getPassword.value)) {
        document.querySelector('.lowercase').style.color = "#6e62fe";
        document.querySelector('.lowercase').style.fontWeight = "bold";
        document.querySelector('.lowercase').style.listStyleType = "disc";


    } else {
        document.querySelector('.lowercase').style.listStyleType = "circle";
        document.querySelector('.lowercase').style.color = null;
        document.querySelector('.lowercase').style.fontWeight = null;
        botaoCriarConta.setAttribute('disabled', true);

    }
}

function numberValidation() {
    var regex = /^(?=.*[0-9]).+$/

    if (regex.test(getPassword.value)) {
        document.querySelector('.number').style.color = "#6e62fe";
        document.querySelector('.number').style.fontWeight = "bold";
        document.querySelector('.number').style.listStyleType = "disc";


    } else {
        document.querySelector('.number').style.listStyleType = "circle";
        document.querySelector('.number').style.color = null;
        document.querySelector('.number').style.fontWeight = null;
        botaoCriarConta.setAttribute('disabled', true);

    }
}

function upperCase() {
    var regex = /^(?=.*[A-Z]).+$/

    if (regex.test(getPassword.value)) {
        document.querySelector('.uppercase').style.color = "#6e62fe";
        document.querySelector('.uppercase').style.fontWeight = "bold";
        document.querySelector('.uppercase').style.listStyleType = "disc";

    } else {
        document.querySelector('.uppercase').style.listStyleType = "circle";
        document.querySelector('.uppercase').style.color = null;
        document.querySelector('.uppercase').style.fontWeight = null;
        botaoCriarConta.setAttribute('disabled', true);
    }
}

function specialText() {
    var regex = /^(?=.*[ !@#$%^&*_=+ -]).+$/

    if (regex.test(getPassword.value)) {
        document.querySelector('.special').style.color = "#6e62fe";
        document.querySelector('.special').style.fontWeight = "bold";
        document.querySelector('.special').style.listStyleType = "disc";

    } else {
        document.querySelector('.special').style.listStyleType = "circle";
        document.querySelector('.special').style.color = null;
        document.querySelector('.special').style.fontWeight = null;
        botaoCriarConta.setAttribute('disabled', true);
    }
}

getPassword.addEventListener('keyup', function () {
    caracterLength()

    lowerCase()

    upperCase()

    specialText()

    numberValidation()

});


//Visualizando o valor dos campos de Senha clicando no ícone de olho

const btnMostrarSenha1 = document.getElementById('eyeSenha1');
const btnMostrarSenha2 = document.getElementById('eyeSenha2');
btnMostrarSenha1.addEventListener('click', () => {

    if(campoSenha.getAttribute('type') === 'password'){
        campoSenha.setAttribute('type', 'text');
        btnMostrarSenha1.setAttribute('src', './assets/eye.svg');
    }

    else if(campoSenha.getAttribute('type') === 'text'){
        campoSenha.setAttribute('type', 'password');    
        btnMostrarSenha1.setAttribute('src', './assets/eye-off.svg');
    } 
});

btnMostrarSenha2.addEventListener('click', () => {

    if(campoRepetirSenha.getAttribute('type') === 'password'){
        campoRepetirSenha.setAttribute('type', 'text');
        btnMostrarSenha2.setAttribute('src', './assets/eye.svg');
    }

    else if(campoRepetirSenha.getAttribute('type') === 'text'){
        campoRepetirSenha.setAttribute('type', 'password');    
        btnMostrarSenha2.setAttribute('src', './assets/eye-off.svg');
    } 
});




// function mostraSenha() {
//     const senha1 = document.getElementById("inputSenha"); 
//     const senha2 = document.getElementById("inputRepetirSenha"); 

//     const olhoSenha = document.getElementsByClassName('eyeSenha');
//     if (senha1.type === 'password' || senha2.type === 'password') {
//         senha1.type = 'text';
//         senha2.type = 'text';
//         olhoSenha.src = './assets/eye.svg'
//     } else if (senha1.type === 'text') {
//         senha1.type = 'password';
//         senha2.type = 'password';
//         olhoSenha.src = './assets/eye-off.svg'
//     }
// }


// var img = document.getElementById;l('eyeSenha');
// img.addEventListener('click', function () {
//     if (getPassword.type === 'password') {
//         getPassword.type = 'text';
//         img.src = './assets/eye.svg'
//     } else if (getPassword.type === 'text') {
//         getPassword.type = 'password';
//         img.src = './assets/eye-off.svg'
//     }
//     // getPassword.type = getPassword.type == 'text' ? 'password' : 'text';
// });



//Validando o campo de Senha
campoSenha.addEventListener('blur', function () {
    //Captura o elemento "small"
    let inputSenhaValidacao = document.getElementById('inputSenhaValidacao');

    //Se o campo estiver com algum valor...
    if (campoSenha.value != "") {
        inputSenhaValidacao.innerText = ""
        campoSenha.style.border = ``
        senhaEValido = true;

        //Se o campo estiver sem nenhum valor...
    } else {
        inputSenhaValidacao.innerText = "Campo obrigatório";
        inputSenhaValidacao.style.color = "#EE1729EC"
        inputSenhaValidacao.style.fontSize = "8pt"
        inputSenhaValidacao.style.fontWeight = "bold"
        campoSenha.style.border = `1px solid #EE1729EC`
        senhaEValido = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeSignup();
});

//Validando o campo de Repetir a Senha
campoRepetirSenha.addEventListener('blur', function () {
    //Captura o elemento "small"
    let inputRepetirSenhaValidacao = document.getElementById('inputRepetirSenhaValidacao');

    //Se o campo estiver com algum valor...
    if (campoRepetirSenha.value != "" && campoRepetirSenha.value == campoSenha.value) {
        inputRepetirSenhaValidacao.innerText = ""
        campoRepetirSenha.style.border = ``
        repetirSenhaEValido = true;

        //Se o campo estiver sem nenhum valor...
    }
    else if (campoRepetirSenha.value == "") {
        inputRepetirSenhaValidacao.innerText = "Campo obrigatório";
        inputRepetirSenhaValidacao.style.color = "#EE1729EC"
        inputRepetirSenhaValidacao.style.fontSize = "8pt"
        inputRepetirSenhaValidacao.style.fontWeight = "bold"
        campoRepetirSenha.style.border = `1px solid #EE1729EC`
        repetirSenhaEValido = false;
    }

    else {
        inputRepetirSenhaValidacao.innerText = "As senhas digitadas não são iguais";
        inputRepetirSenhaValidacao.style.color = "#EE1729EC"
        inputRepetirSenhaValidacao.style.fontSize = "8pt"
        inputRepetirSenhaValidacao.style.fontWeight = "bold"
        campoRepetirSenha.style.border = `1px solid #EE1729EC`
        repetirSenhaEValido = false;
    }



    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeSignup();
});



botaoCriarConta.addEventListener('click', function () {
    let inputSenhaValidacao = document.getElementById('inputSenhaValidacao');
    let inputRepetirSenhaValidacao = document.getElementById('inputRepetirSenhaValidacao');

    if (campoSenha.value == campoRepetirSenha.value & senhaEValido == true & repetirSenhaEValido == true) {

        inputSenhaValidacao.innerText = ""
        campoSenha.style.border = ``

        inputRepetirSenhaValidacao.innerText = ""
        campoRepetirSenha.style.border = ``

        senhasEValido = true;
    } else {

        inputSenhaValidacao.innerText = "As senhas não são iguais";
        inputSenhaValidacao.style.color = "#EE1729EC";
        inputSenhaValidacao.style.fontSize = "8pt";
        inputSenhaValidacao.style.fontWeight = "bold";
        campoSenha.style.border = `1px solid #EE1729EC`;

        inputRepetirSenhaValidacao.innerText = "As senhas não são iguais";
        inputRepetirSenhaValidacao.style.color = "#EE1729EC";
        inputRepetirSenhaValidacao.style.fontSize = "8pt";
        inputRepetirSenhaValidacao.style.fontWeight = "bold";
        campoRepetirSenha.style.border = `1px solid #EE1729EC`;

        senhasEValido = false;
    }
    validacaoTelaDeSignup();
})






function validacaoTelaDeSignup() {
    if (nomeEValido & sobrenomeEValido & emailEValido & senhaEValido & repetirSenhaEValido) {
        botaoCriarConta.removeAttribute('disabled')
        botaoCriarConta.innerText = "Criar Conta";
        return true;
    } else {
        botaoCriarConta.setAttribute('disabled', true);
        botaoCriarConta.innerText = "Bloqueado";
        return false;
    }
}


