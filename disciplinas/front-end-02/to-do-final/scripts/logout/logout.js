function finalizarSessao(){
    localStorage.removeItem('jwt')
    window.location.href = "index.html"
    mostrarSpinner();
}

function logout(){
    let logout = confirm("Você realmente deseja sair?"); 
    if( logout == true)
    finalizarSessao();     
};

