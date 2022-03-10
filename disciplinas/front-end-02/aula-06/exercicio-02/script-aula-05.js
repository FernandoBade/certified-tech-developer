function darkMode() {

    let bodyDm = document.querySelector('body')
    bodyDm.classList.toggle('body-dm')

    let titulo = document.querySelector('h1')
    titulo.classList.toggle('h1-dm')

    let itens = document.querySelectorAll('.item')
    itens.forEach(itens => {
        itens.classList.toggle('item-dm')
    });

    let itensH2 = document.querySelectorAll('.item > h2')
    itensH2.forEach(itensH2 => {
        itensH2.classList.toggle('item-dm-h2')
    });

}

