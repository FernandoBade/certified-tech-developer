/* -------------------------------- Tarefa 1 -------------------------------- */
// Aqui devem desenvolver uma função que seja exibida na tela:
// a foto, o nome completo do usuário e o e-mail.
// Isto deve ser baseado nas informações que obtemos da API e inseridas no HTML.


let criarNovoUsuarop = document.getElementById('recarregar');


function chamarApi() {

    fetch('https://randomuser.me/api/')
        .then(function (resultado) {
            if (resultado.status == 200) {
                return resultado.json();
            }
        }).then((user) => {
            const users = user.results
            users.forEach(user => renderizarDadosUsuario(user));
        })
        .catch((err) => {
            console.log(err);
        });
}



function renderizarDadosUsuario(users) {
    const card = document.querySelector(".tarjeta")


    const foto = document.createElement("img")
    foto.src = users.picture.large;


    const nome = document.createElement("h1")
    nome.innerText = users.name.first + ' ' + users.name.last;

    const email = document.createElement("h2")
    email.innerText = `E-mail: ${users.email}`


    const registro = document.createElement("h3")
    registro.innerText = `ID: ${users.id.value}`

    card.appendChild(foto)
    card.appendChild(nome)
    card.appendChild(email)
    card.appendChild(registro)
    console.log(card);
}


/* --------------------------- Tarefa 2 (extra) --------------------------- */
// Aqui você pode ir para o ponto extra de usar o botão que está comentado no HTML.
// Você pode descomentar o código no index.html e usar esse botão para executar uma nova solicitação API, sem recarregar a página.
// Cabe aos desenvolvedores decidirem qual bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.


window.onload = chamarApi()


// botaoRecarregar.addEventListener('click', function (evento) {
//     renderizarDadosUsuario()
// })

function atualizaPagina() {
    window.location.reload();
}

