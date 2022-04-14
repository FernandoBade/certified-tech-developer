//função para alterar o estado da tarefa

function alterarEstadoDaTarefa(idTarefaEspecifica) {
    buscaTarefaEspecifica(idTarefaEspecifica)
    console.log(idTarefaEspecifica);
    //captura da classe em comum entre as tarefas, "estado"
    const idTarefa = idTarefaEspecifica;

    //confirmação po parte do usuário
    const confirmacaoDeAlteracao = confirm("Ter certeza que deseja alterar o estado da tarefa?");

    const objetoTarefaApi = {}

    if(confirmacaoDeAlteracao && idTarefaEspecifica.completed === false) {
        objetoTarefaApi.completed = true;
        alteracaoDeTarefaPeloId()
        alert("Tarefa alterada com sucesso!")
    } else if(confirmacaoDeAlteracao && idTarefaEspecifica.completed === true) {
        objetoTarefaApi.completed = false;
        alteracaoDeTarefaPeloId()
        alert("Tarefa alterada com sucesso!")
    }

    //Configuração do envio para API

    function alteracaoDeTarefaPeloId() {
        //envia as alterações para a API
        fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefa}`, configApiAlteracaoEstado)
        //cria o objeto vazio para a API 
        const objetoTarefaApiJson = JSON.stringify(objetoTarefaApi)
        objetoTarefaApi = {}
        //configura o JSON para a API
        const configApiAlteracaoEstado = {
            method: 'PUT',
            body: objetoTarefaApiJson,
            headers: {
                "Content-type": "application/json",
                "Authorization": tokenJwtusuarioLogado
            }
        }
            .then(response => { response.json() })
            .then(response => {
                alert("Tarefa alterada com sucesso!")
                location.reload();
                console.log(response)
            })
            .catch(error => console.log(error))
    }

}