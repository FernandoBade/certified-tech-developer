let curso = function(nome, notaAprovacao, faltasMaximas, alunos)
{

    this.nome =  nome;
    this.notaAprovacao = notaAprovacao;
    this.faltasMaximas = faltasMaximas;
    this.alunos = alunos;
    
    this.adicionarAluno = function(aluno)
    {
        this.alunos.push(aluno)
    }

    this.validaAprovacao = function(aluno)
    {
        if(aluno.calcularMedia() >= this.notaAprovacao && aluno.qtdFaltas < this.faltasMaximas) return true;
        if(aluno.qtdFaltas == this.faltasMaximas && (aluno.calcularMedia() * 1.1) > this.notaAprovacao) return true;
        return false;
    }

    this.retornarAlunosAprovados = function()
    {
        return this.alunos.filter((aluno) => this.validaAprovacao(aluno));
    }

}


module.exports = curso;