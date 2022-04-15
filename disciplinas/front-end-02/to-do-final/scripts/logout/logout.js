function finalizarSessao(){
    localStorage.removeItem('jwt')
    confirm("Sessão finaliza com sucesso!")
    window.location.href = "index.html"
}

closeApp.addEventListener("click", function(event){
    let logout = confirm("Você realmente deseja sair?"); 
    if( logout == true)
    finalizarSessao();     
}); 

