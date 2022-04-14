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
            <p class="nome">${tarefa.description}</p>
            <p class="timestamp"><i class="far fa-calendar-alt"></i>${addData.toLocaleDateString()} <i class="far fa-clock"></i>${addData.getHours()}:${addData.getMinutes()}</p>
            <div class="icones-edit">
                <button><i id="${tarefa.id}" class="fa-solid fa-undo change"></i></button>
                <button><i id="${tarefa.id}" class="fa-solid fa-trash"></i></button>
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
            <p class="nome">${tarefa.description}</p>
            <p class="timestamp"><i class="far fa-calendar-alt"></i>${addData.toLocaleDateString()} <i class="far fa-clock"></i>${addData.getHours()}:${addData.getMinutes()}</p>
            <div class="icones-edit">
                <button><i id="${tarefa.id}" class="fa-solid fa-check"></i></button>
                <button><i id="${tarefa.id}" class="fa fa-trash"></i></button>
            </div>
        </div>
    </li>
    `
}



