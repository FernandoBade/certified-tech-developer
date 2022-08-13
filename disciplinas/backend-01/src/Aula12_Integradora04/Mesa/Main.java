//Enunciado
//
//        Utilizaremos um statement para criar uma tabela de funcion�rios com cinco colunas. A �nica coluna obrigat�ria
//        ser� a coluna ID, que tamb�m � Primary Key, e as demais colunas s�o de livre escolha. Em seguida:
//
//        Devemos inserir tr�s linhas com dados diferentes, e uma delas deve conter o ID repetido;
//
//        Verificar se est� ocorrendo o erro: "Unique index or primary key violation", ocasionado ao tentar inserir dois registros
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

import java.sql.*;
import java.util.logging.Logger;

public class Main {
    //import do Logger
    private static final Logger logger = Logger.getLogger(Main.class.getName());


    //Instru��o para criar a tabela "Usuario". Caso j� exista, apaga e cria uma nova tabela
    private static final String sqlCreateTable =
            "DROP TABLE IF EXISTS Funcionario; CREATE TABLE Funcionario"
                    + "("
                    + "id INT PRIMARY KEY,"
                    + "Primeiro_Nome VARCHAR(100) NOT NULL,"
                    + "Sobrenome VARCHAR(100) NOT NULL,"
                    + "Idade INT NOT NULL,"
                    + "email VARCHAR(100) NOT NULL"
                    + ")";

    //cria��o dos 3 inserts, 2 deles com o mesmo ID
    private static final String sqlInsert1 = "INSERT INTO Funcionario (id, Primeiro_Nome, Sobrenome, idade, email)"
            + "VALUES"
            + " (1, 'Maria', 'Almeida', 35, 'maria.almeida@empresa.com')";

    private static final String sqlInsert2 = "INSERT INTO Funcionario (id, Primeiro_Nome, Sobrenome, idade, email)"
            + "VALUES"
            + " (2, 'Jo�o', 'Silva', 22, 'joao.silva@empresa.com')";

    private static final String sqlInsert3 = "INSERT INTO Funcionario (id, Primeiro_Nome, Sobrenome, idade, email)"
            + "VALUES"
            + " (3, 'Pedro', 'Santos', 32, 'pedro.santos@empresa.com')";

    //atualiza��o da idade do funcionario com o ID 3
    private static final String sqlUpdate = "UPDATE Funcionario SET Idade = 30 WHERE id = 3";

    //exclus�o do funcionario com o ID 1
    private static final String sqlDelete1 = "DELETE FROM Funcionario WHERE id = 1";

    //exclus�o do funcionario com o e-mail "
    private static final String sqlDelete2 = "DELETE FROM Funcionario WHERE email = 'pedro.santos@empresa.com'";


    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Funcionario");
            //insere os dados na tabela
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            //imprie os dados inseridos
            resultSet = statement.executeQuery("SELECT * FROM Funcionario");
            logger.info("Dados adicionados com sucesso");
                while (resultSet.next()) System.out.println(resultSet.getInt("id")
                        + " " + resultSet.getString("Primeiro_Nome")
                        + " " + resultSet.getString("Sobrenome")
                        + " " + resultSet.getInt("Idade")
                        + " " + resultSet.getString("email"));

            //atualiza a idade do funcionario com o ID 3
            statement.execute(sqlUpdate);

            logger.info("Dados do funcionario " + sqlUpdate + " atualizados com sucesso");


            //exclui o funcionario com o ID 1
            statement.execute(sqlDelete1);
            resultSet = statement.executeQuery("SELECT * FROM Funcionario");
            logger.warning("Dados do funcionario " + sqlDelete1 + " excluidos com sucesso");

            //exclui o funcionario com o e-mail pedro.santos@empresa.com
            statement.execute(sqlDelete2);
            logger.warning("Dados do funcionario " + sqlDelete2 + " excluidos com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection == null) logger.info("N�o foi poss�vel conectar ao banco de dados");
            connection.close();
        }
    }

    //printa a tabla de funcionarios
    private static void printTable(Statement statement) throws SQLException {
        String sql = "SELECT * FROM Funcionario";
        logger.info("\n" + statement.executeQuery(sql));
    }


    //conecta com o banco de dados
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
