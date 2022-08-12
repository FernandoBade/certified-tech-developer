//Enunciado
//
//        Utilizaremos um statement para criar uma tabela de funcionários com cinco colunas. A única coluna obrigatória
//        será a coluna ID, que também é Primary Key, e as demais colunas são de livre escolha. Em seguida:
//
//        Devemos inserir três linhas com dados diferentes, e uma delas deve conter o ID repetido;
//
//        Verificar se está ocorrendo o erro: ?Unique index or primary key violation?, ocasionado ao tentar inserir dois registros
//        com o mesmo ID. Então devemos tratá-lo como exceção, registar o erro em log e continuar com a execução das demais instruções;
//
//        Em seguida, você deve atualizar um dos funcionários com um novo valor em uma de suas colunas e registrar com um objeto
//        de depuração (debug) as informações do funcionário;
//
//        Posteriormente, temos que excluir um funcionário de acordo com o ID e registrar as informações do funcionário
//        excluído como um objeto de informação (info);
//
//        Por último, excluir outro funcionário utilizando como critério outra coluna que não seja o ID, como por exemplo o e-mail,
//        e registrar as informações do funcionário excluído como um objeto de informação (info).


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
            + " (2, 'João', 'Silva', 22, 'joao.silva@empresa.com')";

    private static final String sqlUpdate = "UPDATE Funcionario SET Idade = 30 WHERE id = 1";
}
