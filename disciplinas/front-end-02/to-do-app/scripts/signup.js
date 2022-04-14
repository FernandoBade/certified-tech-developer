//Captura dos campos de cadastros para

const formCadastro = document.getElementById('formCadastro');
const nomeCadastro = document.getElementById('inputFirstNameSignup');
const sobrenomeCadastro = document.getElementById('inputLastNameSignup');
const emailCadastro = document.getElementById('inputEmailSignup');
const senhaCadastro = document.getElementById('inputPasswordSignup');
const btnMostrarSenha1 = document.getElementById('btnMostrarSenha1');
const btnMostrarSenha2 = document.getElementById('btnMostrarSenha2');
const senhaConfCadastro = document.getElementById('inputPasswordConfirmSignup');
const btnCadastro = document.getElementById('btnSignup');
const endpointCadastro = "https://ctd-todo-api.herokuapp.com/v1/users";
const token = "";
//Função de mostrar as senhas

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
    headers: {
        'Content-Type': 'application/json'
    },
    body: novoUsuarioJson
}

//Variáveis de normalização dos campos

let nomeCadastroNormalizado;
let sobrenomeCadastroNormalizado;
let emailCadastroNormalizado;
let senhaCadastroNormalizado;
let senhaConfCadastroNormalizado;



formCadastro.addEventListener('submit', (e) => {
    e.preventDefault();

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

    fetch(endpointCadastro, configApiCadastro)
        .then(response => {
            if (response.status == 201) {
                return response.json()
            }
            throw response;
        })
        .then(response => {
            cadastroSucesso(response)
        })
        .catch((error) => {
            if (error.status == 400) {
                console.log(error)
            } else {
                cadastroErro(error)
            }
        })
})
