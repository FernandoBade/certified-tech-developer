//Captura dos campos de cadastros para

const nomeCadastro = document.getElementById('inputFirstNameSignup');
const sobrenomeCadastro = document.getElementById('inputLastNameSignup');
const emailCadastro = document.getElementById('inputEmailSignup');
const senhaCadastro = document.getElementById('inputPasswordSignup');
const senhaConfCadastro = document.getElementById('inputPasswordConfirmSignup');
const btnCadastro = document.getElementById('btnSignup');

//Normalização dos campos

let nomeCadastroNormalizado;
let sobrenomeCadastroNormalizado;
let senhaCadastroNormalizado;
let senhaConfCadastroNormalizado;

//Validação dos campos

let nomeValido = false;
let sobrenomeValido = false;
let emailValido = false;
let senhaValida = false;
let senhaConfValida = false;
let senhasConferem = false;

//Objeto de criação de usuário

const novoUsuario = {
    firstName: "",
    lastName: "",
    email: "",
    password: "",
}

//Verifica se as senhas Bateman

