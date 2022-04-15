//função para alterar o estado da tarefa

function alterarEstadoDaTarefa(idTarefaEspecifica) {
const idTarefaBuscada = idTarefaEspecifica
//busca uma tarefa especifica, pelo ID
    const configTarefas = {
        method: 'GET',
        headers: {
            authorization: tokenJwtusuarioLogado
        }
    };
    fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefaBuscada}`, configTarefas)
    .then(response => response.json())
    .then(tarefaEspecifica => {
        console.log(tarefaEspecifica)

    })
    .catch(error => console.log(error));


    //captura da classe em comum entre as tarefas, "estado"
    //confirmação po parte do usuário
    const confirmacaoDeAlteracao = prompt("Escolha o que deseja alterar", "");
    console.log(confirmacaoDeAlteracao);

    
    //Configuração do envio para API
    const objetoTarefaApi = {
        description: confirmacaoDeAlteracao,
        completed: testeTarefa
    }
    console.log(objetoTarefaApi)
    const objetoTarefaApiJson = JSON.stringify(objetoTarefaApi)
    
    const configApiAlteracaoEstado = {
        method: 'PUT',
        body: objetoTarefaApiJson,
        headers: {
            "Content-type": "application/json",
            "Authorization": tokenJwtusuarioLogado
        }
    }
    
    function alteracaoDeTarefaPeloId() {
        //envia as alterações para a API
        fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefaEspecifica}`, configApiAlteracaoEstado)
        //cria o objeto vazio para a API 
        //configura o JSON para a API
            .then(response => { response.json()})
            .then(response => {
                alert("Tarefa alterada com sucesso!")
                location.reload();
                console.log(response)
            })
            .catch(error => console.log(error))
    }
    alteracaoDeTarefaPeloId()
}