let aluno = function (nome, qtdFaltas, notas) 
{
    this.nome  = nome;
    this.qtdFaltas = qtdFaltas,
    this.notas = notas
    this.calcularMedia =  function ()
    {
        var media = this.notas.reduce((total, valor) => total + valor) / this.notas.length;
        return media
    }
    this.faltas =  function ()
    {
        this.qtdFaltas++;
    }
}

module.exports = aluno;
