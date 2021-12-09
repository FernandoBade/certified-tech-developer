const Aluno = require("./aluno.js");
const Curso = require("./curso.js") 
const Estudantes =  require("./estudantes");

// TESTES COM ALUNOS CRIADOS INDIVIDUALMENTE

var pedro = new Aluno("Pedro", 1, [1,2]); // Reprovar
var fernando = new Aluno("Fernando", 0, [10,10]); // Aprovado
var daniel =  new Aluno("Daniel",0,[5,5]) // Aprovado
var jeff =  new Aluno("Jeff", 3, [6,6]) // Aprovado com ressalvas
var pedor =  new Aluno("Pedor", 10, [1,1]) // Reprovar


var curso = new Curso("Informatica1", 5, 3, [])
curso.adicionarAluno(pedro)
curso.adicionarAluno(fernando)
curso.adicionarAluno(daniel)
curso.adicionarAluno(jeff)
curso.adicionarAluno(pedor)

console.log(curso.retornarAlunosAprovados());

// TESTES COM CARREGAMENTO DE ALUNOS NOVOS

var listaAlunos = [];
for (let i = 0; i < Estudantes.length; i++) {
    listaAlunos.push(new Aluno(Estudantes[i]["nome"], Estudantes[i]["qtdFaltas"], Estudantes[i]["notas"])) ; 
}

var curso = new Curso("Informatica2", 5, 3, listaAlunos)
console.log(curso.retornarAlunosAprovados());