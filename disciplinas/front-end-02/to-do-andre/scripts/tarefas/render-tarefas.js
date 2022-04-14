const skeleton = document.getElementById('skeleton');
const tarefasPendetes = document.querySelector('.tarefas-pendentes');
tarefasPendetes.innerHTML = "";
const tarefasTerminadas = document.querySelector('.tarefas-terminadas');
tarefasTerminadas.innerHTML = "";

function renderizaTarefasTerminadas(tarefa) {
    //Da para utilizar o método toLocaleDateString() e 'new Date()' para transformar a data no formato PT-BR
    const addData = new Date(tarefa.createdAt);
    tarefasTerminadas.innerHTML += `
    <li class="tarefa">
        <div class="done"></div>
        <div class="descricao">
            <div class="descricaoECriacao">
            <p class="timestamp">
                Tarefa criada em 
                ${addData.toLocaleDateString()} às
                ${addData.getHours()}:${addData.getMinutes()}
                <i class="far fa-calendar-alt"></i>
            </p>
            <p class="nome">${tarefa.description}</p>
            </div>
            <div class="icones-edit">
                <button title="Ativar tarefa novamente"><i id="${tarefa.id}" class="fa-solid fa-undo change"></i></button>
                <button title="Excluir tarefa"><i id="${tarefa.id}" class="fa fa-trash"></i></button>
            </div>
        </div>
    </li>
    `
}

function renderizaTarefasPendentes(tarefa) {
    const addData = new Date(tarefa.createdAt);
    tarefasPendetes.innerHTML += `
    <li class="tarefa">
        <div class="not-done change" id="${tarefa.id}"></div>
        <div class="descricao">
            <div class="descricaoECriacao">
            <p class="timestamp">
                Tarefa criada em 
                ${addData.toLocaleDateString()} às
                ${addData.getHours()}:${addData.getMinutes()}
                <i class="far fa-calendar-alt"></i>
            </p>
            <p class="nome">${tarefa.description}</p>
            </div>
            <div class="icones-edit">
                <button title="Marcar como terminada"><i id="${tarefa.id}" class="fa-solid fa-check"></i></button>
                <button title="Excluir tarefa"><i id="${tarefa.id}" class="fa fa-trash"></i></button>
            </div>
        </div>
    </li>
    `
}



