//1- Agregar a la tarjeta, el atributo "class" con el valor "card"

let cartao = document.querySelector('#tarjeta').classList.add('card');

//2- Agregar a la imagen, el atributo "src" con el valor "https://www.youtube.com/img/desktop/yt_1200.png"

let logo = document.querySelector('img');
logo.setAttribute("src", "https://www.youtube.com/img/desktop/yt_1200.png")

//3- Quitarle al titulo la clase que le está dando un formato feo

let titulo = document.querySelector("h1")
titulo.removeAttribute ("class")

//4- Chequear si el link a youtube posee o no el atributo href


let linkYoutube = document.querySelector("#link_youtube")
linkYoutube.hasAttribute("href") ? console.log("Sim, o YouTube possui href") : console.log("Não possui href")
//5- Obtener el href del link a wikipedia y mostrarlo por consola

let linkWikipedia = document.querySelector("#link_wikipedia")
linkWikipedia.hasAttribute("href")
console.log(linkWikipedia);
