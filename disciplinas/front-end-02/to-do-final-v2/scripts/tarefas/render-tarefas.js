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
        <div class="done estado"></div>
        <div class="descricao">
            <div class="descricaoECriacao">
            <p class="timestamp timestamp-done">
                Tarefa ${tarefa.id} criada em 
                ${addData.toLocaleDateString()} às
                ${addData.getHours()}:${addData.getMinutes()}
                <i class="far fa-calendar-alt"></i>
            </p>
            <p class="nome">${tarefa.description}</p>
            </div>
            <div class="icones-edit">
                <button onclick="alterarEstadoDaTarefa(${tarefa.id})" id="${tarefa.id}" title="Editar tarefa"><i class="fa-solid fa-edit change"></i></button>
                <button onclick="excluirTarefa(${tarefa.id})" id="${tarefa.id}" title="Excluir tarefa"><i class="fa fa-trash"></i></button>
            </div>
        </div>
    </li>
    `
}

function renderizaTarefasPendentes(tarefa) {
    const addData = new Date(tarefa.createdAt);
    tarefasPendetes.innerHTML += `
    <li class="tarefa">
        <div class="not-done estado" id="${tarefa.id}"></div>
        <div class="descricao">
            <div class="descricaoECriacao">
            <p class="timestamp">
                Tarefa ${tarefa.id} criada em 
                ${addData.toLocaleDateString()} às
                ${addData.getHours()}:${addData.getMinutes()}
                <i class="far fa-calendar-alt"></i>
            </p>
            <p class="nome">${tarefa.description}</p>
            </div>
            <div class="icones-edit">
                <button onclick="alterarEstadoDaTarefa(${tarefa.id})" id="${tarefa.id}" title="Editar tarefa"><i class="fa-solid fa-edit"></i></button>
                <button onclick="excluirTarefa(${tarefa.id})" id="${tarefa.id}" title="Excluir tarefa"><i class="fa fa-trash"></i></button>
            </div>
        </div>
    </li>
    `
}



