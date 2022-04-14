//função para alterar o estado "completed" da tarefa

function alterarEstadoDaTarefa(id) {
    //caputora da classe em comum entre as tarefas, "estado"
    const idTarefa = id;
;    //confirmação da alteração do estado
    const confirmacaoDeAlteracao = confirm("Ter certeza que deseja alterar o estado da tarefa?")
    if (confirmacaoDeAlteracao) {
                //cria o objeto vazio para a API 
                const objetoTarefaApi = {}
                const objetoTarefaApiJson = JSON.stringify(objetoTarefaApi)
                

                //configura o JSON para a API
                const configApiAlteracaoEstado = {
                    method: 'PUT',
                    body: objetoTarefaApiJson,
                    headers: {
                        "Content-type": "application/json",
                        "Authorization": tokenJwtusuarioLogado
                    }
                }
                //envia as alterações para a API
                fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefa}`, configApiAlteracaoEstado)
                .then(response => { response.json() })
                .then(response => {
                    alert("Tarefa alterada com sucesso!")
                    location.reload();
                    console.log(response)
                    })
                .catch(error => console.log(error))

            console.log("Alteração efetuada com sucesso!")
    } else {
        console.log("Alteração cancelada!")}
}