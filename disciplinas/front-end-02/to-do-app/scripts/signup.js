//Captura dos campos de cadastros para

const nomeCadastro = document.getElementById('inputFirstNameSignup');
const sobrenomeCadastro = document.getElementById('inputLastNameSignup');
const emailCadastro = document.getElementById('inputEmailSignup');
const senhaCadastro = document.getElementById('inputPasswordSignup');
const btnMostrarSenha1 = document.getElementById('btnMostrarSenha1');
const btnMostrarSenha2 = document.getElementById('btnMostrarSenha2');
const senhaConfCadastro = document.getElementById('inputPasswordConfirmSignup');
const btnCadastro = document.getElementById('btnSignup');
const endpointCadastro = "https://ctd-todo-api.herokuapp.com/v1/users";

// função de mostrar a senha cadastro

btnMostrarSenha1.addEventListener('click', () => {
    const mudarType = senhaCadastro.getAttribute('type') === 'password' ? 'text' : 'password';
    senhaCadastro.setAttribute('type', mudarType);
    btnMostrarSenha1.classList.toggle('material-icons-outlined-1');
});
btnMostrarSenha2.addEventListener('click', () => {
    const mudarType = senhaConfCadastro.getAttribute('type') === 'password' ? 'text' : 'password';
    senhaConfCadastro.setAttribute('type', mudarType);
    btnMostrarSenha2.classList.toggle('material-icons-outlined-1');
});

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

//Verifica se os campos estão vazios

let nomeValido = nomeCadastro.addEventListener('blur', () => {
    nomeCadastro.value != "" ? nomeValido = true : nomeValido = false
});

let sobrenomeValido = sobrenomeCadastro.addEventListener('blur', () => {
    sobrenomeCadastro.value != "" ? sobrenomeValido = true : sobrenomeValido = false
});

let emailValido = emailCadastro.addEventListener('blur', () => {
    emailCadastro.value != "" ? emailValido = true : emailValido = false
});

let senhaValida = senhaCadastro.addEventListener('blur', () => {
    senhaCadastro.value != "" ? senhaValida = true : senhaValida = false
});

let senhaConfValida = senhaCadastro.addEventListener('blur', () => {
    senhaCadastro.value != "" ? senhaConfValida = true : senhaValida = false
});

let senhasConferem = false

function confereSenhas() {
    senhaCadastro.value === senhaConfCadastro.value ? senhasConferem = true : alert("Senhas não conferem")
};


// btnCadastro.addEventListener('click', (e) => {
//     confereSenhas()
//     if (nomeValido && sobrenomeValido && emailValido && senhaValida && senhaConfValida && senhasConferem) {
//         e.preventDefault()

//         //Normalização dos campos

//         nomeCadastroNormalizado = nomeCadastro.value.trim().toLowerCase();
//         sobrenomeCadastroNormalizado = sobrenomeCadastro.value.trim().toLowerCase();
//         emailCadastroNormalizado = emailCadastro.value.trim().toLowerCase();
//         senhaCadastroNormalizado = senhaCadastro.value.trim();
//         senhaConfCadastroNormalizado = senhaConfCadastro.value.trim();

//         //Insersão dos valores no objeto de criação de usuário

//         novoUsuario.firstName = nomeCadastroNormalizado;
//         novoUsuario.lastName = sobrenomeCadastroNormalizado;
//         novoUsuario.email = emailCadastroNormalizado;
//         novoUsuario.password = senhaCadastroNormalizado;

//         console.log(novoUsuario);

//         // Envio para API

//         fetch(endpointCadastro, configApiCadastro)
//             .then(
//                 resultado => {
//                     return resultado.json();
//                 })
//             .then(
//                 resultado => {
//                     console.log(resultado);
//                 }).
//             catch(
//                 erro => {
//                     if (erro = 400) {
//                         alert("Usuário já cadastrado")
//                     };
//                 });

//     } else {
//         console.log("falta preencher alguns campos");
//     }

// });


