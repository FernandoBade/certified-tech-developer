/* -------------------------------- Tarefa 1 -------------------------------- */
// Aqui devem desenvolver uma função que seja exibida na tela:
// a foto, o nome completo do usuário e o e-mail.
// Isto deve ser baseado nas informações que obtemos da API e inseridas no HTML.


function chamarApi() {
    
    fetch('https://randomuser.me/api/')
    .then(resposta => {
        return resposta.json()
        })
        .then(user => {
            renderizarDadosUsuario(user)
        });
    }
    
    chamarApi()
    let img = document.querySelector('#foto')
    let nome = document.querySelector('#nome')
    let email = document.querySelector('#email')
    let registro = document.querySelector('#registro')

    let criarNovoUsuario = document.querySelector('#result');

function renderizarDadosUsuario(users) {

    img.src = `${users.results[0].picture.large}`
    nome.innerText = `${users.results[0].name.first} ${users.results[0].name.last} `
    email.innerHTML = `<b>Email: </b>${users.results[0].email}`
    registro.innerHTML = `<b>ID: </b>${users.results[0].id.value}`

    // const card = document.querySelector(".tarjeta")


    // const foto = document.createElement("img")
    // foto.src = users.results[0].picture.large;


    // const nome = document.createElement("h1")
    // nome.innerText = users.results[0].name.first + ' ' + users.results[0].name.last;

    // const email = document.createElement("h2")
    // email.innerText = `E-mail: ${users.results[0].email}`


    // const registro = document.createElement("h3")
    // registro.innerText = `ID: ${users.results[0].id.value}`

    // card.appendChild(foto)
    // card.appendChild(nome)
    // card.appendChild(email)
    // card.appendChild(registro)
}

/* --------------------------- Tarefa 2 (extra) --------------------------- */
// Aqui você pode ir para o ponto extra de usar o botão que está comentado no HTML.
// Você pode descomentar o código no index.html e usar esse botão para executar uma nova solicitação API, sem recarregar a página.
// Cabe aos desenvolvedores decidirem qual bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.


criarNovoUsuario.addEventListener('click', () => {
    chamarApi()
})


