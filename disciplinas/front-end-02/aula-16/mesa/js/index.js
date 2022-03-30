const baseDeDados = {
    "resultado": [{
        "genero": "masculino",
        "nome": {
            "titulo": "sr",
            "primeiro": "David",
            "utlimo": "Fernando"
        },
        "localizacao": {
            "rua": " Augusta , 238",
            "cidade": "São Paulo",
            "Estado": "São Paulo",
            "postcode": "01305000",
            "coordenadas": {
                "latitude": "-23.5569581",
                "longitude": "-46.6589677"
            },
            "timezone": {
                "offset": "-3:00",
                "descricao": "Brasil"
            }
        },
        "email": "david.fernando@exemplo.com",
        "login": {
            "uuid": "155e77ee-ba6d-486f-95ce-0e0c0fb4b919",
            "usuario": "silverswan131",
            "senha": "firewall",
            "salt": "TQA1Gz7x",
            "md5": "dc523cb313b63dfe5be2140b0c05b3bc",
            "sha1": "7a4aa07d1bedcc6bcf4b7f8856643492c191540d",
            "sha256": "74364e96174afa7d17ee52dd2c9c7a4651fe1254f471a78bda0190135dcd3480"
        },
        "dob": {
            "data": "1993-07-20T09:44:18.674Z",
            "idade": 26
        },
        "registro": {
            "data": "2002-05-21T10:59:49.966Z",
            "idade": 17
        },
        "fone": "011-4039-8745",
        "celular": "011-99874-5621",
        "id": {
            "nome": "PPS",
            "valor": "0390511T"
        },
        "imagem": {
            "grande": "https://randomuser.me/api/portraits/men/75.jpg",
            "media": "https://randomuser.me/api/portraits/med/men/75.jpg",
            "miniatura": "https://randomuser.me/api/portraits/thumb/men/75.jpg"
        },
        "nat": "IE"
    }],
    "info": {
        "seed": "fea8be3e64777240",
        "resultado": 1,
        "pagina": 1,
        "versao": "1.3"
    }
};



let consultandoBaseDeDados = new Promise((resolve, reject) => {
    // Aqui temos uma solicitação simulada para um banco de dados, com um atraso de 2 segundos.
    //A lógica interna estará  no servidor e nós apenas esperaríamos por uma resposta.
    setTimeout(function () {
        if (baseDeDados == null) {
            reject({
                "mensagem": "Base de dados inexistente."
            });
        } else {
            resolve(baseDeDados);
        }
    }, 0);

});

// Aqui realizamos uma consulta da promessa, aguardando sua resposta assíncrona
consultandoBaseDeDados
    .then((data) => {
        const users = data.resultado
        console.log(users);
        users.forEach(user => renderizarDadosUsuario(user));
    })
    .catch((err) => {
        console.log(err);
    });

function renderizarDadosUsuario(users) {
    const card = document.querySelector(".tarjeta")
    card.style.textAlign = 'center'
    card.style.padding = '30px'
    card.style.display = "flex"
    card.style.flexDirection = 'column'
    card.style.justifyContent = 'center'
    card.style.alignItems = 'center'
    card.style.gap = '20px'

    const foto = document.createElement("img")
    foto.src = users.imagem.grande;
    foto.style.borderRadius = '50%'
    foto.style.width = '30%'

    const nome = document.createElement("h1")
    nome.innerText = users.nome.primeiro + ' ' + users.nome.utlimo;

    const email = document.createElement("h2")
    email.innerText = users.email;

    const registro = document.createElement("h3")
    registro.innerText = users.registro.data

    card.appendChild(foto)
    card.appendChild(nome)
    card.appendChild(email)
    card.appendChild(registro)
    console.log(card);


    /* -------------------------------- TAREFAS -------------------------------- */
    // Aqui devem desenvolver uma função que é exibida na tela:
    // a foto, o nome completo do usuário e seu e-mail.
    //  Isso deve ser baseado nas informações que chegam até nós e são inseridas no HTML.
    //  Dica: você pode manipular o CSS e estruturar o card ao seu gosto.
}

// Fernando Bade
// Gustavo Martins
// Thiago Silva
// Rodrigo Costa Valle
// Guilherme Carvalho