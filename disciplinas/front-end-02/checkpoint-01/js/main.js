<<<<<<< HEAD
function adicionarReceita() {

    //captura do nome

    var nomeCompleto = document.getElementById("nomeCompleto").value.toLowerCase().trim()
    console.log(nomeCompleto);

    //primeira letra do nome maiúscula

    var nomeEmMaiusculo = nomeCompleto.split(" ");

    for (var i = 0; i < nomeEmMaiusculo.length; i++) {
        nomeEmMaiusculo[i] = nomeEmMaiusculo[i].charAt(0).toUpperCase() + nomeEmMaiusculo[i].slice(1);
    }

    var nomeCorrigido = nomeEmMaiusculo.join(" ");
    console.log(nomeCorrigido);

    //captura do título da receita

    var tituloReceita = document.getElementById("tituloReceita").value.toLowerCase().trim()
    console.log(tituloReceita);

    //ajuste do título com primeira em maiúscula

    var tituloEmMaiusculo = tituloReceita.split(" ");

=======
const createCard = () => {
    const cardCol = document.createElement('div');
    cardCol.classList.add("col-sm-6", "col-lg-4", "col-xl-3", "mb-3")
    const card = document.createElement('div');
    card.classList.add('card');
    const cardImg = document.createElement('img');
    cardImg.src = 'https://source.unsplash.com/random?dessert'
    cardImg.classList.add('card-img-top')
    cardImg.alt = "Sobremesa"
    const cardBody = document.createElement('div');
    cardBody.classList.add('card-body')
    const cardTitle = document.createElement('h1')
    cardTitle.classList.add('card-title')
    cardTitle.innerText = "Título"
    const cardText = document.createElement('p')
    cardText.classList.add('card-text')
    cardText.innerText = "Descrição"
    const cardButton = document.createElement('a')
    cardButton.classList.add('btn', 'btn-primary')
    cardButton.href = "#"
    cardButton.innerText = "Ver receita"

    cardCol.appendChild(card)
    card.appendChild(cardImg);
    card.appendChild(cardBody);
    cardBody.appendChild(cardTitle)
    cardBody.appendChild(cardText)
    cardBody.appendChild(cardButton)

    return cardCol
}

const addCard = () => {
    const cardsRow = document.querySelector('.cards-row')
    const card = createCard();

    cardsRow.appendChild(card)
}


{/* <div class="col-sm-6 col-lg-4 col-xl-3 mb-3">
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
</div> */}

function adicionarReceita() {

    //captura do nome

    var nomeCompleto = document.getElementById("nomeCompleto").value.toLowerCase().trim()
    console.log(nomeCompleto);

    //primeira letra do nome maiúscula

    var nomeEmMaiusculo = nomeCompleto.split(" ");

    for (var i = 0; i < nomeEmMaiusculo.length; i++) {
        nomeEmMaiusculo[i] = nomeEmMaiusculo[i].charAt(0).toUpperCase() + nomeEmMaiusculo[i].slice(1);
    }

    var nomeCorrigido = nomeEmMaiusculo.join(" ");
    console.log(nomeCorrigido);

    //captura do título da receita

    var tituloReceita = document.getElementById("tituloReceita").value.toLowerCase().trim()
    console.log(tituloReceita);

    //ajuste do título com primeira em maiúscula

    var tituloEmMaiusculo = tituloReceita.split(" ");

>>>>>>> 355f696142e73530602789fbc757b657f0d78716
    for (var i = 0; i < tituloEmMaiusculo.length; i++) {
        tituloEmMaiusculo[i] = tituloEmMaiusculo[i].charAt(0).toUpperCase() + tituloEmMaiusculo[i].slice(1);
    }

    var tituloCorrigido = tituloEmMaiusculo.join(" ");
    console.log(tituloCorrigido);

    //captura da URL da imagem

    var imgReceita = document.getElementById("imgReceita").value
    console.log(imgReceita);

    //captura da descrição da receita

    var descricaoReceita = document.getElementById("descricaoReceita").value
    console.log(descricaoReceita);



}