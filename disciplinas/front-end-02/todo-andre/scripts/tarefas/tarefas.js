let tokenJwtusuarioLogado = localStorage.getItem("jwt")
onload = () =>{
    

    if(!tokenJwtusuarioLogado){
        location.href="index.html"
    }else{
        console.log(tokenJwtusuarioLogado);
    }
    //console.log(tokenJwtusuarioLogado);
}

console.log(tokenJwtusuarioLogado);



let endPointUsuario = "https://ctd-todo-api.herokuapp.com/v1/users/getMe";
//let usuarioJson = JSON.stringify(usuarioObjeto);
let configuracaoRequisicao = {
    method: 'GET',
    //body: usuarioJson,
    headers: {
        //'content-type': 'application/json'
        'authorization': tokenJwtusuarioLogado
        }
    
}

let endpointTarefas= "https://ctd-todo-api.herokuapp.com/v1/tasks";
fetch(endpointTarefas, configuracaoRequisicao)
.then(resultado => resultado.json())
.then(resultado => {
    console.log(resultado); 
    })
.catch(erro => console.log(erro));

let bodyTarefas = 
{
    description: "Tarefa de TEste Javascript",
    completed: false
  }

bodyTarefas = JSON.stringify(bodyTarefas);

let criaTarefas = {
    method: 'POST',
    body: bodyTarefas,
    headers: {
        'content-type': 'application/json',
        'authorization': tokenJwtusuarioLogado,
    }
}  

function criarTarefaTeste(){
fetch(endpointTarefas, criaTarefas)
.then(resultado => resultado.json())
.then(resultado => {
    console.log(resultado); 
    })
.catch(erro => console.log(erro));
}
criarTarefaTeste()

//Adquirir os dados de usuário da api
// fetch(endPointUsuario, configuracaoRequisicao).then(resultado=>{
//         /* if(resultado.status == 201){
//             return resultado.json();
//         }
//         throw resultado; */
        
//        return resultado.json();      
    
    
//     }).then(resultado =>{
//         /* cadastroSucesso(resultado.jwt) */
//         //console.log(resultado);
//         //console.log(resultado.id);
//         //console.log(resultado.firstName);
//         //console.log(resultado.lastName);
//         //console.log(resultado.email);
//         document.querySelector("#nome").innerText = "Bem vindo " + resultado.firstName +" "+resultado.lastName;
        
//     }).catch(erro=>{
//         /* cadastroErro(erro)
//         if(erro.status==400){
//             alert("Usuário já cadastrado")
                    
//         } */
//         console.log(erro);
//     }
// );
 
    
