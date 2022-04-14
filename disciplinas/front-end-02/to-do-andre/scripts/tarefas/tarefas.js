const tokenJwtusuarioLogado = localStorage.getItem("jwt")
onload = () => {

    if (!tokenJwtusuarioLogado) {
        location.href = "index.html"
    } else {
        // console.log(tokenJwtusuarioLogado);
    }
}

let endPointUsuario = "https://ctd-todo-api.herokuapp.com/v1/users/getMe";
//let usuarioJson = JSON.stringify(usuarioObjeto);
let configuracaoRequisicao = {
    method: 'GET',
    //body: usuarioJson,
    headers: {
        //'content-type': 'application/json'
        'authorization': tokenJwtusuarioLogado
    }
}
//Adquirir os dados de usuário da api
fetch(endPointUsuario, configuracaoRequisicao).then(resultado => {
    return resultado.json();
}).then(resultado => {
    //adiciona o nome do usuário na parte superior direita da tela
    document.querySelector("#nome").innerText = `Olá, ${resultado.firstName}!`;

}).catch(erro => {
    console.log(erro);
}
);

function finalizarSessao() {
    localStorage.removeItem('jwt')
    alert("Logout Realizado")
    window.location.href = "index.html"
}

consultaTarefas()

//captura do skeleton e do input de criação da tarefa
const skeleton = document.getElementById('skeleton');

//busca da listagem de tasks por usuário, utilizando o token
function consultaTarefas() {
    const configTarefas = {
        method: 'GET',
        headers: {
            authorization: tokenJwtusuarioLogado
        }
    };
    fetch("https://ctd-todo-api.herokuapp.com/v1/tasks", configTarefas)
        .then(response => response.json())
        .then(tarefas => {
            //captura e deleta o Skeleton que já existia no documento
            skeleton ? skeleton.remove() : skeleton;
            renderizarTareas(tarefas);
        })
        .catch(error => console.log(error));
}

//ativa as funções do 'render-tarefas.js' para renderizar as tarefas no html

function renderizarTareas(listaTarefas) {

    const tarefasPendentes = document.querySelector('.tarefas-pendentes');
    tarefasPendentes.innerHTML = "";
    const tarefasTerminadas = document.querySelector('.tarefas-terminadas');
    tarefasTerminadas.innerHTML = "";

    for (const tarefa of listaTarefas) {
        tarefa.completed ? renderizaTarefasTerminadas(tarefa) : renderizaTarefasPendentes(tarefa)
    }
}

//Listar tarefas do usuário

let endPointTarefas = "https://ctd-todo-api.herokuapp.com/v1/tasks";

let configuracaoTarefas = {
    method: 'GET',
    headers: {
        'authorization': tokenJwtusuarioLogado
    }
}

// criar uma nova tarefa

const descricaoNovaTarefa = document.querySelector('#inputNovaTarefa');
const addNovaTarefa = document.querySelector('#addNovaTarefa');
const btnAddTarefas = document.querySelector('#btnAddTarefas');

addNovaTarefa.addEventListener('submit', function (event) {
    event.preventDefault();

    //criação do objeto da nova tarefa
    const objetoAddTarefa = {
        description: descricaoNovaTarefa.value,
        completed: false
    }

    //transformação do objeto em json
    const objetoAddTarefaJson = JSON.stringify(objetoAddTarefa);

    //conforme o objeto json, faz a requisição para o endpoint
    const configApiAddTask = {
        method: 'POST',
        body: objetoAddTarefaJson,
        headers: {
            'Content-Type': 'application/json',
            authorization: tokenJwtusuarioLogado
        }
    }

    //envio para o servidor
    fetch("https://ctd-todo-api.herokuapp.com/v1/tasks", configApiAddTask)
        .then(response => response.json())
        .then(response => {
            console.log(response.status);
            location.reload();
        })
        .catch(error => console.log(error));
})
