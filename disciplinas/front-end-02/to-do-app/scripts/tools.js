//Função de mostrar/visualizar as senhas

const btnMostrarSenha1 = document.getElementById('btnMostrarSenha1');
const btnMostrarSenha2 = document.getElementById('btnMostrarSenha2');
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

//validação das senhas

function validacaoDeSenhas(senha1, senha2) {
    if (senha1 === senha2) {
        return true;
    } else {
        return false;
    }
}

//validação de email via Regex

const regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/

function validacaoEmailRegex(email) {

    // check if the email is valid
    const result = regex.test(email);
    if (result) {
        return true;
    } else {
        return false;
    }
}

//criação de snackbars

function criarSnackbar(texto) {
    const snackbar = document.getElementById('snackbar');
    snackbar.innerText = texto;
    snackbar.classList.add('showSnackbar');
    setTimeout(() => { snackbar.style.visibility = "hidden" }, 5000);
}