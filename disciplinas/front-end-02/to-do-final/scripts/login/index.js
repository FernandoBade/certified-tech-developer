//Capturando as informações
let campoEmailLogin = document.getElementById('inputEmail');
let campoSenhaLogin = document.getElementById('inputPassword');
let botaoAcessar = document.getElementById('botaoAcessar');

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado

//variável de controle da validação
let emailEValido = false;
let senhaEValidoLogin = false;


//Definindo objeto
const usuarioObjeto = {
    email: "",
    password: "",
}

botaoAcessar.addEventListener('click', function(evento){
    mostrarSpinner();
    
    if (validacaoTelaDeLogin()) {
        
        //Normalizando as informações
        campoEmailLoginNormalizado = retiraEspacosDeUmValor(campoEmailLogin.value);
        campoSenhaLoginNormalizado = retiraEspacosDeUmValor(campoSenhaLogin.value);
        campoEmailLoginNormalizado = converteValorRecebidoParaMinusculo(campoEmailLoginNormalizado);

        //Populando o objeto com as informações normalizadas
        usuarioObjeto.email = campoEmailLoginNormalizado;
        usuarioObjeto.password = campoSenhaLoginNormalizado;
        console.log(usuarioObjeto);

        let endPointLogin = "https://ctd-todo-api.herokuapp.com/v1/users/login";
        let loginUsarioJson = JSON.stringify(usuarioObjeto);
        let configuracaoRequisicao = {
        method: 'POST',
        body: loginUsarioJson,
        headers: {
            'content-type': 'application/json'
            }
        }

        fetch(endPointLogin, configuracaoRequisicao).then(
            resultado=>{
                if(resultado.status ==201){
                    return resultado.json();                    
                }
                throw resultado;
        }).then(
            resultado =>{
                loginSucesso(resultado.jwt)

            }).catch(
            erro=>{
                loginErro(erro.status)

            });
        evento.preventDefault();

    } else {
        alert("Ambos os campos devem ser informados")
        evento.preventDefault(); //Não permite que o formulário seja executado / realizado o 'submit'
    }
});

function loginSucesso(jwtRecebido) {
    console.log("Jason recebido");
    //console.log(jwtRecebido);
    localStorage.setItem("jwt",jwtRecebido);

    // alert("Usuário logado com sucesso")
    location.href = "tarefas.html"
}
function loginErro(statusRecebido){

    //let loginValidacao=document.getElementById("loginValidacao");
    //elementoSmallErro(loginValidacao);

    //Limpa o campo da senha ao errar o login
    campoSenhaLogin.value = "";
    console.log(statusRecebido);

    if (statusRecebido == 400 || statusRecebido == 404) {
        console.log("Ocorreu algum erro, verifique o email e/ou senha");
        //loginApiValidacao = false;
    }/* else{
        loginValidacao=true;
    } */

    validacaoTelaDeLogin();
}





//Validando o campo de Email
campoEmailLogin.addEventListener('blur', function() {
    //Captura o elemento "small"
    let inputEmailValidacao = document.getElementById('inputEmailValidacao');

    //Se o campo estiver com algum valor...
    if (campoEmailLogin.value != "") {
        inputEmailValidacao.innerText = ""
        campoEmailLogin.style.border = ``
        emailEValido = true;

    //Se o campo estiver sem nenhum valor...
    } else {
        inputEmailValidacao.innerText = "Campo obrigatório";
        inputEmailValidacao.style.color = "#EE1729EC"
        inputEmailValidacao.style.fontSize = "8pt"
        inputEmailValidacao.style.fontWeight = "bold"
        campoEmailLogin.style.border = `1px solid #EE1729EC`
        emailEValido = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeLogin();
});

campoSenhaLogin.addEventListener('blur', function() {
    //Captura o elemento "small"
    let inputSenhaValidacao = document.getElementById('inputSenhaValidacaoLogin');

    //Se o campo estiver com algum valor...
    if (campoSenhaLogin.value != "") {
        inputSenhaValidacao.innerText = ""
        campoSenhaLogin.style.border = ``
        senhaEValidoLogin = true;

    //Se o campo estiver sem nenhum valor...
    } else {
        inputSenhaValidacao.innerText = "Campo obrigatório";
        inputSenhaValidacao.style.color = "#EE1729EC"
        inputSenhaValidacao.style.fontSize = "8pt"
        inputSenhaValidacao.style.fontWeight = "bold"
        campoSenhaLogin.style.border = `1px solid #EE1729EC`
        senhaEValidoLogin = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeLogin();
});














function validacaoTelaDeLogin () {
    if (emailEValido&senhaEValidoLogin) {
        botaoAcessar.removeAttribute('disabled')
        botaoAcessar.innerText = "Acessar";
        return true;
    } else {
        botaoAcessar.setAttribute('disabled', true);
        botaoAcessar.innerText = "Bloqueado";
        return false;
    }
}



