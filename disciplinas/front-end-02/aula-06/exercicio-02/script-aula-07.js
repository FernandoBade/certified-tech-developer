// //////@@@@@@ Trabalhando com elementos dinâmicos

// //@@@Chamado essa função no script da aula 6
// function atributosDinamicos() {

//     //Capturando a lista de imagens da página
//     let listaImagensFelinos = document.querySelectorAll('img');
//     //console.log(listaImagensFelinos);

//     //Percorre a lista
//     for (let img of listaImagensFelinos) {

//         console.log(img);

//         //@@hasAttribute -> Verifica se o atributo existe
//         console.log(img.hasAttribute("src")); // true
//         console.log(img.hasAttribute("teste")); // false

//         //@@getAttribute -> Captura o atributo
//         //let atributoPego = img.getAttribute("teste"); //Retorna nullo
//         let atributoPego = img.getAttribute("src");
//         console.log(atributoPego);

//         //outra forma de capturar e alterar
//         console.log(img.src);

//         //@@setAttributte -> Define um atributo (Local ou da internet)
//         img.setAttribute("src", "./imagens/leopardo.jpg");
//         img.setAttribute("src", "https://s2.glbimg.com/xYzPF9deXowzD_lQBdcpecfnk64=/e.glbimg.com/og/ed/f/original/2021/01/30/jadeeyedleopard-02.jpg");

//         //Criando um novo atributo
//         img.setAttribute("novoAtributo", "Novo valor")

//         console.log(atributoPego);

//         //@@removeAttribute -> Remove um atrivuto especifico
//         img.removeAttribute("src");
//     }

//     //Quero adicionar um Link de mais informações ao Card do leão (APENAS)

//     // 1) Capturo o card do leão
//     console.log(listaImagensFelinos);
//     console.log(listaImagensFelinos[1]); //captura a img
//     console.log(listaImagensFelinos[1].parentElement); //captura a div

//     //Atribui o elemento pai -  a uma variável
//     let cardLeao = listaImagensFelinos[1].parentElement;

//     // 2) Criar o novo elemento
//     let a = document.createElement('a')
//     a.innerText = "Clique para conhecer mais"

//     // 3) Setando os atributos
//     a.setAttribute('href', "https://www.google.com");
//     a.setAttribute('href', "https://www.ikoporan.org/pt-br/voluntariado/conservacao-de-leoes/");

//     //Abrir na mesma página (Usando mais um atributo)
//     a.setAttribute('target', "_blank");
//     cardLeao.appendChild(a)
// }

// /* ////@@@@@ INSTRUÇÕES PRA MESA DE TRABALHO
//     1 - Criar a opção de seleção do felino (1 tigre, 2 leão, etc)
//     2 - Verificar/testar qual foi a opção escolhida
//     3 - Definir uma nova URL da internet (Foto pública da net) 
//     4 - Acessar o atributo "src" das imagens e fazer a nova atribuição
// */

    // for (let img of listaImagensFelinos) {

    //     console.log(img);

    //     //@@hasAttribute -> Verifica se o atributo existe
    //     console.log(img.hasAttribute("src")); // true
    //     console.log(img.hasAttribute("teste")); // false

    //     //@@getAttribute -> Captura o atributo
    //     //let atributoPego = img.getAttribute("teste"); //Retorna nullo
    //     let atributoPego = img.getAttribute("src");
    //     console.log(atributoPego);

    //     //outra forma de capturar e alterar
    //     console.log(img.src);

    //     //@@setAttributte -> Define um atributo (Local ou da internet)
    //     img.setAttribute("src", "./imagens/leopardo.jpg");
    //     img.setAttribute("src", "https://s2.glbimg.com/xYzPF9deXowzD_lQBdcpecfnk64=/e.glbimg.com/og/ed/f/original/2021/01/30/jadeeyedleopard-02.jpg");

    //     //Criando um novo atributo
    //     img.setAttribute("novoAtributo", "Novo valor")

    //     console.log(atributoPego);

    //     //@@removeAttribute -> Remove um atrivuto especifico
    //     img.removeAttribute("src");
    // }

    
var idPeloH2 = document.querySelectorAll('h2')
var imgs = document.querySelectorAll('img');
imgs.forEach(function(item, i){
  item.setAttribute('id', idPeloH2[i].innerText.toLocaleLowerCase());
});

function botaoTrocarImg() {
    var escolhaUsuario = prompt(`De qual felino gostaria de trocar a imagem?`, `Digite "tigre" ou "leão", por exemplo`).toLocaleLowerCase();

    switch (escolhaUsuario) {
        case 'tigre':
            let tigre = document.getElementById('tigre')
            tigre.setAttribute('src', 'https://images.hdqwalls.com/download/tiger-in-snow-image-2048x2048.jpg' )
            setTimeout(() => { alert('Imagem do tigre trocada com sucesso!') }, 700)
            break;
        case 'leão':
            let leao = document.getElementById('leão')
            leao.setAttribute('src', 'https://images.wallpaperscraft.com/image/single/lion_big_cat_art_147996_300x300.jpg')
            setTimeout(() => { alert('Imagem do leão trocada com sucesso!') }, 700)
            break;
        case 'leopardo':
            let leopardo = document.getElementById('leopardo')
            leopardo.setAttribute('src', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYrMyYDOE_Eha7aZ5rorfFtB4M8JkECb3ySx7MEx5_TENWQ6zQLe1KsYZAsXtowo6F4wY&usqp=CAU')
            setTimeout(() => { alert('Imagem do leopardo trocada com sucesso!') }, 700)
            break;
        case 'pantera':
            let pantera = document.getElementById('pantera')
            pantera.setAttribute('src', 'https://download.cnet.com/a/img/resize/a03049891e38c3255e411b56c5ef7eec46285381/catalog/2017/02/02/701d8c49-4ccf-47d4-9a85-88ee0ee29017/fmimg1496852370544008806.jpg?auto=webp&width=416')
            setTimeout(() => { alert('Imagem da pantera trocada com sucesso!') }, 700)
            break;
        case 'jaguar':
            let jaguar = document.getElementById('jaguar')
            jaguar.setAttribute('src', 'https://i.pinimg.com/564x/d1/b7/e4/d1b7e4712eb8e47d2eea349963f060df.jpg')
            setTimeout(() => { alert('Imagem do jaguar trocada com sucesso!') }, 700)
            break;
        case 'guepardo':
            let guepardo = document.getElementById('guepardo')
            guepardo.setAttribute('src', 'https://i.natgeofe.com/n/de5643df-d07b-4547-b10a-3d5941022d46/01sarahcheetah_square.jpg')
            setTimeout(() => { alert('Imagem do guepardo trocada com sucesso!') }, 700)
            break;
        default:
            alert(`Felino não encontrado. Tente novamente`);
            botaoTrocarImg()
    }
}