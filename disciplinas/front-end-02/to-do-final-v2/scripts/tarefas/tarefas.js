window.onload = () => {
    renderizarSkeletons(5, ".tarefas-pendentes");
   };   

const tokenJwtusuarioLogado = localStorage.getItem("jwt")
onload = () => {
    if (!tokenJwtusuarioLogado) {
        location.href = "index.html"
    } else {
        buscaListaTarefas()
    }
}


//Adquire os dados de usuário da api

let endPointUsuario = "https://ctd-todo-api.herokuapp.com/v1/users/getMe";
let configuracaoRequisicao = {
    method: 'GET',
    headers: {
        'authorization': tokenJwtusuarioLogado
    }
}
fetch(endPointUsuario, configuracaoRequisicao).then(resultado => {
    return resultado.json();
}).then(resultado => {
    //adiciona o nome do usuário na parte superior direita da tela
    //a imagem de perfil é aleatória e muda a cada requisição, através do lorem picsum diretamente pelo CSS
    document.querySelector("#nome").innerText = `Olá, ${resultado.firstName}!`;
    renderizarSkeletons(5, ".tarefas-pendentes")

}).catch(erro => {
    console.log(erro);
}
);
var testeTarefa;
//ativa as funções do 'render-tarefas.js' para renderizar as tarefas no HTML

function renderizarTareas(listaTarefas) {

    const tarefasPendentes = document.querySelector('.tarefas-pendentes');
    tarefasPendentes.innerHTML = "";
    const tarefasTerminadas = document.querySelector('.tarefas-terminadas');
    tarefasTerminadas.innerHTML = "";

    for (const tarefa of listaTarefas) {
        testeTarefa = tarefa.completed
        if (tarefa.completed ) {renderizaTarefasTerminadas(tarefa)
            
        } else {
            renderizaTarefasPendentes(tarefa)
        }
    // console.log(testeTarefa);
}
}
