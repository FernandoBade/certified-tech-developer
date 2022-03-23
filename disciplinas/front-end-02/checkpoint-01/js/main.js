function adicionarReceita() {

    //captura do nome

    // var nomeCompleto = document.getElementById("nomeCompleto").value.toLowerCase().trim()
    // console.log(nomeCompleto);

    //primeira letra do nome maiúscula

    // var nomeEmMaiusculo = nomeCompleto.split(" ");

    // for (var i = 0; i < nomeEmMaiusculo.length; i++) {
    //     nomeEmMaiusculo[i] = nomeEmMaiusculo[i].charAt(0).toUpperCase() + nomeEmMaiusculo[i].slice(1);
    // }

    // var nomeCorrigido = nomeEmMaiusculo.join(" ");
    // console.log(nomeCorrigido);

    //captura do título da receita

    // var tituloReceita = document.getElementById("tituloReceita").value.toLowerCase().trim()
    // console.log(tituloReceita);

    //ajuste do título com primeira em maiúscula

    // var tituloEmMaiusculo = tituloReceita.split(" ");

    // for (var i = 0; i < tituloEmMaiusculo.length; i++) {
    //     tituloEmMaiusculo[i] = tituloEmMaiusculo[i].charAt(0).toUpperCase() + tituloEmMaiusculo[i].slice(1);
    // }

    // var tituloCorrigido = tituloEmMaiusculo.join(" ");
    // console.log(tituloCorrigido);

    //captura da URL da imagem

    // var imgReceita = document.getElementById("imgReceita").value
    // console.log(imgReceita);

    //captura da descrição da receita

    // var descricaoReceita = document.getElementById("descricaoReceita").value
    // console.log(descricaoReceita);

    addCard()
}

const createCard = () => {

    //Criação da estrutura do card

    const cardCol = document.createElement('div');
    cardCol.classList.add("col-sm-6", "col-lg-4", "col-xl-3", "mb-3")
    const card = document.createElement('div');
    card.classList.add('card');
    const cardBody = document.createElement('div');
    cardBody.classList.add('card-body')

    //captura do título da receita

    var tituloReceita = document.getElementById("tituloReceita").value.toLowerCase().trim()
    console.log(tituloReceita);

    const cardTitle = document.createElement('h1')
    cardTitle.classList.add('card-title')
    //ajuste do título com primeira em maiúscula

    var tituloEmMaiusculo = tituloReceita.split(" ");

    for (var i = 0; i < tituloEmMaiusculo.length; i++) {
        tituloEmMaiusculo[i] = tituloEmMaiusculo[i].charAt(0).toUpperCase() + tituloEmMaiusculo[i].slice(1);
    }

    var tituloCorrigido = tituloEmMaiusculo.join(" ");

    cardTitle.innerText = tituloCorrigido

    //captura e adição da URL e ALT da imagem

    const cardImg = document.createElement('img');

    var urlImg = document.getElementById("urlImg").value
    console.log(urlImg);

    cardImg.src = urlImg
    cardImg.classList.add('card-img-top')
    cardImg.alt = tituloReceita

    //Captura e inserção da descrição

    var descricaoReceita = document.getElementById("descricaoReceita").value

    const cardText = document.createElement('p')
    cardText.classList.add('card-text')
    cardText.innerText = descricaoReceita

    //Captura e inserção do nome do autor

    var nomeCompleto = document.getElementById("nomeCompleto").value

    //Correção da primeira em maiúscula no nome
    var nomeEmMaiusculo = nomeCompleto.split(" ");

    for (var i = 0; i < nomeEmMaiusculo.length; i++) {
        nomeEmMaiusculo[i] = nomeEmMaiusculo[i].charAt(0).toUpperCase() + nomeEmMaiusculo[i].slice(1);
    }

    var nomeCorrigido = nomeEmMaiusculo.join(" ");
    console.log(nomeCorrigido);


    const cardAuthor = document.createElement('p')
    cardAuthor.classList.add('bottom-p')
    cardAuthor.innerText = `por ${nomeCorrigido}`

    //Adição do botão "Ver receita"

    const cardButton = document.createElement('a')
    cardButton.classList.add('btn', 'btn-primary')
    cardButton.href = "#"
    cardButton.innerText = "Ver receita"

    //Criação dos nós

    cardCol.appendChild(card)
    card.appendChild(cardImg);
    card.appendChild(cardBody);
    cardBody.appendChild(cardTitle)
    cardBody.appendChild(cardText)
    cardBody.appendChild(cardAuthor)
    cardBody.appendChild(cardButton)

    return cardCol
}

const addCard = () => {
    const cardsRow = document.querySelector('.cards-row')
    const card = createCard();

    cardsRow.appendChild(card)
}


//base dos cards

/* <div class="col-sm-6 col-lg-4 col-xl-3 mb-3">
<div class="card">
    <img src="https://images.unsplash.com/photo-1587314168485-3236d6710814?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1078&q=80"
        class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk
                of
                the card's content.</p>
            <a href="#" class="btn btn-primary">Ver receita</a>
        </div>
</div>
</div> */
