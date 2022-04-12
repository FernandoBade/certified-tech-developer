//Captura dos campos de cadastros para

const nomeCadastro = document.getElementById('inputFirstNameSignup');
const sobrenomeCadastro = document.getElementById('inputLastNameSignup');
const emailCadastro = document.getElementById('inputEmailSignup');
const senhaCadastro = document.getElementById('inputPasswordSignup');
const senhaConfCadastro = document.getElementById('inputPasswordConfirmSignup');
const btnCadastro = document.getElementById('btnSignup');
const endpointBase = "https://ctd-todo-api.herokuapp.com/v1/";

//Objeto de criação de usuário

const novoUsuario = {
    firstName: "",
    lastName: "",
    email: "",
    password: "",
}

const novoUsuarioJson = JSON.stringify(novoUsuario);

const configApiCadastro = {
    method: 'POST',
    body: novoUsuarioJson,
    headers: {
        'content-type': 'application/json'
    }
}

//Variáveis de normalização dos campos

let nomeCadastroNormalizado;
let sobrenomeCadastroNormalizado;
let emailCadastroNormalizado;
let senhaCadastroNormalizado;
let senhaConfCadastroNormalizado;

//Validação dos campos

let nomeValido = false;
let sobrenomeValido = false;
let emailValido = false;
let senhaValida = false;
let senhaConfValida = false;
let senhasConferem = false;

//Verifica se os campos estão vazios

nomeCadastro.addEventListener('input', () => {
    nomeCadastro.value != "" ? nomeValido = true : nomeValido = false  
});

sobrenomeCadastro.addEventListener('input', () => {
    sobrenomeCadastro.value != "" ? sobrenomeValido = true : sobrenomeValido = false
});

emailCadastro.addEventListener('input', () => {
    emailCadastro.value != "" ? emailValido = true : emailValido = false
});

senhaCadastro.addEventListener('input', () => {
    senhaCadastro.value != "" ? senhaValida = true : senhaValida = false
});



//Popula o objeto de criação de usuário

btnCadastro.addEventListener('click', (e) => {
    if () {
        e.preventDefault()
        
        //Normalização dos campos

        nomeCadastroNormalizado = nomeCadastro.value.trim().toLowerCase();
        sobrenomeCadastroNormalizado = sobrenomeCadastro.value.trim().toLowerCase();
        emailCadastroNormalizado = emailCadastro.value.trim().toLowerCase();
        senhaCadastroNormalizado = senhaCadastro.value.trim();
        senhaConfCadastroNormalizado = senhaConfCadastro.value.trim();

        //Insersão dos valores no objeto de criação de usuário

        novoUsuario.firstName = nomeCadastroNormalizado;
        novoUsuario.lastName = sobrenomeCadastroNormalizado;
        novoUsuario.email = emailCadastroNormalizado;
        novoUsuario.password = senhaCadastroNormalizado;

        console.log(novoUsuario);

        // Envio para API

        fetch(endpointBase + "users", configApiCadastro).then(
            resultado => {
                return resultado.json();
            }).then(
                resultado => {
                    console.log(resultado);

                }).catch(
                    erro => {
                        console.log(erro);
                        if (erro = 400) {
                            alert("Usuário já cadastrado")
                        }
                    });
    }
    // validaTodosCampos();
});


// function validaTodosCampos() {
//     if (nomeValido && sobrenomeValido && emailValido && senhaValida && senhaConfValida) {
//         console.log(nomeValido);
//         console.log(sobrenomeValido);
//         console.log(emailValido);
//         console.log(senhaValida);
//         console.log(senhaConfValida);
//         console.log(senhasConferem);

//         btnCadastro.innerText = "Cadastrar";
//     } else {
//         btnCadastro.innerText = "Preencha todos os campos";
//         btnCadastro.classList.add("btnDisabled");
//         btnCadastro.style.background = "var(--cinza-escuro)";
//         btnCadastro.style.color = "var(--cinza-medio)";
//         btnCadastro.style.cursor = "default";
//     }
// }

