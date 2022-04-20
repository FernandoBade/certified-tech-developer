//função para excluir tarefa

function excluirTarefa(idTarefaEspecifica) {
        const confirmaExclusao = confirm("Deseja realmente excluir esta tarefa?");
        //Configuração do envio para API
        if (confirmaExclusao) {
        const configApiExclusao = {
            method: 'DELETE',
            headers: {
                "Content-type": "application/json",
                "Authorization": tokenJwtusuarioLogado
            }
        };

            fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefaEspecifica}`, configApiExclusao)
            //cria o objeto vazio para a API 
            //configura o JSON para a API
                .then(response => { response.json()})
                .then(response => {
                    alert("Tarefa excluida com sucesso!")
                    location.reload();
                    console.log(response)
                })
                .catch(error => console.log(error))
        }
    }