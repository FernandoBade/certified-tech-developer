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

    //transformação do objeto em JSON
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
            alert("Tarefa adicionada com sucesso!")
            location.reload();
        })
        .catch(error => console.log(error));
})
