//Captura dos campos de cadastros para
const formCadastro = document.getElementById('formCadastro');
const nomeCadastro = document.getElementById('inputFirstNameSignup');
const sobrenomeCadastro = document.getElementById('inputLastNameSignup');
const emailCadastro = document.getElementById('inputEmailSignup');
const senhaCadastro = document.getElementById('inputPasswordSignup');
const senhaConfCadastro = document.getElementById('inputPasswordConfirmSignup');
const btnCadastro = document.getElementById('btnSignup');
const endpointCadastro = "https://ctd-todo-api.herokuapp.com/v1/users";

//expressão regular baseada no padrão RFC 5322(o mais recente)

//criação da variável que armazenará o token do usuário
const tokenAtivo = "";

//Objeto de criação de usuário
const novoUsuario = {
    firstName: "",
    lastName: "",
    email: "",
    password: "",
}



//função de envio do cadastro para a API
formCadastro.addEventListener('submit', (e) => {
    e.preventDefault();
    if (validacaoDeSenhas(senhaCadastro.value, senhaConfCadastro.value)) {

        //Insersão dos valores no objeto de criação de usuário
        novoUsuario.firstName = nomeCadastro.value.trim().toLowerCase();
        novoUsuario.lastName = sobrenomeCadastro.value.trim().toLowerCase();
        novoUsuario.email = emailCadastro.value.trim().toLowerCase();
        novoUsuario.password = senhaCadastro.value.trim().toLowerCase();

        console.log(novoUsuario);
        const novoUsuarioJson = JSON.stringify(novoUsuario);

        const configApiCadastro = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: novoUsuarioJson
        }

        fetch(endpointCadastro, configApiCadastro)
            .then(response => {
                console.log(response);
                return response.json()
            }
            ).catch((error) => {
                console.log(error);
            })
    } else {
        criarSnackbar("A senhas não conferem");
        console.log('Senhas difentes');
        validacaoDeSenhas(senhaCadastro.value, senhaConfCadastro.value)
    }
})
