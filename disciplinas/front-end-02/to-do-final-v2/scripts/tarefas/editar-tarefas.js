//modal para captura das alterações
const openModal = document.querySelector('.openModal');
const closeModal = document.getElementById('closeModal');
const containerModal = document.getElementById('modal-container');
const statusTarefaModal = document.getElementById('statusPendente');
const btnConfirmaAlteracoes = document.getElementById('btnConfirmaAlteracoes');
const btnCancelar = document.getElementById('btnCancelar');
const alteracoesModal = document.getElementById('alteracoesModal');
const inputAlteracaoTarefa = document.getElementById('inputAlteracaoTarefa');
const objetoDeAlteracao = {}


openModal.addEventListener('click', () => {
    containerModal.classList.add('show');
})

closeModal.addEventListener('click', () => {
    containerModal.classList.remove('show');
})

btnCancelar.addEventListener('click', () => {
    containerModal.classList.remove('show');
})

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
        containerModal.classList.add('show');
        inputAlteracaoTarefa.innerText = tarefaEspecifica.description;
        alteracoesModal.addEventListener('submit', (e) => {
            e.preventDefault();
            objetoDeAlteracao.description = inputAlteracaoTarefa.value;
            statusTarefaModal.checked===true ? objetoDeAlteracao.completed = true : objetoDeAlteracao.completed = false;
            const objetoTarefaApiJson = JSON.stringify(objetoDeAlteracao)
            const configApiAlteracaoEstado = {
                method: 'PUT',
                body: objetoTarefaApiJson,
                headers: {
                    "Content-type": "application/json",
                    "Authorization": tokenJwtusuarioLogado
                }
            }
            fetch(`https://ctd-todo-api.herokuapp.com/v1/tasks/${idTarefaBuscada}`, configApiAlteracaoEstado)
            .then(response => response.json())
            .then(resposta => {
            containerModal.classList.remove('show');
            alert("Tarefa alterada com sucesso!")
            location.reload();
            })
        })
    })
}