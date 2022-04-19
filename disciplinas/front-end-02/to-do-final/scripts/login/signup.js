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

botaoCriarConta.addEventListener('click', function(evento){
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
            resultado=>{
                if(resultado.status == 201){
                    return resultado.json();
                }
                throw resultado;
        }).then(
            resultado =>{
                cadastroSucesso(resultado.jwt)
                

            }).catch(
            erro=>{
                cadastroErro(erro)
                
            });

        

    } else {
        alert("Todos os campos devem ser informados")
        evento.preventDefault(); //Não permite que o formulário seja executado / realizado o 'submit'
    }
});

function cadastroSucesso(jsonRecebido){
    console.log("Json recebido ao cadastrar");
    console.log(jsonRecebido);
    alert("Usuário cadastrado com sucesso")
    window.location.href = "index.html"
}

function cadastroErro(statusRecebido){
    console.log("Erro ao cadastrar");
    console.log(statusRecebido);
    if(erro.status==400){
        alert("Usuário já cadastrado")
        
    }
}



//Validando o campo do Nome
campoNome.addEventListener('blur', function(){
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
campoSobrenome.addEventListener('blur', function(){
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
campoEmail.addEventListener('blur', function() {
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


//Validando o campo de Senha
campoSenha.addEventListener('blur', function() {
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
campoRepetirSenha.addEventListener('blur', function() {
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
        inputRepetirSenhaValidacao.innerText = "'Repetir senha' deve conter o mesmo conteúdo do campo 'Senha'";
        inputRepetirSenhaValidacao.style.color = "#EE1729EC"
        inputRepetirSenhaValidacao.style.fontSize = "8pt"
        inputRepetirSenhaValidacao.style.fontWeight = "bold"
        campoRepetirSenha.style.border = `1px solid #EE1729EC`
        repetirSenhaEValido = false;
    }

    

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
    validacaoTelaDeSignup();
});



botaoCriarConta.addEventListener('click', function(){
    let inputSenhaValidacao = document.getElementById('inputSenhaValidacao');
    let inputRepetirSenhaValidacao = document.getElementById('inputRepetirSenhaValidacao');
    
    if(campoSenha.value == campoRepetirSenha.value & senhaEValido==true & repetirSenhaEValido==true){

        inputSenhaValidacao.innerText = ""
        campoSenha.style.border = ``

        inputRepetirSenhaValidacao.innerText = ""
        campoRepetirSenha.style.border = ``

        senhasEValido = true;
    }else{
        
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






function validacaoTelaDeSignup () {
    if (nomeEValido&sobrenomeEValido&emailEValido&senhaEValido&repetirSenhaEValido) {
        botaoCriarConta.removeAttribute('disabled')
        botaoCriarConta.innerText = "Criar Conta";
        return true;
    } else {
        botaoCriarConta.setAttribute('disabled', true);
        botaoCriarConta.innerText = "Bloqueado";
        return false;
    }
}


