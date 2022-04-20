/*
 Nossa função receberá dois argumentos:
 
 1) Em primeiro lugar, o número de skeletons que queremos
   mostrar;
  2) Em segundo lugar, o conteiner dentro do qual queremos incluir
 os skeletons
  Por exemplo, se queremos mostrar 5 skeletons dentro
 do seguinte conteiner:
 
   <ul class="tarefas-pendentes"></ul>
 
 ao chamar a função podemos passar os seguintes argumentos:
 
 renderizarSkeletons(5, ".tarefas-pendentes")
 
*/
function renderizarSkeletons(quantidade, conteiner) {
    // Selecionamos o conteiner
    const conteinerTarefas = document.querySelector(conteiner);

    // Criamos um array que terá um lenght igual ao número de
    //skeletons que queremos renderizar
    const skeletons = Array.from({ length: quantidade });

    // Iteramos sobre o array acessando cada elemento
    skeletons.forEach(() => {
        // Guardamos o HTML de cada skeleton. Adicionamos uma classe com o seletor do conteiner
        // Isso nos permitirá posteriormente eliminar os skeletons do referido conteiner
        const template = `
      <li class="skeleton-conteiner ${conteiner.replace(".", "")}-child="">
        <div class="skeleton-card">
          <p class="skeleton-text"></p>
          <p class="skeleton-text"></p>
        </div>
      </li>
    `;

        // Inserimos o HTML dentro do conteiner
        conteinerTarefas.innerHTML += template;
    });
}


/*
 Esta função receberá o nome do conteiner dentro do qual
 se encontram os skeletons que desejamos remover
*/
function removerSkeleton(conteiner) {
    // Selecionamos o conteiner
    const conteinerTarefas = document.querySelector(conteiner);

    // Selecionamos todos os skeletons dentro deste conteiner
    const skeletons = document.querySelectorAll(`${conteiner}-child`);

    // Iteramos sobre a lista de skeletons e removemos cada um deles
    // do referido conteiner
    skeletons.forEach((skeleton) => conteinerTarefas.removeChild(skeleton));
}
