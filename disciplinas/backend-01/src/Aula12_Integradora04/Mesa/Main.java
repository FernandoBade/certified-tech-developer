//Enunciado
//
//        Utilizaremos um statement para criar uma tabela de funcion�rios com cinco colunas. A �nica coluna obrigat�ria
//        ser� a coluna ID, que tamb�m � Primary Key, e as demais colunas s�o de livre escolha. Em seguida:
//
//        Devemos inserir tr�s linhas com dados diferentes, e uma delas deve conter o ID repetido;
//
//        Verificar se est� ocorrendo o erro: ?Unique index or primary key violation?, ocasionado ao tentar inserir dois registros
//        com o mesmo ID. Ent�o devemos trat�-lo como exce��o, registar o erro em log e continuar com a execu��o das demais instru��es;
//
//        Em seguida, voc� deve atualizar um dos funcion�rios com um novo valor em uma de suas colunas e registrar com um objeto
//        de depura��o (debug) as informa��es do funcion�rio;
//
//        Posteriormente, temos que excluir um funcion�rio de acordo com o ID e registrar as informa��es do funcion�rio
//        exclu�do como um objeto de informa��o (info);
//
//        Por �ltimo, excluir outro funcion�rio utilizando como crit�rio outra coluna que n�o seja o ID, como por exemplo o e-mail,
//        e registrar as informa��es do funcion�rio exclu�do como um objeto de informa��o (info).


        package Aula12_Integradora04.Mesa;

public class Main {

    private static final String sqlCreateTable =
            "DROP TABLE IF EXISTS Funcionario; CREATE TABLE Funcionario"
                    + "("
                    + "id INT PRIMARY KEY,"
                    + "Primeiro_Nome VARCHAR(100) NOT NULL,"
                    + "Sobrenome VARCHAR(100) NOT NULL,"
                    + "Idade INT NOT NULL,"
                    + "email VARCHAR(100) NOT NULL,"
                    + ")";

    private static final String sqlInsert1 = "INSERT INTO Funcionario (id, Primeiro_Nome, Sobrenome, email)"
            + "VALUES"
            + " (1, 'Maria', 'Almeida', 35, 'maria.almeida@empresa.com')";

    private static final String sqlInsert2 = "INSERT INTO Funcionario (id, Primeiro_Nome, Sobrenome, email)"
            + "VALUES"
            + " (2, 'Jo�o', 'Silva', 22, 'joao.silva@empresa.com')";

    private static final String sqlUpdate = "UPDATE Funcionario SET Idade = 30 WHERE id = 1";
}
