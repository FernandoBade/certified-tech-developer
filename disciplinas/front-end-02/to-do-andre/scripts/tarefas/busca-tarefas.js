//busca da listagem de tasks por usuário, utilizando o token

function buscaListaTarefas() {
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

//busca uma tarefa especifica, pelo ID
function buscaTarefaEspecifica(idTarefa) {
    const idTarefaEspecifica = idTarefa
    const configTarefas = {
        method: 'GET',
        headers: {
            authorization: tokenJwtusuarioLogado
        }
    };
    fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefaEspecifica}`, configTarefas)
    .then(response => response.json())
    .then(tarefaEspecifica => {
        console.log(tarefaEspecifica)
    })
    .catch(error => console.log(error));
}