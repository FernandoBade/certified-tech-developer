let h1 = document.querySelector('h1')
h1.innerText = "Dados Curiosos 2.0"
h1.innerHTML = "<h6>Dados Curiosos 3.0</h6>"

let body = document.querySelector('body')
body.style.backgroundColor = "#88e690";
h1.style.color = "#CA8122";
h1.style.textAlign = "center"

let listas = document.querySelectorAll('li')
console.log(listas);

listas.forEach(li => {

    li.classList.add ('novo-li')
});

console.log (listas[3].innerHTML);

listas[3].classList.remove('novo-li')

console.log(listas[3].classList.contains('novo-li'))